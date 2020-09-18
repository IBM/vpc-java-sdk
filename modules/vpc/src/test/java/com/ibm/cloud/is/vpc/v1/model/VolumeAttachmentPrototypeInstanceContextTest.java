/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeAttachmentPrototypeInstanceContext model.
 */
public class VolumeAttachmentPrototypeInstanceContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeAttachmentPrototypeInstanceContext() throws Throwable {
    VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeInstanceContextVolumeModel = new VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceContextVolumeModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModel = new VolumeAttachmentPrototypeInstanceContext.Builder()
      .name("my-volume-attachment")
      .deleteVolumeOnInstanceDelete(true)
      .volume(volumeAttachmentPrototypeInstanceContextVolumeModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceContextModel.volume(), volumeAttachmentPrototypeInstanceContextVolumeModel);

    String json = TestUtilities.serialize(volumeAttachmentPrototypeInstanceContextModel);

    VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModelNew = TestUtilities.deserialize(json, VolumeAttachmentPrototypeInstanceContext.class);
    assertTrue(volumeAttachmentPrototypeInstanceContextModelNew instanceof VolumeAttachmentPrototypeInstanceContext);
    assertEquals(volumeAttachmentPrototypeInstanceContextModelNew.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceContextModelNew.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceContextModelNew.volume().toString(), volumeAttachmentPrototypeInstanceContextVolumeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeAttachmentPrototypeInstanceContextError() throws Throwable {
    new VolumeAttachmentPrototypeInstanceContext.Builder().build();
  }

}