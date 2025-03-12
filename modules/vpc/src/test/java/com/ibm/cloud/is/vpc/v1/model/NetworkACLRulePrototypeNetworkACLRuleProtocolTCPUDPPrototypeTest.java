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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype() throws Throwable {
    NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
      .id("r006-8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePrototypeModel.id(), "r006-8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype.Builder()
      .action("allow")
      .before(networkAclRuleBeforePrototypeModel)
      .destination("192.168.3.2/32")
      .direction("inbound")
      .ipVersion("ipv4")
      .name("my-network-acl-rule")
      .source("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .protocol("udp")
      .sourcePortMax(Long.valueOf("65535"))
      .sourcePortMin(Long.valueOf("49152"))
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.before(), networkAclRuleBeforePrototypeModel);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel.sourcePortMin(), Long.valueOf("49152"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.before().toString(), networkAclRuleBeforePrototypeModel.toString());
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpPrototypeModelNew.sourcePortMin(), Long.valueOf("49152"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype.Builder().build();
  }

}