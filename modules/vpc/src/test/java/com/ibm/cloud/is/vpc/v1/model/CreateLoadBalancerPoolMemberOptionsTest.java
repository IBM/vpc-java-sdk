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

import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLoadBalancerPoolMemberOptions model.
 */
public class CreateLoadBalancerPoolMemberOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLoadBalancerPoolMemberOptions() throws Throwable {
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    CreateLoadBalancerPoolMemberOptions createLoadBalancerPoolMemberOptionsModel = new CreateLoadBalancerPoolMemberOptions.Builder()
      .loadBalancerId("testString")
      .poolId("testString")
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
      .build();
    assertEquals(createLoadBalancerPoolMemberOptionsModel.loadBalancerId(), "testString");
    assertEquals(createLoadBalancerPoolMemberOptionsModel.poolId(), "testString");
    assertEquals(createLoadBalancerPoolMemberOptionsModel.port(), Long.valueOf("80"));
    assertEquals(createLoadBalancerPoolMemberOptionsModel.target(), loadBalancerPoolMemberTargetPrototypeModel);
    assertEquals(createLoadBalancerPoolMemberOptionsModel.weight(), Long.valueOf("50"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerPoolMemberOptionsError() throws Throwable {
    new CreateLoadBalancerPoolMemberOptions.Builder().build();
  }

}