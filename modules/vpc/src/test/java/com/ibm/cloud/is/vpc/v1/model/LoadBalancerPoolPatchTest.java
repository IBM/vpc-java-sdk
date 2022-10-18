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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolPatch model.
 */
public class LoadBalancerPoolPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolPatch() throws Throwable {
    LoadBalancerPoolHealthMonitorPatch loadBalancerPoolHealthMonitorPatchModel = new LoadBalancerPoolHealthMonitorPatch.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.urlPath(), "/");

    LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatchModel = new LoadBalancerPoolSessionPersistencePatch.Builder()
      .cookieName("my-cookie-name")
      .type("app_cookie")
      .build();
    assertEquals(loadBalancerPoolSessionPersistencePatchModel.cookieName(), "my-cookie-name");
    assertEquals(loadBalancerPoolSessionPersistencePatchModel.type(), "app_cookie");

    LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
      .build();
    assertEquals(loadBalancerPoolPatchModel.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPatchModel.healthMonitor(), loadBalancerPoolHealthMonitorPatchModel);
    assertEquals(loadBalancerPoolPatchModel.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPatchModel.protocol(), "http");
    assertEquals(loadBalancerPoolPatchModel.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPatchModel.sessionPersistence(), loadBalancerPoolSessionPersistencePatchModel);

    String json = TestUtilities.serialize(loadBalancerPoolPatchModel);

    LoadBalancerPoolPatch loadBalancerPoolPatchModelNew = TestUtilities.deserialize(json, LoadBalancerPoolPatch.class);
    assertTrue(loadBalancerPoolPatchModelNew instanceof LoadBalancerPoolPatch);
    assertEquals(loadBalancerPoolPatchModelNew.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPatchModelNew.healthMonitor().toString(), loadBalancerPoolHealthMonitorPatchModel.toString());
    assertEquals(loadBalancerPoolPatchModelNew.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPatchModelNew.protocol(), "http");
    assertEquals(loadBalancerPoolPatchModelNew.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPatchModelNew.sessionPersistence().toString(), loadBalancerPoolSessionPersistencePatchModel.toString());
  }
  @Test
  public void testLoadBalancerPoolPatchAsPatch() throws Throwable {
    LoadBalancerPoolHealthMonitorPatch loadBalancerPoolHealthMonitorPatchModel = new LoadBalancerPoolHealthMonitorPatch.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();

    LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatchModel = new LoadBalancerPoolSessionPersistencePatch.Builder()
      .cookieName("my-cookie-name")
      .type("app_cookie")
      .build();

    LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
      .build();

    Map<String, Object> mergePatch = loadBalancerPoolPatchModel.asPatch();

    assertEquals(mergePatch.get("algorithm"), "least_connections");
    assertTrue(mergePatch.containsKey("health_monitor"));
    assertEquals(mergePatch.get("name"), "my-load-balancer-pool");
    assertEquals(mergePatch.get("protocol"), "http");
    assertEquals(mergePatch.get("proxy_protocol"), "disabled");
    assertTrue(mergePatch.containsKey("session_persistence"));
  }

}