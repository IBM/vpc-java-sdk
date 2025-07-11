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

import com.ibm.cloud.is.vpc.v1.model.CreatePublicAddressRangeOptions;
import com.ibm.cloud.is.vpc.v1.model.PublicAddressRangeTargetPrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePublicAddressRangeOptions model.
 */
public class CreatePublicAddressRangeOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePublicAddressRangeOptions() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    PublicAddressRangeTargetPrototype publicAddressRangeTargetPrototypeModel = new PublicAddressRangeTargetPrototype.Builder()
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(publicAddressRangeTargetPrototypeModel.vpc(), vpcIdentityModel);
    assertEquals(publicAddressRangeTargetPrototypeModel.zone(), zoneIdentityModel);

    CreatePublicAddressRangeOptions createPublicAddressRangeOptionsModel = new CreatePublicAddressRangeOptions.Builder()
      .ipv4AddressCount(Long.valueOf("8"))
      .name("my-public-address-range")
      .resourceGroup(resourceGroupIdentityModel)
      .target(publicAddressRangeTargetPrototypeModel)
      .build();
    assertEquals(createPublicAddressRangeOptionsModel.ipv4AddressCount(), Long.valueOf("8"));
    assertEquals(createPublicAddressRangeOptionsModel.name(), "my-public-address-range");
    assertEquals(createPublicAddressRangeOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createPublicAddressRangeOptionsModel.target(), publicAddressRangeTargetPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePublicAddressRangeOptionsError() throws Throwable {
    new CreatePublicAddressRangeOptions.Builder().build();
  }

}