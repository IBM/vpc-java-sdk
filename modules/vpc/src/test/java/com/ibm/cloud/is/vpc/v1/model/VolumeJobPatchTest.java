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

import com.ibm.cloud.is.vpc.v1.model.VolumeJobPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeJobPatch model.
 */
public class VolumeJobPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeJobPatch() throws Throwable {
    VolumeJobPatch volumeJobPatchModel = new VolumeJobPatch.Builder()
      .name("my-volume-job")
      .build();
    assertEquals(volumeJobPatchModel.name(), "my-volume-job");

    String json = TestUtilities.serialize(volumeJobPatchModel);

    VolumeJobPatch volumeJobPatchModelNew = TestUtilities.deserialize(json, VolumeJobPatch.class);
    assertTrue(volumeJobPatchModelNew instanceof VolumeJobPatch);
    assertEquals(volumeJobPatchModelNew.name(), "my-volume-job");
  }
  @Test
  public void testVolumeJobPatchAsPatch() throws Throwable {
    VolumeJobPatch volumeJobPatchModel = new VolumeJobPatch.Builder()
      .name("my-volume-job")
      .build();

    Map<String, Object> mergePatch = volumeJobPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-volume-job");
  }

}