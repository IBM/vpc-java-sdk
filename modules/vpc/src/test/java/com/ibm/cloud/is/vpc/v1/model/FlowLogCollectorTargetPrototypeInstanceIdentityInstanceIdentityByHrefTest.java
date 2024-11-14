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

import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref model.
 */
public class FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref() throws Throwable {
    FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefModel = new FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/instances/0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
      .build();
    assertEquals(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/instances/0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0");

    String json = TestUtilities.serialize(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefModel);

    FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefModelNew = TestUtilities.deserialize(json, FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref.class);
    assertTrue(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefModelNew instanceof FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref);
    assertEquals(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/instances/0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHrefError() throws Throwable {
    new FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByHref.Builder().build();
  }

}