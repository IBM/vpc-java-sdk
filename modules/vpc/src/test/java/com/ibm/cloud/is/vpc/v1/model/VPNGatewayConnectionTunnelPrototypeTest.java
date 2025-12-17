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
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionTunnelPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionTunnelPrototype model.
 */
public class VPNGatewayConnectionTunnelPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionTunnelPrototype() throws Throwable {
    IP ipModel = new IP.Builder()
      .address("169.254.0.2")
      .build();
    assertEquals(ipModel.address(), "169.254.0.2");

    VPNGatewayConnectionTunnelPrototype vpnGatewayConnectionTunnelPrototypeModel = new VPNGatewayConnectionTunnelPrototype.Builder()
      .neighborIp(ipModel)
      .tunnelInterfaceIp(ipModel)
      .build();
    assertEquals(vpnGatewayConnectionTunnelPrototypeModel.neighborIp(), ipModel);
    assertEquals(vpnGatewayConnectionTunnelPrototypeModel.tunnelInterfaceIp(), ipModel);

    String json = TestUtilities.serialize(vpnGatewayConnectionTunnelPrototypeModel);

    VPNGatewayConnectionTunnelPrototype vpnGatewayConnectionTunnelPrototypeModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionTunnelPrototype.class);
    assertTrue(vpnGatewayConnectionTunnelPrototypeModelNew instanceof VPNGatewayConnectionTunnelPrototype);
    assertEquals(vpnGatewayConnectionTunnelPrototypeModelNew.neighborIp().toString(), ipModel.toString());
    assertEquals(vpnGatewayConnectionTunnelPrototypeModelNew.tunnelInterfaceIp().toString(), ipModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionTunnelPrototypeError() throws Throwable {
    new VPNGatewayConnectionTunnelPrototype.Builder().build();
  }

}