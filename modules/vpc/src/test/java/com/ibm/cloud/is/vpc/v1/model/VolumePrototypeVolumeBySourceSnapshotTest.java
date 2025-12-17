/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
import com.ibm.cloud.is.vpc.v1.model.VolumeAllowedUsePrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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

    VolumeAllowedUsePrototype volumeAllowedUsePrototypeModel = new VolumeAllowedUsePrototype.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();
    assertEquals(volumeAllowedUsePrototypeModel.apiVersion(), "2024-06-23");
    assertEquals(volumeAllowedUsePrototypeModel.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(volumeAllowedUsePrototypeModel.instance(), "gpu.count > 0 && enable_secure_boot == true");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    SnapshotIdentityById snapshotIdentityModel = new SnapshotIdentityById.Builder()
      .id("r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
      .build();
    assertEquals(snapshotIdentityModel.id(), "r006-f6bfa329-0e36-433f-a3bb-0df632e79263");

    VolumePrototypeVolumeBySourceSnapshot volumePrototypeVolumeBySourceSnapshotModel = new VolumePrototypeVolumeBySourceSnapshot.Builder()
      .bandwidth(Long.valueOf("1000"))
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(java.util.Arrays.asList())
      .zone(zoneIdentityModel)
      .allowedUse(volumeAllowedUsePrototypeModel)
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .sourceSnapshot(snapshotIdentityModel)
      .build();
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.bandwidth(), Long.valueOf("1000"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.name(), "my-volume");
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.userTags(), java.util.Arrays.asList());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.zone(), zoneIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.allowedUse(), volumeAllowedUsePrototypeModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModel.sourceSnapshot(), snapshotIdentityModel);

    String json = TestUtilities.serialize(volumePrototypeVolumeBySourceSnapshotModel);

    VolumePrototypeVolumeBySourceSnapshot volumePrototypeVolumeBySourceSnapshotModelNew = TestUtilities.deserialize(json, VolumePrototypeVolumeBySourceSnapshot.class);
    assertTrue(volumePrototypeVolumeBySourceSnapshotModelNew instanceof VolumePrototypeVolumeBySourceSnapshot);
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.bandwidth(), Long.valueOf("1000"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.name(), "my-volume");
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.profile().toString(), volumeProfileIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.allowedUse().toString(), volumeAllowedUsePrototypeModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(volumePrototypeVolumeBySourceSnapshotModelNew.sourceSnapshot().toString(), snapshotIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumePrototypeVolumeBySourceSnapshotError() throws Throwable {
    new VolumePrototypeVolumeBySourceSnapshot.Builder().build();
  }

}