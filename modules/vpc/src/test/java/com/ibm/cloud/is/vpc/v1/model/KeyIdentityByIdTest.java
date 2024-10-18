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

import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KeyIdentityById model.
 */
public class KeyIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKeyIdentityById() throws Throwable {
    KeyIdentityById keyIdentityByIdModel = new KeyIdentityById.Builder()
      .id("82679077-ac3b-4c10-be16-63e9c21f0f45")
      .build();
    assertEquals(keyIdentityByIdModel.id(), "82679077-ac3b-4c10-be16-63e9c21f0f45");

    String json = TestUtilities.serialize(keyIdentityByIdModel);

    KeyIdentityById keyIdentityByIdModelNew = TestUtilities.deserialize(json, KeyIdentityById.class);
    assertTrue(keyIdentityByIdModelNew instanceof KeyIdentityById);
    assertEquals(keyIdentityByIdModelNew.id(), "82679077-ac3b-4c10-be16-63e9c21f0f45");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testKeyIdentityByIdError() throws Throwable {
    new KeyIdentityById.Builder().build();
  }

}