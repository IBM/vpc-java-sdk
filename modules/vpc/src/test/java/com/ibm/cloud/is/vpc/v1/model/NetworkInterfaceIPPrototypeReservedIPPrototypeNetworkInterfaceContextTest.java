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

import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext model.
 */
public class NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext() throws Throwable {
    NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("192.168.3.4")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();
    assertEquals(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModel.address(), "192.168.3.4");
    assertEquals(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModel.name(), "my-reserved-ip");

    String json = TestUtilities.serialize(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModel);

    NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModelNew = TestUtilities.deserialize(json, NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.class);
    assertTrue(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModelNew instanceof NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext);
    assertEquals(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModelNew.address(), "192.168.3.4");
    assertEquals(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModelNew.autoDelete(), Boolean.valueOf(false));
    assertEquals(networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContextModelNew.name(), "my-reserved-ip");
  }
}