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

import com.ibm.cloud.is.vpc.v1.model.VPCIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPCIdentityByCRN model.
 */
public class VPCIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPCIdentityByCRN() throws Throwable {
    VPCIdentityByCRN vpcIdentityByCrnModel = new VPCIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");

    String json = TestUtilities.serialize(vpcIdentityByCrnModel);

    VPCIdentityByCRN vpcIdentityByCrnModelNew = TestUtilities.deserialize(json, VPCIdentityByCRN.class);
    assertTrue(vpcIdentityByCrnModelNew instanceof VPCIdentityByCRN);
    assertEquals(vpcIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPCIdentityByCRNError() throws Throwable {
    new VPCIdentityByCRN.Builder().build();
  }

}