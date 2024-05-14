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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment model.
 */
public class InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment() throws Throwable {
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
      .id("0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(instancePlacementTargetPrototypeModel.id(), "0717-1e09281b-f177-46fb-baf1-bc152b2e391a");

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
      .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeAttachmentPrototypeVolumeModel.id(), "r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    VolumeAttachmentPrototype volumeAttachmentPrototypeModel = new VolumeAttachmentPrototype.Builder()
      .deleteVolumeOnInstanceDelete(false)
      .name("my-volume-attachment")
      .volume(volumeAttachmentPrototypeVolumeModel)
      .build();
    assertEquals(volumeAttachmentPrototypeModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(false));
    assertEquals(volumeAttachmentPrototypeModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeModel.volume(), volumeAttachmentPrototypeVolumeModel);

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(java.util.Arrays.asList())
      .build();
    assertEquals(volumePrototypeInstanceByImageContextModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeInstanceByImageContextModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeInstanceByImageContextModel.name(), "my-volume");
    assertEquals(volumePrototypeInstanceByImageContextModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.userTags(), java.util.Arrays.asList());

    VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumePrototypeInstanceByImageContextModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.volume(), volumePrototypeInstanceByImageContextModel);

    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("r006-02c73baf-9abb-493d-9e41-d0f1866f4051")
      .build();
    assertEquals(imageIdentityModel.id(), "r006-02c73baf-9abb-493d-9e41-d0f1866f4051");

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
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel = new InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext.Builder()
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
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.ips(), java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.name(), "my-virtual-network-interface");
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.primaryIp(), virtualNetworkInterfacePrimaryIpPrototypeModel);
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.subnet(), subnetIdentityModel);

    InstanceNetworkAttachmentPrototype instanceNetworkAttachmentPrototypeModel = new InstanceNetworkAttachmentPrototype.Builder()
      .name("my-instance-network-attachment")
      .virtualNetworkInterface(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
      .build();
    assertEquals(instanceNetworkAttachmentPrototypeModel.name(), "my-instance-network-attachment");
    assertEquals(instanceNetworkAttachmentPrototypeModel.virtualNetworkInterface(), instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel);

    InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel = new InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment.Builder()
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
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
      .image(imageIdentityModel)
      .zone(zoneIdentityModel)
      .networkAttachments(java.util.Arrays.asList(instanceNetworkAttachmentPrototypeModel))
      .primaryNetworkAttachment(instanceNetworkAttachmentPrototypeModel)
      .build();
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.availabilityPolicy(), instanceAvailabilityPolicyPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.defaultTrustedProfile(), instanceDefaultTrustedProfilePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.metadataService(), instanceMetadataServicePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.placementTarget(), instancePlacementTargetPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.profile(), instanceProfileIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.reservationAffinity(), instanceReservationAffinityPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.volumeAttachments(), java.util.Arrays.asList(volumeAttachmentPrototypeModel));
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.vpc(), vpcIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceByImageContextModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.image(), imageIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.zone(), zoneIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.networkAttachments(), java.util.Arrays.asList(instanceNetworkAttachmentPrototypeModel));
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel.primaryNetworkAttachment(), instanceNetworkAttachmentPrototypeModel);

    String json = TestUtilities.serialize(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModel);

    InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew = TestUtilities.deserialize(json, InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment.class);
    assertTrue(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew instanceof InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment);
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.availabilityPolicy().toString(), instanceAvailabilityPolicyPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.defaultTrustedProfile().toString(), instanceDefaultTrustedProfilePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.metadataService().toString(), instanceMetadataServicePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.placementTarget().toString(), instancePlacementTargetPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.profile().toString(), instanceProfileIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.reservationAffinity().toString(), instanceReservationAffinityPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceByImageContextModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.image().toString(), imageIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentModelNew.primaryNetworkAttachment().toString(), instanceNetworkAttachmentPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachmentError() throws Throwable {
    new InstanceTemplatePrototypeInstanceTemplateByImageInstanceTemplateByImageInstanceByNetworkAttachment.Builder().build();
  }

}