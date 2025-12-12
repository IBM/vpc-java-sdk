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

import com.ibm.cloud.is.vpc.v1.model.PublicAddressRangePatch;
import com.ibm.cloud.is.vpc.v1.model.PublicAddressRangeTargetPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicAddressRangePatch model.
 */
public class PublicAddressRangePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicAddressRangePatch() throws Throwable {
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    PublicAddressRangeTargetPatch publicAddressRangeTargetPatchModel = new PublicAddressRangeTargetPatch.Builder()
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(publicAddressRangeTargetPatchModel.vpc(), vpcIdentityModel);
    assertEquals(publicAddressRangeTargetPatchModel.zone(), zoneIdentityModel);

    PublicAddressRangePatch publicAddressRangePatchModel = new PublicAddressRangePatch.Builder()
      .name("my-public-address-range-updated")
      .target(publicAddressRangeTargetPatchModel)
      .build();
    assertEquals(publicAddressRangePatchModel.name(), "my-public-address-range-updated");
    assertEquals(publicAddressRangePatchModel.target(), publicAddressRangeTargetPatchModel);

    String json = TestUtilities.serialize(publicAddressRangePatchModel);

    PublicAddressRangePatch publicAddressRangePatchModelNew = TestUtilities.deserialize(json, PublicAddressRangePatch.class);
    assertTrue(publicAddressRangePatchModelNew instanceof PublicAddressRangePatch);
    assertEquals(publicAddressRangePatchModelNew.name(), "my-public-address-range-updated");
    assertEquals(publicAddressRangePatchModelNew.target().toString(), publicAddressRangeTargetPatchModel.toString());
  }
  @Test
  public void testPublicAddressRangePatchAsPatch() throws Throwable {
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();

    PublicAddressRangeTargetPatch publicAddressRangeTargetPatchModel = new PublicAddressRangeTargetPatch.Builder()
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .build();

    PublicAddressRangePatch publicAddressRangePatchModel = new PublicAddressRangePatch.Builder()
      .name("my-public-address-range-updated")
      .target(publicAddressRangeTargetPatchModel)
      .build();

    Map<String, Object> mergePatch = publicAddressRangePatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-public-address-range-updated");
    assertTrue(mergePatch.containsKey("target"));
  }

}