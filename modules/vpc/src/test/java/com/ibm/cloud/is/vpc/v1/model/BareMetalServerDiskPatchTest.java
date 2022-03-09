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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDiskPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerDiskPatch model.
 */
public class BareMetalServerDiskPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerDiskPatch() throws Throwable {
    BareMetalServerDiskPatch bareMetalServerDiskPatchModel = new BareMetalServerDiskPatch.Builder()
      .name("my-bare-metal-server-disk-updated")
      .build();
    assertEquals(bareMetalServerDiskPatchModel.name(), "my-bare-metal-server-disk-updated");

    String json = TestUtilities.serialize(bareMetalServerDiskPatchModel);

    BareMetalServerDiskPatch bareMetalServerDiskPatchModelNew = TestUtilities.deserialize(json, BareMetalServerDiskPatch.class);
    assertTrue(bareMetalServerDiskPatchModelNew instanceof BareMetalServerDiskPatch);
    assertEquals(bareMetalServerDiskPatchModelNew.name(), "my-bare-metal-server-disk-updated");
  }
  @Test
  public void testBareMetalServerDiskPatchAsPatch() throws Throwable {
    BareMetalServerDiskPatch bareMetalServerDiskPatchModel = new BareMetalServerDiskPatch.Builder()
      .name("my-bare-metal-server-disk-updated")
      .build();

    Map<String, Object> mergePatch = bareMetalServerDiskPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-bare-metal-server-disk-updated");
  }

}