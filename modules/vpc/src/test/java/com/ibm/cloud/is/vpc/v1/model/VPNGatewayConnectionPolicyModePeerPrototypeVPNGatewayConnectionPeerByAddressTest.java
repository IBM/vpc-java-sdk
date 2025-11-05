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
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress model.
 */
public class VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddressTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress() throws Throwable {
    VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN vpnGatewayConnectionIkeIdentityPrototypeModel = new VPNGatewayConnectionIKEIdentityPrototypeVPNGatewayConnectionIKEIdentityFQDN.Builder()
      .type("fqdn")
      .value("my-service.example.com")
      .build();
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.type(), "fqdn");
    assertEquals(vpnGatewayConnectionIkeIdentityPrototypeModel.value(), "my-service.example.com");

    VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModel = new VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder()
      .cidrs(java.util.Arrays.asList("203.0.113.0/24"))
      .ikeIdentity(vpnGatewayConnectionIkeIdentityPrototypeModel)
      .address("192.0.2.5")
      .build();
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModel.cidrs(), java.util.Arrays.asList("203.0.113.0/24"));
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModel.ikeIdentity(), vpnGatewayConnectionIkeIdentityPrototypeModel);
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModel.address(), "192.0.2.5");

    String json = TestUtilities.serialize(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModel);

    VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress.class);
    assertTrue(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew instanceof VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress);
    TestUtilities.assertJsonEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew.ikeIdentity().toString(), vpnGatewayConnectionIkeIdentityPrototypeModel.toString());
    assertEquals(vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByAddressModelNew.address(), "192.0.2.5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddressError() throws Throwable {
    new VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress.Builder().build();
  }

}