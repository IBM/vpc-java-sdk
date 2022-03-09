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
    NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePrototypeModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.Builder()
      .action("allow")
      .before(networkAclRuleBeforePrototypeModel)
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .code(Long.valueOf("0"))
      .protocol("icmp")
      .type(Long.valueOf("8"))
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.before(), networkAclRuleBeforePrototypeModel);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolICMP);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.before().toString(), networkAclRuleBeforePrototypeModel.toString());
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpModelNew.type(), Long.valueOf("8"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolICMPError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.Builder().build();
  }

}