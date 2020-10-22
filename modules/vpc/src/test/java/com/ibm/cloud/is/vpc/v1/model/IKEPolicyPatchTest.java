/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.IKEPolicyPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IKEPolicyPatch model.
 */
public class IKEPolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIKEPolicyPatch() throws Throwable {
    IKEPolicyPatch ikePolicyPatchModel = new IKEPolicyPatch.Builder()
      .name("my-ike-policy")
      .authenticationAlgorithm("md5")
      .dhGroup(Long.valueOf("2"))
      .encryptionAlgorithm("triple_des")
      .ikeVersion(Long.valueOf("1"))
      .keyLifetime(Long.valueOf("28800"))
      .build();
    assertEquals(ikePolicyPatchModel.name(), "my-ike-policy");
    assertEquals(ikePolicyPatchModel.authenticationAlgorithm(), "md5");
    assertEquals(ikePolicyPatchModel.dhGroup(), Long.valueOf("2"));
    assertEquals(ikePolicyPatchModel.encryptionAlgorithm(), "triple_des");
    assertEquals(ikePolicyPatchModel.ikeVersion(), Long.valueOf("1"));
    assertEquals(ikePolicyPatchModel.keyLifetime(), Long.valueOf("28800"));

    String json = TestUtilities.serialize(ikePolicyPatchModel);

    IKEPolicyPatch ikePolicyPatchModelNew = TestUtilities.deserialize(json, IKEPolicyPatch.class);
    assertTrue(ikePolicyPatchModelNew instanceof IKEPolicyPatch);
    assertEquals(ikePolicyPatchModelNew.name(), "my-ike-policy");
    assertEquals(ikePolicyPatchModelNew.authenticationAlgorithm(), "md5");
    assertEquals(ikePolicyPatchModelNew.dhGroup(), Long.valueOf("2"));
    assertEquals(ikePolicyPatchModelNew.encryptionAlgorithm(), "triple_des");
    assertEquals(ikePolicyPatchModelNew.ikeVersion(), Long.valueOf("1"));
    assertEquals(ikePolicyPatchModelNew.keyLifetime(), Long.valueOf("28800"));
  }
  @Test
  public void testIKEPolicyPatchAsPatch() throws Throwable {
    IKEPolicyPatch ikePolicyPatchModel = new IKEPolicyPatch.Builder()
      .name("my-ike-policy")
      .authenticationAlgorithm("md5")
      .dhGroup(Long.valueOf("2"))
      .encryptionAlgorithm("triple_des")
      .ikeVersion(Long.valueOf("1"))
      .keyLifetime(Long.valueOf("28800"))
      .build();

    Map<String, Object> mergePatch = ikePolicyPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-ike-policy");
    assertEquals(mergePatch.get("authentication_algorithm"), "md5");
    assertTrue(mergePatch.containsKey("dh_group"));
    assertEquals(mergePatch.get("encryption_algorithm"), "triple_des");
    assertTrue(mergePatch.containsKey("ike_version"));
    assertTrue(mergePatch.containsKey("key_lifetime"));
  }

}