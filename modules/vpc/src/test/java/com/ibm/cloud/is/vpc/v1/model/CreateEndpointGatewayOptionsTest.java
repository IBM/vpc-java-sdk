/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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
    EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype endpointGatewayTargetPrototypeModel = new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype.Builder()
      .crn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::private-path-service-gateway:r134-fb880975-db45-4459-8548-64e3995ac213")
      .resourceType("private_path_service_gateway")
      .build();
    assertEquals(endpointGatewayTargetPrototypeModel.crn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::private-path-service-gateway:r134-fb880975-db45-4459-8548-64e3995ac213");
    assertEquals(endpointGatewayTargetPrototypeModel.resourceType(), "private_path_service_gateway");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    EndpointGatewayReservedIPReservedIPIdentityById endpointGatewayReservedIpModel = new EndpointGatewayReservedIPReservedIPIdentityById.Builder()
      .id("0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();
    assertEquals(endpointGatewayReservedIpModel.id(), "0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("r134-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "r134-be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    CreateEndpointGatewayOptions createEndpointGatewayOptionsModel = new CreateEndpointGatewayOptions.Builder()
      .target(endpointGatewayTargetPrototypeModel)
      .vpc(vpcIdentityModel)
      .allowDnsResolutionBinding(true)
      .ips(java.util.Arrays.asList(endpointGatewayReservedIpModel))
      .name("my-endpoint-gateway")
      .resourceGroup(resourceGroupIdentityModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .build();
    assertEquals(createEndpointGatewayOptionsModel.target(), endpointGatewayTargetPrototypeModel);
    assertEquals(createEndpointGatewayOptionsModel.vpc(), vpcIdentityModel);
    assertEquals(createEndpointGatewayOptionsModel.allowDnsResolutionBinding(), Boolean.valueOf(true));
    assertEquals(createEndpointGatewayOptionsModel.ips(), java.util.Arrays.asList(endpointGatewayReservedIpModel));
    assertEquals(createEndpointGatewayOptionsModel.name(), "my-endpoint-gateway");
    assertEquals(createEndpointGatewayOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createEndpointGatewayOptionsModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEndpointGatewayOptionsError() throws Throwable {
    new CreateEndpointGatewayOptions.Builder().build();
  }

}