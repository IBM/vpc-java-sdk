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
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachment;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
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
 * Unit test class for the InstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachment model.
 */
public class InstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachment() throws Throwable {
    InstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachment instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel = new InstanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachment();
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getAvailabilityPolicy());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getClusterNetworkAttachments());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getConfidentialComputeMode());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getCreatedAt());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getCrn());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getDefaultTrustedProfile());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.isEnableSecureBoot());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getHref());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getId());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getKeys());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getMetadataService());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getName());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getPlacementTarget());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getProfile());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getReservationAffinity());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getResourceGroup());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getTotalVolumeBandwidth());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getUserData());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getVolumeAttachments());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getVpc());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getBootVolumeAttachment());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getImage());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getZone());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getNetworkAttachments());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextInstanceByImageInstanceTemplateContextInstanceByNetworkAttachmentModel.getPrimaryNetworkAttachment());
  }
}