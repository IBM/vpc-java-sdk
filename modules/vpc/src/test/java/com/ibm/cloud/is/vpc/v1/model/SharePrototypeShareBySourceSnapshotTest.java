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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareInitialOwner;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareContext;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
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
 * Unit test class for the SharePrototypeShareBySourceSnapshot model.
 */
public class SharePrototypeShareBySourceSnapshotTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSharePrototypeShareBySourceSnapshot() throws Throwable {
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
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext shareMountTargetVirtualNetworkInterfacePrototypeModel = new ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext.Builder()
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
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.ips(), java.util.Arrays.asList(virtualNetworkInterfaceIpPrototypeModel));
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.name(), "my-virtual-network-interface");
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.primaryIp(), virtualNetworkInterfacePrimaryIpPrototypeModel);
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.protocolStateFilteringMode(), "auto");
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup shareMountTargetPrototypeModel = new ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.Builder()
      .name("my-share-mount-target")
      .transitEncryption("none")
      .virtualNetworkInterface(shareMountTargetVirtualNetworkInterfacePrototypeModel)
      .build();
    assertEquals(shareMountTargetPrototypeModel.name(), "my-share-mount-target");
    assertEquals(shareMountTargetPrototypeModel.transitEncryption(), "none");
    assertEquals(shareMountTargetPrototypeModel.virtualNetworkInterface(), shareMountTargetVirtualNetworkInterfacePrototypeModel);

    ShareProfileIdentityByName shareProfileIdentityModel = new ShareProfileIdentityByName.Builder()
      .name("tier-3iops")
      .build();
    assertEquals(shareProfileIdentityModel.name(), "tier-3iops");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    SharePrototypeShareContext sharePrototypeShareContextModel = new SharePrototypeShareContext.Builder()
      .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
      .iops(Long.valueOf("100"))
      .mountTargets(java.util.Arrays.asList(shareMountTargetPrototypeModel))
      .name("my-share")
      .profile(shareProfileIdentityModel)
      .replicationCronSpec("0 */5 * * *")
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(java.util.Arrays.asList())
      .zone(zoneIdentityModel)
      .build();
    assertEquals(sharePrototypeShareContextModel.allowedTransitEncryptionModes(), java.util.Arrays.asList("none"));
    assertEquals(sharePrototypeShareContextModel.iops(), Long.valueOf("100"));
    assertEquals(sharePrototypeShareContextModel.mountTargets(), java.util.Arrays.asList(shareMountTargetPrototypeModel));
    assertEquals(sharePrototypeShareContextModel.name(), "my-share");
    assertEquals(sharePrototypeShareContextModel.profile(), shareProfileIdentityModel);
    assertEquals(sharePrototypeShareContextModel.replicationCronSpec(), "0 */5 * * *");
    assertEquals(sharePrototypeShareContextModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(sharePrototypeShareContextModel.userTags(), java.util.Arrays.asList());
    assertEquals(sharePrototypeShareContextModel.zone(), zoneIdentityModel);

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    ShareInitialOwner shareInitialOwnerModel = new ShareInitialOwner.Builder()
      .gid(Long.valueOf("50"))
      .uid(Long.valueOf("50"))
      .build();
    assertEquals(shareInitialOwnerModel.gid(), Long.valueOf("50"));
    assertEquals(shareInitialOwnerModel.uid(), Long.valueOf("50"));

    ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById shareSourceSnapshotPrototypeModel = new ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById.Builder()
      .id("r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4")
      .build();
    assertEquals(shareSourceSnapshotPrototypeModel.id(), "r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4");

    SharePrototypeShareBySourceSnapshot sharePrototypeShareBySourceSnapshotModel = new SharePrototypeShareBySourceSnapshot.Builder()
      .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
      .mountTargets(java.util.Arrays.asList(shareMountTargetPrototypeModel))
      .name("my-share")
      .replicaShare(sharePrototypeShareContextModel)
      .userTags(java.util.Arrays.asList())
      .encryptionKey(encryptionKeyIdentityModel)
      .initialOwner(shareInitialOwnerModel)
      .iops(Long.valueOf("100"))
      .profile(shareProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .size(Long.valueOf("200"))
      .sourceSnapshot(shareSourceSnapshotPrototypeModel)
      .build();
    assertEquals(sharePrototypeShareBySourceSnapshotModel.allowedTransitEncryptionModes(), java.util.Arrays.asList("none"));
    assertEquals(sharePrototypeShareBySourceSnapshotModel.mountTargets(), java.util.Arrays.asList(shareMountTargetPrototypeModel));
    assertEquals(sharePrototypeShareBySourceSnapshotModel.name(), "my-share");
    assertEquals(sharePrototypeShareBySourceSnapshotModel.replicaShare(), sharePrototypeShareContextModel);
    assertEquals(sharePrototypeShareBySourceSnapshotModel.userTags(), java.util.Arrays.asList());
    assertEquals(sharePrototypeShareBySourceSnapshotModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(sharePrototypeShareBySourceSnapshotModel.initialOwner(), shareInitialOwnerModel);
    assertEquals(sharePrototypeShareBySourceSnapshotModel.iops(), Long.valueOf("100"));
    assertEquals(sharePrototypeShareBySourceSnapshotModel.profile(), shareProfileIdentityModel);
    assertEquals(sharePrototypeShareBySourceSnapshotModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(sharePrototypeShareBySourceSnapshotModel.size(), Long.valueOf("200"));
    assertEquals(sharePrototypeShareBySourceSnapshotModel.sourceSnapshot(), shareSourceSnapshotPrototypeModel);

    String json = TestUtilities.serialize(sharePrototypeShareBySourceSnapshotModel);

    SharePrototypeShareBySourceSnapshot sharePrototypeShareBySourceSnapshotModelNew = TestUtilities.deserialize(json, SharePrototypeShareBySourceSnapshot.class);
    assertTrue(sharePrototypeShareBySourceSnapshotModelNew instanceof SharePrototypeShareBySourceSnapshot);
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.name(), "my-share");
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.replicaShare().toString(), sharePrototypeShareContextModel.toString());
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.initialOwner().toString(), shareInitialOwnerModel.toString());
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.iops(), Long.valueOf("100"));
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.profile().toString(), shareProfileIdentityModel.toString());
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.size(), Long.valueOf("200"));
    assertEquals(sharePrototypeShareBySourceSnapshotModelNew.sourceSnapshot().toString(), shareSourceSnapshotPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSharePrototypeShareBySourceSnapshotError() throws Throwable {
    new SharePrototypeShareBySourceSnapshot.Builder().build();
  }

}