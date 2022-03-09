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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName model.
 */
public class EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName() throws Throwable {
    EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModel = new EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName.Builder()
      .resourceType("provider_cloud_service")
      .name("ibm-ntp-server")
      .build();
    assertEquals(endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModel.resourceType(), "provider_cloud_service");
    assertEquals(endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModel.name(), "ibm-ntp-server");

    String json = TestUtilities.serialize(endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModel);

    EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModelNew = TestUtilities.deserialize(json, EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName.class);
    assertTrue(endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModelNew instanceof EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName);
    assertEquals(endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModelNew.resourceType(), "provider_cloud_service");
    assertEquals(endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameModelNew.name(), "ibm-ntp-server");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByNameError() throws Throwable {
    new EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName.Builder().build();
  }

}