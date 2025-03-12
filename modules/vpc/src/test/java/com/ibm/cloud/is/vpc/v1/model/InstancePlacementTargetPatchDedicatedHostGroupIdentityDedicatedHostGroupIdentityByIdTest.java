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

import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById model.
 */
public class InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById() throws Throwable {
    InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById instancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdModel = new InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById.Builder()
      .id("0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0")
      .build();
    assertEquals(instancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdModel.id(), "0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0");

    String json = TestUtilities.serialize(instancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdModel);

    InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById instancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdModelNew = TestUtilities.deserialize(json, InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById.class);
    assertTrue(instancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdModelNew instanceof InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById);
    assertEquals(instancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdModelNew.id(), "0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityByIdError() throws Throwable {
    new InstancePlacementTargetPatchDedicatedHostGroupIdentityDedicatedHostGroupIdentityById.Builder().build();
  }

}