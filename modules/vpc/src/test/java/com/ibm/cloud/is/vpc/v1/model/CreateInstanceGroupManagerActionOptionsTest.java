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

import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
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

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup instanceGroupManagerActionPrototypeModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup.Builder()
      .name("my-instance-group-manager-action")
      .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .group(instanceGroupManagerScheduledActionGroupPrototypeModel)
      .build();
    assertEquals(instanceGroupManagerActionPrototypeModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeModel.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
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