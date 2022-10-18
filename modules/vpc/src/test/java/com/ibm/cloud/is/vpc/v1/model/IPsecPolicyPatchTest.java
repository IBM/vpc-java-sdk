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

import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IPsecPolicyPatch model.
 */
public class IPsecPolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIPsecPolicyPatch() throws Throwable {
    IPsecPolicyPatch iPsecPolicyPatchModel = new IPsecPolicyPatch.Builder()
      .authenticationAlgorithm("disabled")
      .encryptionAlgorithm("aes128")
      .keyLifetime(Long.valueOf("3600"))
      .name("my-ipsec-policy")
      .pfs("disabled")
      .build();
    assertEquals(iPsecPolicyPatchModel.authenticationAlgorithm(), "disabled");
    assertEquals(iPsecPolicyPatchModel.encryptionAlgorithm(), "aes128");
    assertEquals(iPsecPolicyPatchModel.keyLifetime(), Long.valueOf("3600"));
    assertEquals(iPsecPolicyPatchModel.name(), "my-ipsec-policy");
    assertEquals(iPsecPolicyPatchModel.pfs(), "disabled");

    String json = TestUtilities.serialize(iPsecPolicyPatchModel);

    IPsecPolicyPatch iPsecPolicyPatchModelNew = TestUtilities.deserialize(json, IPsecPolicyPatch.class);
    assertTrue(iPsecPolicyPatchModelNew instanceof IPsecPolicyPatch);
    assertEquals(iPsecPolicyPatchModelNew.authenticationAlgorithm(), "disabled");
    assertEquals(iPsecPolicyPatchModelNew.encryptionAlgorithm(), "aes128");
    assertEquals(iPsecPolicyPatchModelNew.keyLifetime(), Long.valueOf("3600"));
    assertEquals(iPsecPolicyPatchModelNew.name(), "my-ipsec-policy");
    assertEquals(iPsecPolicyPatchModelNew.pfs(), "disabled");
  }
  @Test
  public void testIPsecPolicyPatchAsPatch() throws Throwable {
    IPsecPolicyPatch iPsecPolicyPatchModel = new IPsecPolicyPatch.Builder()
      .authenticationAlgorithm("disabled")
      .encryptionAlgorithm("aes128")
      .keyLifetime(Long.valueOf("3600"))
      .name("my-ipsec-policy")
      .pfs("disabled")
      .build();

    Map<String, Object> mergePatch = iPsecPolicyPatchModel.asPatch();

    assertEquals(mergePatch.get("authentication_algorithm"), "disabled");
    assertEquals(mergePatch.get("encryption_algorithm"), "aes128");
    assertTrue(mergePatch.containsKey("key_lifetime"));
    assertEquals(mergePatch.get("name"), "my-ipsec-policy");
    assertEquals(mergePatch.get("pfs"), "disabled");
  }

}