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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP model.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP() throws Throwable {
    NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePrototypeModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP.Builder()
      .action("allow")
      .before(networkAclRuleBeforePrototypeModel)
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
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.before(), networkAclRuleBeforePrototypeModel);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel.sourcePortMin(), Long.valueOf("49152"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.before().toString(), networkAclRuleBeforePrototypeModel.toString());
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.protocol(), "udp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolTcpudpModelNew.sourcePortMin(), Long.valueOf("49152"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP.Builder().build();
  }

}