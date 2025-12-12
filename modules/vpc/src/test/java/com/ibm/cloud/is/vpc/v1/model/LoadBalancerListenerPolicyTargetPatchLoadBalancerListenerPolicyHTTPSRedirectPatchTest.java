/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch model.
 */
public class LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch() throws Throwable {
    LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
      .build();
    assertEquals(loadBalancerListenerIdentityModel.id(), "r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091");

    LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModel = new LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .listener(loadBalancerListenerIdentityModel)
      .uri("/example?doc=get")
      .build();
    assertEquals(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModel.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModel.listener(), loadBalancerListenerIdentityModel);
    assertEquals(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModel.uri(), "/example?doc=get");

    String json = TestUtilities.serialize(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModel);

    LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch.class);
    assertTrue(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModelNew instanceof LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch);
    assertEquals(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModelNew.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModelNew.listener().toString(), loadBalancerListenerIdentityModel.toString());
    assertEquals(loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatchModelNew.uri(), "/example?doc=get");
  }
}