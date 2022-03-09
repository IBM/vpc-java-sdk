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

import com.ibm.cloud.is.vpc.v1.model.CreateEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
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
 * Unit test class for the CreateEndpointGatewayOptions model.
 */
public class CreateEndpointGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateEndpointGatewayOptions() throws Throwable {
    EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN endpointGatewayTargetPrototypeModel = new EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.Builder()
      .resourceType("provider_cloud_service")
      .crn("crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::")
      .build();
    assertEquals(endpointGatewayTargetPrototypeModel.resourceType(), "provider_cloud_service");
    assertEquals(endpointGatewayTargetPrototypeModel.crn(), "crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById endpointGatewayReservedIpModel = new EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById.Builder()
      .id("6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();
    assertEquals(endpointGatewayReservedIpModel.id(), "6d353a0f-aeb1-4ae1-832e-1110d10981bb");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    CreateEndpointGatewayOptions createEndpointGatewayOptionsModel = new CreateEndpointGatewayOptions.Builder()
      .target(endpointGatewayTargetPrototypeModel)
      .vpc(vpcIdentityModel)
      .ips(new java.util.ArrayList<EndpointGatewayReservedIP>(java.util.Arrays.asList(endpointGatewayReservedIpModel)))
      .name("my-endpoint-gateway")
      .resourceGroup(resourceGroupIdentityModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .build();
    assertEquals(createEndpointGatewayOptionsModel.target(), endpointGatewayTargetPrototypeModel);
    assertEquals(createEndpointGatewayOptionsModel.vpc(), vpcIdentityModel);
    assertEquals(createEndpointGatewayOptionsModel.ips(), new java.util.ArrayList<EndpointGatewayReservedIP>(java.util.Arrays.asList(endpointGatewayReservedIpModel)));
    assertEquals(createEndpointGatewayOptionsModel.name(), "my-endpoint-gateway");
    assertEquals(createEndpointGatewayOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createEndpointGatewayOptionsModel.securityGroups(), new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEndpointGatewayOptionsError() throws Throwable {
    new CreateEndpointGatewayOptions.Builder().build();
  }

}