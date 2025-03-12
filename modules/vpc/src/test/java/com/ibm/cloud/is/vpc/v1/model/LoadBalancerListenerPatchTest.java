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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirectPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPatch model.
 */
public class LoadBalancerListenerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPatch() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById loadBalancerListenerDefaultPoolPatchModel = new LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById.Builder()
      .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerDefaultPoolPatchModel.id(), "r006-70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
      .build();
    assertEquals(loadBalancerListenerIdentityModel.id(), "r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091");

    LoadBalancerListenerHTTPSRedirectPatch loadBalancerListenerHttpsRedirectPatchModel = new LoadBalancerListenerHTTPSRedirectPatch.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .listener(loadBalancerListenerIdentityModel)
      .uri("/example?doc=get")
      .build();
    assertEquals(loadBalancerListenerHttpsRedirectPatchModel.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerHttpsRedirectPatchModel.listener(), loadBalancerListenerIdentityModel);
    assertEquals(loadBalancerListenerHttpsRedirectPatchModel.uri(), "/example?doc=get");

    LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
      .acceptProxyProtocol(true)
      .certificateInstance(certificateInstanceIdentityModel)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerListenerDefaultPoolPatchModel)
      .httpsRedirect(loadBalancerListenerHttpsRedirectPatchModel)
      .idleConnectionTimeout(Long.valueOf("100"))
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .protocol("http")
      .build();
    assertEquals(loadBalancerListenerPatchModel.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPatchModel.certificateInstance(), certificateInstanceIdentityModel);
    assertEquals(loadBalancerListenerPatchModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPatchModel.defaultPool(), loadBalancerListenerDefaultPoolPatchModel);
    assertEquals(loadBalancerListenerPatchModel.httpsRedirect(), loadBalancerListenerHttpsRedirectPatchModel);
    assertEquals(loadBalancerListenerPatchModel.idleConnectionTimeout(), Long.valueOf("100"));
    assertEquals(loadBalancerListenerPatchModel.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPatchModel.portMax(), Long.valueOf("499"));
    assertEquals(loadBalancerListenerPatchModel.portMin(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPatchModel.protocol(), "http");

    String json = TestUtilities.serialize(loadBalancerListenerPatchModel);

    LoadBalancerListenerPatch loadBalancerListenerPatchModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPatch.class);
    assertTrue(loadBalancerListenerPatchModelNew instanceof LoadBalancerListenerPatch);
    assertEquals(loadBalancerListenerPatchModelNew.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPatchModelNew.certificateInstance().toString(), certificateInstanceIdentityModel.toString());
    assertEquals(loadBalancerListenerPatchModelNew.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPatchModelNew.defaultPool().toString(), loadBalancerListenerDefaultPoolPatchModel.toString());
    assertEquals(loadBalancerListenerPatchModelNew.httpsRedirect().toString(), loadBalancerListenerHttpsRedirectPatchModel.toString());
    assertEquals(loadBalancerListenerPatchModelNew.idleConnectionTimeout(), Long.valueOf("100"));
    assertEquals(loadBalancerListenerPatchModelNew.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPatchModelNew.portMax(), Long.valueOf("499"));
    assertEquals(loadBalancerListenerPatchModelNew.portMin(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPatchModelNew.protocol(), "http");
  }
  @Test
  public void testLoadBalancerListenerPatchAsPatch() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();

    LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById loadBalancerListenerDefaultPoolPatchModel = new LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById.Builder()
      .id("r006-70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

    LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
      .build();

    LoadBalancerListenerHTTPSRedirectPatch loadBalancerListenerHttpsRedirectPatchModel = new LoadBalancerListenerHTTPSRedirectPatch.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .listener(loadBalancerListenerIdentityModel)
      .uri("/example?doc=get")
      .build();

    LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
      .acceptProxyProtocol(true)
      .certificateInstance(certificateInstanceIdentityModel)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerListenerDefaultPoolPatchModel)
      .httpsRedirect(loadBalancerListenerHttpsRedirectPatchModel)
      .idleConnectionTimeout(Long.valueOf("100"))
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .protocol("http")
      .build();

    Map<String, Object> mergePatch = loadBalancerListenerPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("accept_proxy_protocol"));
    assertTrue(mergePatch.containsKey("certificate_instance"));
    assertTrue(mergePatch.containsKey("connection_limit"));
    assertTrue(mergePatch.containsKey("default_pool"));
    assertTrue(mergePatch.containsKey("https_redirect"));
    assertTrue(mergePatch.containsKey("idle_connection_timeout"));
    assertTrue(mergePatch.containsKey("port"));
    assertTrue(mergePatch.containsKey("port_max"));
    assertTrue(mergePatch.containsKey("port_min"));
    assertEquals(mergePatch.get("protocol"), "http");
  }

}