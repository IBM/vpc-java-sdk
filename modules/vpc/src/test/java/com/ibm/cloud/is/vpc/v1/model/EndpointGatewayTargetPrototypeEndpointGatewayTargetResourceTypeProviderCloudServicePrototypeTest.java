/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype model.
 */
public class EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype() throws Throwable {
    EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModel = new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.Builder()
      .crn("crn:v1:bluemix:public:cloudant:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:3527280b-9327-4411-8020-591092e60353::")
      .resourceType("provider_cloud_service")
      .build();
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModel.crn(), "crn:v1:bluemix:public:cloudant:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:3527280b-9327-4411-8020-591092e60353::");
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModel.resourceType(), "provider_cloud_service");

    String json = TestUtilities.serialize(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModel);

    EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModelNew = TestUtilities.deserialize(json, EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.class);
    assertTrue(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModelNew instanceof EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype);
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModelNew.crn(), "crn:v1:bluemix:public:cloudant:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:3527280b-9327-4411-8020-591092e60353::");
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeModelNew.resourceType(), "provider_cloud_service");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototypeError() throws Throwable {
    new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.Builder().build();
  }

}