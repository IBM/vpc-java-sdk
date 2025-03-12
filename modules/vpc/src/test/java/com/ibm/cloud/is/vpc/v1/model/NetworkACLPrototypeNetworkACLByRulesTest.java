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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLPrototypeNetworkACLByRules model.
 */
public class NetworkACLPrototypeNetworkACLByRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLPrototypeNetworkACLByRules() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype networkAclRulePrototypeNetworkAclContextModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .ipVersion("ipv4")
      .name("my-network-acl-rule")
      .source("192.168.3.2/32")
      .protocol("all")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.ipVersion(), "ipv4");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.name(), "my-network-acl-rule");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.protocol(), "all");

    NetworkACLPrototypeNetworkACLByRules networkAclPrototypeNetworkAclByRulesModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
      .name("my-network-acl")
      .resourceGroup(resourceGroupIdentityModel)
      .vpc(vpcIdentityModel)
      .rules(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel))
      .build();
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.name(), "my-network-acl");
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.vpc(), vpcIdentityModel);
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.rules(), java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel));

    String json = TestUtilities.serialize(networkAclPrototypeNetworkAclByRulesModel);

    NetworkACLPrototypeNetworkACLByRules networkAclPrototypeNetworkAclByRulesModelNew = TestUtilities.deserialize(json, NetworkACLPrototypeNetworkACLByRules.class);
    assertTrue(networkAclPrototypeNetworkAclByRulesModelNew instanceof NetworkACLPrototypeNetworkACLByRules);
    assertEquals(networkAclPrototypeNetworkAclByRulesModelNew.name(), "my-network-acl");
    assertEquals(networkAclPrototypeNetworkAclByRulesModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(networkAclPrototypeNetworkAclByRulesModelNew.vpc().toString(), vpcIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLPrototypeNetworkACLByRulesError() throws Throwable {
    new NetworkACLPrototypeNetworkACLByRules.Builder().build();
  }

}