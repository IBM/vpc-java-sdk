/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager model.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager() throws Throwable {
    InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById instanceGroupManagerScheduledActionManagerPrototypeModel = new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .id("r006-bd21f31f-8a05-4451-836d-ab0347e91fea")
      .build();
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeModel.id(), "r006-bd21f31f-8a05-4451-836d-ab0347e91fea");

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.Builder()
      .name("my-instance-group-manager-action")
      .cronSpec("30 */2 * * 1-5")
      .manager(instanceGroupManagerScheduledActionManagerPrototypeModel)
      .build();
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModel.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModel.manager(), instanceGroupManagerScheduledActionManagerPrototypeModel);

    String json = TestUtilities.serialize(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModel);

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.class);
    assertTrue(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModelNew instanceof InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager);
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModelNew.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerModelNew.manager().toString(), instanceGroupManagerScheduledActionManagerPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManagerError() throws Throwable {
    new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.Builder().build();
  }

}