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

import com.ibm.cloud.is.vpc.v1.model.PublicAddressRangeTargetPrototype;
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
 * Unit test class for the PublicAddressRangeTargetPrototype model.
 */
public class PublicAddressRangeTargetPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicAddressRangeTargetPrototype() throws Throwable {
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

    String json = TestUtilities.serialize(publicAddressRangeTargetPrototypeModel);

    PublicAddressRangeTargetPrototype publicAddressRangeTargetPrototypeModelNew = TestUtilities.deserialize(json, PublicAddressRangeTargetPrototype.class);
    assertTrue(publicAddressRangeTargetPrototypeModelNew instanceof PublicAddressRangeTargetPrototype);
    assertEquals(publicAddressRangeTargetPrototypeModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(publicAddressRangeTargetPrototypeModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublicAddressRangeTargetPrototypeError() throws Throwable {
    new PublicAddressRangeTargetPrototype.Builder().build();
  }

}