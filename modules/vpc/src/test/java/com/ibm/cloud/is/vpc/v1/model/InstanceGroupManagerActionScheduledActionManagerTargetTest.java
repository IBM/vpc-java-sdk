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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionScheduledActionManagerTarget;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerAutoScale;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionScheduledActionManagerTarget model.
 */
public class InstanceGroupManagerActionScheduledActionManagerTargetTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionScheduledActionManagerTarget() throws Throwable {
    InstanceGroupManagerActionScheduledActionManagerTarget instanceGroupManagerActionScheduledActionManagerTargetModel = new InstanceGroupManagerActionScheduledActionManagerTarget();
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.isAutoDelete());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getAutoDeleteTimeout());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getCreatedAt());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getHref());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getId());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getName());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getResourceType());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getStatus());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getUpdatedAt());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getActionType());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getCronSpec());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getLastAppliedAt());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getNextRunAt());
    assertNull(instanceGroupManagerActionScheduledActionManagerTargetModel.getManager());
  }
}