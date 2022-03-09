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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype model.
 */
public class LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype() throws Throwable {
    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .url("https://www.redirect.com")
      .build();
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModel.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModel.url(), "https://www.redirect.com");

    String json = TestUtilities.serialize(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModel);

    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype.class);
    assertTrue(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModelNew instanceof LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype);
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModelNew.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototypeModelNew.url(), "https://www.redirect.com");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototypeError() throws Throwable {
    new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype.Builder().build();
  }

}