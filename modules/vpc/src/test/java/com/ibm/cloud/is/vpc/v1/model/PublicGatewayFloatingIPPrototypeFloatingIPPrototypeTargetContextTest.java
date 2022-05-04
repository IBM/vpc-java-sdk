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

import com.ibm.cloud.is.vpc.v1.model.PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext model.
 */
public class PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModel = new PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext.Builder()
      .name("my-floating-ip")
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModel.name(), "my-floating-ip");
    assertEquals(publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModel.resourceGroup(), resourceGroupIdentityModel);

    String json = TestUtilities.serialize(publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModel);

    PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModelNew = TestUtilities.deserialize(json, PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext.class);
    assertTrue(publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModelNew instanceof PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext);
    assertEquals(publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModelNew.name(), "my-floating-ip");
    assertEquals(publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContextModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
  }
}