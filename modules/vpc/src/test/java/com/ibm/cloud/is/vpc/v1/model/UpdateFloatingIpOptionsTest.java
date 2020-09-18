/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.UpdateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateFloatingIpOptions model.
 */
public class UpdateFloatingIpOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateFloatingIpOptions() throws Throwable {
    FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById floatingIpPatchTargetNetworkInterfaceIdentityModel = new FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
      .id("69e55145-cc7d-4d8e-9e1f-cc3fb60b1793")
      .build();
    assertEquals(floatingIpPatchTargetNetworkInterfaceIdentityModel.id(), "69e55145-cc7d-4d8e-9e1f-cc3fb60b1793");

    UpdateFloatingIpOptions updateFloatingIpOptionsModel = new UpdateFloatingIpOptions.Builder()
      .id("testString")
      .name("my-floating-ip")
      .target(floatingIpPatchTargetNetworkInterfaceIdentityModel)
      .build();
    assertEquals(updateFloatingIpOptionsModel.id(), "testString");
    assertEquals(updateFloatingIpOptionsModel.name(), "my-floating-ip");
    assertEquals(updateFloatingIpOptionsModel.target(), floatingIpPatchTargetNetworkInterfaceIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFloatingIpOptionsError() throws Throwable {
    new UpdateFloatingIpOptions.Builder().build();
  }

}