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
 * Unit test class for the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup model.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup() throws Throwable {
    InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototypeModel = new InstanceGroupManagerScheduledActionGroupPrototype.Builder()
      .membershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerScheduledActionGroupPrototypeModel.membershipCount(), Long.valueOf("10"));

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup.Builder()
      .name("my-instance-group-manager-action")
      .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .group(instanceGroupManagerScheduledActionGroupPrototypeModel)
      .build();
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModel.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModel.group(), instanceGroupManagerScheduledActionGroupPrototypeModel);

    String json = TestUtilities.serialize(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModel);

    InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup.class);
    assertTrue(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModelNew instanceof InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup);
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModelNew.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupModelNew.group().toString(), instanceGroupManagerScheduledActionGroupPrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroupError() throws Throwable {
    new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByGroup.Builder().build();
  }

}