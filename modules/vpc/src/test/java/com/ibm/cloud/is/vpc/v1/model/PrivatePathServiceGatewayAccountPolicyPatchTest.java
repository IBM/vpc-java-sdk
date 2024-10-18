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

import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayAccountPolicyPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivatePathServiceGatewayAccountPolicyPatch model.
 */
public class PrivatePathServiceGatewayAccountPolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivatePathServiceGatewayAccountPolicyPatch() throws Throwable {
    PrivatePathServiceGatewayAccountPolicyPatch privatePathServiceGatewayAccountPolicyPatchModel = new PrivatePathServiceGatewayAccountPolicyPatch.Builder()
      .accessPolicy("deny")
      .build();
    assertEquals(privatePathServiceGatewayAccountPolicyPatchModel.accessPolicy(), "deny");

    String json = TestUtilities.serialize(privatePathServiceGatewayAccountPolicyPatchModel);

    PrivatePathServiceGatewayAccountPolicyPatch privatePathServiceGatewayAccountPolicyPatchModelNew = TestUtilities.deserialize(json, PrivatePathServiceGatewayAccountPolicyPatch.class);
    assertTrue(privatePathServiceGatewayAccountPolicyPatchModelNew instanceof PrivatePathServiceGatewayAccountPolicyPatch);
    assertEquals(privatePathServiceGatewayAccountPolicyPatchModelNew.accessPolicy(), "deny");
  }
  @Test
  public void testPrivatePathServiceGatewayAccountPolicyPatchAsPatch() throws Throwable {
    PrivatePathServiceGatewayAccountPolicyPatch privatePathServiceGatewayAccountPolicyPatchModel = new PrivatePathServiceGatewayAccountPolicyPatch.Builder()
      .accessPolicy("deny")
      .build();

    Map<String, Object> mergePatch = privatePathServiceGatewayAccountPolicyPatchModel.asPatch();

    assertEquals(mergePatch.get("access_policy"), "deny");
  }

}