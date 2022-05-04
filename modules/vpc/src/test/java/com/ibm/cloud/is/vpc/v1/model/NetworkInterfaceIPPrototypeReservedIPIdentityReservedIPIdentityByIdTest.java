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

import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById model.
 */
public class NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById() throws Throwable {
    NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById networkInterfaceIpPrototypeReservedIpIdentityReservedIpIdentityByIdModel = new NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById.Builder()
      .id("6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();
    assertEquals(networkInterfaceIpPrototypeReservedIpIdentityReservedIpIdentityByIdModel.id(), "6d353a0f-aeb1-4ae1-832e-1110d10981bb");

    String json = TestUtilities.serialize(networkInterfaceIpPrototypeReservedIpIdentityReservedIpIdentityByIdModel);

    NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById networkInterfaceIpPrototypeReservedIpIdentityReservedIpIdentityByIdModelNew = TestUtilities.deserialize(json, NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById.class);
    assertTrue(networkInterfaceIpPrototypeReservedIpIdentityReservedIpIdentityByIdModelNew instanceof NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById);
    assertEquals(networkInterfaceIpPrototypeReservedIpIdentityReservedIpIdentityByIdModelNew.id(), "6d353a0f-aeb1-4ae1-832e-1110d10981bb");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityByIdError() throws Throwable {
    new NetworkInterfaceIPPrototypeReservedIPIdentityReservedIPIdentityById.Builder().build();
  }

}