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
 * Unit test class for the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup model.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup() throws Throwable {
    InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototypeModel = new InstanceGroupManagerScheduledActionGroupPrototype.Builder()
      .membershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerScheduledActionGroupPrototypeModel.membershipCount(), Long.valueOf("10"));

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.Builder()
      .name("my-instance-group-manager-action")
      .cronSpec("30 */2 * * 1-5")
      .group(instanceGroupManagerScheduledActionGroupPrototypeModel)
      .build();
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModel.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModel.group(), instanceGroupManagerScheduledActionGroupPrototypeModel);

    String json = TestUtilities.serialize(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModel);

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.class);
    assertTrue(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModelNew instanceof InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup);
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModelNew.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupModelNew.group().toString(), instanceGroupManagerScheduledActionGroupPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroupError() throws Throwable {
    new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.Builder().build();
  }

}