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
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumePrototypeVolumeBySourceSnapshot model.
 */
public class VolumePrototypeVolumeBySourceSnapshotTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumePrototypeVolumeBySourceSnapshot() throws Throwable {
    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    SnapshotIdentityById snapshotIdentityModel = new SnapshotIdentityById.Builder()
      .id("349a61d8-7ab1-420f-a690-5fed76ef9d4f")
      .build();
    assertEquals(snapshotIdentityModel.id(), "349a61d8-7ab1-420f-a690-5fed76ef9d4f");

    VolumePrototypeVolumeBySourceSnapshot volumePrototypeVolumeBySourceSnapshotModel = new VolumePrototypeVolumeBySourceSnapshot.Builder()
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .zone(zoneIdentityModel)
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .sourceSnapshot(snapshotIdentityModel)
      .build();
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.name(), "my-volume");
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.userTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.zone(), zoneIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.sourceSnapshot(), snapshotIdentityModel);

    String json = TestUtilities.serialize(volumePrototypeVolumeBySourceSnapshotModel);

    VolumePrototypeVolumeBySourceSnapshot volumePrototypeVolumeBySourceSnapshotModelNew = TestUtilities.deserialize(json, VolumePrototypeVolumeBySourceSnapshot.class);
    assertTrue(volumePrototypeVolumeBySourceSnapshotModelNew instanceof VolumePrototypeVolumeBySourceSnapshot);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.name(), "my-volume");
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.profile().toString(), volumeProfileIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.sourceSnapshot().toString(), snapshotIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumePrototypeVolumeBySourceSnapshotError() throws Throwable {
    new VolumePrototypeVolumeBySourceSnapshot.Builder().build();
  }

}