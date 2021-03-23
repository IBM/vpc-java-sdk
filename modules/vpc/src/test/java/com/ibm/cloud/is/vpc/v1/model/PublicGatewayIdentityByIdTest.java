/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicGatewayIdentityById model.
 */
public class PublicGatewayIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicGatewayIdentityById() throws Throwable {
    PublicGatewayIdentityById publicGatewayIdentityByIdModel = new PublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();
    assertEquals(publicGatewayIdentityByIdModel.id(), "dc5431ef-1fc6-4861-adc9-a59d077d1241");

    String json = TestUtilities.serialize(publicGatewayIdentityByIdModel);

    PublicGatewayIdentityById publicGatewayIdentityByIdModelNew = TestUtilities.deserialize(json, PublicGatewayIdentityById.class);
    assertTrue(publicGatewayIdentityByIdModelNew instanceof PublicGatewayIdentityById);
    assertEquals(publicGatewayIdentityByIdModelNew.id(), "dc5431ef-1fc6-4861-adc9-a59d077d1241");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublicGatewayIdentityByIdError() throws Throwable {
    new PublicGatewayIdentityById.Builder().build();
  }

}