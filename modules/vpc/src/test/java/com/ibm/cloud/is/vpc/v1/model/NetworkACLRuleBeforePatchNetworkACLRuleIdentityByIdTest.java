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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatchNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRuleBeforePatchNetworkACLRuleIdentityById model.
 */
public class NetworkACLRuleBeforePatchNetworkACLRuleIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRuleBeforePatchNetworkACLRuleIdentityById() throws Throwable {
    NetworkACLRuleBeforePatchNetworkACLRuleIdentityById networkAclRuleBeforePatchNetworkAclRuleIdentityByIdModel = new NetworkACLRuleBeforePatchNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePatchNetworkAclRuleIdentityByIdModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    String json = TestUtilities.serialize(networkAclRuleBeforePatchNetworkAclRuleIdentityByIdModel);

    NetworkACLRuleBeforePatchNetworkACLRuleIdentityById networkAclRuleBeforePatchNetworkAclRuleIdentityByIdModelNew = TestUtilities.deserialize(json, NetworkACLRuleBeforePatchNetworkACLRuleIdentityById.class);
    assertTrue(networkAclRuleBeforePatchNetworkAclRuleIdentityByIdModelNew instanceof NetworkACLRuleBeforePatchNetworkACLRuleIdentityById);
    assertEquals(networkAclRuleBeforePatchNetworkAclRuleIdentityByIdModelNew.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRuleBeforePatchNetworkACLRuleIdentityByIdError() throws Throwable {
    new NetworkACLRuleBeforePatchNetworkACLRuleIdentityById.Builder().build();
  }

}