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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumePrototypeInstanceByImageContext model.
 */
public class VolumePrototypeInstanceByImageContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumePrototypeInstanceByImageContext() throws Throwable {
    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .encryptionKey(encryptionKeyIdentityModel)
      .capacity(Long.valueOf("100"))
      .iops(Long.valueOf("10000"))
      .build();
    assertEquals(volumePrototypeInstanceByImageContextModel.name(), "my-volume");
    assertEquals(volumePrototypeInstanceByImageContextModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeInstanceByImageContextModel.iops(), Long.valueOf("10000"));

    String json = TestUtilities.serialize(volumePrototypeInstanceByImageContextModel);

    VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModelNew = TestUtilities.deserialize(json, VolumePrototypeInstanceByImageContext.class);
    assertTrue(volumePrototypeInstanceByImageContextModelNew instanceof VolumePrototypeInstanceByImageContext);
    assertEquals(volumePrototypeInstanceByImageContextModelNew.name(), "my-volume");
    assertEquals(volumePrototypeInstanceByImageContextModelNew.profile().toString(), volumeProfileIdentityModel.toString());
    assertEquals(volumePrototypeInstanceByImageContextModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(volumePrototypeInstanceByImageContextModelNew.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeInstanceByImageContextModelNew.iops(), Long.valueOf("10000"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumePrototypeInstanceByImageContextError() throws Throwable {
    new VolumePrototypeInstanceByImageContext.Builder().build();
  }

}