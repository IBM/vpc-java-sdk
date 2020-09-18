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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
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
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("cf7cd5a-2f30-4336-a495-6addc820cd61")
      .build();
    assertEquals(vpcIdentityModel.id(), "cf7cd5a-2f30-4336-a495-6addc820cd61");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclContextModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll.Builder()
      .name("my-rule-2")
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .source("192.168.3.2/32")
      .protocol("all")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.protocol(), "all");

    NetworkACLPrototypeNetworkACLByRules networkAclPrototypeNetworkAclByRulesModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
      .name("my-network-acl")
      .vpc(vpcIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .rules(new java.util.ArrayList<NetworkACLRulePrototypeNetworkACLContext>(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel)))
      .build();
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.name(), "my-network-acl");
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.vpc(), vpcIdentityModel);
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(networkAclPrototypeNetworkAclByRulesModel.rules(), new java.util.ArrayList<NetworkACLRulePrototypeNetworkACLContext>(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel)));

    String json = TestUtilities.serialize(networkAclPrototypeNetworkAclByRulesModel);

    NetworkACLPrototypeNetworkACLByRules networkAclPrototypeNetworkAclByRulesModelNew = TestUtilities.deserialize(json, NetworkACLPrototypeNetworkACLByRules.class);
    assertTrue(networkAclPrototypeNetworkAclByRulesModelNew instanceof NetworkACLPrototypeNetworkACLByRules);
    assertEquals(networkAclPrototypeNetworkAclByRulesModelNew.name(), "my-network-acl");
    assertEquals(networkAclPrototypeNetworkAclByRulesModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(networkAclPrototypeNetworkAclByRulesModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLPrototypeNetworkACLByRulesError() throws Throwable {
    new NetworkACLPrototypeNetworkACLByRules.Builder().build();
  }

}