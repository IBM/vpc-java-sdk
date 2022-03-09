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

import com.ibm.cloud.is.vpc.v1.model.EndpointGateway;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetProviderCloudServiceReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReferenceDeleted;
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
 * Unit test class for the EndpointGateway model.
 */
public class EndpointGatewayTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGateway() throws Throwable {
    EndpointGateway endpointGatewayModel = new EndpointGateway();
    assertNull(endpointGatewayModel.getCreatedAt());
    assertNull(endpointGatewayModel.getCrn());
    assertNull(endpointGatewayModel.getHealthState());
    assertNull(endpointGatewayModel.getHref());
    assertNull(endpointGatewayModel.getId());
    assertNull(endpointGatewayModel.getIps());
    assertNull(endpointGatewayModel.getLifecycleState());
    assertNull(endpointGatewayModel.getName());
    assertNull(endpointGatewayModel.getResourceGroup());
    assertNull(endpointGatewayModel.getResourceType());
    assertNull(endpointGatewayModel.getSecurityGroups());
    assertNull(endpointGatewayModel.getServiceEndpoint());
    assertNull(endpointGatewayModel.getServiceEndpoints());
    assertNull(endpointGatewayModel.getTarget());
    assertNull(endpointGatewayModel.getVpc());
  }
}