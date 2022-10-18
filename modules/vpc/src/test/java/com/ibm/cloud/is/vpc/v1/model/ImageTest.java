/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.is.vpc.v1.model;

import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionReference;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.ImageFile;
import com.ibm.cloud.is.vpc.v1.model.ImageFileChecksums;
import com.ibm.cloud.is.vpc.v1.model.ImageStatusReason;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Image model.
 */
public class ImageTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImage() throws Throwable {
    Image imageModel = new Image();
    assertNull(imageModel.getCatalogOffering());
    assertNull(imageModel.getCreatedAt());
    assertNull(imageModel.getCrn());
    assertNull(imageModel.getEncryption());
    assertNull(imageModel.getEncryptionKey());
    assertNull(imageModel.getFile());
    assertNull(imageModel.getHref());
    assertNull(imageModel.getId());
    assertNull(imageModel.getMinimumProvisionedSize());
    assertNull(imageModel.getName());
    assertNull(imageModel.getOperatingSystem());
    assertNull(imageModel.getResourceGroup());
    assertNull(imageModel.getSourceVolume());
    assertNull(imageModel.getStatus());
    assertNull(imageModel.getStatusReasons());
    assertNull(imageModel.getVisibility());
  }
}