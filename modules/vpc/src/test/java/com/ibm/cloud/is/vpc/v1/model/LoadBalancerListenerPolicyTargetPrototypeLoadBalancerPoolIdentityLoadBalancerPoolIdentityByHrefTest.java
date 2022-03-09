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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref model.
 */
public class LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref() throws Throwable {
    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref loadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefModel = new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004");

    String json = TestUtilities.serialize(loadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefModel);

    LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref loadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref.class);
    assertTrue(loadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefModelNew instanceof LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref);
    assertEquals(loadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/load_balancers/dd754295-e9e0-4c9d-bf6c-58fbc59e5727/pools/70294e14-4e61-11e8-bcf4-0242ac110004");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHrefError() throws Throwable {
    new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentityLoadBalancerPoolIdentityByHref.Builder().build();
  }

}