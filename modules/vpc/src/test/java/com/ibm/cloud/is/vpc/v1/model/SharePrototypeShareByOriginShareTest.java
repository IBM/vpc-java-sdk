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

import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareByOriginShare;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareContext;
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
 * Unit test class for the SharePrototypeShareByOriginShare model.
 */
public class SharePrototypeShareByOriginShareTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSharePrototypeShareByOriginShare() throws Throwable {
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

    ShareIdentityById shareIdentityModel = new ShareIdentityById.Builder()
      .id("r006-0fe9e5d8-0a4d-4818-96ec-e99708644a58")
      .build();
    assertEquals(shareIdentityModel.id(), "r006-0fe9e5d8-0a4d-4818-96ec-e99708644a58");

    SharePrototypeShareByOriginShare sharePrototypeShareByOriginShareModel = new SharePrototypeShareByOriginShare.Builder()
      .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
      .mountTargets(java.util.Arrays.asList(shareMountTargetPrototypeModel))
      .name("my-share")
      .replicaShare(sharePrototypeShareContextModel)
      .userTags(java.util.Arrays.asList())
      .originShare(shareIdentityModel)
      .build();
    assertEquals(sharePrototypeShareByOriginShareModel.allowedTransitEncryptionModes(), java.util.Arrays.asList("none"));
    assertEquals(sharePrototypeShareByOriginShareModel.mountTargets(), java.util.Arrays.asList(shareMountTargetPrototypeModel));
    assertEquals(sharePrototypeShareByOriginShareModel.name(), "my-share");
    assertEquals(sharePrototypeShareByOriginShareModel.replicaShare(), sharePrototypeShareContextModel);
    assertEquals(sharePrototypeShareByOriginShareModel.userTags(), java.util.Arrays.asList());
    assertEquals(sharePrototypeShareByOriginShareModel.originShare(), shareIdentityModel);

    String json = TestUtilities.serialize(sharePrototypeShareByOriginShareModel);

    SharePrototypeShareByOriginShare sharePrototypeShareByOriginShareModelNew = TestUtilities.deserialize(json, SharePrototypeShareByOriginShare.class);
    assertTrue(sharePrototypeShareByOriginShareModelNew instanceof SharePrototypeShareByOriginShare);
    assertEquals(sharePrototypeShareByOriginShareModelNew.name(), "my-share");
    assertEquals(sharePrototypeShareByOriginShareModelNew.replicaShare().toString(), sharePrototypeShareContextModel.toString());
    assertEquals(sharePrototypeShareByOriginShareModelNew.originShare().toString(), shareIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSharePrototypeShareByOriginShareError() throws Throwable {
    new SharePrototypeShareByOriginShare.Builder().build();
  }

}