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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN model.
 */
public class EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN() throws Throwable {
    EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModel = new EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.Builder()
      .resourceType("provider_cloud_service")
      .crn("crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::")
      .build();
    assertEquals(endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModel.resourceType(), "provider_cloud_service");
    assertEquals(endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModel.crn(), "crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::");

    String json = TestUtilities.serialize(endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModel);

    EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModelNew = TestUtilities.deserialize(json, EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.class);
    assertTrue(endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModelNew instanceof EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN);
    assertEquals(endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModelNew.resourceType(), "provider_cloud_service");
    assertEquals(endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRNError() throws Throwable {
    new EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.Builder().build();
  }

}