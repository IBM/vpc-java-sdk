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

import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateVpnGatewayOptions model.
 */
public class CreateVpnGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpnGatewayOptions() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    VPNGatewayPrototypeVPNGatewayRouteModePrototype vpnGatewayPrototypeModel = new VPNGatewayPrototypeVPNGatewayRouteModePrototype.Builder()
      .name("my-vpn-gateway")
      .resourceGroup(resourceGroupIdentityModel)
      .subnet(subnetIdentityModel)
      .mode("route")
      .build();
    assertEquals(vpnGatewayPrototypeModel.name(), "my-vpn-gateway");
    assertEquals(vpnGatewayPrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(vpnGatewayPrototypeModel.subnet(), subnetIdentityModel);
    assertEquals(vpnGatewayPrototypeModel.mode(), "route");

    CreateVpnGatewayOptions createVpnGatewayOptionsModel = new CreateVpnGatewayOptions.Builder()
      .vpnGatewayPrototype(vpnGatewayPrototypeModel)
      .build();
    assertEquals(createVpnGatewayOptionsModel.vpnGatewayPrototype(), vpnGatewayPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpnGatewayOptionsError() throws Throwable {
    new CreateVpnGatewayOptions.Builder().build();
  }

}