/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN model.
 */
public class BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN() throws Throwable {
    BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN backupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCrnModel = new BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:enterprise::a/123456::enterprise:ebc2b430240943458b9e91e1432cfcce")
      .build();
    assertEquals(backupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCrnModel.crn(), "crn:v1:bluemix:public:enterprise::a/123456::enterprise:ebc2b430240943458b9e91e1432cfcce");

    String json = TestUtilities.serialize(backupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCrnModel);

    BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN backupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCrnModelNew = TestUtilities.deserialize(json, BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN.class);
    assertTrue(backupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCrnModelNew instanceof BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN);
    assertEquals(backupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:enterprise::a/123456::enterprise:ebc2b430240943458b9e91e1432cfcce");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRNError() throws Throwable {
    new BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN.Builder().build();
  }

}