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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyPrototype model.
 */
public class LoadBalancerListenerPolicyPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyPrototype() throws Throwable {
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

    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerPolicyTargetPrototypeModel.id(), "r006-70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModel = new LoadBalancerListenerPolicyPrototype.Builder()
      .action("forward")
      .name("my-load-balancer-listener-policy")
      .priority(Long.valueOf("5"))
      .rules(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel))
      .target(loadBalancerListenerPolicyTargetPrototypeModel)
      .build();
    assertEquals(loadBalancerListenerPolicyPrototypeModel.action(), "forward");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.name(), "my-load-balancer-listener-policy");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.rules(), java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.target(), loadBalancerListenerPolicyTargetPrototypeModel);

    String json = TestUtilities.serialize(loadBalancerListenerPolicyPrototypeModel);

    LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyPrototype.class);
    assertTrue(loadBalancerListenerPolicyPrototypeModelNew instanceof LoadBalancerListenerPolicyPrototype);
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.action(), "forward");
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.name(), "my-load-balancer-listener-policy");
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.target().toString(), loadBalancerListenerPolicyTargetPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerPolicyPrototypeError() throws Throwable {
    new LoadBalancerListenerPolicyPrototype.Builder().build();
  }

}