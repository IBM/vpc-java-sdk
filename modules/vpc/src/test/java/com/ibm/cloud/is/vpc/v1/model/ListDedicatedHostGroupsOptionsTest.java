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

import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostGroupsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDedicatedHostGroupsOptions model.
 */
public class ListDedicatedHostGroupsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDedicatedHostGroupsOptions() throws Throwable {
    ListDedicatedHostGroupsOptions listDedicatedHostGroupsOptionsModel = new ListDedicatedHostGroupsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .resourceGroupId("testString")
      .zoneName("us-south-1")
      .name("my-name")
      .build();
    assertEquals(listDedicatedHostGroupsOptionsModel.start(), "testString");
    assertEquals(listDedicatedHostGroupsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listDedicatedHostGroupsOptionsModel.resourceGroupId(), "testString");
    assertEquals(listDedicatedHostGroupsOptionsModel.zoneName(), "us-south-1");
    assertEquals(listDedicatedHostGroupsOptionsModel.name(), "my-name");
  }
}