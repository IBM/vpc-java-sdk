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
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeByCapacity;
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
 * Unit test class for the VolumePrototypeVolumeByCapacity model.
 */
public class VolumePrototypeVolumeByCapacityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumePrototypeVolumeByCapacity() throws Throwable {
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

    VolumePrototypeVolumeByCapacity volumePrototypeVolumeByCapacityModel = new VolumePrototypeVolumeByCapacity.Builder()
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .zone(zoneIdentityModel)
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .build();
    assertEquals(volumePrototypeVolumeByCapacityModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeVolumeByCapacityModel.name(), "my-volume");
    assertEquals(volumePrototypeVolumeByCapacityModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeVolumeByCapacityModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(volumePrototypeVolumeByCapacityModel.userTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(volumePrototypeVolumeByCapacityModel.zone(), zoneIdentityModel);
    assertEquals(volumePrototypeVolumeByCapacityModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeVolumeByCapacityModel.encryptionKey(), encryptionKeyIdentityModel);

    String json = TestUtilities.serialize(volumePrototypeVolumeByCapacityModel);

    VolumePrototypeVolumeByCapacity volumePrototypeVolumeByCapacityModelNew = TestUtilities.deserialize(json, VolumePrototypeVolumeByCapacity.class);
    assertTrue(volumePrototypeVolumeByCapacityModelNew instanceof VolumePrototypeVolumeByCapacity);
    assertEquals(volumePrototypeVolumeByCapacityModelNew.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeVolumeByCapacityModelNew.name(), "my-volume");
    assertEquals(volumePrototypeVolumeByCapacityModelNew.profile().toString(), volumeProfileIdentityModel.toString());
    assertEquals(volumePrototypeVolumeByCapacityModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(volumePrototypeVolumeByCapacityModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(volumePrototypeVolumeByCapacityModelNew.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeVolumeByCapacityModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumePrototypeVolumeByCapacityError() throws Throwable {
    new VolumePrototypeVolumeByCapacity.Builder().build();
  }

}