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

import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatchPublicGatewayIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubnetPublicGatewayPatchPublicGatewayIdentityByCRN model.
 */
public class SubnetPublicGatewayPatchPublicGatewayIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubnetPublicGatewayPatchPublicGatewayIdentityByCRN() throws Throwable {
    SubnetPublicGatewayPatchPublicGatewayIdentityByCRN subnetPublicGatewayPatchPublicGatewayIdentityByCrnModel = new SubnetPublicGatewayPatchPublicGatewayIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();
    assertEquals(subnetPublicGatewayPatchPublicGatewayIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241");

    String json = TestUtilities.serialize(subnetPublicGatewayPatchPublicGatewayIdentityByCrnModel);

    SubnetPublicGatewayPatchPublicGatewayIdentityByCRN subnetPublicGatewayPatchPublicGatewayIdentityByCrnModelNew = TestUtilities.deserialize(json, SubnetPublicGatewayPatchPublicGatewayIdentityByCRN.class);
    assertTrue(subnetPublicGatewayPatchPublicGatewayIdentityByCrnModelNew instanceof SubnetPublicGatewayPatchPublicGatewayIdentityByCRN);
    assertEquals(subnetPublicGatewayPatchPublicGatewayIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south-1:a/123456::public-gateway:dc5431ef-1fc6-4861-adc9-a59d077d1241");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubnetPublicGatewayPatchPublicGatewayIdentityByCRNError() throws Throwable {
    new SubnetPublicGatewayPatchPublicGatewayIdentityByCRN.Builder().build();
  }

}