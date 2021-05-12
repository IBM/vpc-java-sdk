/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager model.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager() throws Throwable {
    InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityById instanceGroupManagerScheduledActionByManagerManagerModel = new InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityById.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(instanceGroupManagerScheduledActionByManagerManagerModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionByManagerManagerModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionByManagerManagerModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.Builder()
      .name("my-instance-group-manager-action")
      .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .manager(instanceGroupManagerScheduledActionByManagerManagerModel)
      .build();
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModel.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModel.manager(), instanceGroupManagerScheduledActionByManagerManagerModel);

    String json = TestUtilities.serialize(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModel);

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.class);
    assertTrue(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModelNew instanceof InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager);
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModelNew.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerModelNew.manager().toString(), instanceGroupManagerScheduledActionByManagerManagerModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManagerError() throws Throwable {
    new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.Builder().build();
  }

}