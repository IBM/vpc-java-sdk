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

import com.ibm.cloud.is.vpc.v1.model.CreateInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInstanceVolumeAttachmentOptions model.
 */
public class CreateInstanceVolumeAttachmentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInstanceVolumeAttachmentOptions() throws Throwable {
    VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeAttachmentPrototypeVolumeModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptionsModel = new CreateInstanceVolumeAttachmentOptions.Builder()
      .instanceId("testString")
      .volume(volumeAttachmentPrototypeVolumeModel)
      .deleteVolumeOnInstanceDelete(false)
      .name("my-volume-attachment")
      .build();
    assertEquals(createInstanceVolumeAttachmentOptionsModel.instanceId(), "testString");
    assertEquals(createInstanceVolumeAttachmentOptionsModel.volume(), volumeAttachmentPrototypeVolumeModel);
    assertEquals(createInstanceVolumeAttachmentOptionsModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(false));
    assertEquals(createInstanceVolumeAttachmentOptionsModel.name(), "my-volume-attachment");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceVolumeAttachmentOptionsError() throws Throwable {
    new CreateInstanceVolumeAttachmentOptions.Builder().build();
  }

}