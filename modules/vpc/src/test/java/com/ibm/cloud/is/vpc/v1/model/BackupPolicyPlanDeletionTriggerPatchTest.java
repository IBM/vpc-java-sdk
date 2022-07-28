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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanDeletionTriggerPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyPlanDeletionTriggerPatch model.
 */
public class BackupPolicyPlanDeletionTriggerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyPlanDeletionTriggerPatch() throws Throwable {
    BackupPolicyPlanDeletionTriggerPatch backupPolicyPlanDeletionTriggerPatchModel = new BackupPolicyPlanDeletionTriggerPatch.Builder()
      .deleteAfter(Long.valueOf("20"))
      .deleteOverCount(Long.valueOf("26"))
      .build();
    assertEquals(backupPolicyPlanDeletionTriggerPatchModel.deleteAfter(), Long.valueOf("20"));
    assertEquals(backupPolicyPlanDeletionTriggerPatchModel.deleteOverCount(), Long.valueOf("26"));

    String json = TestUtilities.serialize(backupPolicyPlanDeletionTriggerPatchModel);

    BackupPolicyPlanDeletionTriggerPatch backupPolicyPlanDeletionTriggerPatchModelNew = TestUtilities.deserialize(json, BackupPolicyPlanDeletionTriggerPatch.class);
    assertTrue(backupPolicyPlanDeletionTriggerPatchModelNew instanceof BackupPolicyPlanDeletionTriggerPatch);
    assertEquals(backupPolicyPlanDeletionTriggerPatchModelNew.deleteAfter(), Long.valueOf("20"));
    assertEquals(backupPolicyPlanDeletionTriggerPatchModelNew.deleteOverCount(), Long.valueOf("26"));
  }
}