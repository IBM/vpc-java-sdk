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

import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref model.
 */
public class ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref() throws Throwable {
    ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefModel = new ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/shares/r006-0fe9e5d8-0a4d-4818-96ec-e99708644a58/snapshots/r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4")
      .build();
    assertEquals(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/shares/r006-0fe9e5d8-0a4d-4818-96ec-e99708644a58/snapshots/r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4");

    String json = TestUtilities.serialize(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefModel);

    ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefModelNew = TestUtilities.deserialize(json, ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref.class);
    assertTrue(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefModelNew instanceof ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref);
    assertEquals(shareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/shares/r006-0fe9e5d8-0a4d-4818-96ec-e99708644a58/snapshots/r006-e13ee54f-baa4-40d3-b35c-b9ec163972b4");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHrefError() throws Throwable {
    new ShareSourceSnapshotPrototypeShareSnapshotIdentityShareSnapshotIdentityByHref.Builder().build();
  }

}