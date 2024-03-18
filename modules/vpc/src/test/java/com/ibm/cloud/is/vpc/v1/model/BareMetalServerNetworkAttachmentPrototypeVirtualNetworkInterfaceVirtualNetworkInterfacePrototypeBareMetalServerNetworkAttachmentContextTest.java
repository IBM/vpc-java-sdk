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
 * Unit test class for the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext model.
 */
public class BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext() throws Throwable {
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
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("2302-ea5fe79f-52c3-4f05-86ae-9540a10489f5")
      .build();
    assertEquals(subnetIdentityModel.id(), "2302-ea5fe79f-52c3-4f05-86ae-9540a10489f5");

    BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel = new BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.Builder()
      .allowIpSpoofing(true)
      .autoDelete(false)
      .enableInfrastructureNat(true)
      .ips(java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel))
      .name("my-virtual-network-interface")
      .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
      .resourceGroup(resourceGroupIdentityModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.ips(), java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.name(), "my-virtual-network-interface");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.primaryIp(), virtualNetworkInterfacePrimaryIpPrototypeModel);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel.subnet(), subnetIdentityModel);

    String json = TestUtilities.serialize(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModel);

    BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew = TestUtilities.deserialize(json, BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.class);
    assertTrue(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew instanceof BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew.autoDelete(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew.name(), "my-virtual-network-interface");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew.primaryIp().toString(), virtualNetworkInterfacePrimaryIpPrototypeModel.toString());
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContextModelNew.subnet().toString(), subnetIdentityModel.toString());
  }
}