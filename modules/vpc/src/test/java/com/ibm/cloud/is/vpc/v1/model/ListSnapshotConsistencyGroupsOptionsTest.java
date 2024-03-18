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

import com.ibm.cloud.is.vpc.v1.model.ListSnapshotConsistencyGroupsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListSnapshotConsistencyGroupsOptions model.
 */
public class ListSnapshotConsistencyGroupsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListSnapshotConsistencyGroupsOptions() throws Throwable {
    ListSnapshotConsistencyGroupsOptions listSnapshotConsistencyGroupsOptionsModel = new ListSnapshotConsistencyGroupsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .resourceGroupId("testString")
      .name("testString")
      .sort("name")
      .backupPolicyPlanId("testString")
      .build();
    assertEquals(listSnapshotConsistencyGroupsOptionsModel.start(), "testString");
    assertEquals(listSnapshotConsistencyGroupsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listSnapshotConsistencyGroupsOptionsModel.resourceGroupId(), "testString");
    assertEquals(listSnapshotConsistencyGroupsOptionsModel.name(), "testString");
    assertEquals(listSnapshotConsistencyGroupsOptionsModel.sort(), "name");
    assertEquals(listSnapshotConsistencyGroupsOptionsModel.backupPolicyPlanId(), "testString");
  }
}