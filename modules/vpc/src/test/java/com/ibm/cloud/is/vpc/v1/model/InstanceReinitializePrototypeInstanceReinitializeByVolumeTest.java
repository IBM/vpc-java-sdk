/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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

import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceReinitializePrototypeInstanceReinitializeByVolume;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityById;
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
 * Unit test class for the InstanceReinitializePrototypeInstanceReinitializeByVolume model.
 */
public class InstanceReinitializePrototypeInstanceReinitializeByVolumeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceReinitializePrototypeInstanceReinitializeByVolume() throws Throwable {
    TrustedProfileIdentityById trustedProfileIdentityModel = new TrustedProfileIdentityById.Builder()
      .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();
    assertEquals(trustedProfileIdentityModel.id(), "Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");

    InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
      .autoLink(false)
      .target(trustedProfileIdentityModel)
      .build();
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.autoLink(), Boolean.valueOf(false));
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.target(), trustedProfileIdentityModel);

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
      .build();
    assertEquals(keyIdentityModel.id(), "r006-82679077-ac3b-4c10-be16-63e9c21f0f45");

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

    InstanceReinitializePrototypeInstanceReinitializeByVolume instanceReinitializePrototypeInstanceReinitializeByVolumeModel = new InstanceReinitializePrototypeInstanceReinitializeByVolume.Builder()
      .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
      .keys(java.util.Arrays.asList(keyIdentityModel))
      .userData("[...]")
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByVolumeContextModel)
      .build();
    assertEquals(instanceReinitializePrototypeInstanceReinitializeByVolumeModel.defaultTrustedProfile(), instanceDefaultTrustedProfilePrototypeModel);
    assertEquals(instanceReinitializePrototypeInstanceReinitializeByVolumeModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(instanceReinitializePrototypeInstanceReinitializeByVolumeModel.userData(), "[...]");
    assertEquals(instanceReinitializePrototypeInstanceReinitializeByVolumeModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceByVolumeContextModel);

    String json = TestUtilities.serialize(instanceReinitializePrototypeInstanceReinitializeByVolumeModel);

    InstanceReinitializePrototypeInstanceReinitializeByVolume instanceReinitializePrototypeInstanceReinitializeByVolumeModelNew = TestUtilities.deserialize(json, InstanceReinitializePrototypeInstanceReinitializeByVolume.class);
    assertTrue(instanceReinitializePrototypeInstanceReinitializeByVolumeModelNew instanceof InstanceReinitializePrototypeInstanceReinitializeByVolume);
    assertEquals(instanceReinitializePrototypeInstanceReinitializeByVolumeModelNew.defaultTrustedProfile().toString(), instanceDefaultTrustedProfilePrototypeModel.toString());
    assertEquals(instanceReinitializePrototypeInstanceReinitializeByVolumeModelNew.userData(), "[...]");
    assertEquals(instanceReinitializePrototypeInstanceReinitializeByVolumeModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceByVolumeContextModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceReinitializePrototypeInstanceReinitializeByVolumeError() throws Throwable {
    new InstanceReinitializePrototypeInstanceReinitializeByVolume.Builder().build();
  }

}