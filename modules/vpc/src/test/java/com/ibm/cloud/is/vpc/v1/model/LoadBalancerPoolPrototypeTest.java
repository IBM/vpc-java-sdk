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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolPrototype model.
 */
public class LoadBalancerPoolPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolPrototype() throws Throwable {
    LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.urlPath(), "/");

    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

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

    LoadBalancerPoolPrototype loadBalancerPoolPrototypeModel = new LoadBalancerPoolPrototype.Builder()
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
      .members(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel))
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
      .build();
    assertEquals(loadBalancerPoolPrototypeModel.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPrototypeModel.healthMonitor(), loadBalancerPoolHealthMonitorPrototypeModel);
    assertEquals(loadBalancerPoolPrototypeModel.members(), java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel));
    assertEquals(loadBalancerPoolPrototypeModel.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPrototypeModel.protocol(), "http");
    assertEquals(loadBalancerPoolPrototypeModel.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPrototypeModel.sessionPersistence(), loadBalancerPoolSessionPersistencePrototypeModel);

    String json = TestUtilities.serialize(loadBalancerPoolPrototypeModel);

    LoadBalancerPoolPrototype loadBalancerPoolPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerPoolPrototype.class);
    assertTrue(loadBalancerPoolPrototypeModelNew instanceof LoadBalancerPoolPrototype);
    assertEquals(loadBalancerPoolPrototypeModelNew.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPrototypeModelNew.healthMonitor().toString(), loadBalancerPoolHealthMonitorPrototypeModel.toString());
    assertEquals(loadBalancerPoolPrototypeModelNew.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPrototypeModelNew.protocol(), "http");
    assertEquals(loadBalancerPoolPrototypeModelNew.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPrototypeModelNew.sessionPersistence().toString(), loadBalancerPoolSessionPersistencePrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolPrototypeError() throws Throwable {
    new LoadBalancerPoolPrototype.Builder().build();
  }

}