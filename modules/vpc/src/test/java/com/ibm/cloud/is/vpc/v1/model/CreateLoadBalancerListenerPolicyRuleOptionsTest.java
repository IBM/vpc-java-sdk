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

import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLoadBalancerListenerPolicyRuleOptions model.
 */
public class CreateLoadBalancerListenerPolicyRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLoadBalancerListenerPolicyRuleOptions() throws Throwable {
    CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptionsModel = new CreateLoadBalancerListenerPolicyRuleOptions.Builder()
      .loadBalancerId("testString")
      .listenerId("testString")
      .policyId("testString")
      .condition("contains")
      .type("body")
      .value("testString")
      .field("MY-APP-HEADER")
      .build();
    assertEquals(createLoadBalancerListenerPolicyRuleOptionsModel.loadBalancerId(), "testString");
    assertEquals(createLoadBalancerListenerPolicyRuleOptionsModel.listenerId(), "testString");
    assertEquals(createLoadBalancerListenerPolicyRuleOptionsModel.policyId(), "testString");
    assertEquals(createLoadBalancerListenerPolicyRuleOptionsModel.condition(), "contains");
    assertEquals(createLoadBalancerListenerPolicyRuleOptionsModel.type(), "body");
    assertEquals(createLoadBalancerListenerPolicyRuleOptionsModel.value(), "testString");
    assertEquals(createLoadBalancerListenerPolicyRuleOptionsModel.field(), "MY-APP-HEADER");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerListenerPolicyRuleOptionsError() throws Throwable {
    new CreateLoadBalancerListenerPolicyRuleOptions.Builder().build();
  }

}