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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolMemberPatch model.
 */
public class LoadBalancerPoolMemberPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolMemberPatch() throws Throwable {
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModel = new LoadBalancerPoolMemberPatch.Builder()
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
      .build();
    assertEquals(loadBalancerPoolMemberPatchModel.port(), Long.valueOf("80"));
    assertEquals(loadBalancerPoolMemberPatchModel.target(), loadBalancerPoolMemberTargetPrototypeModel);
    assertEquals(loadBalancerPoolMemberPatchModel.weight(), Long.valueOf("50"));

    String json = TestUtilities.serialize(loadBalancerPoolMemberPatchModel);

    LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModelNew = TestUtilities.deserialize(json, LoadBalancerPoolMemberPatch.class);
    assertTrue(loadBalancerPoolMemberPatchModelNew instanceof LoadBalancerPoolMemberPatch);
    assertEquals(loadBalancerPoolMemberPatchModelNew.port(), Long.valueOf("80"));
    assertEquals(loadBalancerPoolMemberPatchModelNew.target().toString(), loadBalancerPoolMemberTargetPrototypeModel.toString());
    assertEquals(loadBalancerPoolMemberPatchModelNew.weight(), Long.valueOf("50"));
  }
  @Test
  public void testLoadBalancerPoolMemberPatchAsPatch() throws Throwable {
    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();

    LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModel = new LoadBalancerPoolMemberPatch.Builder()
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
      .build();

    Map<String, Object> mergePatch = loadBalancerPoolMemberPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("port"));
    assertTrue(mergePatch.containsKey("target"));
    assertTrue(mergePatch.containsKey("weight"));
  }

}