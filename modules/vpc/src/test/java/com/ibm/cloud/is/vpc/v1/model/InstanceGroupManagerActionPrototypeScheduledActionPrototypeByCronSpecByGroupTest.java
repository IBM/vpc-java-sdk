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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup model.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup() throws Throwable {
    InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototypeModel = new InstanceGroupManagerScheduledActionGroupPrototype.Builder()
      .membershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerScheduledActionGroupPrototypeModel.membershipCount(), Long.valueOf("10"));

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.Builder()
      .name("my-instance-group-manager-action")
      .cronSpec("30 */2 * * 1-5")
      .group(instanceGroupManagerScheduledActionGroupPrototypeModel)
      .build();
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModel.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModel.group(), instanceGroupManagerScheduledActionGroupPrototypeModel);

    String json = TestUtilities.serialize(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModel);

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.class);
    assertTrue(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModelNew instanceof InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup);
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModelNew.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupModelNew.group().toString(), instanceGroupManagerScheduledActionGroupPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroupError() throws Throwable {
    new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.Builder().build();
  }

}