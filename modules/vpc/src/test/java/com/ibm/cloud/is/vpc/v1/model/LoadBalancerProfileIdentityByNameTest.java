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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerProfileIdentityByName model.
 */
public class LoadBalancerProfileIdentityByNameTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerProfileIdentityByName() throws Throwable {
    LoadBalancerProfileIdentityByName loadBalancerProfileIdentityByNameModel = new LoadBalancerProfileIdentityByName.Builder()
      .name("network-fixed")
      .build();
    assertEquals(loadBalancerProfileIdentityByNameModel.name(), "network-fixed");

    String json = TestUtilities.serialize(loadBalancerProfileIdentityByNameModel);

    LoadBalancerProfileIdentityByName loadBalancerProfileIdentityByNameModelNew = TestUtilities.deserialize(json, LoadBalancerProfileIdentityByName.class);
    assertTrue(loadBalancerProfileIdentityByNameModelNew instanceof LoadBalancerProfileIdentityByName);
    assertEquals(loadBalancerProfileIdentityByNameModelNew.name(), "network-fixed");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerProfileIdentityByNameError() throws Throwable {
    new LoadBalancerProfileIdentityByName.Builder().build();
  }

}