/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionsLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CheckVpnGatewayConnectionsLocalCidrOptions model.
 */
public class CheckVpnGatewayConnectionsLocalCidrOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCheckVpnGatewayConnectionsLocalCidrOptions() throws Throwable {
    CheckVpnGatewayConnectionsLocalCidrOptions checkVpnGatewayConnectionsLocalCidrOptionsModel = new CheckVpnGatewayConnectionsLocalCidrOptions.Builder()
      .vpnGatewayId("testString")
      .id("testString")
      .cidr("192.168.1.0/24")
      .build();
    assertEquals(checkVpnGatewayConnectionsLocalCidrOptionsModel.vpnGatewayId(), "testString");
    assertEquals(checkVpnGatewayConnectionsLocalCidrOptionsModel.id(), "testString");
    assertEquals(checkVpnGatewayConnectionsLocalCidrOptionsModel.cidr(), "192.168.1.0/24");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCheckVpnGatewayConnectionsLocalCidrOptionsError() throws Throwable {
    new CheckVpnGatewayConnectionsLocalCidrOptions.Builder().build();
  }

}