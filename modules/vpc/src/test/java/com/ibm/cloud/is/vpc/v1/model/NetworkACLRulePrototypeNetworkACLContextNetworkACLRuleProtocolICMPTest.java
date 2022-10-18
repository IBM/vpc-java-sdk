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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .code(Long.valueOf("0"))
      .protocol("icmp")
      .type(Long.valueOf("8"))
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmpModelNew.type(), Long.valueOf("8"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMP.Builder().build();
  }

}