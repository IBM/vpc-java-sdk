/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById model.
 */
public class LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById() throws Throwable {
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdModel.id(), "0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0");

    String json = TestUtilities.serialize(loadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdModel);

    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdModelNew = TestUtilities.deserialize(json, LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.class);
    assertTrue(loadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdModelNew instanceof LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById);
    assertEquals(loadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdModelNew.id(), "0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityByIdError() throws Throwable {
    new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder().build();
  }

}