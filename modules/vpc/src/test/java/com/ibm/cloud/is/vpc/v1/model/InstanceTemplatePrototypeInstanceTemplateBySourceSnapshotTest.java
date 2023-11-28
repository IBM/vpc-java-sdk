/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
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
 * Unit test class for the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot model.
 */
public class InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplatePrototypeInstanceTemplateBySourceSnapshot() throws Throwable {
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

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/123456:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/123456:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    SnapshotIdentityById snapshotIdentityModel = new SnapshotIdentityById.Builder()
      .id("349a61d8-7ab1-420f-a690-5fed76ef9d4f")
      .build();
    assertEquals(snapshotIdentityModel.id(), "349a61d8-7ab1-420f-a690-5fed76ef9d4f");

    VolumePrototypeInstanceBySourceSnapshotContext volumePrototypeInstanceBySourceSnapshotContextModel = new VolumePrototypeInstanceBySourceSnapshotContext.Builder()
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .sourceSnapshot(snapshotIdentityModel)
      .userTags(java.util.Arrays.asList())
      .build();
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

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel = new InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot.Builder()
      .availabilityPolicy(instanceAvailabilityPolicyPrototypeModel)
      .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
      .keys(java.util.Arrays.asList(keyIdentityModel))
      .metadataService(instanceMetadataServicePrototypeModel)
      .name("my-instance")
      .placementTarget(instancePlacementTargetPrototypeModel)
      .profile(instanceProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .userData("testString")
      .volumeAttachments(java.util.Arrays.asList(volumeAttachmentPrototypeModel))
      .vpc(vpcIdentityModel)
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel)
      .networkInterfaces(java.util.Arrays.asList(networkInterfacePrototypeModel))
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.availabilityPolicy(), instanceAvailabilityPolicyPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.defaultTrustedProfile(), instanceDefaultTrustedProfilePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.metadataService(), instanceMetadataServicePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.placementTarget(), instancePlacementTargetPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.profile(), instanceProfileIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.volumeAttachments(), java.util.Arrays.asList(volumeAttachmentPrototypeModel));
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.vpc(), vpcIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.networkInterfaces(), java.util.Arrays.asList(networkInterfacePrototypeModel));
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.primaryNetworkInterface(), networkInterfacePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModel);

    InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew = TestUtilities.deserialize(json, InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot.class);
    assertTrue(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew instanceof InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot);
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.availabilityPolicy().toString(), instanceAvailabilityPolicyPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.defaultTrustedProfile().toString(), instanceDefaultTrustedProfilePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.metadataService().toString(), instanceMetadataServicePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.placementTarget().toString(), instancePlacementTargetPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.profile().toString(), instanceProfileIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceBySourceSnapshotContextModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.primaryNetworkInterface().toString(), networkInterfacePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceTemplateBySourceSnapshotModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceTemplatePrototypeInstanceTemplateBySourceSnapshotError() throws Throwable {
    new InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot.Builder().build();
  }

}