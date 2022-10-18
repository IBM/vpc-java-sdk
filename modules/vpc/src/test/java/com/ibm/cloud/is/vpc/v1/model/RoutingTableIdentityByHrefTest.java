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

import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RoutingTableIdentityByHref model.
 */
public class RoutingTableIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoutingTableIdentityByHref() throws Throwable {
    RoutingTableIdentityByHref routingTableIdentityByHrefModel = new RoutingTableIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/vpcs/982d72b7-db1b-4606-afb2-ed6bd4b0bed1/routing_tables/6885e83f-03b2-4603-8a86-db2a0f55c840")
      .build();
    assertEquals(routingTableIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/vpcs/982d72b7-db1b-4606-afb2-ed6bd4b0bed1/routing_tables/6885e83f-03b2-4603-8a86-db2a0f55c840");

    String json = TestUtilities.serialize(routingTableIdentityByHrefModel);

    RoutingTableIdentityByHref routingTableIdentityByHrefModelNew = TestUtilities.deserialize(json, RoutingTableIdentityByHref.class);
    assertTrue(routingTableIdentityByHrefModelNew instanceof RoutingTableIdentityByHref);
    assertEquals(routingTableIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/vpcs/982d72b7-db1b-4606-afb2-ed6bd4b0bed1/routing_tables/6885e83f-03b2-4603-8a86-db2a0f55c840");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRoutingTableIdentityByHrefError() throws Throwable {
    new RoutingTableIdentityByHref.Builder().build();
  }

}