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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJob;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobSourceVolumeReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobStatusReason;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VolumeReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyJob model.
 */
public class BackupPolicyJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyJob() throws Throwable {
    BackupPolicyJob backupPolicyJobModel = new BackupPolicyJob();
    assertNull(backupPolicyJobModel.isAutoDelete());
    assertNull(backupPolicyJobModel.getAutoDeleteAfter());
    assertNull(backupPolicyJobModel.getBackupPolicyPlan());
    assertNull(backupPolicyJobModel.getCompletedAt());
    assertNull(backupPolicyJobModel.getCreatedAt());
    assertNull(backupPolicyJobModel.getHref());
    assertNull(backupPolicyJobModel.getId());
    assertNull(backupPolicyJobModel.getJobType());
    assertNull(backupPolicyJobModel.getResourceType());
    assertNull(backupPolicyJobModel.getSource());
    assertNull(backupPolicyJobModel.getStatus());
    assertNull(backupPolicyJobModel.getStatusReasons());
    assertNull(backupPolicyJobModel.getTargetSnapshots());
  }
}