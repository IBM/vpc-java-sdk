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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager model.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager() throws Throwable {
    InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById instanceGroupManagerScheduledActionManagerPrototypeModel = new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .id("r006-bd21f31f-8a05-4451-836d-ab0347e91fea")
      .build();
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeModel.id(), "r006-bd21f31f-8a05-4451-836d-ab0347e91fea");

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.Builder()
      .name("my-instance-group-manager-action")
      .manager(instanceGroupManagerScheduledActionManagerPrototypeModel)
      .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModel.manager(), instanceGroupManagerScheduledActionManagerPrototypeModel);
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModel.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModel);

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.class);
    assertTrue(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModelNew instanceof InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager);
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModelNew.manager().toString(), instanceGroupManagerScheduledActionManagerPrototypeModel.toString());
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerModelNew.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManagerError() throws Throwable {
    new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.Builder().build();
  }

}