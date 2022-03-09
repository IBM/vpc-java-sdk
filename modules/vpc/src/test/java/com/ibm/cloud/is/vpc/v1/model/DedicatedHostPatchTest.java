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

import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DedicatedHostPatch model.
 */
public class DedicatedHostPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDedicatedHostPatch() throws Throwable {
    DedicatedHostPatch dedicatedHostPatchModel = new DedicatedHostPatch.Builder()
      .instancePlacementEnabled(true)
      .name("my-host")
      .build();
    assertEquals(dedicatedHostPatchModel.instancePlacementEnabled(), Boolean.valueOf(true));
    assertEquals(dedicatedHostPatchModel.name(), "my-host");

    String json = TestUtilities.serialize(dedicatedHostPatchModel);

    DedicatedHostPatch dedicatedHostPatchModelNew = TestUtilities.deserialize(json, DedicatedHostPatch.class);
    assertTrue(dedicatedHostPatchModelNew instanceof DedicatedHostPatch);
    assertEquals(dedicatedHostPatchModelNew.instancePlacementEnabled(), Boolean.valueOf(true));
    assertEquals(dedicatedHostPatchModelNew.name(), "my-host");
  }
  @Test
  public void testDedicatedHostPatchAsPatch() throws Throwable {
    DedicatedHostPatch dedicatedHostPatchModel = new DedicatedHostPatch.Builder()
      .instancePlacementEnabled(true)
      .name("my-host")
      .build();

    Map<String, Object> mergePatch = dedicatedHostPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("instance_placement_enabled"));
    assertEquals(mergePatch.get("name"), "my-host");
  }

}