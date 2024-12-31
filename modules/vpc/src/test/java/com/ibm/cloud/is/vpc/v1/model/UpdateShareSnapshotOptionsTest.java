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

import com.ibm.cloud.is.vpc.v1.model.UpdateShareSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateShareSnapshotOptions model.
 */
public class UpdateShareSnapshotOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateShareSnapshotOptions() throws Throwable {
    UpdateShareSnapshotOptions updateShareSnapshotOptionsModel = new UpdateShareSnapshotOptions.Builder()
      .shareId("testString")
      .id("testString")
      .shareSnapshotPatch(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .build();
    assertEquals(updateShareSnapshotOptionsModel.shareId(), "testString");
    assertEquals(updateShareSnapshotOptionsModel.id(), "testString");
    assertEquals(updateShareSnapshotOptionsModel.shareSnapshotPatch(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updateShareSnapshotOptionsModel.ifMatch(), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateShareSnapshotOptionsError() throws Throwable {
    new UpdateShareSnapshotOptions.Builder().build();
  }

}