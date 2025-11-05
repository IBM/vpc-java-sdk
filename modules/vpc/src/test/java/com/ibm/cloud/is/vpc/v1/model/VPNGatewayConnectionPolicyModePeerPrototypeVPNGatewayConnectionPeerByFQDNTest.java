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
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN model.
 */
public class VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN() throws Throwable {
    VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN vpnGatewayConnectionIkeIdentityPrototypeModel = new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN.Builder()
      .type("fqdn")
      .value("my-service.example.com")
      .build();
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.type(), "fqdn");
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.value(), "my-service.example.com");

    VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModel = new VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN.Builder()
      .cidrs(java.util.Arrays.asList("203.0.113.0/24"))
      .ikeIdentity(vpnGatewayConnectionIkeIdentityPrototypeModel)
      .fqdn("my-service.example.com")
      .build();
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModel.cidrs(), java.util.Arrays.asList("203.0.113.0/24"));
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModel.ikeIdentity(), vpnGatewayConnectionIkeIdentityPrototypeModel);
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModel.fqdn(), "my-service.example.com");

    String json = TestUtilities.serialize(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModel);

    VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN.class);
    assertTrue(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModelNew instanceof VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN);
    TestUtilities.assertJsonEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModelNew.ikeIdentity().toString(), vpnGatewayConnectionIkeIdentityPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdnModelNew.fqdn(), "my-service.example.com");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDNError() throws Throwable {
    new VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN.Builder().build();
  }

}