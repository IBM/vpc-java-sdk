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

import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
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
 * Unit test class for the CreateSecurityGroupOptions model.
 */
public class CreateSecurityGroupOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSecurityGroupOptions() throws Throwable {
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
      .code(Long.valueOf("0"))
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("icmp")
      .remote(securityGroupRuleRemotePrototypeModel)
      .type(Long.valueOf("8"))
      .build();
    assertEquals(securityGroupRulePrototypeModel.code(), Long.valueOf("0"));
    assertEquals(securityGroupRulePrototypeModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeModel.protocol(), "icmp");
    assertEquals(securityGroupRulePrototypeModel.remote(), securityGroupRuleRemotePrototypeModel);
    assertEquals(securityGroupRulePrototypeModel.type(), Long.valueOf("8"));

    CreateSecurityGroupOptions createSecurityGroupOptionsModel = new CreateSecurityGroupOptions.Builder()
      .vpc(vpcIdentityModel)
      .name("my-security-group")
      .resourceGroup(resourceGroupIdentityModel)
      .rules(new java.util.ArrayList<SecurityGroupRulePrototype>(java.util.Arrays.asList(securityGroupRulePrototypeModel)))
      .build();
    assertEquals(createSecurityGroupOptionsModel.vpc(), vpcIdentityModel);
    assertEquals(createSecurityGroupOptionsModel.name(), "my-security-group");
    assertEquals(createSecurityGroupOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createSecurityGroupOptionsModel.rules(), new java.util.ArrayList<SecurityGroupRulePrototype>(java.util.Arrays.asList(securityGroupRulePrototypeModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecurityGroupOptionsError() throws Throwable {
    new CreateSecurityGroupOptions.Builder().build();
  }

}