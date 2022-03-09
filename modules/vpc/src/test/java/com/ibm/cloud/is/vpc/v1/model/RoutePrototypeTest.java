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

import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RoutePrototype;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RoutePrototype model.
 */
public class RoutePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoutePrototype() throws Throwable {
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

    String json = TestUtilities.serialize(routePrototypeModel);

    RoutePrototype routePrototypeModelNew = TestUtilities.deserialize(json, RoutePrototype.class);
    assertTrue(routePrototypeModelNew instanceof RoutePrototype);
    assertEquals(routePrototypeModelNew.action(), "deliver");
    assertEquals(routePrototypeModelNew.destination(), "192.168.3.0/24");
    assertEquals(routePrototypeModelNew.name(), "my-route-2");
    assertEquals(routePrototypeModelNew.nextHop().toString(), routeNextHopPrototypeModel.toString());
    assertEquals(routePrototypeModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRoutePrototypeError() throws Throwable {
    new RoutePrototype.Builder().build();
  }

}