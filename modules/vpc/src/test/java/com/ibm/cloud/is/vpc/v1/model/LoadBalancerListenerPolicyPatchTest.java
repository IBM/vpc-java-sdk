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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyPatch model.
 */
public class LoadBalancerListenerPolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyPatch() throws Throwable {
    LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPatchModel = new LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerPolicyTargetPatchModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModel = new LoadBalancerListenerPolicyPatch.Builder()
      .name("my-policy")
      .priority(Long.valueOf("5"))
      .target(loadBalancerListenerPolicyTargetPatchModel)
      .build();
    assertEquals(loadBalancerListenerPolicyPatchModel.name(), "my-policy");
    assertEquals(loadBalancerListenerPolicyPatchModel.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPatchModel.target(), loadBalancerListenerPolicyTargetPatchModel);

    String json = TestUtilities.serialize(loadBalancerListenerPolicyPatchModel);

    LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyPatch.class);
    assertTrue(loadBalancerListenerPolicyPatchModelNew instanceof LoadBalancerListenerPolicyPatch);
    assertEquals(loadBalancerListenerPolicyPatchModelNew.name(), "my-policy");
    assertEquals(loadBalancerListenerPolicyPatchModelNew.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPatchModelNew.target().toString(), loadBalancerListenerPolicyTargetPatchModel.toString());
  }
  @Test
  public void testLoadBalancerListenerPolicyPatchAsPatch() throws Throwable {
    LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyTargetPatchModel = new LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

    LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModel = new LoadBalancerListenerPolicyPatch.Builder()
      .name("my-policy")
      .priority(Long.valueOf("5"))
      .target(loadBalancerListenerPolicyTargetPatchModel)
      .build();

    Map<String, Object> mergePatch = loadBalancerListenerPolicyPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-policy");
    assertTrue(mergePatch.containsKey("priority"));
    assertTrue(mergePatch.containsKey("target"));
  }

}