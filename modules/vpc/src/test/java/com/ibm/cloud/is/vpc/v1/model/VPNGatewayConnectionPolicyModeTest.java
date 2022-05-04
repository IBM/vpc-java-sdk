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

import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPD;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPolicyMode;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionPolicyMode model.
 */
public class VPNGatewayConnectionPolicyModeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionPolicyMode() throws Throwable {
    VPNGatewayConnectionPolicyMode vpnGatewayConnectionPolicyModeModel = new VPNGatewayConnectionPolicyMode();
    assertNull(vpnGatewayConnectionPolicyModeModel.isAdminStateUp());
    assertNull(vpnGatewayConnectionPolicyModeModel.getAuthenticationMode());
    assertNull(vpnGatewayConnectionPolicyModeModel.getCreatedAt());
    assertNull(vpnGatewayConnectionPolicyModeModel.getDeadPeerDetection());
    assertNull(vpnGatewayConnectionPolicyModeModel.getHref());
    assertNull(vpnGatewayConnectionPolicyModeModel.getId());
    assertNull(vpnGatewayConnectionPolicyModeModel.getIkePolicy());
    assertNull(vpnGatewayConnectionPolicyModeModel.getIpsecPolicy());
    assertNull(vpnGatewayConnectionPolicyModeModel.getMode());
    assertNull(vpnGatewayConnectionPolicyModeModel.getName());
    assertNull(vpnGatewayConnectionPolicyModeModel.getPeerAddress());
    assertNull(vpnGatewayConnectionPolicyModeModel.getPsk());
    assertNull(vpnGatewayConnectionPolicyModeModel.getResourceType());
    assertNull(vpnGatewayConnectionPolicyModeModel.getStatus());
    assertNull(vpnGatewayConnectionPolicyModeModel.getLocalCidrs());
    assertNull(vpnGatewayConnectionPolicyModeModel.getPeerCidrs());
  }
}