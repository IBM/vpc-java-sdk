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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyPatch model.
 */
public class BackupPolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyPatch() throws Throwable {
    BackupPolicyPatch backupPolicyPatchModel = new BackupPolicyPatch.Builder()
      .matchUserTags(new java.util.ArrayList<String>(java.util.Arrays.asList("my-daily-backup-policy")))
      .name("my-backup-policy")
      .build();
    assertEquals(backupPolicyPatchModel.matchUserTags(), new java.util.ArrayList<String>(java.util.Arrays.asList("my-daily-backup-policy")));
    assertEquals(backupPolicyPatchModel.name(), "my-backup-policy");

    String json = TestUtilities.serialize(backupPolicyPatchModel);

    BackupPolicyPatch backupPolicyPatchModelNew = TestUtilities.deserialize(json, BackupPolicyPatch.class);
    assertTrue(backupPolicyPatchModelNew instanceof BackupPolicyPatch);
    assertEquals(backupPolicyPatchModelNew.name(), "my-backup-policy");
  }
  @Test
  public void testBackupPolicyPatchAsPatch() throws Throwable {
    BackupPolicyPatch backupPolicyPatchModel = new BackupPolicyPatch.Builder()
      .matchUserTags(new java.util.ArrayList<String>(java.util.Arrays.asList("my-daily-backup-policy")))
      .name("my-backup-policy")
      .build();

    Map<String, Object> mergePatch = backupPolicyPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("match_user_tags"));
    assertEquals(mergePatch.get("name"), "my-backup-policy");
  }

}