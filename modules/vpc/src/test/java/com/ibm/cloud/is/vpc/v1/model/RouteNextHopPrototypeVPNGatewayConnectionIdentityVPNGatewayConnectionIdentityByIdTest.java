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

import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById model.
 */
public class RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById() throws Throwable {
    RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById routeNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByIdModel = new RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById.Builder()
      .id("0717-52f69dc3-6a5c-4bcf-b264-e7fae279b15c")
      .build();
    assertEquals(routeNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByIdModel.id(), "0717-52f69dc3-6a5c-4bcf-b264-e7fae279b15c");

    String json = TestUtilities.serialize(routeNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByIdModel);

    RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById routeNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByIdModelNew = TestUtilities.deserialize(json, RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById.class);
    assertTrue(routeNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByIdModelNew instanceof RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById);
    assertEquals(routeNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByIdModelNew.id(), "0717-52f69dc3-6a5c-4bcf-b264-e7fae279b15c");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByIdError() throws Throwable {
    new RouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById.Builder().build();
  }

}