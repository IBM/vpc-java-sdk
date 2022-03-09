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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .protocol("udp")
      .sourcePortMax(Long.valueOf("65535"))
      .sourcePortMin(Long.valueOf("49152"))
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel.sourcePortMin(), Long.valueOf("49152"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpModelNew.sourcePortMin(), Long.valueOf("49152"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDP.Builder().build();
  }

}