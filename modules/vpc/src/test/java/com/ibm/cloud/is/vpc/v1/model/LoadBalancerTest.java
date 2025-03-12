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

import com.ibm.cloud.is.vpc.v1.model.DNSInstanceReferenceLoadBalancerDNSContext;
import com.ibm.cloud.is.vpc.v1.model.DNSZoneReference;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancer;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerDNS;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLogging;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapath;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
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
    assertNull(loadBalancerModel.getAccessMode());
    assertNull(loadBalancerModel.getAvailability());
    assertNull(loadBalancerModel.getCreatedAt());
    assertNull(loadBalancerModel.getCrn());
    assertNull(loadBalancerModel.getDns());
    assertNull(loadBalancerModel.getFailsafePolicyActions());
    assertNull(loadBalancerModel.getHostname());
    assertNull(loadBalancerModel.getHref());
    assertNull(loadBalancerModel.getId());
    assertNull(loadBalancerModel.isInstanceGroupsSupported());
    assertNull(loadBalancerModel.isIsPrivatePath());
    assertNull(loadBalancerModel.isIsPublic());
    assertNull(loadBalancerModel.getListeners());
    assertNull(loadBalancerModel.getLogging());
    assertNull(loadBalancerModel.getName());
    assertNull(loadBalancerModel.getOperatingStatus());
    assertNull(loadBalancerModel.getPools());
    assertNull(loadBalancerModel.getPrivateIps());
    assertNull(loadBalancerModel.getProfile());
    assertNull(loadBalancerModel.getProvisioningStatus());
    assertNull(loadBalancerModel.getPublicIps());
    assertNull(loadBalancerModel.getResourceGroup());
    assertNull(loadBalancerModel.getResourceType());
    assertNull(loadBalancerModel.isRouteMode());
    assertNull(loadBalancerModel.getSecurityGroups());
    assertNull(loadBalancerModel.isSecurityGroupsSupported());
    assertNull(loadBalancerModel.isSourceIpSessionPersistenceSupported());
    assertNull(loadBalancerModel.getSubnets());
    assertNull(loadBalancerModel.isUdpSupported());
  }
}