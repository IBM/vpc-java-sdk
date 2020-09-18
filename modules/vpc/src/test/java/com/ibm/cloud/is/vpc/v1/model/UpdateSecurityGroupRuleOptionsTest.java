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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateSecurityGroupRuleOptions model.
 */
public class UpdateSecurityGroupRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateSecurityGroupRuleOptions() throws Throwable {
    SecurityGroupRulePatchRemoteIP securityGroupRulePatchRemoteModel = new SecurityGroupRulePatchRemoteIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRulePatchRemoteModel.address(), "192.168.3.4");

    UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptionsModel = new UpdateSecurityGroupRuleOptions.Builder()
      .securityGroupId("testString")
      .id("testString")
      .remote(securityGroupRulePatchRemoteModel)
      .direction("inbound")
      .ipVersion("ipv4")
      .code(Long.valueOf("0"))
      .portMax(Long.valueOf("22"))
      .portMin(Long.valueOf("22"))
      .type(Long.valueOf("8"))
      .build();
    assertEquals(updateSecurityGroupRuleOptionsModel.securityGroupId(), "testString");
    assertEquals(updateSecurityGroupRuleOptionsModel.id(), "testString");
    assertEquals(updateSecurityGroupRuleOptionsModel.remote(), securityGroupRulePatchRemoteModel);
    assertEquals(updateSecurityGroupRuleOptionsModel.direction(), "inbound");
    assertEquals(updateSecurityGroupRuleOptionsModel.ipVersion(), "ipv4");
    assertEquals(updateSecurityGroupRuleOptionsModel.code(), Long.valueOf("0"));
    assertEquals(updateSecurityGroupRuleOptionsModel.portMax(), Long.valueOf("22"));
    assertEquals(updateSecurityGroupRuleOptionsModel.portMin(), Long.valueOf("22"));
    assertEquals(updateSecurityGroupRuleOptionsModel.type(), Long.valueOf("8"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSecurityGroupRuleOptionsError() throws Throwable {
    new UpdateSecurityGroupRuleOptions.Builder().build();
  }

}