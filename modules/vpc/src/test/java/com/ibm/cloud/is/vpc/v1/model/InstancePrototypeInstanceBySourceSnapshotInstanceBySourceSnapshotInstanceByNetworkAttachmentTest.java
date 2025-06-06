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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceBySourceSnapshotContext;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment model.
 */
public class InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment() throws Throwable {
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
      .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
      .build();
    assertEquals(keyIdentityModel.id(), "r006-82679077-ac3b-4c10-be16-63e9c21f0f45");

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

    SnapshotIdentityById snapshotIdentityModel = new SnapshotIdentityById.Builder()
      .id("r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
      .build();
    assertEquals(snapshotIdentityModel.id(), "r006-f6bfa329-0e36-433f-a3bb-0df632e79263");

    VolumePrototypeInstanceBySourceSnapshotContext volumePrototypeInstanceBySourceSnapshotContextModel = new VolumePrototypeInstanceBySourceSnapshotContext.Builder()
      .bandwidth(Long.valueOf("1000"))
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .sourceSnapshot(snapshotIdentityModel)
      .userTags(java.util.Arrays.asList())
      .build();
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.bandwidth(), Long.valueOf("1000"));
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.name(), "my-volume");
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.sourceSnapshot(), snapshotIdentityModel);
    assertEquals(volumePrototypeInstanceBySourceSnapshotContextModel.userTags(), java.util.Arrays.asList());

    VolumeAttachmentPrototypeInstanceBySourceSnapshotContext volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel = new VolumeAttachmentPrototypeInstanceBySourceSnapshotContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumePrototypeInstanceBySourceSnapshotContextModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.volume(), volumePrototypeInstanceBySourceSnapshotContextModel);

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
      .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

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

    InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel = new InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.Builder()
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
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel)
      .zone(zoneIdentityModel)
      .networkAttachments(java.util.Arrays.asList(instanceNetworkAttachmentPrototypeModel))
      .primaryNetworkAttachment(instanceNetworkAttachmentPrototypeModel)
      .build();
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.availabilityPolicy(), instanceAvailabilityPolicyPrototypeModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.clusterNetworkAttachments(), java.util.Arrays.asList(instanceClusterNetworkAttachmentPrototypeInstanceContextModel));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.confidentialComputeMode(), "disabled");
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.defaultTrustedProfile(), instanceDefaultTrustedProfilePrototypeModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.enableSecureBoot(), Boolean.valueOf(true));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.metadataService(), instanceMetadataServicePrototypeModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.name(), "my-instance");
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.placementTarget(), instancePlacementTargetPrototypeModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.profile(), instanceProfileIdentityModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.reservationAffinity(), instanceReservationAffinityPrototypeModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.userData(), "testString");
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.volumeAttachments(), java.util.Arrays.asList(volumeAttachmentPrototypeModel));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.vpc(), vpcIdentityModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.zone(), zoneIdentityModel);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.networkAttachments(), java.util.Arrays.asList(instanceNetworkAttachmentPrototypeModel));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel.primaryNetworkAttachment(), instanceNetworkAttachmentPrototypeModel);

    String json = TestUtilities.serialize(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModel);

    InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew = TestUtilities.deserialize(json, InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.class);
    assertTrue(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew instanceof InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment);
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.availabilityPolicy().toString(), instanceAvailabilityPolicyPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.confidentialComputeMode(), "disabled");
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.defaultTrustedProfile().toString(), instanceDefaultTrustedProfilePrototypeModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.enableSecureBoot(), Boolean.valueOf(true));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.metadataService().toString(), instanceMetadataServicePrototypeModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.name(), "my-instance");
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.placementTarget().toString(), instancePlacementTargetPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.profile().toString(), instanceProfileIdentityModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.reservationAffinity().toString(), instanceReservationAffinityPrototypeModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.userData(), "testString");
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.zone().toString(), zoneIdentityModel.toString());
    assertEquals(instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentModelNew.primaryNetworkAttachment().toString(), instanceNetworkAttachmentPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachmentError() throws Throwable {
    new InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.Builder().build();
  }

}