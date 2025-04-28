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
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrototypeBareMetalServerByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModulePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerPrototypeBareMetalServerByNetworkInterface model.
 */
public class BareMetalServerPrototypeBareMetalServerByNetworkInterfaceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerPrototypeBareMetalServerByNetworkInterface() throws Throwable {
    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .build();
    assertEquals(imageIdentityModel.id(), "r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8");

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
      .build();
    assertEquals(keyIdentityModel.id(), "r006-82679077-ac3b-4c10-be16-63e9c21f0f45");

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

    BareMetalServerPrimaryNetworkInterfacePrototype bareMetalServerPrimaryNetworkInterfacePrototypeModel = new BareMetalServerPrimaryNetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .enableInfrastructureNat(true)
      .interfaceType("pci")
      .name("my-bare-metal-server-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.allowedVlans(), java.util.Arrays.asList(Long.valueOf("4")));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.interfaceType(), "pci");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.name(), "my-bare-metal-server-network-interface");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    BareMetalServerPrototypeBareMetalServerByNetworkInterface bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel = new BareMetalServerPrototypeBareMetalServerByNetworkInterface.Builder()
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
      .networkInterfaces(java.util.Arrays.asList(bareMetalServerNetworkInterfacePrototypeModel))
      .primaryNetworkInterface(bareMetalServerPrimaryNetworkInterfacePrototypeModel)
      .build();
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.bandwidth(), Long.valueOf("20000"));
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.enableSecureBoot(), Boolean.valueOf(false));
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.initialization(), bareMetalServerInitializationPrototypeModel);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.name(), "my-bare-metal-server");
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.profile(), bareMetalServerProfileIdentityModel);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.reservationAffinity(), bareMetalServerReservationAffinityPrototypeModel);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.trustedPlatformModule(), bareMetalServerTrustedPlatformModulePrototypeModel);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.vpc(), vpcIdentityModel);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.zone(), zoneIdentityModel);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.networkInterfaces(), java.util.Arrays.asList(bareMetalServerNetworkInterfacePrototypeModel));
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel.primaryNetworkInterface(), bareMetalServerPrimaryNetworkInterfacePrototypeModel);

    String json = TestUtilities.serialize(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModel);

    BareMetalServerPrototypeBareMetalServerByNetworkInterface bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew = TestUtilities.deserialize(json, BareMetalServerPrototypeBareMetalServerByNetworkInterface.class);
    assertTrue(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew instanceof BareMetalServerPrototypeBareMetalServerByNetworkInterface);
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.bandwidth(), Long.valueOf("20000"));
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.enableSecureBoot(), Boolean.valueOf(false));
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.initialization().toString(), bareMetalServerInitializationPrototypeModel.toString());
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.name(), "my-bare-metal-server");
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.profile().toString(), bareMetalServerProfileIdentityModel.toString());
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.reservationAffinity().toString(), bareMetalServerReservationAffinityPrototypeModel.toString());
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.trustedPlatformModule().toString(), bareMetalServerTrustedPlatformModulePrototypeModel.toString());
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(bareMetalServerPrototypeBareMetalServerByNetworkInterfaceModelNew.primaryNetworkInterface().toString(), bareMetalServerPrimaryNetworkInterfacePrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBareMetalServerPrototypeBareMetalServerByNetworkInterfaceError() throws Throwable {
    new BareMetalServerPrototypeBareMetalServerByNetworkInterface.Builder().build();
  }

}