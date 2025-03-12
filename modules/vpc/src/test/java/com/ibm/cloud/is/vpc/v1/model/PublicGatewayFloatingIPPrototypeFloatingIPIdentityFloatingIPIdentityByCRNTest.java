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

import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN model.
 */
public class PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN() throws Throwable {
    PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN publicGatewayFloatingIpPrototypeFloatingIpIdentityFloatingIpIdentityByCrnModel = new PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::floating-ip:r006-f45e0d90-12a8-4460-8210-290ff2ab75cd")
      .build();
    assertEquals(publicGatewayFloatingIpPrototypeFloatingIpIdentityFloatingIpIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::floating-ip:r006-f45e0d90-12a8-4460-8210-290ff2ab75cd");

    String json = TestUtilities.serialize(publicGatewayFloatingIpPrototypeFloatingIpIdentityFloatingIpIdentityByCrnModel);

    PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN publicGatewayFloatingIpPrototypeFloatingIpIdentityFloatingIpIdentityByCrnModelNew = TestUtilities.deserialize(json, PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN.class);
    assertTrue(publicGatewayFloatingIpPrototypeFloatingIpIdentityFloatingIpIdentityByCrnModelNew instanceof PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN);
    assertEquals(publicGatewayFloatingIpPrototypeFloatingIpIdentityFloatingIpIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::floating-ip:r006-f45e0d90-12a8-4460-8210-290ff2ab75cd");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRNError() throws Throwable {
    new PublicGatewayFloatingIPPrototypeFloatingIPIdentityFloatingIPIdentityByCRN.Builder().build();
  }

}