/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerPatch;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModulePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerPatch model.
 */
public class BareMetalServerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerPatch() throws Throwable {
    BareMetalServerTrustedPlatformModulePatch bareMetalServerTrustedPlatformModulePatchModel = new BareMetalServerTrustedPlatformModulePatch.Builder()
      .mode("disabled")
      .build();
    assertEquals(bareMetalServerTrustedPlatformModulePatchModel.mode(), "disabled");

    BareMetalServerPatch bareMetalServerPatchModel = new BareMetalServerPatch.Builder()
      .bandwidth(Long.valueOf("20000"))
      .enableSecureBoot(false)
      .name("my-bare-metal-server")
      .trustedPlatformModule(bareMetalServerTrustedPlatformModulePatchModel)
      .build();
    assertEquals(bareMetalServerPatchModel.bandwidth(), Long.valueOf("20000"));
    assertEquals(bareMetalServerPatchModel.enableSecureBoot(), Boolean.valueOf(false));
    assertEquals(bareMetalServerPatchModel.name(), "my-bare-metal-server");
    assertEquals(bareMetalServerPatchModel.trustedPlatformModule(), bareMetalServerTrustedPlatformModulePatchModel);

    String json = TestUtilities.serialize(bareMetalServerPatchModel);

    BareMetalServerPatch bareMetalServerPatchModelNew = TestUtilities.deserialize(json, BareMetalServerPatch.class);
    assertTrue(bareMetalServerPatchModelNew instanceof BareMetalServerPatch);
    assertEquals(bareMetalServerPatchModelNew.bandwidth(), Long.valueOf("20000"));
    assertEquals(bareMetalServerPatchModelNew.enableSecureBoot(), Boolean.valueOf(false));
    assertEquals(bareMetalServerPatchModelNew.name(), "my-bare-metal-server");
    assertEquals(bareMetalServerPatchModelNew.trustedPlatformModule().toString(), bareMetalServerTrustedPlatformModulePatchModel.toString());
  }
  @Test
  public void testBareMetalServerPatchAsPatch() throws Throwable {
    BareMetalServerTrustedPlatformModulePatch bareMetalServerTrustedPlatformModulePatchModel = new BareMetalServerTrustedPlatformModulePatch.Builder()
      .mode("disabled")
      .build();

    BareMetalServerPatch bareMetalServerPatchModel = new BareMetalServerPatch.Builder()
      .bandwidth(Long.valueOf("20000"))
      .enableSecureBoot(false)
      .name("my-bare-metal-server")
      .trustedPlatformModule(bareMetalServerTrustedPlatformModulePatchModel)
      .build();

    Map<String, Object> mergePatch = bareMetalServerPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("bandwidth"));
    assertTrue(mergePatch.containsKey("enable_secure_boot"));
    assertEquals(mergePatch.get("name"), "my-bare-metal-server");
    assertTrue(mergePatch.containsKey("trusted_platform_module"));
  }

}