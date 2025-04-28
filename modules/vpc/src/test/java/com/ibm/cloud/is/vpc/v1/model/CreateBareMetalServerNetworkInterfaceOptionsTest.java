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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateBareMetalServerNetworkInterfaceOptions model.
 */
public class CreateBareMetalServerNetworkInterfaceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBareMetalServerNetworkInterfaceOptions() throws Throwable {
    NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();
    assertEquals(networkInterfaceIpPrototypeModel.address(), "10.0.0.5");
    assertEquals(networkInterfaceIpPrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(networkInterfaceIpPrototypeModel.name(), "my-reserved-ip");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype bareMetalServerNetworkInterfacePrototypeModel = new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.Builder()
      .allowIpSpoofing(true)
      .enableInfrastructureNat(true)
      .name("my-bare-metal-server-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .interfaceType("hipersocket")
      .build();
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.name(), "my-bare-metal-server-network-interface");
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.subnet(), subnetIdentityModel);
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.interfaceType(), "hipersocket");

    CreateBareMetalServerNetworkInterfaceOptions createBareMetalServerNetworkInterfaceOptionsModel = new CreateBareMetalServerNetworkInterfaceOptions.Builder()
      .bareMetalServerId("testString")
      .bareMetalServerNetworkInterfacePrototype(bareMetalServerNetworkInterfacePrototypeModel)
      .build();
    assertEquals(createBareMetalServerNetworkInterfaceOptionsModel.bareMetalServerId(), "testString");
    assertEquals(createBareMetalServerNetworkInterfaceOptionsModel.bareMetalServerNetworkInterfacePrototype(), bareMetalServerNetworkInterfacePrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBareMetalServerNetworkInterfaceOptionsError() throws Throwable {
    new CreateBareMetalServerNetworkInterfaceOptions.Builder().build();
  }

}