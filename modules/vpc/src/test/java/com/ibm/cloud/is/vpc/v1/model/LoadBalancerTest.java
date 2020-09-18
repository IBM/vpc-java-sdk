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

import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancer;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancer model.
 */
public class LoadBalancerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancer() throws Throwable {
    LoadBalancer loadBalancerModel = new LoadBalancer();
    assertNull(loadBalancerModel.getProfile());
    assertNull(loadBalancerModel.getId());
    assertNull(loadBalancerModel.getCrn());
    assertNull(loadBalancerModel.getHref());
    assertNull(loadBalancerModel.getName());
    assertNull(loadBalancerModel.getCreatedAt());
    assertNull(loadBalancerModel.getHostname());
    assertNull(loadBalancerModel.isIsPublic());
    assertNull(loadBalancerModel.getListeners());
    assertNull(loadBalancerModel.getOperatingStatus());
    assertNull(loadBalancerModel.getPools());
    assertNull(loadBalancerModel.getPrivateIps());
    assertNull(loadBalancerModel.getProvisioningStatus());
    assertNull(loadBalancerModel.getPublicIps());
    assertNull(loadBalancerModel.getResourceGroup());
    assertNull(loadBalancerModel.getSubnets());
  }
}