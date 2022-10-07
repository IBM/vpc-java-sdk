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
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot model.
 */
public class VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot() throws Throwable {
    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    SnapshotIdentityById snapshotIdentityModel = new SnapshotIdentityById.Builder()
      .id("349a61d8-7ab1-420f-a690-5fed76ef9d4f")
      .build();
    assertEquals(snapshotIdentityModel.id(), "349a61d8-7ab1-420f-a690-5fed76ef9d4f");

    VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel = new VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.Builder()
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .userTags(java.util.Arrays.asList("testString"))
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .sourceSnapshot(snapshotIdentityModel)
      .build();
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel.iops(), Long.valueOf("10000"));
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel.name(), "my-volume");
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel.userTags(), java.util.Arrays.asList("testString"));
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel.capacity(), Long.valueOf("100"));
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel.sourceSnapshot(), snapshotIdentityModel);

    String json = TestUtilities.serialize(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModel);

    VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew = TestUtilities.deserialize(json, VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.class);
    assertTrue(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew instanceof VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot);
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew.iops(), Long.valueOf("10000"));
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew.name(), "my-volume");
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew.profile().toString(), volumeProfileIdentityModel.toString());
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew.capacity(), Long.valueOf("100"));
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(volumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotModelNew.sourceSnapshot().toString(), snapshotIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshotError() throws Throwable {
    new VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeBySourceSnapshot.Builder().build();
  }

}