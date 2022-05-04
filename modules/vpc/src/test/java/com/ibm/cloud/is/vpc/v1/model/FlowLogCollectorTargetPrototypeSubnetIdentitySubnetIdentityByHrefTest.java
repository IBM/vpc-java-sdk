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

import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref model.
 */
public class FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref() throws Throwable {
    FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefModel = new FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    String json = TestUtilities.serialize(flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefModel);

    FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefModelNew = TestUtilities.deserialize(json, FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref.class);
    assertTrue(flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefModelNew instanceof FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref);
    assertEquals(flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/subnets/7ec86020-1c6e-4889-b3f0-a15f2e50f87e");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHrefError() throws Throwable {
    new FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByHref.Builder().build();
  }

}