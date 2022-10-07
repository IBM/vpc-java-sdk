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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype.Builder()
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
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel.sourcePortMin(), Long.valueOf("49152"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototypeModelNew.sourcePortMin(), Long.valueOf("49152"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype.Builder().build();
  }

}