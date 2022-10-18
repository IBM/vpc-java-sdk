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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype;
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
 * Unit test class for the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype model.
 */
public class BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype() throws Throwable {
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

    BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel = new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.Builder()
      .allowIpSpoofing(true)
      .enableInfrastructureNat(true)
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .allowInterfaceToFloat(false)
      .interfaceType("vlan")
      .vlan(Long.valueOf("4"))
      .build();
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.name(), "my-network-interface");
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.subnet(), subnetIdentityModel);
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.allowInterfaceToFloat(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.interfaceType(), "vlan");
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel.vlan(), Long.valueOf("4"));

    String json = TestUtilities.serialize(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModel);

    BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew = TestUtilities.deserialize(json, BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.class);
    assertTrue(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew instanceof BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype);
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.name(), "my-network-interface");
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.primaryIp().toString(), networkInterfaceIpPrototypeModel.toString());
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.subnet().toString(), subnetIdentityModel.toString());
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.allowInterfaceToFloat(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.interfaceType(), "vlan");
    assertEquals(bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototypeModelNew.vlan(), Long.valueOf("4"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototypeError() throws Throwable {
    new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.Builder().build();
  }

}