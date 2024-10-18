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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype model.
 */
public class EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype() throws Throwable {
    EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModel = new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype.Builder()
      .name("ibm-ntp-server")
      .resourceType("provider_infrastructure_service")
      .build();
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModel.name(), "ibm-ntp-server");
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModel.resourceType(), "provider_infrastructure_service");

    String json = TestUtilities.serialize(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModel);

    EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModelNew = TestUtilities.deserialize(json, EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype.class);
    assertTrue(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModelNew instanceof EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype);
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModelNew.name(), "ibm-ntp-server");
    assertEquals(endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeModelNew.resourceType(), "provider_infrastructure_service");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototypeError() throws Throwable {
    new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype.Builder().build();
  }

}