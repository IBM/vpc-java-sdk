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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileAccessModes;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileAvailabilityFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileFailsafePolicyActionsEnum;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileInstanceGroupsSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileLoggingSupported;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileRouteModeSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSecurityGroupsSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileSourceIPSessionPersistenceSupportedFixed;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileUDPSupportedFixed;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerProfile model.
 */
public class LoadBalancerProfileTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerProfile() throws Throwable {
    LoadBalancerProfile loadBalancerProfileModel = new LoadBalancerProfile();
    assertNull(loadBalancerProfileModel.getAccessModes());
    assertNull(loadBalancerProfileModel.getAvailability());
    assertNull(loadBalancerProfileModel.getFailsafePolicyActions());
    assertNull(loadBalancerProfileModel.getFamily());
    assertNull(loadBalancerProfileModel.getHref());
    assertNull(loadBalancerProfileModel.getInstanceGroupsSupported());
    assertNull(loadBalancerProfileModel.getLoggingSupported());
    assertNull(loadBalancerProfileModel.getName());
    assertNull(loadBalancerProfileModel.getRouteModeSupported());
    assertNull(loadBalancerProfileModel.getSecurityGroupsSupported());
    assertNull(loadBalancerProfileModel.getSourceIpSessionPersistenceSupported());
    assertNull(loadBalancerProfileModel.getUdpSupported());
  }
}