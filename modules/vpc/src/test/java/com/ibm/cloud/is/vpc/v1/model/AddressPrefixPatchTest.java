/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.AddressPrefixPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AddressPrefixPatch model.
 */
public class AddressPrefixPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAddressPrefixPatch() throws Throwable {
    AddressPrefixPatch addressPrefixPatchModel = new AddressPrefixPatch.Builder()
      .isDefault(false)
      .name("my-vpc-address-prefix-zone-1")
      .build();
    assertEquals(addressPrefixPatchModel.isDefault(), Boolean.valueOf(false));
    assertEquals(addressPrefixPatchModel.name(), "my-vpc-address-prefix-zone-1");

    String json = TestUtilities.serialize(addressPrefixPatchModel);

    AddressPrefixPatch addressPrefixPatchModelNew = TestUtilities.deserialize(json, AddressPrefixPatch.class);
    assertTrue(addressPrefixPatchModelNew instanceof AddressPrefixPatch);
    assertEquals(addressPrefixPatchModelNew.isDefault(), Boolean.valueOf(false));
    assertEquals(addressPrefixPatchModelNew.name(), "my-vpc-address-prefix-zone-1");
  }
  @Test
  public void testAddressPrefixPatchAsPatch() throws Throwable {
    AddressPrefixPatch addressPrefixPatchModel = new AddressPrefixPatch.Builder()
      .isDefault(false)
      .name("my-vpc-address-prefix-zone-1")
      .build();

    Map<String, Object> mergePatch = addressPrefixPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("is_default"));
    assertEquals(mergePatch.get("name"), "my-vpc-address-prefix-zone-1");
  }

}