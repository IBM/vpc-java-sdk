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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanDeletionTriggerPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanPrototype;
import com.ibm.cloud.is.vpc.v1.model.CreateBackupPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
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
 * Unit test class for the CreateBackupPolicyOptions model.
 */
public class CreateBackupPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBackupPolicyOptions() throws Throwable {
    BackupPolicyPlanDeletionTriggerPrototype backupPolicyPlanDeletionTriggerPrototypeModel = new BackupPolicyPlanDeletionTriggerPrototype.Builder()
      .deleteAfter(Long.valueOf("20"))
      .deleteOverCount(Long.valueOf("20"))
      .build();
    assertEquals(backupPolicyPlanDeletionTriggerPrototypeModel.deleteAfter(), Long.valueOf("20"));
    assertEquals(backupPolicyPlanDeletionTriggerPrototypeModel.deleteOverCount(), Long.valueOf("20"));

    BackupPolicyPlanPrototype backupPolicyPlanPrototypeModel = new BackupPolicyPlanPrototype.Builder()
      .active(true)
      .attachUserTags(new java.util.ArrayList<String>(java.util.Arrays.asList("my-daily-backup-plan")))
      .copyUserTags(true)
      .cronSpec("*/5 1,2,3 * * *")
      .deletionTrigger(backupPolicyPlanDeletionTriggerPrototypeModel)
      .name("my-policy-plan")
      .build();
    assertEquals(backupPolicyPlanPrototypeModel.active(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPrototypeModel.attachUserTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("my-daily-backup-plan")));
    assertEquals(backupPolicyPlanPrototypeModel.copyUserTags(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPrototypeModel.cronSpec(), "*/5 1,2,3 * * *");
    assertEquals(backupPolicyPlanPrototypeModel.deletionTrigger(), backupPolicyPlanDeletionTriggerPrototypeModel);
    assertEquals(backupPolicyPlanPrototypeModel.name(), "my-policy-plan");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreateBackupPolicyOptions createBackupPolicyOptionsModel = new CreateBackupPolicyOptions.Builder()
      .matchResourceTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("volume")))
      .matchUserTags(new java.util.ArrayList<String>(java.util.Arrays.asList("my-daily-backup-policy")))
      .name("my-backup-policy")
      .plans(new java.util.ArrayList<BackupPolicyPlanPrototype>(java.util.Arrays.asList(backupPolicyPlanPrototypeModel)))
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(createBackupPolicyOptionsModel.matchResourceTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("volume")));
    assertEquals(createBackupPolicyOptionsModel.matchUserTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("my-daily-backup-policy")));
    assertEquals(createBackupPolicyOptionsModel.name(), "my-backup-policy");
    assertEquals(createBackupPolicyOptionsModel.plans(), new java.util.ArrayList<BackupPolicyPlanPrototype>(java.util.Arrays.asList(backupPolicyPlanPrototypeModel)));
    assertEquals(createBackupPolicyOptionsModel.resourceGroup(), resourceGroupIdentityModel);
  }
}