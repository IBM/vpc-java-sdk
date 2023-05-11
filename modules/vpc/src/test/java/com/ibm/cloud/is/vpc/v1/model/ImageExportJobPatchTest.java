/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.is.vpc.v1.model.ImageExportJobPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImageExportJobPatch model.
 */
public class ImageExportJobPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImageExportJobPatch() throws Throwable {
    ImageExportJobPatch imageExportJobPatchModel = new ImageExportJobPatch.Builder()
      .name("my-image-export")
      .build();
    assertEquals(imageExportJobPatchModel.name(), "my-image-export");

    String json = TestUtilities.serialize(imageExportJobPatchModel);

    ImageExportJobPatch imageExportJobPatchModelNew = TestUtilities.deserialize(json, ImageExportJobPatch.class);
    assertTrue(imageExportJobPatchModelNew instanceof ImageExportJobPatch);
    assertEquals(imageExportJobPatchModelNew.name(), "my-image-export");
  }
  @Test
  public void testImageExportJobPatchAsPatch() throws Throwable {
    ImageExportJobPatch imageExportJobPatchModel = new ImageExportJobPatch.Builder()
      .name("my-image-export")
      .build();

    Map<String, Object> mergePatch = imageExportJobPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-image-export");
  }

}