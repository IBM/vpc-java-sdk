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

import com.ibm.cloud.is.vpc.v1.model.SnapshotAllowedUsePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotAllowedUsePatch model.
 */
public class SnapshotAllowedUsePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotAllowedUsePatch() throws Throwable {
    SnapshotAllowedUsePatch snapshotAllowedUsePatchModel = new SnapshotAllowedUsePatch.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();
    assertEquals(snapshotAllowedUsePatchModel.apiVersion(), "2024-06-23");
    assertEquals(snapshotAllowedUsePatchModel.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(snapshotAllowedUsePatchModel.instance(), "gpu.count > 0 && enable_secure_boot == true");

    String json = TestUtilities.serialize(snapshotAllowedUsePatchModel);

    SnapshotAllowedUsePatch snapshotAllowedUsePatchModelNew = TestUtilities.deserialize(json, SnapshotAllowedUsePatch.class);
    assertTrue(snapshotAllowedUsePatchModelNew instanceof SnapshotAllowedUsePatch);
    assertEquals(snapshotAllowedUsePatchModelNew.apiVersion(), "2024-06-23");
    assertEquals(snapshotAllowedUsePatchModelNew.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(snapshotAllowedUsePatchModelNew.instance(), "gpu.count > 0 && enable_secure_boot == true");
  }
}