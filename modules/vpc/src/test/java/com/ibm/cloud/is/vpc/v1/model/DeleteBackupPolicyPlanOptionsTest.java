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

import com.ibm.cloud.is.vpc.v1.model.DeleteBackupPolicyPlanOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteBackupPolicyPlanOptions model.
 */
public class DeleteBackupPolicyPlanOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteBackupPolicyPlanOptions() throws Throwable {
    DeleteBackupPolicyPlanOptions deleteBackupPolicyPlanOptionsModel = new DeleteBackupPolicyPlanOptions.Builder()
      .backupPolicyId("testString")
      .id("testString")
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .build();
    assertEquals(deleteBackupPolicyPlanOptionsModel.backupPolicyId(), "testString");
    assertEquals(deleteBackupPolicyPlanOptionsModel.id(), "testString");
    assertEquals(deleteBackupPolicyPlanOptionsModel.ifMatch(), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteBackupPolicyPlanOptionsError() throws Throwable {
    new DeleteBackupPolicyPlanOptions.Builder().build();
  }

}