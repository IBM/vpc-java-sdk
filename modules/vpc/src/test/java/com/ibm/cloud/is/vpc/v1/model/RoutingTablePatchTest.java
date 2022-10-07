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

import com.ibm.cloud.is.vpc.v1.model.ResourceFilter;
import com.ibm.cloud.is.vpc.v1.model.RoutingTablePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RoutingTablePatch model.
 */
public class RoutingTablePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoutingTablePatch() throws Throwable {
    ResourceFilter resourceFilterModel = new ResourceFilter.Builder()
      .resourceType("vpn_server")
      .build();
    assertEquals(resourceFilterModel.resourceType(), "vpn_server");

    RoutingTablePatch routingTablePatchModel = new RoutingTablePatch.Builder()
      .acceptRoutesFrom(java.util.Arrays.asList(resourceFilterModel))
      .name("my-routing-table-2")
      .routeDirectLinkIngress(true)
      .routeTransitGatewayIngress(true)
      .routeVpcZoneIngress(true)
      .build();
    assertEquals(routingTablePatchModel.acceptRoutesFrom(), java.util.Arrays.asList(resourceFilterModel));
    assertEquals(routingTablePatchModel.name(), "my-routing-table-2");
    assertEquals(routingTablePatchModel.routeDirectLinkIngress(), Boolean.valueOf(true));
    assertEquals(routingTablePatchModel.routeTransitGatewayIngress(), Boolean.valueOf(true));
    assertEquals(routingTablePatchModel.routeVpcZoneIngress(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(routingTablePatchModel);

    RoutingTablePatch routingTablePatchModelNew = TestUtilities.deserialize(json, RoutingTablePatch.class);
    assertTrue(routingTablePatchModelNew instanceof RoutingTablePatch);
    assertEquals(routingTablePatchModelNew.name(), "my-routing-table-2");
    assertEquals(routingTablePatchModelNew.routeDirectLinkIngress(), Boolean.valueOf(true));
    assertEquals(routingTablePatchModelNew.routeTransitGatewayIngress(), Boolean.valueOf(true));
    assertEquals(routingTablePatchModelNew.routeVpcZoneIngress(), Boolean.valueOf(true));
  }
  @Test
  public void testRoutingTablePatchAsPatch() throws Throwable {
    ResourceFilter resourceFilterModel = new ResourceFilter.Builder()
      .resourceType("vpn_server")
      .build();

    RoutingTablePatch routingTablePatchModel = new RoutingTablePatch.Builder()
      .acceptRoutesFrom(java.util.Arrays.asList(resourceFilterModel))
      .name("my-routing-table-2")
      .routeDirectLinkIngress(true)
      .routeTransitGatewayIngress(true)
      .routeVpcZoneIngress(true)
      .build();

    Map<String, Object> mergePatch = routingTablePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("accept_routes_from"));
    assertEquals(mergePatch.get("name"), "my-routing-table-2");
    assertTrue(mergePatch.containsKey("route_direct_link_ingress"));
    assertTrue(mergePatch.containsKey("route_transit_gateway_ingress"));
    assertTrue(mergePatch.containsKey("route_vpc_zone_ingress"));
  }

}