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

import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSecurityGroupRuleOptions model.
 */
public class CreateSecurityGroupRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSecurityGroupRuleOptions() throws Throwable {
    SecurityGroupRulePrototypeRemoteIP securityGroupRulePrototypeRemoteModel = new SecurityGroupRulePrototypeRemoteIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRulePrototypeRemoteModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("icmp")
      .remote(securityGroupRulePrototypeRemoteModel)
      .code(Long.valueOf("0"))
      .type(Long.valueOf("8"))
      .build();
    assertEquals(securityGroupRulePrototypeModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeModel.protocol(), "icmp");
    assertEquals(securityGroupRulePrototypeModel.remote(), securityGroupRulePrototypeRemoteModel);
    assertEquals(securityGroupRulePrototypeModel.code(), Long.valueOf("0"));
    assertEquals(securityGroupRulePrototypeModel.type(), Long.valueOf("8"));

    CreateSecurityGroupRuleOptions createSecurityGroupRuleOptionsModel = new CreateSecurityGroupRuleOptions.Builder()
      .securityGroupId("testString")
      .securityGroupRulePrototype(securityGroupRulePrototypeModel)
      .build();
    assertEquals(createSecurityGroupRuleOptionsModel.securityGroupId(), "testString");
    assertEquals(createSecurityGroupRuleOptionsModel.securityGroupRulePrototype(), securityGroupRulePrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSecurityGroupRuleOptionsError() throws Throwable {
    new CreateSecurityGroupRuleOptions.Builder().build();
  }

}