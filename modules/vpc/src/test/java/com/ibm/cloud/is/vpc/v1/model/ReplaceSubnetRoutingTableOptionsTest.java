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

import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
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
    RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
      .id("6885e83f-03b2-4603-8a86-db2a0f55c840")
      .build();
    assertEquals(routingTableIdentityModel.id(), "6885e83f-03b2-4603-8a86-db2a0f55c840");

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