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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivatePathServiceGatewayPatch model.
 */
public class PrivatePathServiceGatewayPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivatePathServiceGatewayPatch() throws Throwable {
    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();
    assertEquals(loadBalancerIdentityModel.id(), "r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727");

    PrivatePathServiceGatewayPatch privatePathServiceGatewayPatchModel = new PrivatePathServiceGatewayPatch.Builder()
      .defaultAccessPolicy("deny")
      .loadBalancer(loadBalancerIdentityModel)
      .name("my-private-path-service-gateway")
      .zonalAffinity(true)
      .build();
    assertEquals(privatePathServiceGatewayPatchModel.defaultAccessPolicy(), "deny");
    assertEquals(privatePathServiceGatewayPatchModel.loadBalancer(), loadBalancerIdentityModel);
    assertEquals(privatePathServiceGatewayPatchModel.name(), "my-private-path-service-gateway");
    assertEquals(privatePathServiceGatewayPatchModel.zonalAffinity(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(privatePathServiceGatewayPatchModel);

    PrivatePathServiceGatewayPatch privatePathServiceGatewayPatchModelNew = TestUtilities.deserialize(json, PrivatePathServiceGatewayPatch.class);
    assertTrue(privatePathServiceGatewayPatchModelNew instanceof PrivatePathServiceGatewayPatch);
    assertEquals(privatePathServiceGatewayPatchModelNew.defaultAccessPolicy(), "deny");
    assertEquals(privatePathServiceGatewayPatchModelNew.loadBalancer().toString(), loadBalancerIdentityModel.toString());
    assertEquals(privatePathServiceGatewayPatchModelNew.name(), "my-private-path-service-gateway");
    assertEquals(privatePathServiceGatewayPatchModelNew.zonalAffinity(), Boolean.valueOf(true));
  }
  @Test
  public void testPrivatePathServiceGatewayPatchAsPatch() throws Throwable {
    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();

    PrivatePathServiceGatewayPatch privatePathServiceGatewayPatchModel = new PrivatePathServiceGatewayPatch.Builder()
      .defaultAccessPolicy("deny")
      .loadBalancer(loadBalancerIdentityModel)
      .name("my-private-path-service-gateway")
      .zonalAffinity(true)
      .build();

    Map<String, Object> mergePatch = privatePathServiceGatewayPatchModel.asPatch();

    assertEquals(mergePatch.get("default_access_policy"), "deny");
    assertTrue(mergePatch.containsKey("load_balancer"));
    assertEquals(mergePatch.get("name"), "my-private-path-service-gateway");
    assertTrue(mergePatch.containsKey("zonal_affinity"));
  }

}