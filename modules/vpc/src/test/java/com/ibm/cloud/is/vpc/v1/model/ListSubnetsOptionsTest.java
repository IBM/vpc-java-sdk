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

import com.ibm.cloud.is.vpc.v1.model.ListSubnetsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListSubnetsOptions model.
 */
public class ListSubnetsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListSubnetsOptions() throws Throwable {
    ListSubnetsOptions listSubnetsOptionsModel = new ListSubnetsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .resourceGroupId("testString")
      .zoneName("us-south-1")
      .vpcId("testString")
      .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .vpcName("my-vpc")
      .routingTableId("testString")
      .routingTableName("my-routing-table")
      .build();
    assertEquals(listSubnetsOptionsModel.start(), "testString");
    assertEquals(listSubnetsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listSubnetsOptionsModel.resourceGroupId(), "testString");
    assertEquals(listSubnetsOptionsModel.zoneName(), "us-south-1");
    assertEquals(listSubnetsOptionsModel.vpcId(), "testString");
    assertEquals(listSubnetsOptionsModel.vpcCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(listSubnetsOptionsModel.vpcName(), "my-vpc");
    assertEquals(listSubnetsOptionsModel.routingTableId(), "testString");
    assertEquals(listSubnetsOptionsModel.routingTableName(), "my-routing-table");
  }
}