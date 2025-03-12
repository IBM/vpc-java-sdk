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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype model.
 */
public class LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype() throws Throwable {
    LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel = new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel.urlPath(), "/");

    String json = TestUtilities.serialize(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModel);

    LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype.class);
    assertTrue(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew instanceof LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype);
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototypeModelNew.urlPath(), "/");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototypeError() throws Throwable {
    new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype.Builder().build();
  }

}