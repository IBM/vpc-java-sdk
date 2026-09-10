/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolClientAuthenticationPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolServerAuthenticationPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolPatch model.
 */
public class LoadBalancerPoolPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolPatch() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    LoadBalancerPoolClientAuthenticationPatch loadBalancerPoolClientAuthenticationPatchModel = new LoadBalancerPoolClientAuthenticationPatch.Builder()
      .certificateInstance(certificateInstanceIdentityModel)
      .build();
    assertEquals(loadBalancerPoolClientAuthenticationPatchModel.certificateInstance(), certificateInstanceIdentityModel);

    LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById loadBalancerPoolFailsafePolicyTargetPatchModel = new LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById.Builder()
      .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolFailsafePolicyTargetPatchModel.id(), "r006-70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerPoolFailsafePolicyPatch loadBalancerPoolFailsafePolicyPatchModel = new LoadBalancerPoolFailsafePolicyPatch.Builder()
      .action("forward")
      .target(loadBalancerPoolFailsafePolicyTargetPatchModel)
      .build();
    assertEquals(loadBalancerPoolFailsafePolicyPatchModel.action(), "forward");
    assertEquals(loadBalancerPoolFailsafePolicyPatchModel.target(), loadBalancerPoolFailsafePolicyTargetPatchModel);

    LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototypeModel = new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype.Builder()
      .field("Content-Type")
      .value("text/plain")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototypeModel.field(), "Content-Type");
    assertEquals(loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototypeModel.value(), "text/plain");

    LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel = new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch.Builder()
      .body("ACTIVE")
      .headers(java.util.Arrays.asList(loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototypeModel))
      .method("get")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel.body(), "ACTIVE");
    assertEquals(loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel.headers(), java.util.Arrays.asList(loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototypeModel));
    assertEquals(loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel.method(), "get");

    LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePatch loadBalancerPoolHealthMonitorTypeHttphttpsResponsePatchModel = new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePatch.Builder()
      .bodyRegex("ACTIVE")
      .codes(java.util.Arrays.asList("2XX"))
      .build();
    assertEquals(loadBalancerPoolHealthMonitorTypeHttphttpsResponsePatchModel.bodyRegex(), "ACTIVE");
    assertEquals(loadBalancerPoolHealthMonitorTypeHttphttpsResponsePatchModel.codes(), java.util.Arrays.asList("2XX"));

    LoadBalancerPoolHealthMonitorPatch loadBalancerPoolHealthMonitorPatchModel = new LoadBalancerPoolHealthMonitorPatch.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .request(loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel)
      .response(loadBalancerPoolHealthMonitorTypeHttphttpsResponsePatchModel)
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.request(), loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel);
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.response(), loadBalancerPoolHealthMonitorTypeHttphttpsResponsePatchModel);
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.urlPath(), "/");

    LoadBalancerPoolServerAuthenticationPatch loadBalancerPoolServerAuthenticationPatchModel = new LoadBalancerPoolServerAuthenticationPatch.Builder()
      .certificateAuthority(certificateInstanceIdentityModel)
      .verifyCertificate(false)
      .build();
    assertEquals(loadBalancerPoolServerAuthenticationPatchModel.certificateAuthority(), certificateInstanceIdentityModel);
    assertEquals(loadBalancerPoolServerAuthenticationPatchModel.verifyCertificate(), Boolean.valueOf(false));

    LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatchModel = new LoadBalancerPoolSessionPersistencePatch.Builder()
      .cookieName("my-cookie-name")
      .type("app_cookie")
      .build();
    assertEquals(loadBalancerPoolSessionPersistencePatchModel.cookieName(), "my-cookie-name");
    assertEquals(loadBalancerPoolSessionPersistencePatchModel.type(), "app_cookie");

    LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
      .algorithm("least_connections")
      .clientAuthentication(loadBalancerPoolClientAuthenticationPatchModel)
      .failsafePolicy(loadBalancerPoolFailsafePolicyPatchModel)
      .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .serverAuthentication(loadBalancerPoolServerAuthenticationPatchModel)
      .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
      .build();
    assertEquals(loadBalancerPoolPatchModel.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPatchModel.clientAuthentication(), loadBalancerPoolClientAuthenticationPatchModel);
    assertEquals(loadBalancerPoolPatchModel.failsafePolicy(), loadBalancerPoolFailsafePolicyPatchModel);
    assertEquals(loadBalancerPoolPatchModel.healthMonitor(), loadBalancerPoolHealthMonitorPatchModel);
    assertEquals(loadBalancerPoolPatchModel.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPatchModel.protocol(), "http");
    assertEquals(loadBalancerPoolPatchModel.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPatchModel.serverAuthentication(), loadBalancerPoolServerAuthenticationPatchModel);
    assertEquals(loadBalancerPoolPatchModel.sessionPersistence(), loadBalancerPoolSessionPersistencePatchModel);

    String json = TestUtilities.serialize(loadBalancerPoolPatchModel);

    LoadBalancerPoolPatch loadBalancerPoolPatchModelNew = TestUtilities.deserialize(json, LoadBalancerPoolPatch.class);
    assertTrue(loadBalancerPoolPatchModelNew instanceof LoadBalancerPoolPatch);
    assertEquals(loadBalancerPoolPatchModelNew.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPatchModelNew.clientAuthentication().toString(), loadBalancerPoolClientAuthenticationPatchModel.toString());
    assertEquals(loadBalancerPoolPatchModelNew.failsafePolicy().toString(), loadBalancerPoolFailsafePolicyPatchModel.toString());
    assertEquals(loadBalancerPoolPatchModelNew.healthMonitor().toString(), loadBalancerPoolHealthMonitorPatchModel.toString());
    assertEquals(loadBalancerPoolPatchModelNew.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPatchModelNew.protocol(), "http");
    assertEquals(loadBalancerPoolPatchModelNew.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPatchModelNew.serverAuthentication().toString(), loadBalancerPoolServerAuthenticationPatchModel.toString());
    assertEquals(loadBalancerPoolPatchModelNew.sessionPersistence().toString(), loadBalancerPoolSessionPersistencePatchModel.toString());
  }
  @Test
  public void testLoadBalancerPoolPatchAsPatch() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();

    LoadBalancerPoolClientAuthenticationPatch loadBalancerPoolClientAuthenticationPatchModel = new LoadBalancerPoolClientAuthenticationPatch.Builder()
      .certificateInstance(certificateInstanceIdentityModel)
      .build();

    LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById loadBalancerPoolFailsafePolicyTargetPatchModel = new LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById.Builder()
      .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

    LoadBalancerPoolFailsafePolicyPatch loadBalancerPoolFailsafePolicyPatchModel = new LoadBalancerPoolFailsafePolicyPatch.Builder()
      .action("forward")
      .target(loadBalancerPoolFailsafePolicyTargetPatchModel)
      .build();

    LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototypeModel = new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype.Builder()
      .field("Content-Type")
      .value("text/plain")
      .build();

    LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel = new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch.Builder()
      .body("ACTIVE")
      .headers(java.util.Arrays.asList(loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototypeModel))
      .method("get")
      .build();

    LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePatch loadBalancerPoolHealthMonitorTypeHttphttpsResponsePatchModel = new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePatch.Builder()
      .bodyRegex("ACTIVE")
      .codes(java.util.Arrays.asList("2XX"))
      .build();

    LoadBalancerPoolHealthMonitorPatch loadBalancerPoolHealthMonitorPatchModel = new LoadBalancerPoolHealthMonitorPatch.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .request(loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatchModel)
      .response(loadBalancerPoolHealthMonitorTypeHttphttpsResponsePatchModel)
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();

    LoadBalancerPoolServerAuthenticationPatch loadBalancerPoolServerAuthenticationPatchModel = new LoadBalancerPoolServerAuthenticationPatch.Builder()
      .certificateAuthority(certificateInstanceIdentityModel)
      .verifyCertificate(false)
      .build();

    LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatchModel = new LoadBalancerPoolSessionPersistencePatch.Builder()
      .cookieName("my-cookie-name")
      .type("app_cookie")
      .build();

    LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
      .algorithm("least_connections")
      .clientAuthentication(loadBalancerPoolClientAuthenticationPatchModel)
      .failsafePolicy(loadBalancerPoolFailsafePolicyPatchModel)
      .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .serverAuthentication(loadBalancerPoolServerAuthenticationPatchModel)
      .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
      .build();

    Map<String, Object> mergePatch = loadBalancerPoolPatchModel.asPatch();

    assertEquals(mergePatch.get("algorithm"), "least_connections");
    assertTrue(mergePatch.containsKey("client_authentication"));
    assertTrue(mergePatch.containsKey("failsafe_policy"));
    assertTrue(mergePatch.containsKey("health_monitor"));
    assertEquals(mergePatch.get("name"), "my-load-balancer-pool");
    assertEquals(mergePatch.get("protocol"), "http");
    assertEquals(mergePatch.get("proxy_protocol"), "disabled");
    assertTrue(mergePatch.containsKey("server_authentication"));
    assertTrue(mergePatch.containsKey("session_persistence"));
  }

}