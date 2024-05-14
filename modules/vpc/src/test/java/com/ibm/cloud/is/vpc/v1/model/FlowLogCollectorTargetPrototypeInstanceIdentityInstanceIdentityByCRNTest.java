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

import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN model.
 */
public class FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN() throws Throwable {
    FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCrnModel = new FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::instance:0717_1e09281b-f177-46f2-b1f1-bc152b2e391a")
      .build();
    assertEquals(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::instance:0717_1e09281b-f177-46f2-b1f1-bc152b2e391a");

    String json = TestUtilities.serialize(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCrnModel);

    FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCrnModelNew = TestUtilities.deserialize(json, FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN.class);
    assertTrue(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCrnModelNew instanceof FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN);
    assertEquals(flowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::instance:0717_1e09281b-f177-46f2-b1f1-bc152b2e391a");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRNError() throws Throwable {
    new FlowLogCollectorTargetPrototypeInstanceIdentityInstanceIdentityByCRN.Builder().build();
  }

}