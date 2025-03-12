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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkAttachmentPrototypeBareMetalServerPrimaryNetworkAttachmentByPCIPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrototypeBareMetalServerByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModulePrototype;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateBareMetalServerOptions model.
 */
public class CreateBareMetalServerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBareMetalServerOptions() throws Throwable {
    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .build();
    assertEquals(imageIdentityModel.id(), "r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8");

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(keyIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    BareMetalServerInitializationPrototype bareMetalServerInitializationPrototypeModel = new BareMetalServerInitializationPrototype.Builder()
      .image(imageIdentityModel)
      .keys(java.util.Arrays.asList(keyIdentityModel))
      .userData("testString")
      .build();
    assertEquals(bareMetalServerInitializationPrototypeModel.image(), imageIdentityModel);
    assertEquals(bareMetalServerInitializationPrototypeModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(bareMetalServerInitializationPrototypeModel.userData(), "testString");

    BareMetalServerProfileIdentityByName bareMetalServerProfileIdentityModel = new BareMetalServerProfileIdentityByName.Builder()
      .name("bx2-metal-192x768")
      .build();
    assertEquals(bareMetalServerProfileIdentityModel.name(), "bx2-metal-192x768");

    ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
      .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .build();
    assertEquals(reservationIdentityModel.id(), "0717-ba49df72-37b8-43ac-98da-f8e029de0e63");

    BareMetalServerReservationAffinityPrototype bareMetalServerReservationAffinityPrototypeModel = new BareMetalServerReservationAffinityPrototype.Builder()
      .policy("automatic")
      .pool(java.util.Arrays.asList(reservationIdentityModel))
      .build();
    assertEquals(bareMetalServerReservationAffinityPrototypeModel.policy(), "automatic");
    assertEquals(bareMetalServerReservationAffinityPrototypeModel.pool(), java.util.Arrays.asList(reservationIdentityModel));

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    BareMetalServerTrustedPlatformModulePrototype bareMetalServerTrustedPlatformModulePrototypeModel = new BareMetalServerTrustedPlatformModulePrototype.Builder()
      .mode("disabled")
      .build();
    assertEquals(bareMetalServerTrustedPlatformModulePrototypeModel.mode(), "disabled");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

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

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

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

    BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype bareMetalServerNetworkAttachmentPrototypeModel = new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype.Builder()
      .name("my-bare-metal-server-network-attachment")
      .virtualNetworkInterface(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .interfaceType("pci")
      .build();
    assertEquals(bareMetalServerNetworkAttachmentPrototypeModel.name(), "my-bare-metal-server-network-attachment");
    assertEquals(bareMetalServerNetworkAttachmentPrototypeModel.virtualNetworkInterface(), bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel);
    assertEquals(bareMetalServerNetworkAttachmentPrototypeModel.allowedVlans(), java.util.Arrays.asList(Long.valueOf("4")));
    assertEquals(bareMetalServerNetworkAttachmentPrototypeModel.interfaceType(), "pci");

    BareMetalServerPrimaryNetworkAttachmentPrototypeBareMetalServerPrimaryNetworkAttachmentByPCIPrototype bareMetalServerPrimaryNetworkAttachmentPrototypeModel = new BareMetalServerPrimaryNetworkAttachmentPrototypeBareMetalServerPrimaryNetworkAttachmentByPCIPrototype.Builder()
      .name("my-bare-metal-server-network-attachment")
      .virtualNetworkInterface(bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .interfaceType("pci")
      .build();
    assertEquals(bareMetalServerPrimaryNetworkAttachmentPrototypeModel.name(), "my-bare-metal-server-network-attachment");
    assertEquals(bareMetalServerPrimaryNetworkAttachmentPrototypeModel.virtualNetworkInterface(), bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceModel);
    assertEquals(bareMetalServerPrimaryNetworkAttachmentPrototypeModel.allowedVlans(), java.util.Arrays.asList(Long.valueOf("4")));
    assertEquals(bareMetalServerPrimaryNetworkAttachmentPrototypeModel.interfaceType(), "pci");

    BareMetalServerPrototypeBareMetalServerByNetworkAttachment bareMetalServerPrototypeModel = new BareMetalServerPrototypeBareMetalServerByNetworkAttachment.Builder()
      .bandwidth(Long.valueOf("20000"))
      .enableSecureBoot(false)
      .initialization(bareMetalServerInitializationPrototypeModel)
      .name("my-bare-metal-server")
      .profile(bareMetalServerProfileIdentityModel)
      .reservationAffinity(bareMetalServerReservationAffinityPrototypeModel)
      .resourceGroup(resourceGroupIdentityModel)
      .trustedPlatformModule(bareMetalServerTrustedPlatformModulePrototypeModel)
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .networkAttachments(java.util.Arrays.asList(bareMetalServerNetworkAttachmentPrototypeModel))
      .primaryNetworkAttachment(bareMetalServerPrimaryNetworkAttachmentPrototypeModel)
      .build();
    assertEquals(bareMetalServerPrototypeModel.bandwidth(), Long.valueOf("20000"));
    assertEquals(bareMetalServerPrototypeModel.enableSecureBoot(), Boolean.valueOf(false));
    assertEquals(bareMetalServerPrototypeModel.initialization(), bareMetalServerInitializationPrototypeModel);
    assertEquals(bareMetalServerPrototypeModel.name(), "my-bare-metal-server");
    assertEquals(bareMetalServerPrototypeModel.profile(), bareMetalServerProfileIdentityModel);
    assertEquals(bareMetalServerPrototypeModel.reservationAffinity(), bareMetalServerReservationAffinityPrototypeModel);
    assertEquals(bareMetalServerPrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(bareMetalServerPrototypeModel.trustedPlatformModule(), bareMetalServerTrustedPlatformModulePrototypeModel);
    assertEquals(bareMetalServerPrototypeModel.vpc(), vpcIdentityModel);
    assertEquals(bareMetalServerPrototypeModel.zone(), zoneIdentityModel);
    assertEquals(bareMetalServerPrototypeModel.networkAttachments(), java.util.Arrays.asList(bareMetalServerNetworkAttachmentPrototypeModel));
    assertEquals(bareMetalServerPrototypeModel.primaryNetworkAttachment(), bareMetalServerPrimaryNetworkAttachmentPrototypeModel);

    CreateBareMetalServerOptions createBareMetalServerOptionsModel = new CreateBareMetalServerOptions.Builder()
      .bareMetalServerPrototype(bareMetalServerPrototypeModel)
      .build();
    assertEquals(createBareMetalServerOptionsModel.bareMetalServerPrototype(), bareMetalServerPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBareMetalServerOptionsError() throws Throwable {
    new CreateBareMetalServerOptions.Builder().build();
  }

}