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

import com.ibm.cloud.is.vpc.v1.model.SnapshotPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotPatch model.
 */
public class SnapshotPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotPatch() throws Throwable {
    SnapshotPatch snapshotPatchModel = new SnapshotPatch.Builder()
      .name("my-snapshot")
      .userTags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(snapshotPatchModel.name(), "my-snapshot");
    assertEquals(snapshotPatchModel.userTags(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(snapshotPatchModel);

    SnapshotPatch snapshotPatchModelNew = TestUtilities.deserialize(json, SnapshotPatch.class);
    assertTrue(snapshotPatchModelNew instanceof SnapshotPatch);
    assertEquals(snapshotPatchModelNew.name(), "my-snapshot");
  }
  @Test
  public void testSnapshotPatchAsPatch() throws Throwable {
    SnapshotPatch snapshotPatchModel = new SnapshotPatch.Builder()
      .name("my-snapshot")
      .userTags(java.util.Arrays.asList("testString"))
      .build();

    Map<String, Object> mergePatch = snapshotPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-snapshot");
    assertTrue(mergePatch.containsKey("user_tags"));
  }

}