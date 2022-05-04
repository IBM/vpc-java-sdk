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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPool;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitor;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistence;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPool model.
 */
public class LoadBalancerPoolTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPool() throws Throwable {
    LoadBalancerPool loadBalancerPoolModel = new LoadBalancerPool();
    assertNull(loadBalancerPoolModel.getAlgorithm());
    assertNull(loadBalancerPoolModel.getCreatedAt());
    assertNull(loadBalancerPoolModel.getHealthMonitor());
    assertNull(loadBalancerPoolModel.getHref());
    assertNull(loadBalancerPoolModel.getId());
    assertNull(loadBalancerPoolModel.getInstanceGroup());
    assertNull(loadBalancerPoolModel.getMembers());
    assertNull(loadBalancerPoolModel.getName());
    assertNull(loadBalancerPoolModel.getProtocol());
    assertNull(loadBalancerPoolModel.getProvisioningStatus());
    assertNull(loadBalancerPoolModel.getProxyProtocol());
    assertNull(loadBalancerPoolModel.getSessionPersistence());
  }
}