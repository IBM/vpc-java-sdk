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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerNetworkInterfacePatch model.
 */
public class BareMetalServerNetworkInterfacePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerNetworkInterfacePatch() throws Throwable {
    BareMetalServerNetworkInterfacePatch bareMetalServerNetworkInterfacePatchModel = new BareMetalServerNetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .enableInfrastructureNat(true)
      .name("my-network-interface")
      .build();
    assertEquals(bareMetalServerNetworkInterfacePatchModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePatchModel.allowedVlans(), java.util.Arrays.asList(Long.valueOf("4")));
    assertEquals(bareMetalServerNetworkInterfacePatchModel.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePatchModel.name(), "my-network-interface");

    String json = TestUtilities.serialize(bareMetalServerNetworkInterfacePatchModel);

    BareMetalServerNetworkInterfacePatch bareMetalServerNetworkInterfacePatchModelNew = TestUtilities.deserialize(json, BareMetalServerNetworkInterfacePatch.class);
    assertTrue(bareMetalServerNetworkInterfacePatchModelNew instanceof BareMetalServerNetworkInterfacePatch);
    assertEquals(bareMetalServerNetworkInterfacePatchModelNew.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePatchModelNew.enableInfrastructureNat(), Boolean.valueOf(true));
    assertEquals(bareMetalServerNetworkInterfacePatchModelNew.name(), "my-network-interface");
  }
  @Test
  public void testBareMetalServerNetworkInterfacePatchAsPatch() throws Throwable {
    BareMetalServerNetworkInterfacePatch bareMetalServerNetworkInterfacePatchModel = new BareMetalServerNetworkInterfacePatch.Builder()
      .allowIpSpoofing(true)
      .allowedVlans(java.util.Arrays.asList(Long.valueOf("4")))
      .enableInfrastructureNat(true)
      .name("my-network-interface")
      .build();

    Map<String, Object> mergePatch = bareMetalServerNetworkInterfacePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("allow_ip_spoofing"));
    assertTrue(mergePatch.containsKey("allowed_vlans"));
    assertTrue(mergePatch.containsKey("enable_infrastructure_nat"));
    assertEquals(mergePatch.get("name"), "my-network-interface");
  }

}