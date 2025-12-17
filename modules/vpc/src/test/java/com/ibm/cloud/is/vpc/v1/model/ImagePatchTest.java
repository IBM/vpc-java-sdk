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

import com.ibm.cloud.is.vpc.v1.model.ImageAllowedUsePatch;
import com.ibm.cloud.is.vpc.v1.model.ImagePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImagePatch model.
 */
public class ImagePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImagePatch() throws Throwable {
    ImageAllowedUsePatch imageAllowedUsePatchModel = new ImageAllowedUsePatch.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();
    assertEquals(imageAllowedUsePatchModel.apiVersion(), "2024-06-23");
    assertEquals(imageAllowedUsePatchModel.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(imageAllowedUsePatchModel.instance(), "gpu.count > 0 && enable_secure_boot == true");

    ImagePatch imagePatchModel = new ImagePatch.Builder()
      .allowedUse(imageAllowedUsePatchModel)
      .deprecationAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .name("my-image")
      .obsolescenceAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(imagePatchModel.allowedUse(), imageAllowedUsePatchModel);
    assertEquals(imagePatchModel.deprecationAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePatchModel.name(), "my-image");
    assertEquals(imagePatchModel.obsolescenceAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(imagePatchModel);

    ImagePatch imagePatchModelNew = TestUtilities.deserialize(json, ImagePatch.class);
    assertTrue(imagePatchModelNew instanceof ImagePatch);
    assertEquals(imagePatchModelNew.allowedUse().toString(), imageAllowedUsePatchModel.toString());
    assertEquals(imagePatchModelNew.deprecationAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePatchModelNew.name(), "my-image");
    assertEquals(imagePatchModelNew.obsolescenceAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
  @Test
  public void testImagePatchAsPatch() throws Throwable {
    ImageAllowedUsePatch imageAllowedUsePatchModel = new ImageAllowedUsePatch.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();

    ImagePatch imagePatchModel = new ImagePatch.Builder()
      .allowedUse(imageAllowedUsePatchModel)
      .deprecationAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .name("my-image")
      .obsolescenceAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    Map<String, Object> mergePatch = imagePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("allowed_use"));
    assertTrue(mergePatch.containsKey("deprecation_at"));
    assertEquals(mergePatch.get("name"), "my-image");
    assertTrue(mergePatch.containsKey("obsolescence_at"));
  }

}