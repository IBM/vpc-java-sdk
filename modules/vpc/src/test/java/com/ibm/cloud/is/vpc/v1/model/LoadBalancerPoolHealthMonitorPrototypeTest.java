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
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolHealthMonitorPrototype model.
 */
public class LoadBalancerPoolHealthMonitorPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolHealthMonitorPrototype() throws Throwable {
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

    String json = TestUtilities.serialize(loadBalancerPoolHealthMonitorPrototypeModel);

    LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerPoolHealthMonitorPrototype.class);
    assertTrue(loadBalancerPoolHealthMonitorPrototypeModelNew instanceof LoadBalancerPoolHealthMonitorPrototype);
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModelNew.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModelNew.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModelNew.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModelNew.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModelNew.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModelNew.urlPath(), "/");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolHealthMonitorPrototypeError() throws Throwable {
    new LoadBalancerPoolHealthMonitorPrototype.Builder().build();
  }

}