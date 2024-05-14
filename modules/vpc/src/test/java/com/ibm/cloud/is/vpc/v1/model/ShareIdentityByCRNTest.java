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

import com.ibm.cloud.is.vpc.v1.model.ShareIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ShareIdentityByCRN model.
 */
public class ShareIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareIdentityByCRN() throws Throwable {
    ShareIdentityByCRN shareIdentityByCrnModel = new ShareIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::share:0fe9e5d8-0a4d-4818-96ec-e99708644a58")
      .build();
    assertEquals(shareIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::share:0fe9e5d8-0a4d-4818-96ec-e99708644a58");

    String json = TestUtilities.serialize(shareIdentityByCrnModel);

    ShareIdentityByCRN shareIdentityByCrnModelNew = TestUtilities.deserialize(json, ShareIdentityByCRN.class);
    assertTrue(shareIdentityByCrnModelNew instanceof ShareIdentityByCRN);
    assertEquals(shareIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::share:0fe9e5d8-0a4d-4818-96ec-e99708644a58");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testShareIdentityByCRNError() throws Throwable {
    new ShareIdentityByCRN.Builder().build();
  }

}