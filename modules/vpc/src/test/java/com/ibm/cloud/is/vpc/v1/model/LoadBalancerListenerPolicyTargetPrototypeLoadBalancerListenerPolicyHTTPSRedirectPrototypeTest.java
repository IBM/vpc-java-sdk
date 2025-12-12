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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype model.
 */
public class LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype() throws Throwable {
    LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
      .build();
    assertEquals(loadBalancerListenerIdentityModel.id(), "r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091");

    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .listener(loadBalancerListenerIdentityModel)
      .uri("/example?doc=get")
      .build();
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModel.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModel.listener(), loadBalancerListenerIdentityModel);
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModel.uri(), "/example?doc=get");

    String json = TestUtilities.serialize(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModel);

    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype.class);
    assertTrue(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModelNew instanceof LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype);
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModelNew.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModelNew.listener().toString(), loadBalancerListenerIdentityModel.toString());
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHttpsRedirectPrototypeModelNew.uri(), "/example?doc=get");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototypeError() throws Throwable {
    new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype.Builder().build();
  }

}