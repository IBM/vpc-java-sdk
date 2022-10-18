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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupMembership model.
 */
public class InstanceGroupMembershipTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupMembership() throws Throwable {
    InstanceGroupMembership instanceGroupMembershipModel = new InstanceGroupMembership();
    assertNull(instanceGroupMembershipModel.getCreatedAt());
    assertNull(instanceGroupMembershipModel.isDeleteInstanceOnMembershipDelete());
    assertNull(instanceGroupMembershipModel.getHref());
    assertNull(instanceGroupMembershipModel.getId());
    assertNull(instanceGroupMembershipModel.getInstance());
    assertNull(instanceGroupMembershipModel.getInstanceTemplate());
    assertNull(instanceGroupMembershipModel.getName());
    assertNull(instanceGroupMembershipModel.getPoolMember());
    assertNull(instanceGroupMembershipModel.getStatus());
    assertNull(instanceGroupMembershipModel.getUpdatedAt());
  }
}