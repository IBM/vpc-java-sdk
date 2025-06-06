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

import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayPrototypeVPNGatewayRouteModePrototype model.
 */
public class VPNGatewayPrototypeVPNGatewayRouteModePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayPrototypeVPNGatewayRouteModePrototype() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    VPNGatewayPrototypeVPNGatewayRouteModePrototype vpnGatewayPrototypeVpnGatewayRouteModePrototypeModel = new VPNGatewayPrototypeVPNGatewayRouteModePrototype.Builder()
      .name("my-vpn-gateway")
      .resourceGroup(resourceGroupIdentityModel)
      .subnet(subnetIdentityModel)
      .mode("route")
      .build();
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModel.name(), "my-vpn-gateway");
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModel.subnet(), subnetIdentityModel);
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModel.mode(), "route");

    String json = TestUtilities.serialize(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModel);

    VPNGatewayPrototypeVPNGatewayRouteModePrototype vpnGatewayPrototypeVpnGatewayRouteModePrototypeModelNew = TestUtilities.deserialize(json, VPNGatewayPrototypeVPNGatewayRouteModePrototype.class);
    assertTrue(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModelNew instanceof VPNGatewayPrototypeVPNGatewayRouteModePrototype);
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModelNew.name(), "my-vpn-gateway");
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModelNew.subnet().toString(), subnetIdentityModel.toString());
    assertEquals(vpnGatewayPrototypeVpnGatewayRouteModePrototypeModelNew.mode(), "route");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayPrototypeVPNGatewayRouteModePrototypeError() throws Throwable {
    new VPNGatewayPrototypeVPNGatewayRouteModePrototype.Builder().build();
  }

}