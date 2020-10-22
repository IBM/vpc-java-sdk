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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRuleIdentityById model.
 */
public class NetworkACLRuleIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRuleIdentityById() throws Throwable {
    NetworkACLRuleIdentityById networkAclRuleIdentityByIdModel = new NetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleIdentityByIdModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    String json = TestUtilities.serialize(networkAclRuleIdentityByIdModel);

    NetworkACLRuleIdentityById networkAclRuleIdentityByIdModelNew = TestUtilities.deserialize(json, NetworkACLRuleIdentityById.class);
    assertTrue(networkAclRuleIdentityByIdModelNew instanceof NetworkACLRuleIdentityById);
    assertEquals(networkAclRuleIdentityByIdModelNew.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRuleIdentityByIdError() throws Throwable {
    new NetworkACLRuleIdentityById.Builder().build();
  }

}