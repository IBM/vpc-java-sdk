/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype model.
 */
public class LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype() throws Throwable {
    LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModel = new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("tcp")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModel.type(), "tcp");

    String json = TestUtilities.serialize(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModel);

    LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.class);
    assertTrue(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModelNew instanceof LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype);
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModelNew.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModelNew.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModelNew.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModelNew.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototypeModelNew.type(), "tcp");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototypeError() throws Throwable {
    new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.Builder().build();
  }

}