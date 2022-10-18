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

import com.ibm.cloud.is.vpc.v1.model.CreateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.RoutePrototypeNextHopRouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateVpcRouteOptions model.
 */
public class CreateVpcRouteOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpcRouteOptions() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    RoutePrototypeNextHopRouteNextHopPrototypeRouteNextHopIP routePrototypeNextHopModel = new RoutePrototypeNextHopRouteNextHopPrototypeRouteNextHopIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(routePrototypeNextHopModel.address(), "192.168.3.4");

    CreateVpcRouteOptions createVpcRouteOptionsModel = new CreateVpcRouteOptions.Builder()
      .vpcId("testString")
      .destination("192.168.3.0/24")
      .zone(zoneIdentityModel)
      .action("deliver")
      .name("my-route-1")
      .nextHop(routePrototypeNextHopModel)
      .build();
    assertEquals(createVpcRouteOptionsModel.vpcId(), "testString");
    assertEquals(createVpcRouteOptionsModel.destination(), "192.168.3.0/24");
    assertEquals(createVpcRouteOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createVpcRouteOptionsModel.action(), "deliver");
    assertEquals(createVpcRouteOptionsModel.name(), "my-route-1");
    assertEquals(createVpcRouteOptionsModel.nextHop(), routePrototypeNextHopModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpcRouteOptionsError() throws Throwable {
    new CreateVpcRouteOptions.Builder().build();
  }

}