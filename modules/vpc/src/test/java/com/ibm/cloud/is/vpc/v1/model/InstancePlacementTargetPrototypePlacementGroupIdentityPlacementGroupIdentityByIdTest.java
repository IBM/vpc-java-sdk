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

import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById model.
 */
public class InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById() throws Throwable {
    InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdModel = new InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById.Builder()
      .id("r018-418fe842-a3e9-47b9-a938-1aa5bd632871")
      .build();
    assertEquals(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdModel.id(), "r018-418fe842-a3e9-47b9-a938-1aa5bd632871");

    String json = TestUtilities.serialize(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdModel);

    InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdModelNew = TestUtilities.deserialize(json, InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById.class);
    assertTrue(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdModelNew instanceof InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById);
    assertEquals(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdModelNew.id(), "r018-418fe842-a3e9-47b9-a938-1aa5bd632871");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByIdError() throws Throwable {
    new InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityById.Builder().build();
  }

}