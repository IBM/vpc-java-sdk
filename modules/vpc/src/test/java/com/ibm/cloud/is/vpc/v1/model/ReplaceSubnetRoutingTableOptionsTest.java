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

import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceSubnetRoutingTableOptions model.
 */
public class ReplaceSubnetRoutingTableOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceSubnetRoutingTableOptions() throws Throwable {
    RoutingTableIdentityByCRN routingTableIdentityModel = new RoutingTableIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc-routing-table:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b/r006-6885e83f-03b2-4603-8a86-db2a0f55c840")
      .build();
    assertEquals(routingTableIdentityModel.crn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc-routing-table:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b/r006-6885e83f-03b2-4603-8a86-db2a0f55c840");

    ReplaceSubnetRoutingTableOptions replaceSubnetRoutingTableOptionsModel = new ReplaceSubnetRoutingTableOptions.Builder()
      .id("testString")
      .routingTableIdentity(routingTableIdentityModel)
      .build();
    assertEquals(replaceSubnetRoutingTableOptionsModel.id(), "testString");
    assertEquals(replaceSubnetRoutingTableOptionsModel.routingTableIdentity(), routingTableIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSubnetRoutingTableOptionsError() throws Throwable {
    new ReplaceSubnetRoutingTableOptions.Builder().build();
  }

}