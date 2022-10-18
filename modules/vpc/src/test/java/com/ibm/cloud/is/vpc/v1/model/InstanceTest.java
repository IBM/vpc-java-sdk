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

import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ImageReference;
import com.ibm.cloud.is.vpc.v1.model.ImageReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.InstanceDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceGPU;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataService;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetDedicatedHostGroupReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceStatusReason;
import com.ibm.cloud.is.vpc.v1.model.InstanceVCPU;
import com.ibm.cloud.is.vpc.v1.model.LifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceInstanceContextReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceInstanceContextReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentDevice;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentReferenceInstanceContextDeleted;
import com.ibm.cloud.is.vpc.v1.model.VolumeReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Instance model.
 */
public class InstanceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstance() throws Throwable {
    Instance instanceModel = new Instance();
    assertNull(instanceModel.getAvailabilityPolicy());
    assertNull(instanceModel.getBandwidth());
    assertNull(instanceModel.getBootVolumeAttachment());
    assertNull(instanceModel.getCatalogOffering());
    assertNull(instanceModel.getCreatedAt());
    assertNull(instanceModel.getCrn());
    assertNull(instanceModel.getDedicatedHost());
    assertNull(instanceModel.getDisks());
    assertNull(instanceModel.getGpu());
    assertNull(instanceModel.getHref());
    assertNull(instanceModel.getId());
    assertNull(instanceModel.getImage());
    assertNull(instanceModel.getLifecycleReasons());
    assertNull(instanceModel.getLifecycleState());
    assertNull(instanceModel.getMemory());
    assertNull(instanceModel.getMetadataService());
    assertNull(instanceModel.getName());
    assertNull(instanceModel.getNetworkInterfaces());
    assertNull(instanceModel.getPlacementTarget());
    assertNull(instanceModel.getPrimaryNetworkInterface());
    assertNull(instanceModel.getProfile());
    assertNull(instanceModel.getResourceGroup());
    assertNull(instanceModel.getResourceType());
    assertNull(instanceModel.isStartable());
    assertNull(instanceModel.getStatus());
    assertNull(instanceModel.getStatusReasons());
    assertNull(instanceModel.getTotalNetworkBandwidth());
    assertNull(instanceModel.getTotalVolumeBandwidth());
    assertNull(instanceModel.getVcpu());
    assertNull(instanceModel.getVolumeAttachments());
    assertNull(instanceModel.getVpc());
    assertNull(instanceModel.getZone());
  }
}