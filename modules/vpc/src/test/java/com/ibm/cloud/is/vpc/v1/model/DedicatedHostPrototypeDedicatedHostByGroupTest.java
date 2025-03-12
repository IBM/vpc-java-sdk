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

import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototypeDedicatedHostByGroup;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DedicatedHostPrototypeDedicatedHostByGroup model.
 */
public class DedicatedHostPrototypeDedicatedHostByGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDedicatedHostPrototypeDedicatedHostByGroup() throws Throwable {
    DedicatedHostProfileIdentityByName dedicatedHostProfileIdentityModel = new DedicatedHostProfileIdentityByName.Builder()
      .name("mx2-host-152x1216")
      .build();
    assertEquals(dedicatedHostProfileIdentityModel.name(), "mx2-host-152x1216");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    DedicatedHostGroupIdentityById dedicatedHostGroupIdentityModel = new DedicatedHostGroupIdentityById.Builder()
      .id("0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0")
      .build();
    assertEquals(dedicatedHostGroupIdentityModel.id(), "0717-bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0");

    DedicatedHostPrototypeDedicatedHostByGroup dedicatedHostPrototypeDedicatedHostByGroupModel = new DedicatedHostPrototypeDedicatedHostByGroup.Builder()
      .instancePlacementEnabled(true)
      .name("my-host")
      .profile(dedicatedHostProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .group(dedicatedHostGroupIdentityModel)
      .build();
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModel.instancePlacementEnabled(), Boolean.valueOf(true));
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModel.name(), "my-host");
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModel.profile(), dedicatedHostProfileIdentityModel);
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModel.group(), dedicatedHostGroupIdentityModel);

    String json = TestUtilities.serialize(dedicatedHostPrototypeDedicatedHostByGroupModel);

    DedicatedHostPrototypeDedicatedHostByGroup dedicatedHostPrototypeDedicatedHostByGroupModelNew = TestUtilities.deserialize(json, DedicatedHostPrototypeDedicatedHostByGroup.class);
    assertTrue(dedicatedHostPrototypeDedicatedHostByGroupModelNew instanceof DedicatedHostPrototypeDedicatedHostByGroup);
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModelNew.instancePlacementEnabled(), Boolean.valueOf(true));
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModelNew.name(), "my-host");
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModelNew.profile().toString(), dedicatedHostProfileIdentityModel.toString());
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(dedicatedHostPrototypeDedicatedHostByGroupModelNew.group().toString(), dedicatedHostGroupIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDedicatedHostPrototypeDedicatedHostByGroupError() throws Throwable {
    new DedicatedHostPrototypeDedicatedHostByGroup.Builder().build();
  }

}