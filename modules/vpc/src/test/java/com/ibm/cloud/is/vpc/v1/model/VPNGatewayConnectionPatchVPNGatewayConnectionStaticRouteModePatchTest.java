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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch model.
 */
public class VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch() throws Throwable {
    VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModel = new VPNGatewayConnectionDPDPatch.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();
    assertEquals(vpnGatewayConnectionDpdPatchModel.action(), "restart");
    assertEquals(vpnGatewayConnectionDpdPatchModel.interval(), Long.valueOf("30"));
    assertEquals(vpnGatewayConnectionDpdPatchModel.timeout(), Long.valueOf("120"));

    VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPatchModel = new VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(vpnGatewayConnectionIkePolicyPatchModel.id(), "ddf51bec-3424-11e8-b467-0ed5f89f718b");

    VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPatchModel = new VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(vpnGatewayConnectionIPsecPolicyPatchModel.id(), "ddf51bec-3424-11e8-b467-0ed5f89f718b");

    VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel = new VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPatchModel)
      .ikePolicy(vpnGatewayConnectionIkePolicyPatchModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPatchModel)
      .name("my-vpn-connection")
      .peerAddress("169.21.50.5")
      .psk("lkj14b1oi0alcniejkso")
      .routingProtocol("none")
      .build();
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.deadPeerDetection(), vpnGatewayConnectionDpdPatchModel);
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.ikePolicy(), vpnGatewayConnectionIkePolicyPatchModel);
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.ipsecPolicy(), vpnGatewayConnectionIPsecPolicyPatchModel);
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.name(), "my-vpn-connection");
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.peerAddress(), "169.21.50.5");
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.routingProtocol(), "none");

    String json = TestUtilities.serialize(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel);

    VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.class);
    assertTrue(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew instanceof VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch);
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.deadPeerDetection().toString(), vpnGatewayConnectionDpdPatchModel.toString());
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.ikePolicy().toString(), vpnGatewayConnectionIkePolicyPatchModel.toString());
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.ipsecPolicy().toString(), vpnGatewayConnectionIPsecPolicyPatchModel.toString());
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.name(), "my-vpn-connection");
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.peerAddress(), "169.21.50.5");
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModelNew.routingProtocol(), "none");
  }
  @Test
  public void testVPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatchAsPatch() throws Throwable {
    VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModel = new VPNGatewayConnectionDPDPatch.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();

    VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPatchModel = new VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

    VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPatchModel = new VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

    VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel = new VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPatchModel)
      .ikePolicy(vpnGatewayConnectionIkePolicyPatchModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPatchModel)
      .name("my-vpn-connection")
      .peerAddress("169.21.50.5")
      .psk("lkj14b1oi0alcniejkso")
      .routingProtocol("none")
      .build();

    Map<String, Object> mergePatch = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("admin_state_up"));
    assertTrue(mergePatch.containsKey("dead_peer_detection"));
    assertTrue(mergePatch.containsKey("ike_policy"));
    assertTrue(mergePatch.containsKey("ipsec_policy"));
    assertEquals(mergePatch.get("name"), "my-vpn-connection");
    assertEquals(mergePatch.get("peer_address"), "169.21.50.5");
    assertEquals(mergePatch.get("psk"), "lkj14b1oi0alcniejkso");
    assertEquals(mergePatch.get("routing_protocol"), "none");
  }

}