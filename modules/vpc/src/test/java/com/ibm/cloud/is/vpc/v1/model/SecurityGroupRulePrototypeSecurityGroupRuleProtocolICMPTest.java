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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP model.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP() throws Throwable {
    SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
      .code(Long.valueOf("0"))
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("icmp")
      .remote(securityGroupRuleRemotePrototypeModel)
      .type(Long.valueOf("8"))
      .build();
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel.code(), Long.valueOf("0"));
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel.protocol(), "icmp");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel.remote(), securityGroupRuleRemotePrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModel);

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew = TestUtilities.deserialize(json, SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.class);
    assertTrue(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew instanceof SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew.code(), Long.valueOf("0"));
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew.protocol(), "icmp");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew.remote().toString(), securityGroupRuleRemotePrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmpModelNew.type(), Long.valueOf("8"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPError() throws Throwable {
    new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder().build();
  }

}