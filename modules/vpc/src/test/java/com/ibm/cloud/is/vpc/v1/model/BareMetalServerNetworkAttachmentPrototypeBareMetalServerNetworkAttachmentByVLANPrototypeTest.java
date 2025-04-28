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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype model.
 */
public class BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype() throws Throwable {
    VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext virtualNetworkInterfaceIpPrototypeModel = new VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();
    assertEquals(virtualNetworkInterfaceIpPrototypeModel.address(), "10.0.0.5");
    assertEquals(virtualNetworkInterfaceIpPrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(virtualNetworkInterfaceIpPrototypeModel.name(), "my-reserved-ip");

    VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeModel.address(), "10.0.0.5");
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeModel.name(), "my-reserved-ip");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel = new BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.Builder()
      .allowIpSpoofing(true)
      .autoDelete(false)
      .enableInfrastructureNat(true)
      .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
      .name("my-virtual-network-interface")
      .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
      .protocolStateFilteringMode("auto")
      .resourceGroup(resourceGroupIdentityModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.ips(), java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.name(), "my-virtual-network-interface");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.primaryIp(), virtualNetworkInterfacePrimaryIpPrototypeModel);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.protocolStateFilteringMode(), "auto");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.subnet(), subnetIdentityModel);

    BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModel = new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype.Builder()
      .name("my-bare-metal-server-network-attachment")
      .virtualNetworkInterface(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
      .allowToFloat(false)
      .interfaceType("vlan")
      .vlan(Long.valueOf("4"))
      .build();
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModel.name(), "my-bare-metal-server-network-attachment");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModel.virtualNetworkInterface(), bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModel.allowToFloat(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModel.interfaceType(), "vlan");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModel.vlan(), Long.valueOf("4"));

    String json = TestUtilities.serialize(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModel);

    BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModelNew = TestUtilities.deserialize(json, BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype.class);
    assertTrue(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModelNew instanceof BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModelNew.name(), "my-bare-metal-server-network-attachment");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModelNew.virtualNetworkInterface().toString(), bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.toString());
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModelNew.allowToFloat(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModelNew.interfaceType(), "vlan");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototypeModelNew.vlan(), Long.valueOf("4"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototypeError() throws Throwable {
    new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype.Builder().build();
  }

}