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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress model.
 */
public class VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddressTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress() throws Throwable {
    VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN vpnGatewayConnectionIkeIdentityPrototypeModel = new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN.Builder()
      .type("fqdn")
      .value("my-service.example.com")
      .build();
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.type(), "fqdn");
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.value(), "my-service.example.com");

    VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModel = new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder()
      .ikeIdentity(vpnGatewayConnectionIkeIdentityPrototypeModel)
      .address("192.0.2.5")
      .build();
    assertEquals(vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModel.ikeIdentity(), vpnGatewayConnectionIkeIdentityPrototypeModel);
    assertEquals(vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModel.address(), "192.0.2.5");

    String json = TestUtilities.serialize(vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModel);

    VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.class);
    assertTrue(vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew instanceof VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress);
    assertEquals(vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew.ikeIdentity().toString(), vpnGatewayConnectionIkeIdentityPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew.address(), "192.0.2.5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddressError() throws Throwable {
    new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder().build();
  }

}