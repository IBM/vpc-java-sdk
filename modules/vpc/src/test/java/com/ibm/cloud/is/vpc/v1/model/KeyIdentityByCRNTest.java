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

import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KeyIdentityByCRN model.
 */
public class KeyIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKeyIdentityByCRN() throws Throwable {
    KeyIdentityByCRN keyIdentityByCrnModel = new KeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(keyIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803");

    String json = TestUtilities.serialize(keyIdentityByCrnModel);

    KeyIdentityByCRN keyIdentityByCrnModelNew = TestUtilities.deserialize(json, KeyIdentityByCRN.class);
    assertTrue(keyIdentityByCrnModelNew instanceof KeyIdentityByCRN);
    assertEquals(keyIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south:a/123456::key:a6b1a881-2ce8-41a3-80fc-36316a73f803");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testKeyIdentityByCRNError() throws Throwable {
    new KeyIdentityByCRN.Builder().build();
  }

}