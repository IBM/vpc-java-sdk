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

import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateVpnGatewayConnectionOptions model.
 */
public class CreateVpnGatewayConnectionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpnGatewayConnectionOptions() throws Throwable {
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

    CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptionsModel = new CreateVpnGatewayConnectionOptions.Builder()
      .vpnGatewayId("testString")
      .peerAddress("169.21.50.5")
      .psk("lkj14b1oi0alcniejkso")
      .adminStateUp(true)
      .name("my-vpn-connection")
      .deadPeerDetection(vpnGatewayConnectionDpdPrototypeModel)
      .ikePolicy(ikePolicyIdentityModel)
      .ipsecPolicy(iPsecPolicyIdentityModel)
      .localCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("192.168.1.0/24")))
      .peerCidrs(new java.util.ArrayList<String>(java.util.Arrays.asList("10.45.1.0/24")))
      .build();
    assertEquals(createVpnGatewayConnectionOptionsModel.vpnGatewayId(), "testString");
    assertEquals(createVpnGatewayConnectionOptionsModel.peerAddress(), "169.21.50.5");
    assertEquals(createVpnGatewayConnectionOptionsModel.psk(), "lkj14b1oi0alcniejkso");
    assertEquals(createVpnGatewayConnectionOptionsModel.adminStateUp(), Boolean.valueOf(true));
    assertEquals(createVpnGatewayConnectionOptionsModel.name(), "my-vpn-connection");
    assertEquals(createVpnGatewayConnectionOptionsModel.deadPeerDetection(), vpnGatewayConnectionDpdPrototypeModel);
    assertEquals(createVpnGatewayConnectionOptionsModel.ikePolicy(), ikePolicyIdentityModel);
    assertEquals(createVpnGatewayConnectionOptionsModel.ipsecPolicy(), iPsecPolicyIdentityModel);
    assertEquals(createVpnGatewayConnectionOptionsModel.localCidrs(), new java.util.ArrayList<String>(java.util.Arrays.asList("192.168.1.0/24")));
    assertEquals(createVpnGatewayConnectionOptionsModel.peerCidrs(), new java.util.ArrayList<String>(java.util.Arrays.asList("10.45.1.0/24")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpnGatewayConnectionOptionsError() throws Throwable {
    new CreateVpnGatewayConnectionOptions.Builder().build();
  }

}