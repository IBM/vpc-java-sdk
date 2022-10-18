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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPDPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionDPDPatch model.
 */
public class VPNGatewayConnectionDPDPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionDPDPatch() throws Throwable {
    VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModel = new VPNGatewayConnectionDPDPatch.Builder()
      .action("restart")
      .interval(Long.valueOf("30"))
      .timeout(Long.valueOf("120"))
      .build();
    assertEquals(vpnGatewayConnectionDpdPatchModel.action(), "restart");
    assertEquals(vpnGatewayConnectionDpdPatchModel.interval(), Long.valueOf("30"));
    assertEquals(vpnGatewayConnectionDpdPatchModel.timeout(), Long.valueOf("120"));

    String json = TestUtilities.serialize(vpnGatewayConnectionDpdPatchModel);

    VPNGatewayConnectionDPDPatch vpnGatewayConnectionDpdPatchModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionDPDPatch.class);
    assertTrue(vpnGatewayConnectionDpdPatchModelNew instanceof VPNGatewayConnectionDPDPatch);
    assertEquals(vpnGatewayConnectionDpdPatchModelNew.action(), "restart");
    assertEquals(vpnGatewayConnectionDpdPatchModelNew.interval(), Long.valueOf("30"));
    assertEquals(vpnGatewayConnectionDpdPatchModelNew.timeout(), Long.valueOf("120"));
  }
}