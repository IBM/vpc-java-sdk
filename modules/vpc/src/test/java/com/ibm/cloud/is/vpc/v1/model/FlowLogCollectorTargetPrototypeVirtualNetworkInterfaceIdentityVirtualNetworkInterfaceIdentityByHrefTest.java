/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref model.
 */
public class FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref() throws Throwable {
    FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefModel = new FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/virtual_network_interfaces/0767-fa41aecb-4f21-423d-8082-630bfba1e1d9")
      .build();
    assertEquals(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/virtual_network_interfaces/0767-fa41aecb-4f21-423d-8082-630bfba1e1d9");

    String json = TestUtilities.serialize(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefModel);

    FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefModelNew = TestUtilities.deserialize(json, FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref.class);
    assertTrue(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefModelNew instanceof FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref);
    assertEquals(flowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/virtual_network_interfaces/0767-fa41aecb-4f21-423d-8082-630bfba1e1d9");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHrefError() throws Throwable {
    new FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByHref.Builder().build();
  }

}