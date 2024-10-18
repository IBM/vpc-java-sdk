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

import com.ibm.cloud.is.vpc.v1.model.AccountReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemote;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroup;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.SnapshotReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotRemote;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotConsistencyGroupCollection model.
 */
public class SnapshotConsistencyGroupCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotConsistencyGroupCollection() throws Throwable {
    SnapshotConsistencyGroupCollection snapshotConsistencyGroupCollectionModel = new SnapshotConsistencyGroupCollection();
    assertNull(snapshotConsistencyGroupCollectionModel.getFirst());
    assertNull(snapshotConsistencyGroupCollectionModel.getLimit());
    assertNull(snapshotConsistencyGroupCollectionModel.getNext());
    assertNull(snapshotConsistencyGroupCollectionModel.getSnapshotConsistencyGroups());
    assertNull(snapshotConsistencyGroupCollectionModel.getTotalCount());
  }
}