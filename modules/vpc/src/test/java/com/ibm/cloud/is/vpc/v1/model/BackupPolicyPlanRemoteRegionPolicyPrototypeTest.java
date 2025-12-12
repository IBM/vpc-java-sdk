/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemoteRegionPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.RegionIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyPlanRemoteRegionPolicyPrototype model.
 */
public class BackupPolicyPlanRemoteRegionPolicyPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyPlanRemoteRegionPolicyPrototype() throws Throwable {
    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    RegionIdentityByName regionIdentityModel = new RegionIdentityByName.Builder()
      .name("us-south")
      .build();
    assertEquals(regionIdentityModel.name(), "us-south");

    BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototypeModel = new BackupPolicyPlanRemoteRegionPolicyPrototype.Builder()
      .deleteOverCount(Long.valueOf("5"))
      .encryptionKey(encryptionKeyIdentityModel)
      .region(regionIdentityModel)
      .build();
    assertEquals(backupPolicyPlanRemoteRegionPolicyPrototypeModel.deleteOverCount(), Long.valueOf("5"));
    assertEquals(backupPolicyPlanRemoteRegionPolicyPrototypeModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(backupPolicyPlanRemoteRegionPolicyPrototypeModel.region(), regionIdentityModel);

    String json = TestUtilities.serialize(backupPolicyPlanRemoteRegionPolicyPrototypeModel);

    BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototypeModelNew = TestUtilities.deserialize(json, BackupPolicyPlanRemoteRegionPolicyPrototype.class);
    assertTrue(backupPolicyPlanRemoteRegionPolicyPrototypeModelNew instanceof BackupPolicyPlanRemoteRegionPolicyPrototype);
    assertEquals(backupPolicyPlanRemoteRegionPolicyPrototypeModelNew.deleteOverCount(), Long.valueOf("5"));
    assertEquals(backupPolicyPlanRemoteRegionPolicyPrototypeModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(backupPolicyPlanRemoteRegionPolicyPrototypeModelNew.region().toString(), regionIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBackupPolicyPlanRemoteRegionPolicyPrototypeError() throws Throwable {
    new BackupPolicyPlanRemoteRegionPolicyPrototype.Builder().build();
  }

}