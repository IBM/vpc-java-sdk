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

import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref model.
 */
public class InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref() throws Throwable {
    InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefModel = new InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/groups/0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0")
      .build();
    assertEquals(instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/groups/0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0");

    String json = TestUtilities.serialize(instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefModel);

    InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefModelNew = TestUtilities.deserialize(json, InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref.class);
    assertTrue(instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefModelNew instanceof InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref);
    assertEquals(instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/groups/0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHrefError() throws Throwable {
    new InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByHref.Builder().build();
  }

}