/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeAttachmentPrototypeInstanceByVolumeContext model.
 */
public class VolumeAttachmentPrototypeInstanceByVolumeContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeAttachmentPrototypeInstanceByVolumeContext() throws Throwable {
    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeIdentityModel.id(), "r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    VolumeAttachmentPrototypeInstanceByVolumeContext volumeAttachmentPrototypeInstanceByVolumeContextModel = new VolumeAttachmentPrototypeInstanceByVolumeContext.Builder()
      .deleteVolumeOnInstanceDelete(false)
      .name("my-volume-attachment")
      .volume(volumeIdentityModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(false));
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModel.volume(), volumeIdentityModel);

    String json = TestUtilities.serialize(volumeAttachmentPrototypeInstanceByVolumeContextModel);

    VolumeAttachmentPrototypeInstanceByVolumeContext volumeAttachmentPrototypeInstanceByVolumeContextModelNew = TestUtilities.deserialize(json, VolumeAttachmentPrototypeInstanceByVolumeContext.class);
    assertTrue(volumeAttachmentPrototypeInstanceByVolumeContextModelNew instanceof VolumeAttachmentPrototypeInstanceByVolumeContext);
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModelNew.deleteVolumeOnInstanceDelete(), Boolean.valueOf(false));
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModelNew.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModelNew.volume().toString(), volumeIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeAttachmentPrototypeInstanceByVolumeContextError() throws Throwable {
    new VolumeAttachmentPrototypeInstanceByVolumeContext.Builder().build();
  }

}