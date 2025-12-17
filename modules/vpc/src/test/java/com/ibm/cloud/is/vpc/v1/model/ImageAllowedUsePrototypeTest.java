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

import com.ibm.cloud.is.vpc.v1.model.ImageAllowedUsePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImageAllowedUsePrototype model.
 */
public class ImageAllowedUsePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImageAllowedUsePrototype() throws Throwable {
    ImageAllowedUsePrototype imageAllowedUsePrototypeModel = new ImageAllowedUsePrototype.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();
    assertEquals(imageAllowedUsePrototypeModel.apiVersion(), "2024-06-23");
    assertEquals(imageAllowedUsePrototypeModel.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(imageAllowedUsePrototypeModel.instance(), "gpu.count > 0 && enable_secure_boot == true");

    String json = TestUtilities.serialize(imageAllowedUsePrototypeModel);

    ImageAllowedUsePrototype imageAllowedUsePrototypeModelNew = TestUtilities.deserialize(json, ImageAllowedUsePrototype.class);
    assertTrue(imageAllowedUsePrototypeModelNew instanceof ImageAllowedUsePrototype);
    assertEquals(imageAllowedUsePrototypeModelNew.apiVersion(), "2024-06-23");
    assertEquals(imageAllowedUsePrototypeModelNew.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(imageAllowedUsePrototypeModelNew.instance(), "gpu.count > 0 && enable_secure_boot == true");
  }
}