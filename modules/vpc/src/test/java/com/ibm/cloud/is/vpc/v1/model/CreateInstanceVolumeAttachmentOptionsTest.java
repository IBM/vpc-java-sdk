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

import com.ibm.cloud.is.vpc.v1.model.CreateInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
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
    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeIdentityModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptionsModel = new CreateInstanceVolumeAttachmentOptions.Builder()
      .instanceId("testString")
      .volume(volumeIdentityModel)
      .name("my-volume-attachment")
      .deleteVolumeOnInstanceDelete(true)
      .build();
    assertEquals(createInstanceVolumeAttachmentOptionsModel.instanceId(), "testString");
    assertEquals(createInstanceVolumeAttachmentOptionsModel.volume(), volumeIdentityModel);
    assertEquals(createInstanceVolumeAttachmentOptionsModel.name(), "my-volume-attachment");
    assertEquals(createInstanceVolumeAttachmentOptionsModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceVolumeAttachmentOptionsError() throws Throwable {
    new CreateInstanceVolumeAttachmentOptions.Builder().build();
  }

}