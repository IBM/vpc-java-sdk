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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.ImageReference;
import com.ibm.cloud.is.vpc.v1.model.ImageReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentDevice;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceVolumeContextDeleted;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Volume model.
 */
public class VolumeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolume() throws Throwable {
    Volume volumeModel = new Volume();
    assertNull(volumeModel.isActive());
    assertNull(volumeModel.getBandwidth());
    assertNull(volumeModel.isBusy());
    assertNull(volumeModel.getCapacity());
    assertNull(volumeModel.getCreatedAt());
    assertNull(volumeModel.getCrn());
    assertNull(volumeModel.getEncryption());
    assertNull(volumeModel.getEncryptionKey());
    assertNull(volumeModel.getHref());
    assertNull(volumeModel.getId());
    assertNull(volumeModel.getIops());
    assertNull(volumeModel.getName());
    assertNull(volumeModel.getOperatingSystem());
    assertNull(volumeModel.getProfile());
    assertNull(volumeModel.getResourceGroup());
    assertNull(volumeModel.getSourceImage());
    assertNull(volumeModel.getSourceSnapshot());
    assertNull(volumeModel.getStatus());
    assertNull(volumeModel.getStatusReasons());
    assertNull(volumeModel.getUserTags());
    assertNull(volumeModel.getVolumeAttachments());
    assertNull(volumeModel.getZone());
  }
}