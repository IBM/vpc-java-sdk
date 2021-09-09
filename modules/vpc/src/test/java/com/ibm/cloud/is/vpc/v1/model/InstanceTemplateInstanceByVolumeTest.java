/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByVolume;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
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
 * Unit test class for the InstanceTemplateInstanceByVolume model.
 */
public class InstanceTemplateInstanceByVolumeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplateInstanceByVolume() throws Throwable {
    InstanceTemplateInstanceByVolume instanceTemplateInstanceByVolumeModel = new InstanceTemplateInstanceByVolume();
    assertNull(instanceTemplateInstanceByVolumeModel.getCreatedAt());
    assertNull(instanceTemplateInstanceByVolumeModel.getCrn());
    assertNull(instanceTemplateInstanceByVolumeModel.getHref());
    assertNull(instanceTemplateInstanceByVolumeModel.getId());
    assertNull(instanceTemplateInstanceByVolumeModel.getKeys());
    assertNull(instanceTemplateInstanceByVolumeModel.getName());
    assertNull(instanceTemplateInstanceByVolumeModel.getNetworkInterfaces());
    assertNull(instanceTemplateInstanceByVolumeModel.getPlacementTarget());
    assertNull(instanceTemplateInstanceByVolumeModel.getProfile());
    assertNull(instanceTemplateInstanceByVolumeModel.getResourceGroup());
    assertNull(instanceTemplateInstanceByVolumeModel.getTotalVolumeBandwidth());
    assertNull(instanceTemplateInstanceByVolumeModel.getUserData());
    assertNull(instanceTemplateInstanceByVolumeModel.getVolumeAttachments());
    assertNull(instanceTemplateInstanceByVolumeModel.getVpc());
    assertNull(instanceTemplateInstanceByVolumeModel.getBootVolumeAttachment());
    assertNull(instanceTemplateInstanceByVolumeModel.getPrimaryNetworkInterface());
    assertNull(instanceTemplateInstanceByVolumeModel.getZone());
  }
}