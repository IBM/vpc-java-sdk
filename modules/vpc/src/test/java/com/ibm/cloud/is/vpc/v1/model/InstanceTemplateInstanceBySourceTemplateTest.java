/*
 * (C) Copyright IBM Corp. 2020.
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
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContextVolumeVolumeIdentityVolumeIdentityById;
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
 * Unit test class for the InstanceTemplateInstanceBySourceTemplate model.
 */
public class InstanceTemplateInstanceBySourceTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplateInstanceBySourceTemplate() throws Throwable {
    InstanceTemplateInstanceBySourceTemplate instanceTemplateInstanceBySourceTemplateModel = new InstanceTemplateInstanceBySourceTemplate();
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getId());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getHref());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getCrn());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getName());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getKeys());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getNetworkInterfaces());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getProfile());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getUserData());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getVolumeAttachments());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getVpc());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getCreatedAt());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getResourceGroup());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getPrimaryNetworkInterface());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getZone());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getBootVolumeAttachment());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getImage());
    assertNull(instanceTemplateInstanceBySourceTemplateModel.getSourceTemplate());
  }
}