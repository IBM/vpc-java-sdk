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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionManagerPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionPatch model.
 */
public class InstanceGroupManagerActionPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionPatch() throws Throwable {
    InstanceGroupManagerActionGroupPatch instanceGroupManagerActionGroupPatchModel = new InstanceGroupManagerActionGroupPatch.Builder()
      .membershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerActionGroupPatchModel.membershipCount(), Long.valueOf("10"));

    InstanceGroupManagerActionManagerPatch instanceGroupManagerActionManagerPatchModel = new InstanceGroupManagerActionManagerPatch.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerActionManagerPatchModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerActionManagerPatchModel.minMembershipCount(), Long.valueOf("10"));

    InstanceGroupManagerActionPatch instanceGroupManagerActionPatchModel = new InstanceGroupManagerActionPatch.Builder()
      .autoDelete(true)
      .autoDeleteTimeout(Long.valueOf("24"))
      .cronSpec("30 */2 * * 1-5")
      .group(instanceGroupManagerActionGroupPatchModel)
      .manager(instanceGroupManagerActionManagerPatchModel)
      .name("my-instance-group-manager-action")
      .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(instanceGroupManagerActionPatchModel.autoDelete(), Boolean.valueOf(true));
    assertEquals(instanceGroupManagerActionPatchModel.autoDeleteTimeout(), Long.valueOf("24"));
    assertEquals(instanceGroupManagerActionPatchModel.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPatchModel.group(), instanceGroupManagerActionGroupPatchModel);
    assertEquals(instanceGroupManagerActionPatchModel.manager(), instanceGroupManagerActionManagerPatchModel);
    assertEquals(instanceGroupManagerActionPatchModel.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPatchModel.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(instanceGroupManagerActionPatchModel);

    InstanceGroupManagerActionPatch instanceGroupManagerActionPatchModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionPatch.class);
    assertTrue(instanceGroupManagerActionPatchModelNew instanceof InstanceGroupManagerActionPatch);
    assertEquals(instanceGroupManagerActionPatchModelNew.autoDelete(), Boolean.valueOf(true));
    assertEquals(instanceGroupManagerActionPatchModelNew.autoDeleteTimeout(), Long.valueOf("24"));
    assertEquals(instanceGroupManagerActionPatchModelNew.cronSpec(), "30 */2 * * 1-5");
    assertEquals(instanceGroupManagerActionPatchModelNew.group().toString(), instanceGroupManagerActionGroupPatchModel.toString());
    assertEquals(instanceGroupManagerActionPatchModelNew.manager().toString(), instanceGroupManagerActionManagerPatchModel.toString());
    assertEquals(instanceGroupManagerActionPatchModelNew.name(), "my-instance-group-manager-action");
    assertEquals(instanceGroupManagerActionPatchModelNew.runAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
  @Test
  public void testInstanceGroupManagerActionPatchAsPatch() throws Throwable {
    InstanceGroupManagerActionGroupPatch instanceGroupManagerActionGroupPatchModel = new InstanceGroupManagerActionGroupPatch.Builder()
      .membershipCount(Long.valueOf("10"))
      .build();

    InstanceGroupManagerActionManagerPatch instanceGroupManagerActionManagerPatchModel = new InstanceGroupManagerActionManagerPatch.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .build();

    InstanceGroupManagerActionPatch instanceGroupManagerActionPatchModel = new InstanceGroupManagerActionPatch.Builder()
      .autoDelete(true)
      .autoDeleteTimeout(Long.valueOf("24"))
      .cronSpec("30 */2 * * 1-5")
      .group(instanceGroupManagerActionGroupPatchModel)
      .manager(instanceGroupManagerActionManagerPatchModel)
      .name("my-instance-group-manager-action")
      .runAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();

    Map<String, Object> mergePatch = instanceGroupManagerActionPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("auto_delete"));
    assertTrue(mergePatch.containsKey("auto_delete_timeout"));
    assertEquals(mergePatch.get("cron_spec"), "30 */2 * * 1-5");
    assertTrue(mergePatch.containsKey("group"));
    assertTrue(mergePatch.containsKey("manager"));
    assertEquals(mergePatch.get("name"), "my-instance-group-manager-action");
    assertTrue(mergePatch.containsKey("run_at"));
  }

}