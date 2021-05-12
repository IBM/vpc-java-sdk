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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPatchScheduledActionPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionPatchScheduledActionPatch model.
 */
public class InstanceGroupManagerActionPatchScheduledActionPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPatchScheduledActionPatch() throws Throwable {
    InstanceGroupManagerScheduledActionGroupPatch instanceGroupManagerScheduledActionGroupPatchModel = new InstanceGroupManagerScheduledActionGroupPatch.Builder()
      .membershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerScheduledActionGroupPatchModel.membershipCount(), Long.valueOf("10"));

    InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch instanceGroupManagerScheduledActionByManagerPatchManagerModel = new InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerScheduledActionByManagerPatchManagerModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionByManagerPatchManagerModel.minMembershipCount(), Long.valueOf("10"));

    InstanceGroupManagerActionPatchScheduledActionPatch instanceGroupManagerActionPatchScheduledActionPatchModel = new InstanceGroupManagerActionPatchScheduledActionPatch.Builder()
      .name("my-instance-group-manager-action")
      .cronSpec("*/5 1,2,3 * * *")
      .group(instanceGroupManagerScheduledActionGroupPatchModel)
      .manager(instanceGroupManagerScheduledActionByManagerPatchManagerModel)
      .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModel.cronSpec(), "*/5 1,2,3 * * *");
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModel.group(), instanceGroupManagerScheduledActionGroupPatchModel);
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModel.manager(), instanceGroupManagerScheduledActionByManagerPatchManagerModel);
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModel.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(instanceGroupManagerActionPatchScheduledActionPatchModel);

    InstanceGroupManagerActionPatchScheduledActionPatch instanceGroupManagerActionPatchScheduledActionPatchModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPatchScheduledActionPatch.class);
    assertTrue(instanceGroupManagerActionPatchScheduledActionPatchModelNew instanceof InstanceGroupManagerActionPatchScheduledActionPatch);
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModelNew.cronSpec(), "*/5 1,2,3 * * *");
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModelNew.group().toString(), instanceGroupManagerScheduledActionGroupPatchModel.toString());
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModelNew.manager().toString(), instanceGroupManagerScheduledActionByManagerPatchManagerModel.toString());
    assertEquals(instanceGroupManagerActionPatchScheduledActionPatchModelNew.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}