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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirectPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    LoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolIdentityModel.id(), "r006-70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
      .build();
    assertEquals(loadBalancerListenerIdentityModel.id(), "r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091");

    LoadBalancerListenerHTTPSRedirectPrototype loadBalancerListenerHttpsRedirectPrototypeModel = new LoadBalancerListenerHTTPSRedirectPrototype.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .listener(loadBalancerListenerIdentityModel)
      .uri("/example?doc=get")
      .build();
    assertEquals(loadBalancerListenerHttpsRedirectPrototypeModel.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerHttpsRedirectPrototypeModel.listener(), loadBalancerListenerIdentityModel);
    assertEquals(loadBalancerListenerHttpsRedirectPrototypeModel.uri(), "/example?doc=get");

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
      .action("forward_to_listener")
      .name("my-load-balancer-listener-policy")
      .priority(Long.valueOf("5"))
      .rules(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel))
      .target(loadBalancerListenerPolicyTargetPrototypeModel)
      .build();
    assertEquals(loadBalancerListenerPolicyPrototypeModel.action(), "forward_to_listener");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.name(), "my-load-balancer-listener-policy");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.rules(), java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.target(), loadBalancerListenerPolicyTargetPrototypeModel);

    CreateLoadBalancerListenerOptions createLoadBalancerListenerOptionsModel = new CreateLoadBalancerListenerOptions.Builder()
      .loadBalancerId("testString")
      .protocol("http")
      .acceptProxyProtocol(true)
      .certificateInstance(certificateInstanceIdentityModel)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityModel)
      .httpsRedirect(loadBalancerListenerHttpsRedirectPrototypeModel)
      .idleConnectionTimeout(Long.valueOf("100"))
      .policies(java.util.Arrays.asList(loadBalancerListenerPolicyPrototypeModel))
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .build();
    assertEquals(createLoadBalancerListenerOptionsModel.loadBalancerId(), "testString");
    assertEquals(createLoadBalancerListenerOptionsModel.protocol(), "http");
    assertEquals(createLoadBalancerListenerOptionsModel.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(createLoadBalancerListenerOptionsModel.certificateInstance(), certificateInstanceIdentityModel);
    assertEquals(createLoadBalancerListenerOptionsModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(createLoadBalancerListenerOptionsModel.defaultPool(), loadBalancerPoolIdentityModel);
    assertEquals(createLoadBalancerListenerOptionsModel.httpsRedirect(), loadBalancerListenerHttpsRedirectPrototypeModel);
    assertEquals(createLoadBalancerListenerOptionsModel.idleConnectionTimeout(), Long.valueOf("100"));
    assertEquals(createLoadBalancerListenerOptionsModel.policies(), java.util.Arrays.asList(loadBalancerListenerPolicyPrototypeModel));
    assertEquals(createLoadBalancerListenerOptionsModel.port(), Long.valueOf("443"));
    assertEquals(createLoadBalancerListenerOptionsModel.portMax(), Long.valueOf("499"));
    assertEquals(createLoadBalancerListenerOptionsModel.portMin(), Long.valueOf("443"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerListenerOptionsError() throws Throwable {
    new CreateLoadBalancerListenerOptions.Builder().build();
  }

}