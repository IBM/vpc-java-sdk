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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolIdentityByName model.
 */
public class LoadBalancerPoolIdentityByNameTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolIdentityByName() throws Throwable {
    LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
      .name("my-load-balancer-pool")
      .build();
    assertEquals(loadBalancerPoolIdentityByNameModel.name(), "my-load-balancer-pool");

    String json = TestUtilities.serialize(loadBalancerPoolIdentityByNameModel);

    LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModelNew = TestUtilities.deserialize(json, LoadBalancerPoolIdentityByName.class);
    assertTrue(loadBalancerPoolIdentityByNameModelNew instanceof LoadBalancerPoolIdentityByName);
    assertEquals(loadBalancerPoolIdentityByNameModelNew.name(), "my-load-balancer-pool");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolIdentityByNameError() throws Throwable {
    new LoadBalancerPoolIdentityByName.Builder().build();
  }

}