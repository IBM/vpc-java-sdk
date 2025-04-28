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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModeLocalPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype model.
 */
public class VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype() throws Throwable {
    VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototypeModel = new VPNGatewayConnectionDPDPrototype.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();
    assertEquals(vpnGatewayConnectionDpdPrototypeModel.action(), "restart");
    assertEquals(vpnGatewayConnectionDpdPrototypeModel.interval(), Long.valueOf("30"));
    assertEquals(vpnGatewayConnectionDpdPrototypeModel.timeout(), Long.valueOf("120"));

    VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPrototypeModel = new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById.Builder()
      .id("r006-e98f46a3-1e4e-4195-b4e5-b8155192689d")
      .build();
    assertEquals(vpnGatewayConnectionIkePolicyPrototypeModel.id(), "r006-e98f46a3-1e4e-4195-b4e5-b8155192689d");

    VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPrototypeModel = new VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById.Builder()
      .id("r006-51eae621-dbbc-4c47-b623-b57a43c19876")
      .build();
    assertEquals(vpnGatewayConnectionIPsecPolicyPrototypeModel.id(), "r006-51eae621-dbbc-4c47-b623-b57a43c19876");

    VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN vpnGatewayConnectionIkeIdentityPrototypeModel = new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN.Builder()
      .type("fqdn")
      .value("my-service.example.com")
      .build();
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.type(), "fqdn");
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.value(), "my-service.example.com");

    VPNGatewayConnectionStaticRouteModeLocalPrototype vpnGatewayConnectionStaticRouteModeLocalPrototypeModel = new VPNGatewayConnectionStaticRouteModeLocalPrototype.Builder()
      .ikeIdentities(java.util.Arrays.asList(vpnGatewayConnectionIkeIdentityPrototypeModel))
      .build();
    assertEquals(vpnGatewayConnectionStaticRouteModeLocalPrototypeModel.ikeIdentities(), java.util.Arrays.asList(vpnGatewayConnectionIkeIdentityPrototypeModel));

    VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionStaticRouteModePeerPrototypeModel = new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder()
      .ikeIdentity(vpnGatewayConnectionIkeIdentityPrototypeModel)
      .address("192.0.2.5")
      .build();
    assertEquals(vpnGatewayConnectionStaticRouteModePeerPrototypeModel.ikeIdentity(), vpnGatewayConnectionIkeIdentityPrototypeModel);
    assertEquals(vpnGatewayConnectionStaticRouteModePeerPrototypeModel.address(), "192.0.2.5");

    VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .establishMode("bidirectional")
      .ikePolicy(vpnGatewayConnectionIkePolicyPrototypeModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPrototypeModel)
      .name("my-vpn-gateway-connection")
      .psk("lkj14b1oi0alcniejkso")
      .distributeTraffic(false)
      .local(vpnGatewayConnectionStaticRouteModeLocalPrototypeModel)
      .peer(vpnGatewayConnectionStaticRouteModePeerPrototypeModel)
      .routingProtocol("none")
      .build();
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.deadPeerDetection(), vpnGatewayConnectionDpdPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.ikePolicy(), vpnGatewayConnectionIkePolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.ipsecPolicy(), vpnGatewayConnectionIPsecPolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.distributeTraffic(), Boolean.valueOf(false));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.local(), vpnGatewayConnectionStaticRouteModeLocalPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.peer(), vpnGatewayConnectionStaticRouteModePeerPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel.routingProtocol(), "none");

    String json = TestUtilities.serialize(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModel);

    VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.class);
    assertTrue(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew instanceof VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.deadPeerDetection().toString(), vpnGatewayConnectionDpdPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.ikePolicy().toString(), vpnGatewayConnectionIkePolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.ipsecPolicy().toString(), vpnGatewayConnectionIPsecPolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.distributeTraffic(), Boolean.valueOf(false));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.local().toString(), vpnGatewayConnectionStaticRouteModeLocalPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.peer().toString(), vpnGatewayConnectionStaticRouteModePeerPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototypeModelNew.routingProtocol(), "none");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototypeError() throws Throwable {
    new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.Builder().build();
  }

}