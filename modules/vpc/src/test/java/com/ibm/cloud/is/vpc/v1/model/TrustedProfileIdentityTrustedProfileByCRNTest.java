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

import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TrustedProfileIdentityTrustedProfileByCRN model.
 */
public class TrustedProfileIdentityTrustedProfileByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTrustedProfileIdentityTrustedProfileByCRN() throws Throwable {
    TrustedProfileIdentityTrustedProfileByCRN trustedProfileIdentityTrustedProfileByCrnModel = new TrustedProfileIdentityTrustedProfileByCRN.Builder()
      .crn("crn:v1:bluemix:public:iam-identity::a/123456::profile:Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();
    assertEquals(trustedProfileIdentityTrustedProfileByCrnModel.crn(), "crn:v1:bluemix:public:iam-identity::a/123456::profile:Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");

    String json = TestUtilities.serialize(trustedProfileIdentityTrustedProfileByCrnModel);

    TrustedProfileIdentityTrustedProfileByCRN trustedProfileIdentityTrustedProfileByCrnModelNew = TestUtilities.deserialize(json, TrustedProfileIdentityTrustedProfileByCRN.class);
    assertTrue(trustedProfileIdentityTrustedProfileByCrnModelNew instanceof TrustedProfileIdentityTrustedProfileByCRN);
    assertEquals(trustedProfileIdentityTrustedProfileByCrnModelNew.crn(), "crn:v1:bluemix:public:iam-identity::a/123456::profile:Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTrustedProfileIdentityTrustedProfileByCRNError() throws Throwable {
    new TrustedProfileIdentityTrustedProfileByCRN.Builder().build();
  }

}