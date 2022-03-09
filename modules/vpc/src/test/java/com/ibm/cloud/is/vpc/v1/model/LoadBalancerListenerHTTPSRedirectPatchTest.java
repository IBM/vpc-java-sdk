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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirectPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerHTTPSRedirectPatch model.
 */
public class LoadBalancerListenerHTTPSRedirectPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerHTTPSRedirectPatch() throws Throwable {
    LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerIdentityModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerHTTPSRedirectPatch loadBalancerListenerHttpsRedirectPatchModel = new LoadBalancerListenerHTTPSRedirectPatch.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .listener(loadBalancerListenerIdentityModel)
      .uri("/example?doc=get")
      .build();
    assertEquals(loadBalancerListenerHttpsRedirectPatchModel.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerHttpsRedirectPatchModel.listener(), loadBalancerListenerIdentityModel);
    assertEquals(loadBalancerListenerHttpsRedirectPatchModel.uri(), "/example?doc=get");

    String json = TestUtilities.serialize(loadBalancerListenerHttpsRedirectPatchModel);

    LoadBalancerListenerHTTPSRedirectPatch loadBalancerListenerHttpsRedirectPatchModelNew = TestUtilities.deserialize(json, LoadBalancerListenerHTTPSRedirectPatch.class);
    assertTrue(loadBalancerListenerHttpsRedirectPatchModelNew instanceof LoadBalancerListenerHTTPSRedirectPatch);
    assertEquals(loadBalancerListenerHttpsRedirectPatchModelNew.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerHttpsRedirectPatchModelNew.listener().toString(), loadBalancerListenerIdentityModel.toString());
    assertEquals(loadBalancerListenerHttpsRedirectPatchModelNew.uri(), "/example?doc=get");
  }
}