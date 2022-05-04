/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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

import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotIdentityById model.
 */
public class SnapshotIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotIdentityById() throws Throwable {
    SnapshotIdentityById snapshotIdentityByIdModel = new SnapshotIdentityById.Builder()
      .id("r134-f6bfa329-0e36-433f-a3bb-0df632e79263")
      .build();
    assertEquals(snapshotIdentityByIdModel.id(), "r134-f6bfa329-0e36-433f-a3bb-0df632e79263");

    String json = TestUtilities.serialize(snapshotIdentityByIdModel);

    SnapshotIdentityById snapshotIdentityByIdModelNew = TestUtilities.deserialize(json, SnapshotIdentityById.class);
    assertTrue(snapshotIdentityByIdModelNew instanceof SnapshotIdentityById);
    assertEquals(snapshotIdentityByIdModelNew.id(), "r134-f6bfa329-0e36-433f-a3bb-0df632e79263");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSnapshotIdentityByIdError() throws Throwable {
    new SnapshotIdentityById.Builder().build();
  }

}