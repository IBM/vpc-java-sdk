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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPrototypeLoadBalancerContext model.
 */
public class LoadBalancerListenerPrototypeLoadBalancerContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPrototypeLoadBalancerContext() throws Throwable {
    LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
      .name("my-load-balancer-pool")
      .build();
    assertEquals(loadBalancerPoolIdentityByNameModel.name(), "my-load-balancer-pool");

    LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModel = new LoadBalancerListenerPrototypeLoadBalancerContext.Builder()
      .acceptProxyProtocol(true)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityByNameModel)
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .protocol("http")
      .build();
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.defaultPool(), loadBalancerPoolIdentityByNameModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMax(), Long.valueOf("499"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMin(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.protocol(), "http");

    String json = TestUtilities.serialize(loadBalancerListenerPrototypeLoadBalancerContextModel);

    LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPrototypeLoadBalancerContext.class);
    assertTrue(loadBalancerListenerPrototypeLoadBalancerContextModelNew instanceof LoadBalancerListenerPrototypeLoadBalancerContext);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.defaultPool().toString(), loadBalancerPoolIdentityByNameModel.toString());
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.portMax(), Long.valueOf("499"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.portMin(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.protocol(), "http");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerPrototypeLoadBalancerContextError() throws Throwable {
    new LoadBalancerListenerPrototypeLoadBalancerContext.Builder().build();
  }

}