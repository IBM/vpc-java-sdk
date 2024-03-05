/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyHealthReason;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyMatchResourceTypeInstance;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemote;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopeEnterpriseReference;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyMatchResourceTypeInstance model.
 */
public class BackupPolicyMatchResourceTypeInstanceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyMatchResourceTypeInstance() throws Throwable {
    BackupPolicyMatchResourceTypeInstance backupPolicyMatchResourceTypeInstanceModel = new BackupPolicyMatchResourceTypeInstance();
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getCreatedAt());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getCrn());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getHealthReasons());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getHealthState());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getHref());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getId());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getLastJobCompletedAt());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getLifecycleState());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getMatchUserTags());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getName());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getPlans());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getResourceGroup());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getResourceType());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getScope());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getIncludedContent());
    assertNull(backupPolicyMatchResourceTypeInstanceModel.getMatchResourceType());
  }
}