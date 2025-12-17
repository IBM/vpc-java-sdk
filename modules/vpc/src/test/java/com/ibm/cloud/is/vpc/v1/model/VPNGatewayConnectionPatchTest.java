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

import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionTunnel;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPatch model.
 */
public class VPNGatewayConnectionPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPatch() throws Throwable {
    VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModel = new VPNGatewayConnectionDPDPatch.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();
    assertEquals(vpnGatewayConnectionDpdPatchModel.action(), "restart");
    assertEquals(vpnGatewayConnectionDpdPatchModel.interval(), Long.valueOf("30"));
    assertEquals(vpnGatewayConnectionDpdPatchModel.timeout(), Long.valueOf("120"));

    VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPatchModel = new VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById.Builder()
      .id("r006-e98f46a3-1e4e-4195-b4e5-b8155192689d")
      .build();
    assertEquals(vpnGatewayConnectionIkePolicyPatchModel.id(), "r006-e98f46a3-1e4e-4195-b4e5-b8155192689d");

    VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPatchModel = new VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById.Builder()
      .id("r006-51eae621-dbbc-4c47-b623-b57a43c19876")
      .build();
    assertEquals(vpnGatewayConnectionIPsecPolicyPatchModel.id(), "r006-51eae621-dbbc-4c47-b623-b57a43c19876");

    VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch vpnGatewayConnectionPeerPatchModel = new VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch.Builder()
      .address("192.0.2.5")
      .build();
    assertEquals(vpnGatewayConnectionPeerPatchModel.address(), "192.0.2.5");

    IP ipModel = new IP.Builder()
      .address("169.254.0.2")
      .build();
    assertEquals(ipModel.address(), "169.254.0.2");

    VPNGatewayConnectionTunnel vpnGatewayConnectionTunnelModel = new VPNGatewayConnectionTunnel.Builder()
      .neighborIp(ipModel)
      .tunnelInterfaceIp(ipModel)
      .build();
    assertEquals(vpnGatewayConnectionTunnelModel.neighborIp(), ipModel);
    assertEquals(vpnGatewayConnectionTunnelModel.tunnelInterfaceIp(), ipModel);

    VPNGatewayConnectionPatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatch.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPatchModel)
      .distributeTraffic(true)
      .establishMode("bidirectional")
      .ikePolicy(vpnGatewayConnectionIkePolicyPatchModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPatchModel)
      .name("my-vpn-gateway-connection")
      .peer(vpnGatewayConnectionPeerPatchModel)
      .psk("lkj14b1oi0alcniejkso")
      .routingProtocol("bgp")
      .tunnels(java.util.Arrays.asList(vpnGatewayConnectionTunnelModel))
      .build();
    assertEquals(vpnGatewayConnectionPatchModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchModel.deadPeerDetection(), vpnGatewayConnectionDpdPatchModel);
    assertEquals(vpnGatewayConnectionPatchModel.distributeTraffic(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchModel.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPatchModel.ikePolicy(), vpnGatewayConnectionIkePolicyPatchModel);
    assertEquals(vpnGatewayConnectionPatchModel.ipsecPolicy(), vpnGatewayConnectionIPsecPolicyPatchModel);
    assertEquals(vpnGatewayConnectionPatchModel.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPatchModel.peer(), vpnGatewayConnectionPeerPatchModel);
    assertEquals(vpnGatewayConnectionPatchModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPatchModel.routingProtocol(), "bgp");
    assertEquals(vpnGatewayConnectionPatchModel.tunnels(), java.util.Arrays.asList(vpnGatewayConnectionTunnelModel));

    String json = TestUtilities.serialize(vpnGatewayConnectionPatchModel);

    VPNGatewayConnectionPatch vpnGatewayConnectionPatchModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPatch.class);
    assertTrue(vpnGatewayConnectionPatchModelNew instanceof VPNGatewayConnectionPatch);
    assertEquals(vpnGatewayConnectionPatchModelNew.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchModelNew.deadPeerDetection().toString(), vpnGatewayConnectionDpdPatchModel.toString());
    assertEquals(vpnGatewayConnectionPatchModelNew.distributeTraffic(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchModelNew.establishMode(), "bidirectional");
    assertEquals(vpnGatewayConnectionPatchModelNew.ikePolicy().toString(), vpnGatewayConnectionIkePolicyPatchModel.toString());
    assertEquals(vpnGatewayConnectionPatchModelNew.ipsecPolicy().toString(), vpnGatewayConnectionIPsecPolicyPatchModel.toString());
    assertEquals(vpnGatewayConnectionPatchModelNew.name(), "my-vpn-gateway-connection");
    assertEquals(vpnGatewayConnectionPatchModelNew.peer().toString(), vpnGatewayConnectionPeerPatchModel.toString());
    assertEquals(vpnGatewayConnectionPatchModelNew.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPatchModelNew.routingProtocol(), "bgp");
  }
  @Test
  public void testVPNGatewayConnectionPatchAsPatch() throws Throwable {
    VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModel = new VPNGatewayConnectionDPDPatch.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();

    VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPatchModel = new VPNGatewayConnectionIKEPolicyPatchIKEPolicyIdentityById.Builder()
      .id("r006-e98f46a3-1e4e-4195-b4e5-b8155192689d")
      .build();

    VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById vpnGatewayConnectionIPsecPolicyPatchModel = new VPNGatewayConnectionIPsecPolicyPatchIPsecPolicyIdentityById.Builder()
      .id("r006-51eae621-dbbc-4c47-b623-b57a43c19876")
      .build();

    VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch vpnGatewayConnectionPeerPatchModel = new VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch.Builder()
      .address("192.0.2.5")
      .build();

    IP ipModel = new IP.Builder()
      .address("169.254.0.2")
      .build();

    VPNGatewayConnectionTunnel vpnGatewayConnectionTunnelModel = new VPNGatewayConnectionTunnel.Builder()
      .neighborIp(ipModel)
      .tunnelInterfaceIp(ipModel)
      .build();

    VPNGatewayConnectionPatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatch.Builder()
      .adminStateUp(true)
      .deadPeerDetection(vpnGatewayConnectionDpdPatchModel)
      .distributeTraffic(true)
      .establishMode("bidirectional")
      .ikePolicy(vpnGatewayConnectionIkePolicyPatchModel)
      .ipsecPolicy(vpnGatewayConnectionIPsecPolicyPatchModel)
      .name("my-vpn-gateway-connection")
      .peer(vpnGatewayConnectionPeerPatchModel)
      .psk("lkj14b1oi0alcniejkso")
      .routingProtocol("bgp")
      .tunnels(java.util.Arrays.asList(vpnGatewayConnectionTunnelModel))
      .build();

    Map<String, Object> mergePatch = vpnGatewayConnectionPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("admin_state_up"));
    assertTrue(mergePatch.containsKey("dead_peer_detection"));
    assertTrue(mergePatch.containsKey("distribute_traffic"));
    assertEquals(mergePatch.get("establish_mode"), "bidirectional");
    assertTrue(mergePatch.containsKey("ike_policy"));
    assertTrue(mergePatch.containsKey("ipsec_policy"));
    assertEquals(mergePatch.get("name"), "my-vpn-gateway-connection");
    assertTrue(mergePatch.containsKey("peer"));
    assertEquals(mergePatch.get("psk"), "lkj14b1oi0alcniejkso");
    assertEquals(mergePatch.get("routing_protocol"), "bgp");
    assertTrue(mergePatch.containsKey("tunnels"));
  }

}