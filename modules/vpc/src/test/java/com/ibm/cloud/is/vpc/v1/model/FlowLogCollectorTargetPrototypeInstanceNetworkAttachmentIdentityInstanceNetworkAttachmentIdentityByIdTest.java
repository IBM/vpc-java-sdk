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

import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById model.
 */
public class FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById() throws Throwable {
    FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById flowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdModel = new FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById.Builder()
      .id("0717-d54eb633-98ea-459d-aa00-6a8e780175a7")
      .build();
    assertEquals(flowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdModel.id(), "0717-d54eb633-98ea-459d-aa00-6a8e780175a7");

    String json = TestUtilities.serialize(flowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdModel);

    FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById flowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdModelNew = TestUtilities.deserialize(json, FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById.class);
    assertTrue(flowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdModelNew instanceof FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById);
    assertEquals(flowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdModelNew.id(), "0717-d54eb633-98ea-459d-aa00-6a8e780175a7");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityByIdError() throws Throwable {
    new FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentityInstanceNetworkAttachmentIdentityById.Builder().build();
  }

}