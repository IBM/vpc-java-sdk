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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FloatingIPTargetPatchNetworkInterfaceIdentityById model.
 */
public class FloatingIPTargetPatchNetworkInterfaceIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFloatingIPTargetPatchNetworkInterfaceIdentityById() throws Throwable {
    FloatingIPTargetPatchNetworkInterfaceIdentityById floatingIpTargetPatchNetworkInterfaceIdentityByIdModel = new FloatingIPTargetPatchNetworkInterfaceIdentityById.Builder()
      .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
      .build();
    assertEquals(floatingIpTargetPatchNetworkInterfaceIdentityByIdModel.id(), "10c02d81-0ecb-4dc5-897d-28392913b81e");

    String json = TestUtilities.serialize(floatingIpTargetPatchNetworkInterfaceIdentityByIdModel);

    FloatingIPTargetPatchNetworkInterfaceIdentityById floatingIpTargetPatchNetworkInterfaceIdentityByIdModelNew = TestUtilities.deserialize(json, FloatingIPTargetPatchNetworkInterfaceIdentityById.class);
    assertTrue(floatingIpTargetPatchNetworkInterfaceIdentityByIdModelNew instanceof FloatingIPTargetPatchNetworkInterfaceIdentityById);
    assertEquals(floatingIpTargetPatchNetworkInterfaceIdentityByIdModelNew.id(), "10c02d81-0ecb-4dc5-897d-28392913b81e");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPTargetPatchNetworkInterfaceIdentityByIdError() throws Throwable {
    new FloatingIPTargetPatchNetworkInterfaceIdentityById.Builder().build();
  }

}