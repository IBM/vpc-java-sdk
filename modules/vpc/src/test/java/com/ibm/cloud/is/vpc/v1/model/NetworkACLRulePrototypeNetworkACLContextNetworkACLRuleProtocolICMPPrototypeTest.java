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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .code(Long.valueOf("0"))
      .protocol("icmp")
      .type(Long.valueOf("8"))
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpPrototypeModelNew.type(), Long.valueOf("8"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPPrototype.Builder().build();
  }

}