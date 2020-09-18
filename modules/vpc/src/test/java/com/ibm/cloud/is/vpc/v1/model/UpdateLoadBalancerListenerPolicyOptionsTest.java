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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLoadBalancerListenerPolicyOptions model.
 */
public class UpdateLoadBalancerListenerPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLoadBalancerListenerPolicyOptions() throws Throwable {
    LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyPatchTargetModel = new LoadBalancerListenerPolicyPatchTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerPolicyPatchTargetModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptionsModel = new UpdateLoadBalancerListenerPolicyOptions.Builder()
      .loadBalancerId("testString")
      .listenerId("testString")
      .id("testString")
      .name("my-policy")
      .priority(Long.valueOf("5"))
      .target(loadBalancerListenerPolicyPatchTargetModel)
      .build();
    assertEquals(updateLoadBalancerListenerPolicyOptionsModel.loadBalancerId(), "testString");
    assertEquals(updateLoadBalancerListenerPolicyOptionsModel.listenerId(), "testString");
    assertEquals(updateLoadBalancerListenerPolicyOptionsModel.id(), "testString");
    assertEquals(updateLoadBalancerListenerPolicyOptionsModel.name(), "my-policy");
    assertEquals(updateLoadBalancerListenerPolicyOptionsModel.priority(), Long.valueOf("5"));
    assertEquals(updateLoadBalancerListenerPolicyOptionsModel.target(), loadBalancerListenerPolicyPatchTargetModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerListenerPolicyOptionsError() throws Throwable {
    new UpdateLoadBalancerListenerPolicyOptions.Builder().build();
  }

}