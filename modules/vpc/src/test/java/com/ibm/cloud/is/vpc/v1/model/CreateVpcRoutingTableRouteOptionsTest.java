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

import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateVpcRoutingTableRouteOptions model.
 */
public class CreateVpcRoutingTableRouteOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpcRoutingTableRouteOptions() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(routeNextHopPrototypeModel.address(), "192.168.3.4");

    CreateVpcRoutingTableRouteOptions createVpcRoutingTableRouteOptionsModel = new CreateVpcRoutingTableRouteOptions.Builder()
      .vpcId("testString")
      .routingTableId("testString")
      .destination("192.168.3.0/24")
      .zone(zoneIdentityModel)
      .action("deliver")
      .name("my-route-2")
      .nextHop(routeNextHopPrototypeModel)
      .build();
    assertEquals(createVpcRoutingTableRouteOptionsModel.vpcId(), "testString");
    assertEquals(createVpcRoutingTableRouteOptionsModel.routingTableId(), "testString");
    assertEquals(createVpcRoutingTableRouteOptionsModel.destination(), "192.168.3.0/24");
    assertEquals(createVpcRoutingTableRouteOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createVpcRoutingTableRouteOptionsModel.action(), "deliver");
    assertEquals(createVpcRoutingTableRouteOptionsModel.name(), "my-route-2");
    assertEquals(createVpcRoutingTableRouteOptionsModel.nextHop(), routeNextHopPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpcRoutingTableRouteOptionsError() throws Throwable {
    new CreateVpcRoutingTableRouteOptions.Builder().build();
  }

}