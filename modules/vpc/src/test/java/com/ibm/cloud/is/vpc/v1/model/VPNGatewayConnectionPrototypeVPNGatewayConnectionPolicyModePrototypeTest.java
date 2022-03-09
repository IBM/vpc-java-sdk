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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(vpnGatewayConnectionIkePolicyPrototypeModel.id(), "ddf51bec-3424-11e8-b467-0ed5f89f718b");

    VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPrototypeModel = new VPNGatewayConnectionIPsecPolicyPrototypeIPsecPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(vpnGatewayConnectionIPsecPolicyPrototypeModel.id(), "ddf51bec-3424-11e8-b467-0ed5f89f718b");

    VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .ikePolicy(vpnGatewayConnectionIkePolicyPrototypeModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPrototypeModel)
      .name("my-vpn-connection")
      .peerAddress("169.21.50.5")
      .psk("lkj14b1oi0alcniejkso")
      .localCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("192.168.1.0/24")))
      .peerCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("10.45.1.0/24")))
      .build();
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.deadPeerDetection(), vpnGatewayConnectionDpdPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.ikePolicy(), vpnGatewayConnectionIkePolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.ipsecPolicy(), vpnGatewayConnectionIPsecPolicyPrototypeModel);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.name(), "my-vpn-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.peerAddress(), "169.21.50.5");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.localCidrs(), new java.util.ArrayList<String>(java.util.Arrays.asList("192.168.1.0/24")));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel.peerCidrs(), new java.util.ArrayList<String>(java.util.Arrays.asList("10.45.1.0/24")));

    String json = TestUtilities.serialize(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModel);

    VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.class);
    assertTrue(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew instanceof VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype);
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.deadPeerDetection().toString(), vpnGatewayConnectionDpdPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.ikePolicy().toString(), vpnGatewayConnectionIkePolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.ipsecPolicy().toString(), vpnGatewayConnectionIPsecPolicyPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.name(), "my-vpn-connection");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.peerAddress(), "169.21.50.5");
    assertEquals(vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototypeModelNew.psk(), "lkj14b1oi0alcniejkso");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototypeError() throws Throwable {
    new VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.Builder().build();
  }

}