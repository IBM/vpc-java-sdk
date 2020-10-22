/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById model.
 */
public class PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById() throws Throwable {
    PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById publicGatewayPrototypeFloatingIpFloatingIpIdentityFloatingIpIdentityByIdModel = new PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById.Builder()
      .id("39300233-9995-4806-89a5-3c1b6eb88689")
      .build();
    assertEquals(publicGatewayPrototypeFloatingIpFloatingIpIdentityFloatingIpIdentityByIdModel.id(), "39300233-9995-4806-89a5-3c1b6eb88689");

    String json = TestUtilities.serialize(publicGatewayPrototypeFloatingIpFloatingIpIdentityFloatingIpIdentityByIdModel);

    PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById publicGatewayPrototypeFloatingIpFloatingIpIdentityFloatingIpIdentityByIdModelNew = TestUtilities.deserialize(json, PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById.class);
    assertTrue(publicGatewayPrototypeFloatingIpFloatingIpIdentityFloatingIpIdentityByIdModelNew instanceof PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById);
    assertEquals(publicGatewayPrototypeFloatingIpFloatingIpIdentityFloatingIpIdentityByIdModelNew.id(), "39300233-9995-4806-89a5-3c1b6eb88689");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityByIdError() throws Throwable {
    new PublicGatewayPrototypeFloatingIpFloatingIPIdentityFloatingIPIdentityById.Builder().build();
  }

}