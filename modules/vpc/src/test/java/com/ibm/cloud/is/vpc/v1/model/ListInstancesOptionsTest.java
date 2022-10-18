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

import com.ibm.cloud.is.vpc.v1.model.ListInstancesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListInstancesOptions model.
 */
public class ListInstancesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListInstancesOptions() throws Throwable {
    ListInstancesOptions listInstancesOptionsModel = new ListInstancesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .name("testString")
      .vpcId("testString")
      .vpcCrn("testString")
      .vpcName("testString")
      .dedicatedHostId("testString")
      .dedicatedHostCrn("testString")
      .dedicatedHostName("testString")
      .placementGroupId("testString")
      .placementGroupCrn("testString")
      .placementGroupName("testString")
      .build();
    assertEquals(listInstancesOptionsModel.start(), "testString");
    assertEquals(listInstancesOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(listInstancesOptionsModel.resourceGroupId(), "testString");
    assertEquals(listInstancesOptionsModel.name(), "testString");
    assertEquals(listInstancesOptionsModel.vpcId(), "testString");
    assertEquals(listInstancesOptionsModel.vpcCrn(), "testString");
    assertEquals(listInstancesOptionsModel.vpcName(), "testString");
    assertEquals(listInstancesOptionsModel.dedicatedHostId(), "testString");
    assertEquals(listInstancesOptionsModel.dedicatedHostCrn(), "testString");
    assertEquals(listInstancesOptionsModel.dedicatedHostName(), "testString");
    assertEquals(listInstancesOptionsModel.placementGroupId(), "testString");
    assertEquals(listInstancesOptionsModel.placementGroupCrn(), "testString");
    assertEquals(listInstancesOptionsModel.placementGroupName(), "testString");
  }
}