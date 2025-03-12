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

import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolutionBindingPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPCDNSResolutionBindingPatch model.
 */
public class VPCDNSResolutionBindingPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPCDNSResolutionBindingPatch() throws Throwable {
    VPCDNSResolutionBindingPatch vpcdnsResolutionBindingPatchModel = new VPCDNSResolutionBindingPatch.Builder()
      .name("my-dns-resolution-binding-updated")
      .build();
    assertEquals(vpcdnsResolutionBindingPatchModel.name(), "my-dns-resolution-binding-updated");

    String json = TestUtilities.serialize(vpcdnsResolutionBindingPatchModel);

    VPCDNSResolutionBindingPatch vpcdnsResolutionBindingPatchModelNew = TestUtilities.deserialize(json, VPCDNSResolutionBindingPatch.class);
    assertTrue(vpcdnsResolutionBindingPatchModelNew instanceof VPCDNSResolutionBindingPatch);
    assertEquals(vpcdnsResolutionBindingPatchModelNew.name(), "my-dns-resolution-binding-updated");
  }
  @Test
  public void testVPCDNSResolutionBindingPatchAsPatch() throws Throwable {
    VPCDNSResolutionBindingPatch vpcdnsResolutionBindingPatchModel = new VPCDNSResolutionBindingPatch.Builder()
      .name("my-dns-resolution-binding-updated")
      .build();

    Map<String, Object> mergePatch = vpcdnsResolutionBindingPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-dns-resolution-binding-updated");
  }

}