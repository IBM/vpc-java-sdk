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

import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkInterfaceIPPrototypeReservedIPIdentityByHref model.
 */
public class NetworkInterfaceIPPrototypeReservedIPIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkInterfaceIPPrototypeReservedIPIdentityByHref() throws Throwable {
    NetworkInterfaceIPPrototypeReservedIPIdentityByHref networkInterfaceIpPrototypeReservedIpIdentityByHrefModel = new NetworkInterfaceIPPrototypeReservedIPIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/subnets/0717-bea6a632-5e13-42a4-b4b8-31dc877abfe4/reserved_ips/0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();
    assertEquals(networkInterfaceIpPrototypeReservedIpIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/subnets/0717-bea6a632-5e13-42a4-b4b8-31dc877abfe4/reserved_ips/0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb");

    String json = TestUtilities.serialize(networkInterfaceIpPrototypeReservedIpIdentityByHrefModel);

    NetworkInterfaceIPPrototypeReservedIPIdentityByHref networkInterfaceIpPrototypeReservedIpIdentityByHrefModelNew = TestUtilities.deserialize(json, NetworkInterfaceIPPrototypeReservedIPIdentityByHref.class);
    assertTrue(networkInterfaceIpPrototypeReservedIpIdentityByHrefModelNew instanceof NetworkInterfaceIPPrototypeReservedIPIdentityByHref);
    assertEquals(networkInterfaceIpPrototypeReservedIpIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/subnets/0717-bea6a632-5e13-42a4-b4b8-31dc877abfe4/reserved_ips/0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkInterfaceIPPrototypeReservedIPIdentityByHrefError() throws Throwable {
    new NetworkInterfaceIPPrototypeReservedIPIdentityByHref.Builder().build();
  }

}