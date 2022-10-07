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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkInterfacePrototype;
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
 * Unit test class for the BareMetalServerPrimaryNetworkInterfacePrototype model.
 */
public class BareMetalServerPrimaryNetworkInterfacePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerPrimaryNetworkInterfacePrototype() throws Throwable {
    NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();
    assertEquals(networkInterfaceIpPrototypeModel.address(), "10.0.0.5");
    assertEquals(networkInterfaceIpPrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(networkInterfaceIpPrototypeModel.name(), "my-reserved-ip");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    BareMetalServerPrimaryNetworkInterfacePrototype bareMetalServerPrimaryNetworkInterfacePrototypeModel = new BareMetalServerPrimaryNetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .enableInfrastructureNat(true)
      .interfaceType("pci")
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.allowedVlans(), java.util.Arrays.asList(Long.valueOf("4")));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.interfaceType(), "pci");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.name(), "my-network-interface");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    String json = TestUtilities.serialize(bareMetalServerPrimaryNetworkInterfacePrototypeModel);

    BareMetalServerPrimaryNetworkInterfacePrototype bareMetalServerPrimaryNetworkInterfacePrototypeModelNew = TestUtilities.deserialize(json, BareMetalServerPrimaryNetworkInterfacePrototype.class);
    assertTrue(bareMetalServerPrimaryNetworkInterfacePrototypeModelNew instanceof BareMetalServerPrimaryNetworkInterfacePrototype);
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModelNew.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModelNew.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModelNew.interfaceType(), "pci");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModelNew.name(), "my-network-interface");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModelNew.primaryIp().toString(), networkInterfaceIpPrototypeModel.toString());
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModelNew.subnet().toString(), subnetIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBareMetalServerPrimaryNetworkInterfacePrototypeError() throws Throwable {
    new BareMetalServerPrimaryNetworkInterfacePrototype.Builder().build();
  }

}