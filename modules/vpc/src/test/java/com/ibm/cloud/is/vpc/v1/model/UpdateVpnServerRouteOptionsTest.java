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

import com.ibm.cloud.is.vpc.v1.model.UpdateVpnServerRouteOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateVpnServerRouteOptions model.
 */
public class UpdateVpnServerRouteOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateVpnServerRouteOptions() throws Throwable {
    UpdateVpnServerRouteOptions updateVpnServerRouteOptionsModel = new UpdateVpnServerRouteOptions.Builder()
      .vpnServerId("testString")
      .id("testString")
      .vpnServerRoutePatch(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(updateVpnServerRouteOptionsModel.vpnServerId(), "testString");
    assertEquals(updateVpnServerRouteOptionsModel.id(), "testString");
    assertEquals(updateVpnServerRouteOptionsModel.vpnServerRoutePatch(), java.util.Collections.singletonMap("anyKey", "anyValue"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateVpnServerRouteOptionsError() throws Throwable {
    new UpdateVpnServerRouteOptions.Builder().build();
  }

}