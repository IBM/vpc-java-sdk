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

import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VirtualNetworkInterfacePatch model.
 */
public class VirtualNetworkInterfacePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVirtualNetworkInterfacePatch() throws Throwable {
    VirtualNetworkInterfacePatch virtualNetworkInterfacePatchModel = new VirtualNetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .autoDelete(false)
      .enableInfrastructureNat(true)
      .name("my-virtual-network-interface")
      .protocolStateFilteringMode("auto")
      .build();
    assertEquals(virtualNetworkInterfacePatchModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(virtualNetworkInterfacePatchModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(virtualNetworkInterfacePatchModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(virtualNetworkInterfacePatchModel.name(), "my-virtual-network-interface");
    assertEquals(virtualNetworkInterfacePatchModel.protocolStateFilteringMode(), "auto");

    String json = TestUtilities.serialize(virtualNetworkInterfacePatchModel);

    VirtualNetworkInterfacePatch virtualNetworkInterfacePatchModelNew = TestUtilities.deserialize(json, VirtualNetworkInterfacePatch.class);
    assertTrue(virtualNetworkInterfacePatchModelNew instanceof VirtualNetworkInterfacePatch);
    assertEquals(virtualNetworkInterfacePatchModelNew.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(virtualNetworkInterfacePatchModelNew.autoDelete(), Boolean.valueOf(false));
    assertEquals(virtualNetworkInterfacePatchModelNew.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(virtualNetworkInterfacePatchModelNew.name(), "my-virtual-network-interface");
    assertEquals(virtualNetworkInterfacePatchModelNew.protocolStateFilteringMode(), "auto");
  }
  @Test
  public void testVirtualNetworkInterfacePatchAsPatch() throws Throwable {
    VirtualNetworkInterfacePatch virtualNetworkInterfacePatchModel = new VirtualNetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .autoDelete(false)
      .enableInfrastructureNat(true)
      .name("my-virtual-network-interface")
      .protocolStateFilteringMode("auto")
      .build();

    Map<String, Object> mergePatch = virtualNetworkInterfacePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("allow_ip_spoofing"));
    assertTrue(mergePatch.containsKey("auto_delete"));
    assertTrue(mergePatch.containsKey("enable_infrastructure_nat"));
    assertEquals(mergePatch.get("name"), "my-virtual-network-interface");
    assertEquals(mergePatch.get("protocol_state_filtering_mode"), "auto");
  }

}