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

import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingIdentityCatalogOfferingByCRN;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionPlanIdentityCatalogOfferingVersionPlanByCRN;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOfferingPrototypeCatalogOfferingByOffering;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityById;
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
 * Unit test class for the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment model.
 */
public class InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment() throws Throwable {
    InstanceAvailabilityPolicyPrototype instanceAvailabilityPolicyPrototypeModel = new InstanceAvailabilityPolicyPrototype.Builder()
      .hostFailure("restart")
      .build();
    assertEquals(instanceAvailabilityPolicyPrototypeModel.hostFailure(), "restart");

    ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext clusterNetworkInterfacePrimaryIpPrototypeModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-cluster-network-subnet-reserved-ip")
      .build();
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeModel.address(), "10.0.0.5");
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeModel.name(), "my-cluster-network-subnet-reserved-ip");

    ClusterNetworkSubnetIdentityById clusterNetworkSubnetIdentityModel = new ClusterNetworkSubnetIdentityById.Builder()
      .id("0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930")
      .build();
    assertEquals(clusterNetworkSubnetIdentityModel.id(), "0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930");

    InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel = new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment.Builder()
      .autoDelete(false)
      .name("my-cluster-network-interface")
      .primaryIp(clusterNetworkInterfacePrimaryIpPrototypeModel)
      .subnet(clusterNetworkSubnetIdentityModel)
      .build();
    assertEquals(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel.name(), "my-cluster-network-interface");
    assertEquals(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel.primaryIp(), clusterNetworkInterfacePrimaryIpPrototypeModel);
    assertEquals(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel.subnet(), clusterNetworkSubnetIdentityModel);

    InstanceClusterNetworkAttachmentPrototypeInstanceContext instanceClusterNetworkAttachmentPrototypeInstanceContextModel = new InstanceClusterNetworkAttachmentPrototypeInstanceContext.Builder()
      .clusterNetworkInterface(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel)
      .name("my-instance-network-attachment")
      .build();
    assertEquals(instanceClusterNetworkAttachmentPrototypeInstanceContextModel.clusterNetworkInterface(), instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceModel);
    assertEquals(instanceClusterNetworkAttachmentPrototypeInstanceContextModel.name(), "my-instance-network-attachment");

    TrustedProfileIdentityById trustedProfileIdentityModel = new TrustedProfileIdentityById.Builder()
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
      .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .build();
    assertEquals(reservationIdentityModel.id(), "0717-ba49df72-37b8-43ac-98da-f8e029de0e63");

    InstanceReservationAffinityPrototype instanceReservationAffinityPrototypeModel = new InstanceReservationAffinityPrototype.Builder()
      .policy("automatic")
      .pool(java.util.Arrays.asList(reservationIdentityModel))
      .build();
    assertEquals(instanceReservationAffinityPrototypeModel.policy(), "automatic");
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

    CatalogOfferingVersionPlanIdentityCatalogOfferingVersionPlanByCRN catalogOfferingVersionPlanIdentityModel = new CatalogOfferingVersionPlanIdentityCatalogOfferingVersionPlanByCRN.Builder()
      .crn("crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:51c9e0db-2911-45a6-adb0-ac5332d27cf2:plan:sw.51c9e0db-2911-45a6-adb0-ac5332d27cf2.772c0dbe-aa62-482e-adbe-a3fc20101e0e")
      .build();
    assertEquals(catalogOfferingVersionPlanIdentityModel.crn(), "crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:51c9e0db-2911-45a6-adb0-ac5332d27cf2:plan:sw.51c9e0db-2911-45a6-adb0-ac5332d27cf2.772c0dbe-aa62-482e-adbe-a3fc20101e0e");

    CatalogOfferingIdentityCatalogOfferingByCRN catalogOfferingIdentityModel = new CatalogOfferingIdentityCatalogOfferingByCRN.Builder()
      .crn("crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:offering:00111601-0ec5-41ac-b142-96d1e64e6442")
      .build();
    assertEquals(catalogOfferingIdentityModel.crn(), "crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:offering:00111601-0ec5-41ac-b142-96d1e64e6442");

    InstanceCatalogOfferingPrototypeCatalogOfferingByOffering instanceCatalogOfferingPrototypeModel = new InstanceCatalogOfferingPrototypeCatalogOfferingByOffering.Builder()
      .plan(catalogOfferingVersionPlanIdentityModel)
      .offering(catalogOfferingIdentityModel)
      .build();
    assertEquals(instanceCatalogOfferingPrototypeModel.plan(), catalogOfferingVersionPlanIdentityModel);
    assertEquals(instanceCatalogOfferingPrototypeModel.offering(), catalogOfferingIdentityModel);

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

    InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel = new InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext.Builder()
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
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.ips(), java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.name(), "my-virtual-network-interface");
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.primaryIp(), virtualNetworkInterfacePrimaryIpPrototypeModel);
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.protocolStateFilteringMode(), "auto");
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel.subnet(), subnetIdentityModel);

    InstanceNetworkAttachmentPrototype instanceNetworkAttachmentPrototypeModel = new InstanceNetworkAttachmentPrototype.Builder()
      .name("my-instance-network-attachment")
      .virtualNetworkInterface(instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel)
      .build();
    assertEquals(instanceNetworkAttachmentPrototypeModel.name(), "my-instance-network-attachment");
    assertEquals(instanceNetworkAttachmentPrototypeModel.virtualNetworkInterface(), instanceNetworkAttachmentPrototypeVirtualNetworkInterfaceModel);

    InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel = new InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.Builder()
      .availabilityPolicy(instanceAvailabilityPolicyPrototypeModel)
      .clusterNetworkAttachments(java.util.Arrays.asList(instanceClusterNetworkAttachmentPrototypeInstanceContextModel))
      .confidentialComputeMode("disabled")
      .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
      .enableSecureBoot(true)
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
      .catalogOffering(instanceCatalogOfferingPrototypeModel)
      .zone(zoneIdentityModel)
      .networkAttachments(java.util.Arrays.asList(instanceNetworkAttachmentPrototypeModel))
      .primaryNetworkAttachment(instanceNetworkAttachmentPrototypeModel)
      .build();
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.availabilityPolicy(), instanceAvailabilityPolicyPrototypeModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.clusterNetworkAttachments(), java.util.Arrays.asList(instanceClusterNetworkAttachmentPrototypeInstanceContextModel));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.confidentialComputeMode(), "disabled");
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.defaultTrustedProfile(), instanceDefaultTrustedProfilePrototypeModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.enableSecureBoot(), Boolean.valueOf(true));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.metadataService(), instanceMetadataServicePrototypeModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.name(), "my-instance");
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.placementTarget(), instancePlacementTargetPrototypeModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.profile(), instanceProfileIdentityModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.reservationAffinity(), instanceReservationAffinityPrototypeModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.userData(), "testString");
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.volumeAttachments(), java.util.Arrays.asList(volumeAttachmentPrototypeModel));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.vpc(), vpcIdentityModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceByImageContextModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.catalogOffering(), instanceCatalogOfferingPrototypeModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.zone(), zoneIdentityModel);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.networkAttachments(), java.util.Arrays.asList(instanceNetworkAttachmentPrototypeModel));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel.primaryNetworkAttachment(), instanceNetworkAttachmentPrototypeModel);

    String json = TestUtilities.serialize(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModel);

    InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew = TestUtilities.deserialize(json, InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.class);
    assertTrue(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew instanceof InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment);
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.availabilityPolicy().toString(), instanceAvailabilityPolicyPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.confidentialComputeMode(), "disabled");
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.defaultTrustedProfile().toString(), instanceDefaultTrustedProfilePrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.enableSecureBoot(), Boolean.valueOf(true));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.metadataService().toString(), instanceMetadataServicePrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.name(), "my-instance");
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.placementTarget().toString(), instancePlacementTargetPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.profile().toString(), instanceProfileIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.reservationAffinity().toString(), instanceReservationAffinityPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.userData(), "testString");
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceByImageContextModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.catalogOffering().toString(), instanceCatalogOfferingPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentModelNew.primaryNetworkAttachment().toString(), instanceNetworkAttachmentPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachmentError() throws Throwable {
    new InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.Builder().build();
  }

}