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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroup model.
 */
public class InstanceGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroup() throws Throwable {
    InstanceGroup instanceGroupModel = new InstanceGroup();
    assertNull(instanceGroupModel.getApplicationPort());
    assertNull(instanceGroupModel.getCreatedAt());
    assertNull(instanceGroupModel.getCrn());
    assertNull(instanceGroupModel.getHref());
    assertNull(instanceGroupModel.getId());
    assertNull(instanceGroupModel.getInstanceTemplate());
    assertNull(instanceGroupModel.getLoadBalancerPool());
    assertNull(instanceGroupModel.getManagers());
    assertNull(instanceGroupModel.getMembershipCount());
    assertNull(instanceGroupModel.getName());
    assertNull(instanceGroupModel.getResourceGroup());
    assertNull(instanceGroupModel.getStatus());
    assertNull(instanceGroupModel.getSubnets());
    assertNull(instanceGroupModel.getUpdatedAt());
    assertNull(instanceGroupModel.getVpc());
  }
}