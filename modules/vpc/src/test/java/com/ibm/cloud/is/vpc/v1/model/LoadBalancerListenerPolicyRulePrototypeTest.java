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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyRulePrototype model.
 */
public class LoadBalancerListenerPolicyRulePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyRulePrototype() throws Throwable {
    LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("body")
      .value("testString")
      .build();
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.condition(), "contains");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.field(), "MY-APP-HEADER");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.type(), "body");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.value(), "testString");

    String json = TestUtilities.serialize(loadBalancerListenerPolicyRulePrototypeModel);

    LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyRulePrototype.class);
    assertTrue(loadBalancerListenerPolicyRulePrototypeModelNew instanceof LoadBalancerListenerPolicyRulePrototype);
    assertEquals(loadBalancerListenerPolicyRulePrototypeModelNew.condition(), "contains");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModelNew.field(), "MY-APP-HEADER");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModelNew.type(), "body");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModelNew.value(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerPolicyRulePrototypeError() throws Throwable {
    new LoadBalancerListenerPolicyRulePrototype.Builder().build();
  }

}