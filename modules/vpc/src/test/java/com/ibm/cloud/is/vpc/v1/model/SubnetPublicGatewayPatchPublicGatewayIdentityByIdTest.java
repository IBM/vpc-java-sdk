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

import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatchPublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubnetPublicGatewayPatchPublicGatewayIdentityById model.
 */
public class SubnetPublicGatewayPatchPublicGatewayIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubnetPublicGatewayPatchPublicGatewayIdentityById() throws Throwable {
    SubnetPublicGatewayPatchPublicGatewayIdentityById subnetPublicGatewayPatchPublicGatewayIdentityByIdModel = new SubnetPublicGatewayPatchPublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();
    assertEquals(subnetPublicGatewayPatchPublicGatewayIdentityByIdModel.id(), "dc5431ef-1fc6-4861-adc9-a59d077d1241");

    String json = TestUtilities.serialize(subnetPublicGatewayPatchPublicGatewayIdentityByIdModel);

    SubnetPublicGatewayPatchPublicGatewayIdentityById subnetPublicGatewayPatchPublicGatewayIdentityByIdModelNew = TestUtilities.deserialize(json, SubnetPublicGatewayPatchPublicGatewayIdentityById.class);
    assertTrue(subnetPublicGatewayPatchPublicGatewayIdentityByIdModelNew instanceof SubnetPublicGatewayPatchPublicGatewayIdentityById);
    assertEquals(subnetPublicGatewayPatchPublicGatewayIdentityByIdModelNew.id(), "dc5431ef-1fc6-4861-adc9-a59d077d1241");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubnetPublicGatewayPatchPublicGatewayIdentityByIdError() throws Throwable {
    new SubnetPublicGatewayPatchPublicGatewayIdentityById.Builder().build();
  }

}