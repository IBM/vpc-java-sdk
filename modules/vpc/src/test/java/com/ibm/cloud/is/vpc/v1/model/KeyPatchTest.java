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

import com.ibm.cloud.is.vpc.v1.model.KeyPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KeyPatch model.
 */
public class KeyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKeyPatch() throws Throwable {
    KeyPatch keyPatchModel = new KeyPatch.Builder()
      .name("my-key-1")
      .build();
    assertEquals(keyPatchModel.name(), "my-key-1");

    String json = TestUtilities.serialize(keyPatchModel);

    KeyPatch keyPatchModelNew = TestUtilities.deserialize(json, KeyPatch.class);
    assertTrue(keyPatchModelNew instanceof KeyPatch);
    assertEquals(keyPatchModelNew.name(), "my-key-1");
  }
  @Test
  public void testKeyPatchAsPatch() throws Throwable {
    KeyPatch keyPatchModel = new KeyPatch.Builder()
      .name("my-key-1")
      .build();

    Map<String, Object> mergePatch = keyPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-key-1");
  }

}