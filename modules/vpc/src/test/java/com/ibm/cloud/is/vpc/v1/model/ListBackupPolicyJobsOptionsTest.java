/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.ibm.cloud.is.vpc.v1.model.ListBackupPolicyJobsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListBackupPolicyJobsOptions model.
 */
public class ListBackupPolicyJobsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListBackupPolicyJobsOptions() throws Throwable {
    ListBackupPolicyJobsOptions listBackupPolicyJobsOptionsModel = new ListBackupPolicyJobsOptions.Builder()
      .backupPolicyId("testString")
      .status("failed")
      .backupPolicyPlanId("testString")
      .start("testString")
      .limit(Long.valueOf("50"))
      .sort("name")
      .sourceId("testString")
      .targetSnapshotsId("testString")
      .targetSnapshotsCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot:r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
      .build();
    assertEquals(listBackupPolicyJobsOptionsModel.backupPolicyId(), "testString");
    assertEquals(listBackupPolicyJobsOptionsModel.status(), "failed");
    assertEquals(listBackupPolicyJobsOptionsModel.backupPolicyPlanId(), "testString");
    assertEquals(listBackupPolicyJobsOptionsModel.start(), "testString");
    assertEquals(listBackupPolicyJobsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listBackupPolicyJobsOptionsModel.sort(), "name");
    assertEquals(listBackupPolicyJobsOptionsModel.sourceId(), "testString");
    assertEquals(listBackupPolicyJobsOptionsModel.targetSnapshotsId(), "testString");
    assertEquals(listBackupPolicyJobsOptionsModel.targetSnapshotsCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot:r006-f6bfa329-0e36-433f-a3bb-0df632e79263");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListBackupPolicyJobsOptionsError() throws Throwable {
    new ListBackupPolicyJobsOptions.Builder().build();
  }

}