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

import com.ibm.cloud.is.vpc.v1.model.AccountReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJob;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobSourceVolumeReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyJobStatusReason;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemote;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyTargetSnapshotSnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.PageLink;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotRemote;
import com.ibm.cloud.is.vpc.v1.model.VolumeRemote;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyJobCollection model.
 */
public class BackupPolicyJobCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyJobCollection() throws Throwable {
    BackupPolicyJobCollection backupPolicyJobCollectionModel = new BackupPolicyJobCollection();
    assertNull(backupPolicyJobCollectionModel.getFirst());
    assertNull(backupPolicyJobCollectionModel.getJobs());
    assertNull(backupPolicyJobCollectionModel.getLimit());
    assertNull(backupPolicyJobCollectionModel.getNext());
    assertNull(backupPolicyJobCollectionModel.getTotalCount());
  }
}