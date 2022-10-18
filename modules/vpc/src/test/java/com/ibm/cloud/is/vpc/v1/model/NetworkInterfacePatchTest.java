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

import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkInterfacePatch model.
 */
public class NetworkInterfacePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkInterfacePatch() throws Throwable {
    NetworkInterfacePatch networkInterfacePatchModel = new NetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .name("my-network-interface")
      .build();
    assertEquals(networkInterfacePatchModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(networkInterfacePatchModel.name(), "my-network-interface");

    String json = TestUtilities.serialize(networkInterfacePatchModel);

    NetworkInterfacePatch networkInterfacePatchModelNew = TestUtilities.deserialize(json, NetworkInterfacePatch.class);
    assertTrue(networkInterfacePatchModelNew instanceof NetworkInterfacePatch);
    assertEquals(networkInterfacePatchModelNew.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(networkInterfacePatchModelNew.name(), "my-network-interface");
  }
  @Test
  public void testNetworkInterfacePatchAsPatch() throws Throwable {
    NetworkInterfacePatch networkInterfacePatchModel = new NetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .name("my-network-interface")
      .build();

    Map<String, Object> mergePatch = networkInterfacePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("allow_ip_spoofing"));
    assertEquals(mergePatch.get("name"), "my-network-interface");
  }

}