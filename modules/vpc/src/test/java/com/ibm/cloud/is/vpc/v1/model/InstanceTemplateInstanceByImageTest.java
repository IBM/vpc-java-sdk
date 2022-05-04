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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
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
 * Unit test class for the InstanceTemplateInstanceByImage model.
 */
public class InstanceTemplateInstanceByImageTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplateInstanceByImage() throws Throwable {
    InstanceTemplateInstanceByImage instanceTemplateInstanceByImageModel = new InstanceTemplateInstanceByImage();
    assertNull(instanceTemplateInstanceByImageModel.getAvailabilityPolicy());
    assertNull(instanceTemplateInstanceByImageModel.getCreatedAt());
    assertNull(instanceTemplateInstanceByImageModel.getCrn());
    assertNull(instanceTemplateInstanceByImageModel.getDefaultTrustedProfile());
    assertNull(instanceTemplateInstanceByImageModel.getHref());
    assertNull(instanceTemplateInstanceByImageModel.getId());
    assertNull(instanceTemplateInstanceByImageModel.getKeys());
    assertNull(instanceTemplateInstanceByImageModel.getMetadataService());
    assertNull(instanceTemplateInstanceByImageModel.getName());
    assertNull(instanceTemplateInstanceByImageModel.getNetworkInterfaces());
    assertNull(instanceTemplateInstanceByImageModel.getPlacementTarget());
    assertNull(instanceTemplateInstanceByImageModel.getProfile());
    assertNull(instanceTemplateInstanceByImageModel.getResourceGroup());
    assertNull(instanceTemplateInstanceByImageModel.getTotalVolumeBandwidth());
    assertNull(instanceTemplateInstanceByImageModel.getUserData());
    assertNull(instanceTemplateInstanceByImageModel.getVolumeAttachments());
    assertNull(instanceTemplateInstanceByImageModel.getVpc());
    assertNull(instanceTemplateInstanceByImageModel.getBootVolumeAttachment());
    assertNull(instanceTemplateInstanceByImageModel.getImage());
    assertNull(instanceTemplateInstanceByImageModel.getPrimaryNetworkInterface());
    assertNull(instanceTemplateInstanceByImageModel.getZone());
  }
}