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

import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TrustedProfileIdentityByCRN model.
 */
public class TrustedProfileIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTrustedProfileIdentityByCRN() throws Throwable {
    TrustedProfileIdentityByCRN trustedProfileIdentityByCrnModel = new TrustedProfileIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:iam-identity::a/aa2432b1fa4d4ace891e9b80fc104e34::profile:Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();
    assertEquals(trustedProfileIdentityByCrnModel.crn(), "crn:v1:bluemix:public:iam-identity::a/aa2432b1fa4d4ace891e9b80fc104e34::profile:Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");

    String json = TestUtilities.serialize(trustedProfileIdentityByCrnModel);

    TrustedProfileIdentityByCRN trustedProfileIdentityByCrnModelNew = TestUtilities.deserialize(json, TrustedProfileIdentityByCRN.class);
    assertTrue(trustedProfileIdentityByCrnModelNew instanceof TrustedProfileIdentityByCRN);
    assertEquals(trustedProfileIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:iam-identity::a/aa2432b1fa4d4ace891e9b80fc104e34::profile:Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTrustedProfileIdentityByCRNError() throws Throwable {
    new TrustedProfileIdentityByCRN.Builder().build();
  }

}