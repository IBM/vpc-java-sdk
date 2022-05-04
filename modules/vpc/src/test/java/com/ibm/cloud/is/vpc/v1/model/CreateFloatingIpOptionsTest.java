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

import com.ibm.cloud.is.vpc.v1.model.CreateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPByTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByTarget;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateFloatingIpOptions model.
 */
public class CreateFloatingIpOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateFloatingIpOptions() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    FloatingIPByTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById floatingIpByTargetNetworkInterfaceIdentityModel = new FloatingIPByTargetNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
      .id("69e55145-cc7d-4d8e-9e1f-cc3fb60b1793")
      .build();
    assertEquals(floatingIpByTargetNetworkInterfaceIdentityModel.id(), "69e55145-cc7d-4d8e-9e1f-cc3fb60b1793");

    FloatingIPPrototypeFloatingIPByTarget floatingIpPrototypeModel = new FloatingIPPrototypeFloatingIPByTarget.Builder()
      .name("my-new-floating-ip")
      .resourceGroup(resourceGroupIdentityModel)
      .target(floatingIpByTargetNetworkInterfaceIdentityModel)
      .build();
    assertEquals(floatingIpPrototypeModel.name(), "my-new-floating-ip");
    assertEquals(floatingIpPrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(floatingIpPrototypeModel.target(), floatingIpByTargetNetworkInterfaceIdentityModel);

    CreateFloatingIpOptions createFloatingIpOptionsModel = new CreateFloatingIpOptions.Builder()
      .floatingIpPrototype(floatingIpPrototypeModel)
      .build();
    assertEquals(createFloatingIpOptionsModel.floatingIpPrototype(), floatingIpPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFloatingIpOptionsError() throws Throwable {
    new CreateFloatingIpOptions.Builder().build();
  }

}