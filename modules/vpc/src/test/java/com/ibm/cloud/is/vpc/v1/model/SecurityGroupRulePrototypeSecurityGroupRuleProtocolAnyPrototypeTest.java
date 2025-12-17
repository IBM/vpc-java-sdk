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
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype model.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype() throws Throwable {
    SecurityGroupRuleLocalPrototypeIP securityGroupRuleLocalPrototypeModel = new SecurityGroupRuleLocalPrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleLocalPrototypeModel.address(), "192.168.3.4");

    SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .local(securityGroupRuleLocalPrototypeModel)
      .name("my-rule-1")
      .remote(securityGroupRuleRemotePrototypeModel)
      .protocol("any")
      .build();
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel.local(), securityGroupRuleLocalPrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel.name(), "my-rule-1");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel.remote(), securityGroupRuleRemotePrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel.protocol(), "any");

    String json = TestUtilities.serialize(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModel);

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew = TestUtilities.deserialize(json, SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype.class);
    assertTrue(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew instanceof SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew.local().toString(), securityGroupRuleLocalPrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew.name(), "my-rule-1");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew.remote().toString(), securityGroupRuleRemotePrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeModelNew.protocol(), "any");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototypeError() throws Throwable {
    new SecurityGroupRulePrototypeSecurityGroupRuleProtocolAnyPrototype.Builder().build();
  }

}