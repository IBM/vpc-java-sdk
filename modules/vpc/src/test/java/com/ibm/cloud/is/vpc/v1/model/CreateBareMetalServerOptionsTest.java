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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPrimaryNetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.CreateBareMetalServerOptions;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
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
 * Unit test class for the CreateBareMetalServerOptions model.
 */
public class CreateBareMetalServerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBareMetalServerOptions() throws Throwable {
    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .build();
    assertEquals(imageIdentityModel.id(), "72b27b5c-f4b0-48bb-b954-5becc7c1dcb8");

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(keyIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    BareMetalServerInitializationPrototype bareMetalServerInitializationPrototypeModel = new BareMetalServerInitializationPrototype.Builder()
      .image(imageIdentityModel)
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .userData("testString")
      .build();
    assertEquals(bareMetalServerInitializationPrototypeModel.image(), imageIdentityModel);
    assertEquals(bareMetalServerInitializationPrototypeModel.keys(), new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)));
    assertEquals(bareMetalServerInitializationPrototypeModel.userData(), "testString");

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
      .allowedVlans(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("4"))))
      .enableInfrastructureNat(true)
      .interfaceType("pci")
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.allowedVlans(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("4"))));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.interfaceType(), "pci");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.name(), "my-network-interface");
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.securityGroups(), new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)));
    assertEquals(bareMetalServerPrimaryNetworkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    BareMetalServerProfileIdentityByName bareMetalServerProfileIdentityModel = new BareMetalServerProfileIdentityByName.Builder()
      .name("bx2-metal-192x768")
      .build();
    assertEquals(bareMetalServerProfileIdentityModel.name(), "bx2-metal-192x768");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype bareMetalServerNetworkInterfacePrototypeModel = new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.Builder()
      .allowIpSpoofing(true)
      .enableInfrastructureNat(true)
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .allowInterfaceToFloat(false)
      .interfaceType("vlan")
      .vlan(Long.valueOf("4"))
      .build();
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.name(), "my-network-interface");
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.securityGroups(), new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)));
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.subnet(), subnetIdentityModel);
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.allowInterfaceToFloat(), Boolean.valueOf(false));
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.interfaceType(), "vlan");
    assertEquals(bareMetalServerNetworkInterfacePrototypeModel.vlan(), Long.valueOf("4"));

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    CreateBareMetalServerOptions createBareMetalServerOptionsModel = new CreateBareMetalServerOptions.Builder()
      .initialization(bareMetalServerInitializationPrototypeModel)
      .primaryNetworkInterface(bareMetalServerPrimaryNetworkInterfacePrototypeModel)
      .profile(bareMetalServerProfileIdentityModel)
      .zone(zoneIdentityModel)
      .name("my-bare-metal-server")
      .networkInterfaces(new java.util.ArrayList<BareMetalServerNetworkInterfacePrototype>(java.util.Arrays.asList(bareMetalServerNetworkInterfacePrototypeModel)))
      .resourceGroup(resourceGroupIdentityModel)
      .vpc(vpcIdentityModel)
      .build();
    assertEquals(createBareMetalServerOptionsModel.initialization(), bareMetalServerInitializationPrototypeModel);
    assertEquals(createBareMetalServerOptionsModel.primaryNetworkInterface(), bareMetalServerPrimaryNetworkInterfacePrototypeModel);
    assertEquals(createBareMetalServerOptionsModel.profile(), bareMetalServerProfileIdentityModel);
    assertEquals(createBareMetalServerOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createBareMetalServerOptionsModel.name(), "my-bare-metal-server");
    assertEquals(createBareMetalServerOptionsModel.networkInterfaces(), new java.util.ArrayList<BareMetalServerNetworkInterfacePrototype>(java.util.Arrays.asList(bareMetalServerNetworkInterfacePrototypeModel)));
    assertEquals(createBareMetalServerOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createBareMetalServerOptionsModel.vpc(), vpcIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBareMetalServerOptionsError() throws Throwable {
    new CreateBareMetalServerOptions.Builder().build();
  }

}