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
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype model.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype() throws Throwable {
    SecurityGroupRuleLocalPrototypeIP securityGroupRuleLocalPrototypeModel = new SecurityGroupRuleLocalPrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleLocalPrototypeModel.address(), "192.168.3.4");

    SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .local(securityGroupRuleLocalPrototypeModel)
      .name("my-rule-1")
      .remote(securityGroupRuleRemotePrototypeModel)
      .protocol("icmp_tcp_udp")
      .build();
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel.local(), securityGroupRuleLocalPrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel.name(), "my-rule-1");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel.remote(), securityGroupRuleRemotePrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel.protocol(), "icmp_tcp_udp");

    String json = TestUtilities.serialize(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModel);

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew = TestUtilities.deserialize(json, SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype.class);
    assertTrue(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew instanceof SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew.local().toString(), securityGroupRuleLocalPrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew.name(), "my-rule-1");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew.remote().toString(), securityGroupRuleRemotePrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolIcmptcpudpPrototypeModelNew.protocol(), "icmp_tcp_udp");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototypeError() throws Throwable {
    new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMPTCPUDPPrototype.Builder().build();
  }

}