/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ShareMountTargetPatch model.
 */
public class ShareMountTargetPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareMountTargetPatch() throws Throwable {
    ShareMountTargetPatch shareMountTargetPatchModel = new ShareMountTargetPatch.Builder()
      .name("my-share-mount-target")
      .build();
    assertEquals(shareMountTargetPatchModel.name(), "my-share-mount-target");

    String json = TestUtilities.serialize(shareMountTargetPatchModel);

    ShareMountTargetPatch shareMountTargetPatchModelNew = TestUtilities.deserialize(json, ShareMountTargetPatch.class);
    assertTrue(shareMountTargetPatchModelNew instanceof ShareMountTargetPatch);
    assertEquals(shareMountTargetPatchModelNew.name(), "my-share-mount-target");
  }
  @Test
  public void testShareMountTargetPatchAsPatch() throws Throwable {
    ShareMountTargetPatch shareMountTargetPatchModel = new ShareMountTargetPatch.Builder()
      .name("my-share-mount-target")
      .build();

    Map<String, Object> mergePatch = shareMountTargetPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-share-mount-target");
  }

}