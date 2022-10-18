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

import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref model.
 */
public class InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref() throws Throwable {
    InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefModel = new InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/placement_groups/r018-418fe842-a3e9-47b9-a938-1aa5bd632871")
      .build();
    assertEquals(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/placement_groups/r018-418fe842-a3e9-47b9-a938-1aa5bd632871");

    String json = TestUtilities.serialize(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefModel);

    InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefModelNew = TestUtilities.deserialize(json, InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref.class);
    assertTrue(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefModelNew instanceof InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref);
    assertEquals(instancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/placement_groups/r018-418fe842-a3e9-47b9-a938-1aa5bd632871");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHrefError() throws Throwable {
    new InstancePlacementTargetPrototypePlacementGroupIdentityPlacementGroupIdentityByHref.Builder().build();
  }

}