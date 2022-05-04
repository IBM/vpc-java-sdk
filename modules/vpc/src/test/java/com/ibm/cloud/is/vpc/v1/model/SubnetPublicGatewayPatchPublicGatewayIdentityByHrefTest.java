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

import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatchPublicGatewayIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubnetPublicGatewayPatchPublicGatewayIdentityByHref model.
 */
public class SubnetPublicGatewayPatchPublicGatewayIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubnetPublicGatewayPatchPublicGatewayIdentityByHref() throws Throwable {
    SubnetPublicGatewayPatchPublicGatewayIdentityByHref subnetPublicGatewayPatchPublicGatewayIdentityByHrefModel = new SubnetPublicGatewayPatchPublicGatewayIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();
    assertEquals(subnetPublicGatewayPatchPublicGatewayIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241");

    String json = TestUtilities.serialize(subnetPublicGatewayPatchPublicGatewayIdentityByHrefModel);

    SubnetPublicGatewayPatchPublicGatewayIdentityByHref subnetPublicGatewayPatchPublicGatewayIdentityByHrefModelNew = TestUtilities.deserialize(json, SubnetPublicGatewayPatchPublicGatewayIdentityByHref.class);
    assertTrue(subnetPublicGatewayPatchPublicGatewayIdentityByHrefModelNew instanceof SubnetPublicGatewayPatchPublicGatewayIdentityByHref);
    assertEquals(subnetPublicGatewayPatchPublicGatewayIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/public_gateways/dc5431ef-1fc6-4861-adc9-a59d077d1241");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubnetPublicGatewayPatchPublicGatewayIdentityByHrefError() throws Throwable {
    new SubnetPublicGatewayPatchPublicGatewayIdentityByHref.Builder().build();
  }

}