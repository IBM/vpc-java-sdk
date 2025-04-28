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

import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP;
import com.ibm.cloud.is.vpc.v1.model.RoutePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RoutePatch model.
 */
public class RoutePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoutePatch() throws Throwable {
    RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP routeNextHopPatchModel = new RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP.Builder()
      .address("0.0.0.0")
      .build();
    assertEquals(routeNextHopPatchModel.address(), "0.0.0.0");

    RoutePatch routePatchModel = new RoutePatch.Builder()
      .advertise(true)
      .name("my-vpc-routing-table-route")
      .nextHop(routeNextHopPatchModel)
      .priority(Long.valueOf("1"))
      .build();
    assertEquals(routePatchModel.advertise(), Boolean.valueOf(true));
    assertEquals(routePatchModel.name(), "my-vpc-routing-table-route");
    assertEquals(routePatchModel.nextHop(), routeNextHopPatchModel);
    assertEquals(routePatchModel.priority(), Long.valueOf("1"));

    String json = TestUtilities.serialize(routePatchModel);

    RoutePatch routePatchModelNew = TestUtilities.deserialize(json, RoutePatch.class);
    assertTrue(routePatchModelNew instanceof RoutePatch);
    assertEquals(routePatchModelNew.advertise(), Boolean.valueOf(true));
    assertEquals(routePatchModelNew.name(), "my-vpc-routing-table-route");
    assertEquals(routePatchModelNew.nextHop().toString(), routeNextHopPatchModel.toString());
    assertEquals(routePatchModelNew.priority(), Long.valueOf("1"));
  }
  @Test
  public void testRoutePatchAsPatch() throws Throwable {
    RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP routeNextHopPatchModel = new RouteNextHopPatchRouteNextHopIPRouteNextHopIPSentinelIP.Builder()
      .address("0.0.0.0")
      .build();

    RoutePatch routePatchModel = new RoutePatch.Builder()
      .advertise(true)
      .name("my-vpc-routing-table-route")
      .nextHop(routeNextHopPatchModel)
      .priority(Long.valueOf("1"))
      .build();

    Map<String, Object> mergePatch = routePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("advertise"));
    assertEquals(mergePatch.get("name"), "my-vpc-routing-table-route");
    assertTrue(mergePatch.containsKey("next_hop"));
    assertTrue(mergePatch.containsKey("priority"));
  }

}