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

import com.ibm.cloud.is.vpc.v1.model.ShareIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ShareIdentityById model.
 */
public class ShareIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareIdentityById() throws Throwable {
    ShareIdentityById shareIdentityByIdModel = new ShareIdentityById.Builder()
      .id("0fe9e5d8-0a4d-4818-96ec-e99708644a58")
      .build();
    assertEquals(shareIdentityByIdModel.id(), "0fe9e5d8-0a4d-4818-96ec-e99708644a58");

    String json = TestUtilities.serialize(shareIdentityByIdModel);

    ShareIdentityById shareIdentityByIdModelNew = TestUtilities.deserialize(json, ShareIdentityById.class);
    assertTrue(shareIdentityByIdModelNew instanceof ShareIdentityById);
    assertEquals(shareIdentityByIdModelNew.id(), "0fe9e5d8-0a4d-4818-96ec-e99708644a58");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testShareIdentityByIdError() throws Throwable {
    new ShareIdentityById.Builder().build();
  }

}