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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype model.
 */
public class SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype() throws Throwable {
    SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype securityGroupRuleRemotePrototypeSecurityGroupRuleCidrPrototypeModel = new SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype.Builder()
      .cidrBlock("testString")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeSecurityGroupRuleCidrPrototypeModel.cidrBlock(), "testString");

    String json = TestUtilities.serialize(securityGroupRuleRemotePrototypeSecurityGroupRuleCidrPrototypeModel);

    SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype securityGroupRuleRemotePrototypeSecurityGroupRuleCidrPrototypeModelNew = TestUtilities.deserialize(json, SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype.class);
    assertTrue(securityGroupRuleRemotePrototypeSecurityGroupRuleCidrPrototypeModelNew instanceof SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype);
    assertEquals(securityGroupRuleRemotePrototypeSecurityGroupRuleCidrPrototypeModelNew.cidrBlock(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototypeError() throws Throwable {
    new SecurityGroupRuleRemotePrototypeSecurityGroupRuleCIDRPrototype.Builder().build();
  }

}