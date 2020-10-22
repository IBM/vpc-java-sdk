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
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FloatingIPByTargetTargetNetworkInterfaceIdentityById model.
 */
public class FloatingIPByTargetTargetNetworkInterfaceIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFloatingIPByTargetTargetNetworkInterfaceIdentityById() throws Throwable {
    FloatingIPByTargetTargetNetworkInterfaceIdentityById floatingIpByTargetTargetNetworkInterfaceIdentityByIdModel = new FloatingIPByTargetTargetNetworkInterfaceIdentityById.Builder()
      .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
      .build();
    assertEquals(floatingIpByTargetTargetNetworkInterfaceIdentityByIdModel.id(), "10c02d81-0ecb-4dc5-897d-28392913b81e");

    String json = TestUtilities.serialize(floatingIpByTargetTargetNetworkInterfaceIdentityByIdModel);

    FloatingIPByTargetTargetNetworkInterfaceIdentityById floatingIpByTargetTargetNetworkInterfaceIdentityByIdModelNew = TestUtilities.deserialize(json, FloatingIPByTargetTargetNetworkInterfaceIdentityById.class);
    assertTrue(floatingIpByTargetTargetNetworkInterfaceIdentityByIdModelNew instanceof FloatingIPByTargetTargetNetworkInterfaceIdentityById);
    assertEquals(floatingIpByTargetTargetNetworkInterfaceIdentityByIdModelNew.id(), "10c02d81-0ecb-4dc5-897d-28392913b81e");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPByTargetTargetNetworkInterfaceIdentityByIdError() throws Throwable {
    new FloatingIPByTargetTargetNetworkInterfaceIdentityById.Builder().build();
  }

}