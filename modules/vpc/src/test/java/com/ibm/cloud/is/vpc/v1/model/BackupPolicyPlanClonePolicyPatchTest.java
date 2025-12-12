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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanClonePolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyPlanClonePolicyPatch model.
 */
public class BackupPolicyPlanClonePolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyPlanClonePolicyPatch() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    BackupPolicyPlanClonePolicyPatch backupPolicyPlanClonePolicyPatchModel = new BackupPolicyPlanClonePolicyPatch.Builder()
      .maxSnapshots(Long.valueOf("1"))
      .zones(java.util.Arrays.asList(zoneIdentityModel))
      .build();
    assertEquals(backupPolicyPlanClonePolicyPatchModel.maxSnapshots(), Long.valueOf("1"));
    assertEquals(backupPolicyPlanClonePolicyPatchModel.zones(), java.util.Arrays.asList(zoneIdentityModel));

    String json = TestUtilities.serialize(backupPolicyPlanClonePolicyPatchModel);

    BackupPolicyPlanClonePolicyPatch backupPolicyPlanClonePolicyPatchModelNew = TestUtilities.deserialize(json, BackupPolicyPlanClonePolicyPatch.class);
    assertTrue(backupPolicyPlanClonePolicyPatchModelNew instanceof BackupPolicyPlanClonePolicyPatch);
    assertEquals(backupPolicyPlanClonePolicyPatchModelNew.maxSnapshots(), Long.valueOf("1"));
  }
}