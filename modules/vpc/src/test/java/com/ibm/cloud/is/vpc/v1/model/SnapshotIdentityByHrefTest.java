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

import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotIdentityByHref model.
 */
public class SnapshotIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotIdentityByHref() throws Throwable {
    SnapshotIdentityByHref snapshotIdentityByHrefModel = new SnapshotIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/snapshots/r006-f6bfa329-0e36-433f-a3bb-0df632e79263")
      .build();
    assertEquals(snapshotIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/snapshots/r006-f6bfa329-0e36-433f-a3bb-0df632e79263");

    String json = TestUtilities.serialize(snapshotIdentityByHrefModel);

    SnapshotIdentityByHref snapshotIdentityByHrefModelNew = TestUtilities.deserialize(json, SnapshotIdentityByHref.class);
    assertTrue(snapshotIdentityByHrefModelNew instanceof SnapshotIdentityByHref);
    assertEquals(snapshotIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/snapshots/r006-f6bfa329-0e36-433f-a3bb-0df632e79263");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSnapshotIdentityByHrefError() throws Throwable {
    new SnapshotIdentityByHref.Builder().build();
  }

}