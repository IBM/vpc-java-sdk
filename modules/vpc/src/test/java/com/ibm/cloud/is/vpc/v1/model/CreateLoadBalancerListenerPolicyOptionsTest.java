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

import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLoadBalancerListenerPolicyOptions model.
 */
public class CreateLoadBalancerListenerPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLoadBalancerListenerPolicyOptions() throws Throwable {
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

    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerPolicyTargetPrototypeModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptionsModel = new CreateLoadBalancerListenerPolicyOptions.Builder()
      .loadBalancerId("testString")
      .listenerId("testString")
      .action("forward")
      .priority(Long.valueOf("5"))
      .name("my-policy")
      .rules(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel))
      .target(loadBalancerListenerPolicyTargetPrototypeModel)
      .build();
    assertEquals(createLoadBalancerListenerPolicyOptionsModel.loadBalancerId(), "testString");
    assertEquals(createLoadBalancerListenerPolicyOptionsModel.listenerId(), "testString");
    assertEquals(createLoadBalancerListenerPolicyOptionsModel.action(), "forward");
    assertEquals(createLoadBalancerListenerPolicyOptionsModel.priority(), Long.valueOf("5"));
    assertEquals(createLoadBalancerListenerPolicyOptionsModel.name(), "my-policy");
    assertEquals(createLoadBalancerListenerPolicyOptionsModel.rules(), java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel));
    assertEquals(createLoadBalancerListenerPolicyOptionsModel.target(), loadBalancerListenerPolicyTargetPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerListenerPolicyOptionsError() throws Throwable {
    new CreateLoadBalancerListenerPolicyOptions.Builder().build();
  }

}