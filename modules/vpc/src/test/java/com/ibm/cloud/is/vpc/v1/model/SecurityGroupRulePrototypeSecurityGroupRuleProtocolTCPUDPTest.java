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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleLocalPrototypeIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP model.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP() throws Throwable {
    SecurityGroupRuleLocalPrototypeIP securityGroupRuleLocalPrototypeModel = new SecurityGroupRuleLocalPrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleLocalPrototypeModel.address(), "192.168.3.4");

    SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .local(securityGroupRuleLocalPrototypeModel)
      .portMax(Long.valueOf("22"))
      .portMin(Long.valueOf("22"))
      .protocol("tcp")
      .remote(securityGroupRuleRemotePrototypeModel)
      .build();
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel.local(), securityGroupRuleLocalPrototypeModel);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel.portMax(), Long.valueOf("22"));
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel.portMin(), Long.valueOf("22"));
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel.protocol(), "tcp");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel.remote(), securityGroupRuleRemotePrototypeModel);

    String json = TestUtilities.serialize(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModel);

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew = TestUtilities.deserialize(json, SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP.class);
    assertTrue(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew instanceof SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew.local().toString(), securityGroupRuleLocalPrototypeModel.toString());
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew.portMax(), Long.valueOf("22"));
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew.portMin(), Long.valueOf("22"));
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew.protocol(), "tcp");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudpModelNew.remote().toString(), securityGroupRuleRemotePrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDPError() throws Throwable {
    new SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP.Builder().build();
  }

}