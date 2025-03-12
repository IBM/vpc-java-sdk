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

import com.ibm.cloud.is.vpc.v1.model.InstanceNetworkAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceNetworkAttachmentPatch model.
 */
public class InstanceNetworkAttachmentPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceNetworkAttachmentPatch() throws Throwable {
    InstanceNetworkAttachmentPatch instanceNetworkAttachmentPatchModel = new InstanceNetworkAttachmentPatch.Builder()
      .name("my-instance-network-attachment-updated")
      .build();
    assertEquals(instanceNetworkAttachmentPatchModel.name(), "my-instance-network-attachment-updated");

    String json = TestUtilities.serialize(instanceNetworkAttachmentPatchModel);

    InstanceNetworkAttachmentPatch instanceNetworkAttachmentPatchModelNew = TestUtilities.deserialize(json, InstanceNetworkAttachmentPatch.class);
    assertTrue(instanceNetworkAttachmentPatchModelNew instanceof InstanceNetworkAttachmentPatch);
    assertEquals(instanceNetworkAttachmentPatchModelNew.name(), "my-instance-network-attachment-updated");
  }
  @Test
  public void testInstanceNetworkAttachmentPatchAsPatch() throws Throwable {
    InstanceNetworkAttachmentPatch instanceNetworkAttachmentPatchModel = new InstanceNetworkAttachmentPatch.Builder()
      .name("my-instance-network-attachment-updated")
      .build();

    Map<String, Object> mergePatch = instanceNetworkAttachmentPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-instance-network-attachment-updated");
  }

}