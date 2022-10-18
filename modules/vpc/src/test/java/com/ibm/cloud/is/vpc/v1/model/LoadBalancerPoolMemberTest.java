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

import com.ibm.cloud.is.vpc.v1.model.InstanceReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMember;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetInstanceReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolMember model.
 */
public class LoadBalancerPoolMemberTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolMember() throws Throwable {
    LoadBalancerPoolMember loadBalancerPoolMemberModel = new LoadBalancerPoolMember();
    assertNull(loadBalancerPoolMemberModel.getCreatedAt());
    assertNull(loadBalancerPoolMemberModel.getHealth());
    assertNull(loadBalancerPoolMemberModel.getHref());
    assertNull(loadBalancerPoolMemberModel.getId());
    assertNull(loadBalancerPoolMemberModel.getPort());
    assertNull(loadBalancerPoolMemberModel.getProvisioningStatus());
    assertNull(loadBalancerPoolMemberModel.getTarget());
    assertNull(loadBalancerPoolMemberModel.getWeight());
  }
}