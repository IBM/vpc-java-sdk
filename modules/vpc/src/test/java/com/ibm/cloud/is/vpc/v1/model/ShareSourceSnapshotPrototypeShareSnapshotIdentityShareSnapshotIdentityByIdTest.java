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

import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById model.
 */
public class ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById() throws Throwable {
    ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdModel = new ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById.Builder()
      .id("r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4")
      .build();
    assertEquals(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdModel.id(), "r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4");

    String json = TestUtilities.serialize(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdModel);

    ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdModelNew = TestUtilities.deserialize(json, ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById.class);
    assertTrue(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdModelNew instanceof ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById);
    assertEquals(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdModelNew.id(), "r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByIdError() throws Throwable {
    new ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityById.Builder().build();
  }

}