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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .protocol("all")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel.protocol(), "all");

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototypeModelNew.protocol(), "all");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype.Builder().build();
  }

}