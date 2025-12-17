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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerMetadataServicePrototype model.
 */
public class BareMetalServerMetadataServicePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerMetadataServicePrototype() throws Throwable {
    BareMetalServerMetadataServicePrototype bareMetalServerMetadataServicePrototypeModel = new BareMetalServerMetadataServicePrototype.Builder()
      .enabled(true)
      .protocol("https")
      .build();
    assertEquals(bareMetalServerMetadataServicePrototypeModel.enabled(), Boolean.valueOf(true));
    assertEquals(bareMetalServerMetadataServicePrototypeModel.protocol(), "https");

    String json = TestUtilities.serialize(bareMetalServerMetadataServicePrototypeModel);

    BareMetalServerMetadataServicePrototype bareMetalServerMetadataServicePrototypeModelNew = TestUtilities.deserialize(json, BareMetalServerMetadataServicePrototype.class);
    assertTrue(bareMetalServerMetadataServicePrototypeModelNew instanceof BareMetalServerMetadataServicePrototype);
    assertEquals(bareMetalServerMetadataServicePrototypeModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(bareMetalServerMetadataServicePrototypeModelNew.protocol(), "https");
  }
}