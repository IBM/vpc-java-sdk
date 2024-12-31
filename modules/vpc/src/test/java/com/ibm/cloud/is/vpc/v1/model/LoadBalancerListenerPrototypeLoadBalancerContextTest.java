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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirectPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
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
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
      .name("my-load-balancer-pool")
      .build();
    assertEquals(loadBalancerPoolIdentityByNameModel.name(), "my-load-balancer-pool");

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

    LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModel = new LoadBalancerListenerPrototypeLoadBalancerContext.Builder()
      .acceptProxyProtocol(true)
      .certificateInstance(certificateInstanceIdentityModel)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityByNameModel)
      .httpsRedirect(loadBalancerListenerHttpsRedirectPrototypeModel)
      .idleConnectionTimeout(Long.valueOf("100"))
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .protocol("http")
      .build();
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.certificateInstance(), certificateInstanceIdentityModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.defaultPool(), loadBalancerPoolIdentityByNameModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.httpsRedirect(), loadBalancerListenerHttpsRedirectPrototypeModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.idleConnectionTimeout(), Long.valueOf("100"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMax(), Long.valueOf("499"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMin(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.protocol(), "http");

    String json = TestUtilities.serialize(loadBalancerListenerPrototypeLoadBalancerContextModel);

    LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPrototypeLoadBalancerContext.class);
    assertTrue(loadBalancerListenerPrototypeLoadBalancerContextModelNew instanceof LoadBalancerListenerPrototypeLoadBalancerContext);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.certificateInstance().toString(), certificateInstanceIdentityModel.toString());
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.defaultPool().toString(), loadBalancerPoolIdentityByNameModel.toString());
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.httpsRedirect().toString(), loadBalancerListenerHttpsRedirectPrototypeModel.toString());
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModelNew.idleConnectionTimeout(), Long.valueOf("100"));
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