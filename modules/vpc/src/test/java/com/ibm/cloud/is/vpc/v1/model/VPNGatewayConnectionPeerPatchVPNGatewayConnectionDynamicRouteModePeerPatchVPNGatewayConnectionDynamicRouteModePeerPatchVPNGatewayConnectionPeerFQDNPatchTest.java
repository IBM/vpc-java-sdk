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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch model.
 */
public class VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch() throws Throwable {
    VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModel = new VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch.Builder()
      .asn(Long.valueOf("26"))
      .fqdn("my-service.example.com")
      .build();
    assertEquals(vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModel.asn(), Long.valueOf("26"));
    assertEquals(vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModel.fqdn(), "my-service.example.com");

    String json = TestUtilities.serialize(vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModel);

    VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch.class);
    assertTrue(vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModelNew instanceof VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch);
    assertEquals(vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModelNew.asn(), Long.valueOf("26"));
    assertEquals(vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatchModelNew.fqdn(), "my-service.example.com");
  }
}