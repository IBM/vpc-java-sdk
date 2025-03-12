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

import com.ibm.cloud.is.vpc.v1.model.AccountReference;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReferenceRemote;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayRemote;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBinding;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBindingHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceRemote;
import com.ibm.cloud.is.vpc.v1.model.VPCRemote;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPCDNSResolutionBinding model.
 */
public class VPCDNSResolutionBindingTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPCDNSResolutionBinding() throws Throwable {
    VPCDNSResolutionBinding vpcdnsResolutionBindingModel = new VPCDNSResolutionBinding();
    assertNull(vpcdnsResolutionBindingModel.getCreatedAt());
    assertNull(vpcdnsResolutionBindingModel.getEndpointGateways());
    assertNull(vpcdnsResolutionBindingModel.getHealthReasons());
    assertNull(vpcdnsResolutionBindingModel.getHealthState());
    assertNull(vpcdnsResolutionBindingModel.getHref());
    assertNull(vpcdnsResolutionBindingModel.getId());
    assertNull(vpcdnsResolutionBindingModel.getLifecycleState());
    assertNull(vpcdnsResolutionBindingModel.getName());
    assertNull(vpcdnsResolutionBindingModel.getResourceType());
    assertNull(vpcdnsResolutionBindingModel.getVpc());
  }
}