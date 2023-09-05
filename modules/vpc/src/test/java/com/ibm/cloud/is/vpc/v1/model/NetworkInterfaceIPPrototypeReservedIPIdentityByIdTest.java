/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkInterfaceIPPrototypeReservedIPIdentityById model.
 */
public class NetworkInterfaceIPPrototypeReservedIPIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkInterfaceIPPrototypeReservedIPIdentityById() throws Throwable {
    NetworkInterfaceIPPrototypeReservedIPIdentityById networkInterfaceIpPrototypeReservedIpIdentityByIdModel = new NetworkInterfaceIPPrototypeReservedIPIdentityById.Builder()
      .id("6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();
    assertEquals(networkInterfaceIpPrototypeReservedIpIdentityByIdModel.id(), "6d353a0f-aeb1-4ae1-832e-1110d10981bb");

    String json = TestUtilities.serialize(networkInterfaceIpPrototypeReservedIpIdentityByIdModel);

    NetworkInterfaceIPPrototypeReservedIPIdentityById networkInterfaceIpPrototypeReservedIpIdentityByIdModelNew = TestUtilities.deserialize(json, NetworkInterfaceIPPrototypeReservedIPIdentityById.class);
    assertTrue(networkInterfaceIpPrototypeReservedIpIdentityByIdModelNew instanceof NetworkInterfaceIPPrototypeReservedIPIdentityById);
    assertEquals(networkInterfaceIpPrototypeReservedIpIdentityByIdModelNew.id(), "6d353a0f-aeb1-4ae1-832e-1110d10981bb");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkInterfaceIPPrototypeReservedIPIdentityByIdError() throws Throwable {
    new NetworkInterfaceIPPrototypeReservedIPIdentityById.Builder().build();
  }

}