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

import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPD;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDynamicRouteModeLocal;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDynamicRouteModePeerVPNGatewayConnectionPeerByAddress;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDynamicRouteModeTunnel;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEIdentityVPNGatewayConnectionIKEIdentityFQDN;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionRouteModeVPNGatewayConnectionDynamicRouteMode;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionStatusReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionTunnelStatusReason;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionRouteModeVPNGatewayConnectionDynamicRouteMode model.
 */
public class VPNGatewayConnectionRouteModeVPNGatewayConnectionDynamicRouteModeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionRouteModeVPNGatewayConnectionDynamicRouteMode() throws Throwable {
    VPNGatewayConnectionRouteModeVPNGatewayConnectionDynamicRouteMode vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel = new VPNGatewayConnectionRouteModeVPNGatewayConnectionDynamicRouteMode();
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.isAdminStateUp());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getAuthenticationMode());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getCreatedAt());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getDeadPeerDetection());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getEstablishMode());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getHref());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getId());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getIkePolicy());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getIpsecPolicy());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getMode());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getName());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getPsk());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getResourceType());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getStatus());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getStatusReasons());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.isDistributeTraffic());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getLocal());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getPeer());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getRoutingProtocol());
    assertNull(vpnGatewayConnectionRouteModeVpnGatewayConnectionDynamicRouteModeModel.getTunnels());
  }
}