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

import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetLoadBalancerPoolMemberOptions model.
 */
public class GetLoadBalancerPoolMemberOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetLoadBalancerPoolMemberOptions() throws Throwable {
    GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptionsModel = new GetLoadBalancerPoolMemberOptions.Builder()
      .loadBalancerId("testString")
      .poolId("testString")
      .id("testString")
      .build();
    assertEquals(getLoadBalancerPoolMemberOptionsModel.loadBalancerId(), "testString");
    assertEquals(getLoadBalancerPoolMemberOptionsModel.poolId(), "testString");
    assertEquals(getLoadBalancerPoolMemberOptionsModel.id(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetLoadBalancerPoolMemberOptionsError() throws Throwable {
    new GetLoadBalancerPoolMemberOptions.Builder().build();
  }

}