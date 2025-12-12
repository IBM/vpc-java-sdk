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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanClonePolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanDeletionTriggerPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemoteRegionPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.RegionIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype model.
 */
public class BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    BackupPolicyPlanClonePolicyPrototype backupPolicyPlanClonePolicyPrototypeModel = new BackupPolicyPlanClonePolicyPrototype.Builder()
      .maxSnapshots(Long.valueOf("5"))
      .zones(java.util.Arrays.asList(zoneIdentityModel))
      .build();
    assertEquals(backupPolicyPlanClonePolicyPrototypeModel.maxSnapshots(), Long.valueOf("5"));
    assertEquals(backupPolicyPlanClonePolicyPrototypeModel.zones(), java.util.Arrays.asList(zoneIdentityModel));

    BackupPolicyPlanDeletionTriggerPrototype backupPolicyPlanDeletionTriggerPrototypeModel = new BackupPolicyPlanDeletionTriggerPrototype.Builder()
      .deleteAfter(Long.valueOf("20"))
      .deleteOverCount(Long.valueOf("20"))
      .build();
    assertEquals(backupPolicyPlanDeletionTriggerPrototypeModel.deleteAfter(), Long.valueOf("20"));
    assertEquals(backupPolicyPlanDeletionTriggerPrototypeModel.deleteOverCount(), Long.valueOf("20"));

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

    BackupPolicyPlanPrototype backupPolicyPlanPrototypeModel = new BackupPolicyPlanPrototype.Builder()
      .active(true)
      .attachUserTags(java.util.Arrays.asList("my-daily-backup-plan"))
      .clonePolicy(backupPolicyPlanClonePolicyPrototypeModel)
      .copyUserTags(true)
      .cronSpec("30 */2 * * 1-5")
      .deletionTrigger(backupPolicyPlanDeletionTriggerPrototypeModel)
      .name("my-policy-plan")
      .remoteRegionPolicies(java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel))
      .build();
    assertEquals(backupPolicyPlanPrototypeModel.active(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPrototypeModel.attachUserTags(), java.util.Arrays.asList("my-daily-backup-plan"));
    assertEquals(backupPolicyPlanPrototypeModel.clonePolicy(), backupPolicyPlanClonePolicyPrototypeModel);
    assertEquals(backupPolicyPlanPrototypeModel.copyUserTags(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPrototypeModel.cronSpec(), "30 */2 * * 1-5");
    assertEquals(backupPolicyPlanPrototypeModel.deletionTrigger(), backupPolicyPlanDeletionTriggerPrototypeModel);
    assertEquals(backupPolicyPlanPrototypeModel.name(), "my-policy-plan");
    assertEquals(backupPolicyPlanPrototypeModel.remoteRegionPolicies(), java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel));

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN backupPolicyScopePrototypeModel = new BackupPolicyScopePrototypeEnterpriseIdentityEnterpriseIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:enterprise::a/aa2432b1fa4d4ace891e9b80fc104e34::enterprise:ebc2b430240943458b9e91e1432cfcce")
      .build();
    assertEquals(backupPolicyScopePrototypeModel.crn(), "crn:v1:bluemix:public:enterprise::a/aa2432b1fa4d4ace891e9b80fc104e34::enterprise:ebc2b430240943458b9e91e1432cfcce");

    BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel = new BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.Builder()
      .matchUserTags(java.util.Arrays.asList("my-daily-backup-policy"))
      .name("my-backup-policy")
      .plans(java.util.Arrays.asList(backupPolicyPlanPrototypeModel))
      .resourceGroup(resourceGroupIdentityModel)
      .scope(backupPolicyScopePrototypeModel)
      .includedContent(java.util.Arrays.asList("boot_volume", "data_volumes"))
      .matchResourceType("instance")
      .build();
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel.matchUserTags(), java.util.Arrays.asList("my-daily-backup-policy"));
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel.name(), "my-backup-policy");
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel.plans(), java.util.Arrays.asList(backupPolicyPlanPrototypeModel));
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel.scope(), backupPolicyScopePrototypeModel);
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel.includedContent(), java.util.Arrays.asList("boot_volume", "data_volumes"));
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel.matchResourceType(), "instance");

    String json = TestUtilities.serialize(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModel);

    BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModelNew = TestUtilities.deserialize(json, BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.class);
    assertTrue(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModelNew instanceof BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype);
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModelNew.name(), "my-backup-policy");
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModelNew.scope().toString(), backupPolicyScopePrototypeModel.toString());
    assertEquals(backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeModelNew.matchResourceType(), "instance");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototypeError() throws Throwable {
    new BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.Builder().build();
  }

}