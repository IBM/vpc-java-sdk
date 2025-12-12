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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref model.
 */
public class LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref() throws Throwable {
    LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref loadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefModel = new LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/load_balancers/r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/load_balancers/r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727");

    String json = TestUtilities.serialize(loadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefModel);

    LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref loadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefModelNew = TestUtilities.deserialize(json, LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref.class);
    assertTrue(loadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefModelNew instanceof LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref);
    assertEquals(loadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/load_balancers/r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHrefError() throws Throwable {
    new LoadBalancerPoolMemberTargetPrototypeLoadBalancerIdentityLoadBalancerIdentityByHref.Builder().build();
  }

}