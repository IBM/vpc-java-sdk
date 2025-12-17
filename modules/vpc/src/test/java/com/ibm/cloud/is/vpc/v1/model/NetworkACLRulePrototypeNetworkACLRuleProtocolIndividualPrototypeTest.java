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
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype() throws Throwable {
    NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
      .id("r006-8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePrototypeModel.id(), "r006-8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype.Builder()
      .action("allow")
      .before(networkAclRuleBeforePrototypeModel)
      .destination("192.168.3.2/32")
      .direction("inbound")
      .ipVersion("ipv4")
      .name("my-network-acl-rule")
      .source("192.168.3.2/32")
      .protocol("ah")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.before(), networkAclRuleBeforePrototypeModel);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel.protocol(), "ah");

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.before().toString(), networkAclRuleBeforePrototypeModel.toString());
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIndividualPrototypeModelNew.protocol(), "ah");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLRuleProtocolIndividualPrototype.Builder().build();
  }

}