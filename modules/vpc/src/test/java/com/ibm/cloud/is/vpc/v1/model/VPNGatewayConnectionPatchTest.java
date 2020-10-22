/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.IKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatch;
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
    VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototypeModel = new VPNGatewayConnectionDPDPrototype.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();
    assertEquals(vpnGatewayConnectionDpdPrototypeModel.action(), "restart");
    assertEquals(vpnGatewayConnectionDpdPrototypeModel.interval(), Long.valueOf("30"));
    assertEquals(vpnGatewayConnectionDpdPrototypeModel.timeout(), Long.valueOf("120"));

    IKEPolicyIdentityById ikePolicyIdentityModel = new IKEPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(ikePolicyIdentityModel.id(), "ddf51bec-3424-11e8-b467-0ed5f89f718b");

    IPsecPolicyIdentityById iPsecPolicyIdentityModel = new IPsecPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(iPsecPolicyIdentityModel.id(), "ddf51bec-3424-11e8-b467-0ed5f89f718b");

    VPNGatewayConnectionPatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatch.Builder()
      .adminStateUp(true)
      .peerAddress("169.21.50.5")
      .name("my-vpn-connection")
      .psk("lkj14b1oi0alcniejkso")
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .ikePolicy(ikePolicyIdentityModel)
      .ipsecPolicy(iPsecPolicyIdentityModel)
      .build();
    assertEquals(vpnGatewayConnectionPatchModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchModel.peerAddress(), "169.21.50.5");
    assertEquals(vpnGatewayConnectionPatchModel.name(), "my-vpn-connection");
    assertEquals(vpnGatewayConnectionPatchModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPatchModel.deadPeerDetection(), vpnGatewayConnectionDpdPrototypeModel);
    assertEquals(vpnGatewayConnectionPatchModel.ikePolicy(), ikePolicyIdentityModel);
    assertEquals(vpnGatewayConnectionPatchModel.ipsecPolicy(), iPsecPolicyIdentityModel);

    String json = TestUtilities.serialize(vpnGatewayConnectionPatchModel);

    VPNGatewayConnectionPatch vpnGatewayConnectionPatchModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPatch.class);
    assertTrue(vpnGatewayConnectionPatchModelNew instanceof VPNGatewayConnectionPatch);
    assertEquals(vpnGatewayConnectionPatchModelNew.adminStateUp(), Boolean.valueOf(true));
    assertEquals(vpnGatewayConnectionPatchModelNew.peerAddress(), "169.21.50.5");
    assertEquals(vpnGatewayConnectionPatchModelNew.name(), "my-vpn-connection");
    assertEquals(vpnGatewayConnectionPatchModelNew.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(vpnGatewayConnectionPatchModelNew.deadPeerDetection().toString(), vpnGatewayConnectionDpdPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPatchModelNew.ikePolicy().toString(), ikePolicyIdentityModel.toString());
    assertEquals(vpnGatewayConnectionPatchModelNew.ipsecPolicy().toString(), iPsecPolicyIdentityModel.toString());
  }
  @Test
  public void testVPNGatewayConnectionPatchAsPatch() throws Throwable {
    VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototypeModel = new VPNGatewayConnectionDPDPrototype.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();

    IKEPolicyIdentityById ikePolicyIdentityModel = new IKEPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

    IPsecPolicyIdentityById iPsecPolicyIdentityModel = new IPsecPolicyIdentityById.Builder()
      .id("ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();

    VPNGatewayConnectionPatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatch.Builder()
      .adminStateUp(true)
      .peerAddress("169.21.50.5")
      .name("my-vpn-connection")
      .psk("lkj14b1oi0alcniejkso")
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .ikePolicy(ikePolicyIdentityModel)
      .ipsecPolicy(iPsecPolicyIdentityModel)
      .build();

    Map<String, Object> mergePatch = vpnGatewayConnectionPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("admin_state_up"));
    assertEquals(mergePatch.get("peer_address"), "169.21.50.5");
    assertEquals(mergePatch.get("name"), "my-vpn-connection");
    assertEquals(mergePatch.get("psk"), "lkj14b1oi0alcniejkso");
    assertTrue(mergePatch.containsKey("dead_peer_detection"));
    assertTrue(mergePatch.containsKey("ike_policy"));
    assertTrue(mergePatch.containsKey("ipsec_policy"));
  }

}