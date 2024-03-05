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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerNetworkAttachmentPatch model.
 */
public class BareMetalServerNetworkAttachmentPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerNetworkAttachmentPatch() throws Throwable {
    BareMetalServerNetworkAttachmentPatch bareMetalServerNetworkAttachmentPatchModel = new BareMetalServerNetworkAttachmentPatch.Builder()
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .name("my-bare-metal-server-network-attachment-updated")
      .build();
    assertEquals(bareMetalServerNetworkAttachmentPatchModel.allowedVlans(), java.util.Arrays.asList(Long.valueOf("4")));
    assertEquals(bareMetalServerNetworkAttachmentPatchModel.name(), "my-bare-metal-server-network-attachment-updated");

    String json = TestUtilities.serialize(bareMetalServerNetworkAttachmentPatchModel);

    BareMetalServerNetworkAttachmentPatch bareMetalServerNetworkAttachmentPatchModelNew = TestUtilities.deserialize(json, BareMetalServerNetworkAttachmentPatch.class);
    assertTrue(bareMetalServerNetworkAttachmentPatchModelNew instanceof BareMetalServerNetworkAttachmentPatch);
    assertEquals(bareMetalServerNetworkAttachmentPatchModelNew.name(), "my-bare-metal-server-network-attachment-updated");
  }
  @Test
  public void testBareMetalServerNetworkAttachmentPatchAsPatch() throws Throwable {
    BareMetalServerNetworkAttachmentPatch bareMetalServerNetworkAttachmentPatchModel = new BareMetalServerNetworkAttachmentPatch.Builder()
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .name("my-bare-metal-server-network-attachment-updated")
      .build();

    Map<String, Object> mergePatch = bareMetalServerNetworkAttachmentPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("allowed_vlans"));
    assertEquals(mergePatch.get("name"), "my-bare-metal-server-network-attachment-updated");
  }

}