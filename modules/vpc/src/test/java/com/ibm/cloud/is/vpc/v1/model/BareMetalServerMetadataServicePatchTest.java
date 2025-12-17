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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerMetadataServicePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerMetadataServicePatch model.
 */
public class BareMetalServerMetadataServicePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerMetadataServicePatch() throws Throwable {
    BareMetalServerMetadataServicePatch bareMetalServerMetadataServicePatchModel = new BareMetalServerMetadataServicePatch.Builder()
      .enabled(true)
      .protocol("http")
      .build();
    assertEquals(bareMetalServerMetadataServicePatchModel.enabled(), Boolean.valueOf(true));
    assertEquals(bareMetalServerMetadataServicePatchModel.protocol(), "http");

    String json = TestUtilities.serialize(bareMetalServerMetadataServicePatchModel);

    BareMetalServerMetadataServicePatch bareMetalServerMetadataServicePatchModelNew = TestUtilities.deserialize(json, BareMetalServerMetadataServicePatch.class);
    assertTrue(bareMetalServerMetadataServicePatchModelNew instanceof BareMetalServerMetadataServicePatch);
    assertEquals(bareMetalServerMetadataServicePatchModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(bareMetalServerMetadataServicePatchModelNew.protocol(), "http");
  }
}