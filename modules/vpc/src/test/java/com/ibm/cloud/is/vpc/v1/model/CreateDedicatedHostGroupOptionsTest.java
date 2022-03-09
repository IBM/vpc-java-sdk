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

import com.ibm.cloud.is.vpc.v1.model.CreateDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDedicatedHostGroupOptions model.
 */
public class CreateDedicatedHostGroupOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDedicatedHostGroupOptions() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    CreateDedicatedHostGroupOptions createDedicatedHostGroupOptionsModel = new CreateDedicatedHostGroupOptions.Builder()
      .xClass("mx2")
      .family("balanced")
      .name("my-host-group")
      .resourceGroup(resourceGroupIdentityModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(createDedicatedHostGroupOptionsModel.xClass(), "mx2");
    assertEquals(createDedicatedHostGroupOptionsModel.family(), "balanced");
    assertEquals(createDedicatedHostGroupOptionsModel.name(), "my-host-group");
    assertEquals(createDedicatedHostGroupOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createDedicatedHostGroupOptionsModel.zone(), zoneIdentityModel);
  }
}