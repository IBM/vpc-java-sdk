/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLoadBalancerListenerOptions model.
 */
public class CreateLoadBalancerListenerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLoadBalancerListenerOptions() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758");

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolIdentityModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("header")
      .value("testString")
      .build();
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.condition(), "contains");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.field(), "MY-APP-HEADER");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.type(), "header");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.value(), "testString");

    LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyPrototypeTargetModel = new LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerPolicyPrototypeTargetModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModel = new LoadBalancerListenerPolicyPrototype.Builder()
      .name("my-policy")
      .priority(Long.valueOf("5"))
      .action("forward")
      .rules(new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)))
      .target(loadBalancerListenerPolicyPrototypeTargetModel)
      .build();
    assertEquals(loadBalancerListenerPolicyPrototypeModel.name(), "my-policy");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.action(), "forward");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.rules(), new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.target(), loadBalancerListenerPolicyPrototypeTargetModel);

    CreateLoadBalancerListenerOptions createLoadBalancerListenerOptionsModel = new CreateLoadBalancerListenerOptions.Builder()
      .loadBalancerId("testString")
      .port(Long.valueOf("443"))
      .protocol("http")
      .connectionLimit(Long.valueOf("2000"))
      .certificateInstance(certificateInstanceIdentityModel)
      .defaultPool(loadBalancerPoolIdentityModel)
      .policies(new java.util.ArrayList<LoadBalancerListenerPolicyPrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyPrototypeModel)))
      .build();
    assertEquals(createLoadBalancerListenerOptionsModel.loadBalancerId(), "testString");
    assertEquals(createLoadBalancerListenerOptionsModel.port(), Long.valueOf("443"));
    assertEquals(createLoadBalancerListenerOptionsModel.protocol(), "http");
    assertEquals(createLoadBalancerListenerOptionsModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(createLoadBalancerListenerOptionsModel.certificateInstance(), certificateInstanceIdentityModel);
    assertEquals(createLoadBalancerListenerOptionsModel.defaultPool(), loadBalancerPoolIdentityModel);
    assertEquals(createLoadBalancerListenerOptionsModel.policies(), new java.util.ArrayList<LoadBalancerListenerPolicyPrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyPrototypeModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerListenerOptionsError() throws Throwable {
    new CreateLoadBalancerListenerOptions.Builder().build();
  }

}