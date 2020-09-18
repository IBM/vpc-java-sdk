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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLoadBalancerPoolMemberOptions model.
 */
public class UpdateLoadBalancerPoolMemberOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLoadBalancerPoolMemberOptions() throws Throwable {
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptionsModel = new UpdateLoadBalancerPoolMemberOptions.Builder()
      .loadBalancerId("testString")
      .poolId("testString")
      .id("testString")
      .port(Long.valueOf("80"))
      .weight(Long.valueOf("50"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .build();
    assertEquals(updateLoadBalancerPoolMemberOptionsModel.loadBalancerId(), "testString");
    assertEquals(updateLoadBalancerPoolMemberOptionsModel.poolId(), "testString");
    assertEquals(updateLoadBalancerPoolMemberOptionsModel.id(), "testString");
    assertEquals(updateLoadBalancerPoolMemberOptionsModel.port(), Long.valueOf("80"));
    assertEquals(updateLoadBalancerPoolMemberOptionsModel.weight(), Long.valueOf("50"));
    assertEquals(updateLoadBalancerPoolMemberOptionsModel.target(), loadBalancerPoolMemberTargetPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerPoolMemberOptionsError() throws Throwable {
    new UpdateLoadBalancerPoolMemberOptions.Builder().build();
  }

}