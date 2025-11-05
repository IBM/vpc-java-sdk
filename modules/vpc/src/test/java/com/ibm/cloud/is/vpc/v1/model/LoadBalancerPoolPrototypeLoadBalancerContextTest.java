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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolPrototypeLoadBalancerContext model.
 */
public class LoadBalancerPoolPrototypeLoadBalancerContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolPrototypeLoadBalancerContext() throws Throwable {
    LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("tcp")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.type(), "tcp");

    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeModel.id(), "0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0");

    LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
      .build();
    assertEquals(loadBalancerPoolMemberPrototypeModel.port(), Long.valueOf("80"));
    assertEquals(loadBalancerPoolMemberPrototypeModel.target(), loadBalancerPoolMemberTargetPrototypeModel);
    assertEquals(loadBalancerPoolMemberPrototypeModel.weight(), Long.valueOf("50"));

    LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModel = new LoadBalancerPoolSessionPersistencePrototype.Builder()
      .cookieName("my-cookie-name")
      .type("app_cookie")
      .build();
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModel.cookieName(), "my-cookie-name");
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModel.type(), "app_cookie");

    LoadBalancerPoolPrototypeLoadBalancerContext loadBalancerPoolPrototypeLoadBalancerContextModel = new LoadBalancerPoolPrototypeLoadBalancerContext.Builder()
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
      .members(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel))
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
      .build();
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.healthMonitor(), loadBalancerPoolHealthMonitorPrototypeModel);
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.members(), java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel));
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.protocol(), "http");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.sessionPersistence(), loadBalancerPoolSessionPersistencePrototypeModel);

    String json = TestUtilities.serialize(loadBalancerPoolPrototypeLoadBalancerContextModel);

    LoadBalancerPoolPrototypeLoadBalancerContext loadBalancerPoolPrototypeLoadBalancerContextModelNew = TestUtilities.deserialize(json, LoadBalancerPoolPrototypeLoadBalancerContext.class);
    assertTrue(loadBalancerPoolPrototypeLoadBalancerContextModelNew instanceof LoadBalancerPoolPrototypeLoadBalancerContext);
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModelNew.algorithm(), "least_connections");
    TestUtilities.assertJsonEquals(loadBalancerPoolPrototypeLoadBalancerContextModelNew.healthMonitor().toString(), loadBalancerPoolHealthMonitorPrototypeModel.toString());
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModelNew.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModelNew.protocol(), "http");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModelNew.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModelNew.sessionPersistence().toString(), loadBalancerPoolSessionPersistencePrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolPrototypeLoadBalancerContextError() throws Throwable {
    new LoadBalancerPoolPrototypeLoadBalancerContext.Builder().build();
  }

}