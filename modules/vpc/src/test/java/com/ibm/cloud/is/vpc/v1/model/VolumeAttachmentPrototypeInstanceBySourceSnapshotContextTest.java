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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeAttachmentPrototypeInstanceBySourceSnapshotContext model.
 */
public class VolumeAttachmentPrototypeInstanceBySourceSnapshotContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeAttachmentPrototypeInstanceBySourceSnapshotContext() throws Throwable {
    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    SnapshotIdentityById snapshotIdentityModel = new SnapshotIdentityById.Builder()
      .id("349a61d8-7ab1-420f-a690-5fed76ef9d4f")
      .build();
    assertEquals(snapshotIdentityModel.id(), "349a61d8-7ab1-420f-a690-5fed76ef9d4f");

    VolumePrototypeInstanceBySourceSnapshotContext volumePrototypeInstanceBySourceSnapshotContextModel = new VolumePrototypeInstanceBySourceSnapshotContext.Builder()
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .sourceSnapshot(snapshotIdentityModel)
      .userTags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.name(), "my-volume");
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.sourceSnapshot(), snapshotIdentityModel);
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.userTags(), java.util.Arrays.asList("testString"));

    VolumeAttachmentPrototypeInstanceBySourceSnapshotContext volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel = new VolumeAttachmentPrototypeInstanceBySourceSnapshotContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumePrototypeInstanceBySourceSnapshotContextModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.volume(), volumePrototypeInstanceBySourceSnapshotContextModel);

    String json = TestUtilities.serialize(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel);

    VolumeAttachmentPrototypeInstanceBySourceSnapshotContext volumeAttachmentPrototypeInstanceBySourceSnapshotContextModelNew = TestUtilities.deserialize(json, VolumeAttachmentPrototypeInstanceBySourceSnapshotContext.class);
    assertTrue(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModelNew instanceof VolumeAttachmentPrototypeInstanceBySourceSnapshotContext);
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModelNew.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModelNew.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModelNew.volume().toString(), volumePrototypeInstanceBySourceSnapshotContextModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeAttachmentPrototypeInstanceBySourceSnapshotContextError() throws Throwable {
    new VolumeAttachmentPrototypeInstanceBySourceSnapshotContext.Builder().build();
  }

}