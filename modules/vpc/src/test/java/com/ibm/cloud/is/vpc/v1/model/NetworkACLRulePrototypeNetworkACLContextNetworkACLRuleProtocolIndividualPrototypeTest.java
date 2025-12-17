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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .ipVersion("ipv4")
      .name("my-network-acl-rule")
      .source("192.168.3.2/32")
      .protocol("ah")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel.protocol(), "ah");

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIndividualPrototypeModelNew.protocol(), "ah");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolIndividualPrototype.Builder().build();
  }

}