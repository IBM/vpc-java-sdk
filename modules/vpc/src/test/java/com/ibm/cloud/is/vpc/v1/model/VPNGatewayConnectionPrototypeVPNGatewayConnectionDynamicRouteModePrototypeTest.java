/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDynamicRouteModeLocalPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionTunnelPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype model.
 */
public class VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype() throws Throwable {
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

    VPNGatewayConnectionDynamicRouteModeLocalPrototype vpnGatewayConnectionDynamicRouteModeLocalPrototypeModel = new VPNGatewayConnectionDynamicRouteModeLocalPrototype.Builder()
      .ikeIdentities(java.util.Arrays.asList(vpnGatewayConnectionIkeIdentityPrototypeModel))
      .build();
    assertEquals(vpnGatewayConnectionDynamicRouteModeLocalPrototypeModel.ikeIdentities(), java.util.Arrays.asList(vpnGatewayConnectionIkeIdentityPrototypeModel));

    VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionDynamicRouteModePeerPrototypeModel = new VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder()
      .asn(Long.valueOf("26"))
      .ikeIdentity(vpnGatewayConnectionIkeIdentityPrototypeModel)
      .address("192.0.2.5")
      .build();
    assertEquals(vpnGatewayConnectionDynamicRouteModePeerPrototypeModel.asn(), Long.valueOf("26"));
    assertEquals(vpnGatewayConnectionDynamicRouteModePeerPrototypeModel.ikeIdentity(), vpnGatewayConnectionIkeIdentityPrototypeModel);
    assertEquals(vpnGatewayConnectionDynamicRouteModePeerPrototypeModel.address(), "192.0.2.5");

    IP ipModel = new IP.Builder()
      .address("169.254.0.2")
      .build();
    assertEquals(ipModel.address(), "169.254.0.2");

    VPNGatewayConnectionTunnelPrototype vpnGatewayConnectionTunnelPrototypeModel = new VPNGatewayConnectionTunnelPrototype.Builder()
      .neighborIp(ipModel)
      .tunnelInterfaceIp(ipModel)
      .build();
    assertEquals(vpnGatewayConnectionTunnelPrototypeModel.neighborIp(), ipModel);
    assertEquals(vpnGatewayConnectionTunnelPrototypeModel.tunnelInterfaceIp(), ipModel);

    VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .establishMode("bidirectional")
      .ikePolicy(vpnGatewayConnectionIkePolicyPrototypeModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPrototypeModel)
      .name("my-vpn-gateway-connection")
      .psk("lkj14b1oi0alcniejkso")
      .distributeTraffic(false)
      .local(vpnGatewayConnectionDynamicRouteModeLocalPrototypeModel)
      .peer(vpnGatewayConnectionDynamicRouteModePeerPrototypeModel)
      .routingProtocol("bgp")
      .tunnels(java.util.Arrays.asList(vpnGatewayConnectionTunnelPrototypeModel))
      .build();
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.deadPeerDetection(), vpnGatewayConnectionDpdPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.ikePolicy(), vpnGatewayConnectionIkePolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.ipsecPolicy(), vpnGatewayConnectionIPsecPolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.distributeTraffic(), Boolean.valueOf(false));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.local(), vpnGatewayConnectionDynamicRouteModeLocalPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.peer(), vpnGatewayConnectionDynamicRouteModePeerPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.routingProtocol(), "bgp");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel.tunnels(), java.util.Arrays.asList(vpnGatewayConnectionTunnelPrototypeModel));

    String json = TestUtilities.serialize(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModel);

    VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype.class);
    assertTrue(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew instanceof VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.deadPeerDetection().toString(), vpnGatewayConnectionDpdPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.ikePolicy().toString(), vpnGatewayConnectionIkePolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.ipsecPolicy().toString(), vpnGatewayConnectionIPsecPolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.distributeTraffic(), Boolean.valueOf(false));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.local().toString(), vpnGatewayConnectionDynamicRouteModeLocalPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.peer().toString(), vpnGatewayConnectionDynamicRouteModePeerPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototypeModelNew.routingProtocol(), "bgp");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototypeError() throws Throwable {
    new VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype.Builder().build();
  }

}