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

import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionTunnel;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionTunnel model.
 */
public class VPNGatewayConnectionTunnelTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionTunnel() throws Throwable {
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

    String json = TestUtilities.serialize(vpnGatewayConnectionTunnelModel);

    VPNGatewayConnectionTunnel vpnGatewayConnectionTunnelModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionTunnel.class);
    assertTrue(vpnGatewayConnectionTunnelModelNew instanceof VPNGatewayConnectionTunnel);
    assertEquals(vpnGatewayConnectionTunnelModelNew.neighborIp().toString(), ipModel.toString());
    assertEquals(vpnGatewayConnectionTunnelModelNew.tunnelInterfaceIp().toString(), ipModel.toString());
  }
}