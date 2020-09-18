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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetTargetNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByTarget;
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

    FloatingIPByTargetTargetNetworkInterfaceIdentityById floatingIpByTargetTargetModel = new FloatingIPByTargetTargetNetworkInterfaceIdentityById.Builder()
      .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
      .build();
    assertEquals(floatingIpByTargetTargetModel.id(), "10c02d81-0ecb-4dc5-897d-28392913b81e");

    FloatingIPPrototypeFloatingIPByTarget floatingIpPrototypeFloatingIpByTargetModel = new FloatingIPPrototypeFloatingIPByTarget.Builder()
      .name("my-floating-ip")
      .resourceGroup(resourceGroupIdentityModel)
      .target(floatingIpByTargetTargetModel)
      .build();
    assertEquals(floatingIpPrototypeFloatingIpByTargetModel.name(), "my-floating-ip");
    assertEquals(floatingIpPrototypeFloatingIpByTargetModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(floatingIpPrototypeFloatingIpByTargetModel.target(), floatingIpByTargetTargetModel);

    String json = TestUtilities.serialize(floatingIpPrototypeFloatingIpByTargetModel);

    FloatingIPPrototypeFloatingIPByTarget floatingIpPrototypeFloatingIpByTargetModelNew = TestUtilities.deserialize(json, FloatingIPPrototypeFloatingIPByTarget.class);
    assertTrue(floatingIpPrototypeFloatingIpByTargetModelNew instanceof FloatingIPPrototypeFloatingIPByTarget);
    assertEquals(floatingIpPrototypeFloatingIpByTargetModelNew.name(), "my-floating-ip");
    assertEquals(floatingIpPrototypeFloatingIpByTargetModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(floatingIpPrototypeFloatingIpByTargetModelNew.target().toString(), floatingIpByTargetTargetModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPPrototypeFloatingIPByTargetError() throws Throwable {
    new FloatingIPPrototypeFloatingIPByTarget.Builder().build();
  }

}