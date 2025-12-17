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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .ipVersion("ipv4")
      .name("my-network-acl-rule")
      .source("192.168.3.2/32")
      .protocol("icmp_tcp_udp")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel.protocol(), "icmp_tcp_udp");

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototypeModelNew.protocol(), "icmp_tcp_udp");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype.Builder().build();
  }

}