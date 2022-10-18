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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerPatch model.
 */
public class InstanceGroupManagerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerPatch() throws Throwable {
    InstanceGroupManagerPatch instanceGroupManagerPatchModel = new InstanceGroupManagerPatch.Builder()
      .aggregationWindow(Long.valueOf("120"))
      .cooldown(Long.valueOf("210"))
      .managementEnabled(true)
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .name("my-instance-group-manager")
      .build();
    assertEquals(instanceGroupManagerPatchModel.aggregationWindow(), Long.valueOf("120"));
    assertEquals(instanceGroupManagerPatchModel.cooldown(), Long.valueOf("210"));
    assertEquals(instanceGroupManagerPatchModel.managementEnabled(), Boolean.valueOf(true));
    assertEquals(instanceGroupManagerPatchModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPatchModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPatchModel.name(), "my-instance-group-manager");

    String json = TestUtilities.serialize(instanceGroupManagerPatchModel);

    InstanceGroupManagerPatch instanceGroupManagerPatchModelNew = TestUtilities.deserialize(json, InstanceGroupManagerPatch.class);
    assertTrue(instanceGroupManagerPatchModelNew instanceof InstanceGroupManagerPatch);
    assertEquals(instanceGroupManagerPatchModelNew.aggregationWindow(), Long.valueOf("120"));
    assertEquals(instanceGroupManagerPatchModelNew.cooldown(), Long.valueOf("210"));
    assertEquals(instanceGroupManagerPatchModelNew.managementEnabled(), Boolean.valueOf(true));
    assertEquals(instanceGroupManagerPatchModelNew.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPatchModelNew.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPatchModelNew.name(), "my-instance-group-manager");
  }
  @Test
  public void testInstanceGroupManagerPatchAsPatch() throws Throwable {
    InstanceGroupManagerPatch instanceGroupManagerPatchModel = new InstanceGroupManagerPatch.Builder()
      .aggregationWindow(Long.valueOf("120"))
      .cooldown(Long.valueOf("210"))
      .managementEnabled(true)
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .name("my-instance-group-manager")
      .build();

    Map<String, Object> mergePatch = instanceGroupManagerPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("aggregation_window"));
    assertTrue(mergePatch.containsKey("cooldown"));
    assertTrue(mergePatch.containsKey("management_enabled"));
    assertTrue(mergePatch.containsKey("max_membership_count"));
    assertTrue(mergePatch.containsKey("min_membership_count"));
    assertEquals(mergePatch.get("name"), "my-instance-group-manager");
  }

}