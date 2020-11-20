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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityById;
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
      .crn("crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758");

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolIdentityModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
      .acceptProxyProtocol(true)
      .certificateInstance(certificateInstanceIdentityModel)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityModel)
      .port(Long.valueOf("443"))
      .protocol("http")
      .build();
    assertEquals(loadBalancerListenerPatchModel.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPatchModel.certificateInstance(), certificateInstanceIdentityModel);
    assertEquals(loadBalancerListenerPatchModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPatchModel.defaultPool(), loadBalancerPoolIdentityModel);
    assertEquals(loadBalancerListenerPatchModel.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPatchModel.protocol(), "http");

    String json = TestUtilities.serialize(loadBalancerListenerPatchModel);

    LoadBalancerListenerPatch loadBalancerListenerPatchModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPatch.class);
    assertTrue(loadBalancerListenerPatchModelNew instanceof LoadBalancerListenerPatch);
    assertEquals(loadBalancerListenerPatchModelNew.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPatchModelNew.certificateInstance().toString(), certificateInstanceIdentityModel.toString());
    assertEquals(loadBalancerListenerPatchModelNew.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPatchModelNew.defaultPool().toString(), loadBalancerPoolIdentityModel.toString());
    assertEquals(loadBalancerListenerPatchModelNew.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPatchModelNew.protocol(), "http");
  }
  @Test
  public void testLoadBalancerListenerPatchAsPatch() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758")
      .build();

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

    LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
      .acceptProxyProtocol(true)
      .certificateInstance(certificateInstanceIdentityModel)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityModel)
      .port(Long.valueOf("443"))
      .protocol("http")
      .build();

    Map<String, Object> mergePatch = loadBalancerListenerPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("accept_proxy_protocol"));
    assertTrue(mergePatch.containsKey("certificate_instance"));
    assertTrue(mergePatch.containsKey("connection_limit"));
    assertTrue(mergePatch.containsKey("default_pool"));
    assertTrue(mergePatch.containsKey("port"));
    assertEquals(mergePatch.get("protocol"), "http");
  }

}