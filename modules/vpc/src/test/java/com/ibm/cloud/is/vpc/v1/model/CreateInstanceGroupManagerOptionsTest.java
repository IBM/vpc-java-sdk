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

import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInstanceGroupManagerOptions model.
 */
public class CreateInstanceGroupManagerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInstanceGroupManagerOptions() throws Throwable {
    InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeModel = new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder()
      .name("my-instance-group-manager")
      .managementEnabled(true)
      .aggregationWindow(Long.valueOf("120"))
      .cooldown(Long.valueOf("210"))
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .managerType("autoscale")
      .build();
    assertEquals(instanceGroupManagerPrototypeModel.name(), "my-instance-group-manager");
    assertEquals(instanceGroupManagerPrototypeModel.managementEnabled(), Boolean.valueOf(true));
    assertEquals(instanceGroupManagerPrototypeModel.aggregationWindow(), Long.valueOf("120"));
    assertEquals(instanceGroupManagerPrototypeModel.cooldown(), Long.valueOf("210"));
    assertEquals(instanceGroupManagerPrototypeModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPrototypeModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPrototypeModel.managerType(), "autoscale");

    CreateInstanceGroupManagerOptions createInstanceGroupManagerOptionsModel = new CreateInstanceGroupManagerOptions.Builder()
      .instanceGroupId("testString")
      .instanceGroupManagerPrototype(instanceGroupManagerPrototypeModel)
      .build();
    assertEquals(createInstanceGroupManagerOptionsModel.instanceGroupId(), "testString");
    assertEquals(createInstanceGroupManagerOptionsModel.instanceGroupManagerPrototype(), instanceGroupManagerPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceGroupManagerOptionsError() throws Throwable {
    new CreateInstanceGroupManagerOptions.Builder().build();
  }

}