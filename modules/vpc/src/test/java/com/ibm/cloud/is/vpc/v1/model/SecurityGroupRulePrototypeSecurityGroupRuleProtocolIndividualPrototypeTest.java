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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype model.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype() throws Throwable {
    SecurityGroupRuleLocalPrototypeIP securityGroupRuleLocalPrototypeModel = new SecurityGroupRuleLocalPrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleLocalPrototypeModel.address(), "192.168.3.4");

    SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .local(securityGroupRuleLocalPrototypeModel)
      .name("my-rule-1")
      .remote(securityGroupRuleRemotePrototypeModel)
      .protocol("ah")
      .build();
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel.local(), securityGroupRuleLocalPrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel.name(), "my-rule-1");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel.remote(), securityGroupRuleRemotePrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel.protocol(), "ah");

    String json = TestUtilities.serialize(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModel);

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew = TestUtilities.deserialize(json, SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype.class);
    assertTrue(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew instanceof SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew.local().toString(), securityGroupRuleLocalPrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew.name(), "my-rule-1");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew.remote().toString(), securityGroupRuleRemotePrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeModelNew.protocol(), "ah");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototypeError() throws Throwable {
    new SecurityGroupRulePrototypeSecurityGroupRuleProtocolIndividualPrototype.Builder().build();
  }

}