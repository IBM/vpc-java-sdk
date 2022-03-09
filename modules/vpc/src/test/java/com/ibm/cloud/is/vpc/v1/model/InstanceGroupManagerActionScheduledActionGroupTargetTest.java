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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledActionGroupTarget;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroup;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionScheduledActionGroupTarget model.
 */
public class InstanceGroupManagerActionScheduledActionGroupTargetTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionScheduledActionGroupTarget() throws Throwable {
    InstanceGroupManagerActionScheduledActionGroupTarget instanceGroupManagerActionScheduledActionGroupTargetModel = new InstanceGroupManagerActionScheduledActionGroupTarget();
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.isAutoDelete());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getAutoDeleteTimeout());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getCreatedAt());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getHref());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getId());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getName());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getResourceType());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getStatus());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getUpdatedAt());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getActionType());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getCronSpec());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getLastAppliedAt());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getNextRunAt());
    assertNull(instanceGroupManagerActionScheduledActionGroupTargetModel.getGroup());
  }
}