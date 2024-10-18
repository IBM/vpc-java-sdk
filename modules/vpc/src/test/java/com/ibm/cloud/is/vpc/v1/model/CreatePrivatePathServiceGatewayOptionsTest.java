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

import com.ibm.cloud.is.vpc.v1.model.CreatePrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePrivatePathServiceGatewayOptions model.
 */
public class CreatePrivatePathServiceGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePrivatePathServiceGatewayOptions() throws Throwable {
    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();
    assertEquals(loadBalancerIdentityModel.id(), "dd754295-e9e0-4c9d-bf6c-58fbc59e5727");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreatePrivatePathServiceGatewayOptions createPrivatePathServiceGatewayOptionsModel = new CreatePrivatePathServiceGatewayOptions.Builder()
      .loadBalancer(loadBalancerIdentityModel)
      .serviceEndpoints(java.util.Arrays.asList("*.example.com"))
      .defaultAccessPolicy("deny")
      .name("my-private-path-service-gateway")
      .resourceGroup(resourceGroupIdentityModel)
      .zonalAffinity(false)
      .build();
    assertEquals(createPrivatePathServiceGatewayOptionsModel.loadBalancer(), loadBalancerIdentityModel);
    assertEquals(createPrivatePathServiceGatewayOptionsModel.serviceEndpoints(), java.util.Arrays.asList("*.example.com"));
    assertEquals(createPrivatePathServiceGatewayOptionsModel.defaultAccessPolicy(), "deny");
    assertEquals(createPrivatePathServiceGatewayOptionsModel.name(), "my-private-path-service-gateway");
    assertEquals(createPrivatePathServiceGatewayOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createPrivatePathServiceGatewayOptionsModel.zonalAffinity(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrivatePathServiceGatewayOptionsError() throws Throwable {
    new CreatePrivatePathServiceGatewayOptions.Builder().build();
  }

}