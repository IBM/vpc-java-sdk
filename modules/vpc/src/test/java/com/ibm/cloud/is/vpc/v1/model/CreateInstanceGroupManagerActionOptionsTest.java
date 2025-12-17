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

import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInstanceGroupManagerActionOptions model.
 */
public class CreateInstanceGroupManagerActionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInstanceGroupManagerActionOptions() throws Throwable {
    InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototypeModel = new InstanceGroupManagerScheduledActionGroupPrototype.Builder()
      .membershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerScheduledActionGroupPrototypeModel.membershipCount(), Long.valueOf("10"));

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup instanceGroupManagerActionPrototypeModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.Builder()
      .name("my-instance-group-manager-action")
      .cronSpec("30 */2 * * 1-5")
      .group(instanceGroupManagerScheduledActionGroupPrototypeModel)
      .build();
    assertEquals(instanceGroupManagerActionPrototypeModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeModel.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPrototypeModel.group(), instanceGroupManagerScheduledActionGroupPrototypeModel);

    CreateInstanceGroupManagerActionOptions createInstanceGroupManagerActionOptionsModel = new CreateInstanceGroupManagerActionOptions.Builder()
      .instanceGroupId("testString")
      .instanceGroupManagerId("testString")
      .instanceGroupManagerActionPrototype(instanceGroupManagerActionPrototypeModel)
      .build();
    assertEquals(createInstanceGroupManagerActionOptionsModel.instanceGroupId(), "testString");
    assertEquals(createInstanceGroupManagerActionOptionsModel.instanceGroupManagerId(), "testString");
    assertEquals(createInstanceGroupManagerActionOptionsModel.instanceGroupManagerActionPrototype(), instanceGroupManagerActionPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceGroupManagerActionOptionsError() throws Throwable {
    new CreateInstanceGroupManagerActionOptions.Builder().build();
  }

}