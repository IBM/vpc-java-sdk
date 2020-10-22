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
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLRuleProtocolAll model.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolAllTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolAll() throws Throwable {
    NetworkACLRuleIdentityById networkAclRuleIdentityModel = new NetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleIdentityModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclRuleProtocolAllModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolAll.Builder()
      .name("my-rule-2")
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .source("192.168.3.2/32")
      .protocol("all")
      .before(networkAclRuleIdentityModel)
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModel.protocol(), "all");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModel.before(), networkAclRuleIdentityModel);

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolAllModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolAll.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolAll);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew.protocol(), "all");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolAllModelNew.before().toString(), networkAclRuleIdentityModel.toString());
    assertNotNull(networkAclRulePrototypeNetworkAclRuleProtocolAllModel);
  }
}