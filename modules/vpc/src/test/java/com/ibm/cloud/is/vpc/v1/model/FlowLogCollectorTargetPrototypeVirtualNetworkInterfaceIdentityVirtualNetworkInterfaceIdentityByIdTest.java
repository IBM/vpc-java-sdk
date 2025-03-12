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

import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById model.
 */
public class FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById() throws Throwable {
    FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdModel = new FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById.Builder()
      .id("0717-54eb57ee-86f2-4796-90bb-d7874e0831ef")
      .build();
    assertEquals(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdModel.id(), "0717-54eb57ee-86f2-4796-90bb-d7874e0831ef");

    String json = TestUtilities.serialize(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdModel);

    FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdModelNew = TestUtilities.deserialize(json, FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById.class);
    assertTrue(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdModelNew instanceof FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById);
    assertEquals(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdModelNew.id(), "0717-54eb57ee-86f2-4796-90bb-d7874e0831ef");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByIdError() throws Throwable {
    new FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityById.Builder().build();
  }

}