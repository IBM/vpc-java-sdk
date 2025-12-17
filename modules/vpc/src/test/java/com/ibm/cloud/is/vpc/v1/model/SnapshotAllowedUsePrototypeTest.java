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

import com.ibm.cloud.is.vpc.v1.model.SnapshotAllowedUsePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotAllowedUsePrototype model.
 */
public class SnapshotAllowedUsePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotAllowedUsePrototype() throws Throwable {
    SnapshotAllowedUsePrototype snapshotAllowedUsePrototypeModel = new SnapshotAllowedUsePrototype.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();
    assertEquals(snapshotAllowedUsePrototypeModel.apiVersion(), "2024-06-23");
    assertEquals(snapshotAllowedUsePrototypeModel.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(snapshotAllowedUsePrototypeModel.instance(), "gpu.count > 0 && enable_secure_boot == true");

    String json = TestUtilities.serialize(snapshotAllowedUsePrototypeModel);

    SnapshotAllowedUsePrototype snapshotAllowedUsePrototypeModelNew = TestUtilities.deserialize(json, SnapshotAllowedUsePrototype.class);
    assertTrue(snapshotAllowedUsePrototypeModelNew instanceof SnapshotAllowedUsePrototype);
    assertEquals(snapshotAllowedUsePrototypeModelNew.apiVersion(), "2024-06-23");
    assertEquals(snapshotAllowedUsePrototypeModelNew.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(snapshotAllowedUsePrototypeModelNew.instance(), "gpu.count > 0 && enable_secure_boot == true");
  }
}