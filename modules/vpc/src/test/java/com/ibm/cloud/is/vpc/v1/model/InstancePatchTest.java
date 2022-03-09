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

import com.ibm.cloud.is.vpc.v1.model.InstancePatch;
import com.ibm.cloud.is.vpc.v1.model.InstancePatchProfileInstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePatch model.
 */
public class InstancePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePatch() throws Throwable {
    InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPatchModel = new InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(instancePlacementTargetPatchModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileModel = new InstancePatchProfileInstanceProfileIdentityByName.Builder()
      .name("bc1-4x16")
      .build();
    assertEquals(instancePatchProfileModel.name(), "bc1-4x16");

    InstancePatch instancePatchModel = new InstancePatch.Builder()
      .name("my-instance")
      .placementTarget(instancePlacementTargetPatchModel)
      .profile(instancePatchProfileModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .build();
    assertEquals(instancePatchModel.name(), "my-instance");
    assertEquals(instancePatchModel.placementTarget(), instancePlacementTargetPatchModel);
    assertEquals(instancePatchModel.profile(), instancePatchProfileModel);
    assertEquals(instancePatchModel.totalVolumeBandwidth(), Long.valueOf("500"));

    String json = TestUtilities.serialize(instancePatchModel);

    InstancePatch instancePatchModelNew = TestUtilities.deserialize(json, InstancePatch.class);
    assertTrue(instancePatchModelNew instanceof InstancePatch);
    assertEquals(instancePatchModelNew.name(), "my-instance");
    assertEquals(instancePatchModelNew.placementTarget().toString(), instancePlacementTargetPatchModel.toString());
    assertEquals(instancePatchModelNew.profile().toString(), instancePatchProfileModel.toString());
    assertEquals(instancePatchModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
  }
  @Test
  public void testInstancePatchAsPatch() throws Throwable {
    InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPatchModel = new InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();

    InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileModel = new InstancePatchProfileInstanceProfileIdentityByName.Builder()
      .name("bc1-4x16")
      .build();

    InstancePatch instancePatchModel = new InstancePatch.Builder()
      .name("my-instance")
      .placementTarget(instancePlacementTargetPatchModel)
      .profile(instancePatchProfileModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .build();

    Map<String, Object> mergePatch = instancePatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-instance");
    assertTrue(mergePatch.containsKey("placement_target"));
    assertTrue(mergePatch.containsKey("profile"));
    assertTrue(mergePatch.containsKey("total_volume_bandwidth"));
  }

}