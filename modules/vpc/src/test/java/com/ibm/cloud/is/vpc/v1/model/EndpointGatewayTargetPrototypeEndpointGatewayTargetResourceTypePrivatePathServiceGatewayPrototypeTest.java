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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype model.
 */
public class EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype() throws Throwable {
    EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModel = new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype.Builder()
      .crn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::private-path-service-gateway:r006-7268d425-59b7-48fd-9735-81a7271657d5")
      .resourceType("private_path_service_gateway")
      .build();
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModel.crn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::private-path-service-gateway:r006-7268d425-59b7-48fd-9735-81a7271657d5");
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModel.resourceType(), "private_path_service_gateway");

    String json = TestUtilities.serialize(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModel);

    EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModelNew = TestUtilities.deserialize(json, EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype.class);
    assertTrue(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModelNew instanceof EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype);
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModelNew.crn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::private-path-service-gateway:r006-7268d425-59b7-48fd-9735-81a7271657d5");
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeModelNew.resourceType(), "private_path_service_gateway");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototypeError() throws Throwable {
    new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype.Builder().build();
  }

}