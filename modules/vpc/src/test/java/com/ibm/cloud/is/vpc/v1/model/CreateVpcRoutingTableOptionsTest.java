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

import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RoutePrototype;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateVpcRoutingTableOptions model.
 */
public class CreateVpcRoutingTableOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpcRoutingTableOptions() throws Throwable {
    RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeModel = new RouteNextHopPrototypeRouteNextHopIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(routeNextHopPrototypeModel.address(), "192.168.3.4");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    RoutePrototype routePrototypeModel = new RoutePrototype.Builder()
      .action("deliver")
      .destination("192.168.3.0/24")
      .name("my-route-2")
      .nextHop(routeNextHopPrototypeModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(routePrototypeModel.action(), "deliver");
    assertEquals(routePrototypeModel.destination(), "192.168.3.0/24");
    assertEquals(routePrototypeModel.name(), "my-route-2");
    assertEquals(routePrototypeModel.nextHop(), routeNextHopPrototypeModel);
    assertEquals(routePrototypeModel.zone(), zoneIdentityModel);

    CreateVpcRoutingTableOptions createVpcRoutingTableOptionsModel = new CreateVpcRoutingTableOptions.Builder()
      .vpcId("testString")
      .name("my-routing-table-2")
      .routeDirectLinkIngress(false)
      .routeTransitGatewayIngress(false)
      .routeVpcZoneIngress(false)
      .routes(new java.util.ArrayList<RoutePrototype>(java.util.Arrays.asList(routePrototypeModel)))
      .build();
    assertEquals(createVpcRoutingTableOptionsModel.vpcId(), "testString");
    assertEquals(createVpcRoutingTableOptionsModel.name(), "my-routing-table-2");
    assertEquals(createVpcRoutingTableOptionsModel.routeDirectLinkIngress(), Boolean.valueOf(false));
    assertEquals(createVpcRoutingTableOptionsModel.routeTransitGatewayIngress(), Boolean.valueOf(false));
    assertEquals(createVpcRoutingTableOptionsModel.routeVpcZoneIngress(), Boolean.valueOf(false));
    assertEquals(createVpcRoutingTableOptionsModel.routes(), new java.util.ArrayList<RoutePrototype>(java.util.Arrays.asList(routePrototypeModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpcRoutingTableOptionsError() throws Throwable {
    new CreateVpcRoutingTableOptions.Builder().build();
  }

}