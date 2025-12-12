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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModeLocalPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype model.
 */
public class VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype() throws Throwable {
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

    VPNGatewayConnectionPolicyModeLocalPrototype vpnGatewayConnectionPolicyModeLocalPrototypeModel = new VPNGatewayConnectionPolicyModeLocalPrototype.Builder()
      .cidrs(java.util.Arrays.asList("192.0.2.0/24"))
      .ikeIdentities(java.util.Arrays.asList(vpnGatewayConnectionIkeIdentityPrototypeModel))
      .build();
    assertEquals(vpnGatewayConnectionPolicyModeLocalPrototypeModel.cidrs(), java.util.Arrays.asList("192.0.2.0/24"));
    assertEquals(vpnGatewayConnectionPolicyModeLocalPrototypeModel.ikeIdentities(), java.util.Arrays.asList(vpnGatewayConnectionIkeIdentityPrototypeModel));

    VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionPolicyModePeerPrototypeModel = new VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder()
      .cidrs(java.util.Arrays.asList("203.0.113.0/24"))
      .ikeIdentity(vpnGatewayConnectionIkeIdentityPrototypeModel)
      .address("192.0.2.5")
      .build();
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeModel.cidrs(), java.util.Arrays.asList("203.0.113.0/24"));
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeModel.ikeIdentity(), vpnGatewayConnectionIkeIdentityPrototypeModel);
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeModel.address(), "192.0.2.5");

    VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .establishMode("bidirectional")
      .ikePolicy(vpnGatewayConnectionIkePolicyPrototypeModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPrototypeModel)
      .name("my-vpn-gateway-connection")
      .psk("lkj14b1oi0alcniejkso")
      .local(vpnGatewayConnectionPolicyModeLocalPrototypeModel)
      .peer(vpnGatewayConnectionPolicyModePeerPrototypeModel)
      .build();
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.deadPeerDetection(), vpnGatewayConnectionDpdPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.ikePolicy(), vpnGatewayConnectionIkePolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.ipsecPolicy(), vpnGatewayConnectionIPsecPolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.local(), vpnGatewayConnectionPolicyModeLocalPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.peer(), vpnGatewayConnectionPolicyModePeerPrototypeModel);

    String json = TestUtilities.serialize(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel);

    VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.class);
    assertTrue(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew instanceof VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.deadPeerDetection().toString(), vpnGatewayConnectionDpdPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.ikePolicy().toString(), vpnGatewayConnectionIkePolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.ipsecPolicy().toString(), vpnGatewayConnectionIPsecPolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.local().toString(), vpnGatewayConnectionPolicyModeLocalPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.peer().toString(), vpnGatewayConnectionPolicyModePeerPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototypeError() throws Throwable {
    new VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.Builder().build();
  }

}