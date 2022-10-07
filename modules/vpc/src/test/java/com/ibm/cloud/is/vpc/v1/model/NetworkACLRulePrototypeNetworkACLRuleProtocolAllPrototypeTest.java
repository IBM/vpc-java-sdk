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
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype() throws Throwable {
    NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePrototypeModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype.Builder()
      .action("allow")
      .before(networkAclRuleBeforePrototypeModel)
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .protocol("all")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel.before(), networkAclRuleBeforePrototypeModel);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel.protocol(), "all");

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew.before().toString(), networkAclRuleBeforePrototypeModel.toString());
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllPrototypeModelNew.protocol(), "all");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype.Builder().build();
  }

}