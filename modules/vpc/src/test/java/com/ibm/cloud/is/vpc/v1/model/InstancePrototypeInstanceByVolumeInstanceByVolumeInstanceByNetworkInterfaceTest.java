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

import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface model.
 */
public class InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface() throws Throwable {
    InstanceAvailabilityPolicyPrototype instanceAvailabilityPolicyPrototypeModel = new InstanceAvailabilityPolicyPrototype.Builder()
      .hostFailure("restart")
      .build();
    assertEquals(instanceAvailabilityPolicyPrototypeModel.hostFailure(), "restart");

    TrustedProfileIdentityTrustedProfileById trustedProfileIdentityModel = new TrustedProfileIdentityTrustedProfileById.Builder()
      .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();
    assertEquals(trustedProfileIdentityModel.id(), "Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");

    InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
      .autoLink(false)
      .target(trustedProfileIdentityModel)
      .build();
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.autoLink(), Boolean.valueOf(false));
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.target(), trustedProfileIdentityModel);

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(keyIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    InstanceMetadataServicePrototype instanceMetadataServicePrototypeModel = new InstanceMetadataServicePrototype.Builder()
      .enabled(false)
      .protocol("https")
      .responseHopLimit(Long.valueOf("2"))
      .build();
    assertEquals(instanceMetadataServicePrototypeModel.enabled(), Boolean.valueOf(false));
    assertEquals(instanceMetadataServicePrototypeModel.protocol(), "https");
    assertEquals(instanceMetadataServicePrototypeModel.responseHopLimit(), Long.valueOf("2"));

    InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(instancePlacementTargetPrototypeModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
      .name("cx2-16x32")
      .build();
    assertEquals(instanceProfileIdentityModel.name(), "cx2-16x32");

    ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
      .id("7187-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .build();
    assertEquals(reservationIdentityModel.id(), "7187-ba49df72-37b8-43ac-98da-f8e029de0e63");

    InstanceReservationAffinityPrototype instanceReservationAffinityPrototypeModel = new InstanceReservationAffinityPrototype.Builder()
      .policy("disabled")
      .pool(java.util.Arrays.asList(reservationIdentityModel))
      .build();
    assertEquals(instanceReservationAffinityPrototypeModel.policy(), "disabled");
    assertEquals(instanceReservationAffinityPrototypeModel.pool(), java.util.Arrays.asList(reservationIdentityModel));

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeAttachmentPrototypeVolumeModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    VolumeAttachmentPrototype volumeAttachmentPrototypeModel = new VolumeAttachmentPrototype.Builder()
      .deleteVolumeOnInstanceDelete(false)
      .name("my-volume-attachment")
      .volume(volumeAttachmentPrototypeVolumeModel)
      .build();
    assertEquals(volumeAttachmentPrototypeModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(false));
    assertEquals(volumeAttachmentPrototypeModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeModel.volume(), volumeAttachmentPrototypeVolumeModel);

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeIdentityModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    VolumeAttachmentPrototypeInstanceByVolumeContext volumeAttachmentPrototypeInstanceByVolumeContextModel = new VolumeAttachmentPrototypeInstanceByVolumeContext.Builder()
      .deleteVolumeOnInstanceDelete(false)
      .name("my-volume-attachment")
      .volume(volumeIdentityModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(false));
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceByVolumeContextModel.volume(), volumeIdentityModel);

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
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .name("my-instance-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(networkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(networkInterfacePrototypeModel.name(), "my-instance-network-interface");
    assertEquals(networkInterfacePrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(networkInterfacePrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(networkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel = new InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface.Builder()
      .availabilityPolicy(instanceAvailabilityPolicyPrototypeModel)
      .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
      .keys(java.util.Arrays.asList(keyIdentityModel))
      .metadataService(instanceMetadataServicePrototypeModel)
      .name("my-instance")
      .placementTarget(instancePlacementTargetPrototypeModel)
      .profile(instanceProfileIdentityModel)
      .reservationAffinity(instanceReservationAffinityPrototypeModel)
      .resourceGroup(resourceGroupIdentityModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .userData("testString")
      .volumeAttachments(java.util.Arrays.asList(volumeAttachmentPrototypeModel))
      .vpc(vpcIdentityModel)
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByVolumeContextModel)
      .zone(zoneIdentityModel)
      .networkInterfaces(java.util.Arrays.asList(networkInterfacePrototypeModel))
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .build();
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.availabilityPolicy(), instanceAvailabilityPolicyPrototypeModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.defaultTrustedProfile(), instanceDefaultTrustedProfilePrototypeModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.metadataService(), instanceMetadataServicePrototypeModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.name(), "my-instance");
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.placementTarget(), instancePlacementTargetPrototypeModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.profile(), instanceProfileIdentityModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.reservationAffinity(), instanceReservationAffinityPrototypeModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.userData(), "testString");
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.volumeAttachments(), java.util.Arrays.asList(volumeAttachmentPrototypeModel));
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.vpc(), vpcIdentityModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceByVolumeContextModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.zone(), zoneIdentityModel);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.networkInterfaces(), java.util.Arrays.asList(networkInterfacePrototypeModel));
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel.primaryNetworkInterface(), networkInterfacePrototypeModel);

    String json = TestUtilities.serialize(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModel);

    InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew = TestUtilities.deserialize(json, InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface.class);
    assertTrue(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew instanceof InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface);
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.availabilityPolicy().toString(), instanceAvailabilityPolicyPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.defaultTrustedProfile().toString(), instanceDefaultTrustedProfilePrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.metadataService().toString(), instanceMetadataServicePrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.name(), "my-instance");
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.placementTarget().toString(), instancePlacementTargetPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.profile().toString(), instanceProfileIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.reservationAffinity().toString(), instanceReservationAffinityPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.userData(), "testString");
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceByVolumeContextModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceModelNew.primaryNetworkInterface().toString(), networkInterfacePrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterfaceError() throws Throwable {
    new InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkInterface.Builder().build();
  }

}