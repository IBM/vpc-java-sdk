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

import com.ibm.cloud.is.vpc.v1.model.KeyIdentityByFingerprint;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KeyIdentityByFingerprint model.
 */
public class KeyIdentityByFingerprintTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKeyIdentityByFingerprint() throws Throwable {
    KeyIdentityByFingerprint keyIdentityByFingerprintModel = new KeyIdentityByFingerprint.Builder()
      .fingerprint("SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY")
      .build();
    assertEquals(keyIdentityByFingerprintModel.fingerprint(), "SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY");

    String json = TestUtilities.serialize(keyIdentityByFingerprintModel);

    KeyIdentityByFingerprint keyIdentityByFingerprintModelNew = TestUtilities.deserialize(json, KeyIdentityByFingerprint.class);
    assertTrue(keyIdentityByFingerprintModelNew instanceof KeyIdentityByFingerprint);
    assertEquals(keyIdentityByFingerprintModelNew.fingerprint(), "SHA256:yxavE4CIOL2NlsqcurRO3xGjkP6m/0mp8ugojH5yxlY");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testKeyIdentityByFingerprintError() throws Throwable {
    new KeyIdentityByFingerprint.Builder().build();
  }

}