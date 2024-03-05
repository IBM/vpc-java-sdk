/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById model.
 */
public class VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById() throws Throwable {
    VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById virtualNetworkInterfacePrimaryIpPrototypeReservedIpIdentityVirtualNetworkInterfacePrimaryIpContextByIdModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById.Builder()
      .id("6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeReservedIpIdentityVirtualNetworkInterfacePrimaryIpContextByIdModel.id(), "6d353a0f-aeb1-4ae1-832e-1110d10981bb");

    String json = TestUtilities.serialize(virtualNetworkInterfacePrimaryIpPrototypeReservedIpIdentityVirtualNetworkInterfacePrimaryIpContextByIdModel);

    VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById virtualNetworkInterfacePrimaryIpPrototypeReservedIpIdentityVirtualNetworkInterfacePrimaryIpContextByIdModelNew = TestUtilities.deserialize(json, VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById.class);
    assertTrue(virtualNetworkInterfacePrimaryIpPrototypeReservedIpIdentityVirtualNetworkInterfacePrimaryIpContextByIdModelNew instanceof VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById);
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeReservedIpIdentityVirtualNetworkInterfacePrimaryIpContextByIdModelNew.id(), "6d353a0f-aeb1-4ae1-832e-1110d10981bb");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextByIdError() throws Throwable {
    new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPIdentityVirtualNetworkInterfacePrimaryIPContextById.Builder().build();
  }

}