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

import com.ibm.cloud.is.vpc.v1.model.CreateIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateIpsecPolicyOptions model.
 */
public class CreateIpsecPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateIpsecPolicyOptions() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreateIpsecPolicyOptions createIpsecPolicyOptionsModel = new CreateIpsecPolicyOptions.Builder()
      .authenticationAlgorithm("disabled")
      .encryptionAlgorithm("aes128")
      .pfs("disabled")
      .keyLifetime(Long.valueOf("3600"))
      .name("my-ipsec-policy")
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(createIpsecPolicyOptionsModel.authenticationAlgorithm(), "disabled");
    assertEquals(createIpsecPolicyOptionsModel.encryptionAlgorithm(), "aes128");
    assertEquals(createIpsecPolicyOptionsModel.pfs(), "disabled");
    assertEquals(createIpsecPolicyOptionsModel.keyLifetime(), Long.valueOf("3600"));
    assertEquals(createIpsecPolicyOptionsModel.name(), "my-ipsec-policy");
    assertEquals(createIpsecPolicyOptionsModel.resourceGroup(), resourceGroupIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateIpsecPolicyOptionsError() throws Throwable {
    new CreateIpsecPolicyOptions.Builder().build();
  }

}