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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanClonePolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanDeletionTriggerPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanPatch;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemoteRegionPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.RegionIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyPlanPatch model.
 */
public class BackupPolicyPlanPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyPlanPatch() throws Throwable {
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

    BackupPolicyPlanDeletionTriggerPatch backupPolicyPlanDeletionTriggerPatchModel = new BackupPolicyPlanDeletionTriggerPatch.Builder()
      .deleteAfter(Long.valueOf("20"))
      .deleteOverCount(Long.valueOf("1"))
      .build();
    assertEquals(backupPolicyPlanDeletionTriggerPatchModel.deleteAfter(), Long.valueOf("20"));
    assertEquals(backupPolicyPlanDeletionTriggerPatchModel.deleteOverCount(), Long.valueOf("1"));

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

    BackupPolicyPlanPatch backupPolicyPlanPatchModel = new BackupPolicyPlanPatch.Builder()
      .active(true)
      .attachUserTags(java.util.Arrays.asList("my-daily-backup-plan"))
      .clonePolicy(backupPolicyPlanClonePolicyPatchModel)
      .copyUserTags(true)
      .cronSpec("30 */2 * * 1-5")
      .deletionTrigger(backupPolicyPlanDeletionTriggerPatchModel)
      .name("my-policy-plan")
      .remoteRegionPolicies(java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel))
      .build();
    assertEquals(backupPolicyPlanPatchModel.active(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPatchModel.attachUserTags(), java.util.Arrays.asList("my-daily-backup-plan"));
    assertEquals(backupPolicyPlanPatchModel.clonePolicy(), backupPolicyPlanClonePolicyPatchModel);
    assertEquals(backupPolicyPlanPatchModel.copyUserTags(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPatchModel.cronSpec(), "30 */2 * * 1-5");
    assertEquals(backupPolicyPlanPatchModel.deletionTrigger(), backupPolicyPlanDeletionTriggerPatchModel);
    assertEquals(backupPolicyPlanPatchModel.name(), "my-policy-plan");
    assertEquals(backupPolicyPlanPatchModel.remoteRegionPolicies(), java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel));

    String json = TestUtilities.serialize(backupPolicyPlanPatchModel);

    BackupPolicyPlanPatch backupPolicyPlanPatchModelNew = TestUtilities.deserialize(json, BackupPolicyPlanPatch.class);
    assertTrue(backupPolicyPlanPatchModelNew instanceof BackupPolicyPlanPatch);
    assertEquals(backupPolicyPlanPatchModelNew.active(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPatchModelNew.clonePolicy().toString(), backupPolicyPlanClonePolicyPatchModel.toString());
    assertEquals(backupPolicyPlanPatchModelNew.copyUserTags(), Boolean.valueOf(true));
    assertEquals(backupPolicyPlanPatchModelNew.cronSpec(), "30 */2 * * 1-5");
    assertEquals(backupPolicyPlanPatchModelNew.deletionTrigger().toString(), backupPolicyPlanDeletionTriggerPatchModel.toString());
    assertEquals(backupPolicyPlanPatchModelNew.name(), "my-policy-plan");
  }
  @Test
  public void testBackupPolicyPlanPatchAsPatch() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

    BackupPolicyPlanClonePolicyPatch backupPolicyPlanClonePolicyPatchModel = new BackupPolicyPlanClonePolicyPatch.Builder()
      .maxSnapshots(Long.valueOf("1"))
      .zones(java.util.Arrays.asList(zoneIdentityModel))
      .build();

    BackupPolicyPlanDeletionTriggerPatch backupPolicyPlanDeletionTriggerPatchModel = new BackupPolicyPlanDeletionTriggerPatch.Builder()
      .deleteAfter(Long.valueOf("20"))
      .deleteOverCount(Long.valueOf("1"))
      .build();

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();

    RegionIdentityByName regionIdentityModel = new RegionIdentityByName.Builder()
      .name("us-south")
      .build();

    BackupPolicyPlanRemoteRegionPolicyPrototype backupPolicyPlanRemoteRegionPolicyPrototypeModel = new BackupPolicyPlanRemoteRegionPolicyPrototype.Builder()
      .deleteOverCount(Long.valueOf("5"))
      .encryptionKey(encryptionKeyIdentityModel)
      .region(regionIdentityModel)
      .build();

    BackupPolicyPlanPatch backupPolicyPlanPatchModel = new BackupPolicyPlanPatch.Builder()
      .active(true)
      .attachUserTags(java.util.Arrays.asList("my-daily-backup-plan"))
      .clonePolicy(backupPolicyPlanClonePolicyPatchModel)
      .copyUserTags(true)
      .cronSpec("30 */2 * * 1-5")
      .deletionTrigger(backupPolicyPlanDeletionTriggerPatchModel)
      .name("my-policy-plan")
      .remoteRegionPolicies(java.util.Arrays.asList(backupPolicyPlanRemoteRegionPolicyPrototypeModel))
      .build();

    Map<String, Object> mergePatch = backupPolicyPlanPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("active"));
    assertTrue(mergePatch.containsKey("attach_user_tags"));
    assertTrue(mergePatch.containsKey("clone_policy"));
    assertTrue(mergePatch.containsKey("copy_user_tags"));
    assertEquals(mergePatch.get("cron_spec"), "30 */2 * * 1-5");
    assertTrue(mergePatch.containsKey("deletion_trigger"));
    assertEquals(mergePatch.get("name"), "my-policy-plan");
    assertTrue(mergePatch.containsKey("remote_region_policies"));
  }

}