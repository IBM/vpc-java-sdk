/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP model.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolICMPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolICMP() throws Throwable {
    NetworkACLRuleIdentityById networkAclRuleIdentityModel = new NetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleIdentityModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.Builder()
      .name("my-rule-2")
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .source("192.168.3.2/32")
      .protocol("icmp")
      .before(networkAclRuleIdentityModel)
      .code(Long.valueOf("0"))
      .type(Long.valueOf("8"))
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.before(), networkAclRuleIdentityModel);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolICMP);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.before().toString(), networkAclRuleIdentityModel.toString());
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.type(), Long.valueOf("8"));
  }
}