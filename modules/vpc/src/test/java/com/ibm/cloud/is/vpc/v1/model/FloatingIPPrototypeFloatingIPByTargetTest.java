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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByTarget;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FloatingIPPrototypeFloatingIPByTarget model.
 */
public class FloatingIPPrototypeFloatingIPByTargetTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFloatingIPPrototypeFloatingIPByTarget() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById floatingIpTargetPrototypeModel = new FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityById.Builder()
      .id("0717-da8c43ec-b6ca-4bd2-871e-72e288c66ee6")
      .build();
    assertEquals(floatingIpTargetPrototypeModel.id(), "0717-da8c43ec-b6ca-4bd2-871e-72e288c66ee6");

    FloatingIPPrototypeFloatingIPByTarget floatingIpPrototypeFloatingIpByTargetModel = new FloatingIPPrototypeFloatingIPByTarget.Builder()
      .name("my-floating-ip")
      .resourceGroup(resourceGroupIdentityModel)
      .target(floatingIpTargetPrototypeModel)
      .build();
    assertEquals(floatingIpPrototypeFloatingIpByTargetModel.name(), "my-floating-ip");
    assertEquals(floatingIpPrototypeFloatingIpByTargetModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(floatingIpPrototypeFloatingIpByTargetModel.target(), floatingIpTargetPrototypeModel);

    String json = TestUtilities.serialize(floatingIpPrototypeFloatingIpByTargetModel);

    FloatingIPPrototypeFloatingIPByTarget floatingIpPrototypeFloatingIpByTargetModelNew = TestUtilities.deserialize(json, FloatingIPPrototypeFloatingIPByTarget.class);
    assertTrue(floatingIpPrototypeFloatingIpByTargetModelNew instanceof FloatingIPPrototypeFloatingIPByTarget);
    assertEquals(floatingIpPrototypeFloatingIpByTargetModelNew.name(), "my-floating-ip");
    assertEquals(floatingIpPrototypeFloatingIpByTargetModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(floatingIpPrototypeFloatingIpByTargetModelNew.target().toString(), floatingIpTargetPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPPrototypeFloatingIPByTargetError() throws Throwable {
    new FloatingIPPrototypeFloatingIPByTarget.Builder().build();
  }

}