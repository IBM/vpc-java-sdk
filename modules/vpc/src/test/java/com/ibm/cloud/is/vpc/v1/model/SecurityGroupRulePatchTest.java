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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePatchCIDR;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePatch model.
 */
public class SecurityGroupRulePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePatch() throws Throwable {
    SecurityGroupRuleRemotePatchCIDR securityGroupRuleRemotePatchModel = new SecurityGroupRuleRemotePatchCIDR.Builder()
      .cidrBlock("10.0.0.0/16")
      .build();
    assertEquals(securityGroupRuleRemotePatchModel.cidrBlock(), "10.0.0.0/16");

    SecurityGroupRulePatch securityGroupRulePatchModel = new SecurityGroupRulePatch.Builder()
      .code(Long.valueOf("0"))
      .direction("inbound")
      .ipVersion("ipv4")
      .portMax(Long.valueOf("22"))
      .portMin(Long.valueOf("22"))
      .remote(securityGroupRuleRemotePatchModel)
      .type(Long.valueOf("8"))
      .build();
    assertEquals(securityGroupRulePatchModel.code(), Long.valueOf("0"));
    assertEquals(securityGroupRulePatchModel.direction(), "inbound");
    assertEquals(securityGroupRulePatchModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePatchModel.portMax(), Long.valueOf("22"));
    assertEquals(securityGroupRulePatchModel.portMin(), Long.valueOf("22"));
    assertEquals(securityGroupRulePatchModel.remote(), securityGroupRuleRemotePatchModel);
    assertEquals(securityGroupRulePatchModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(securityGroupRulePatchModel);

    SecurityGroupRulePatch securityGroupRulePatchModelNew = TestUtilities.deserialize(json, SecurityGroupRulePatch.class);
    assertTrue(securityGroupRulePatchModelNew instanceof SecurityGroupRulePatch);
    assertEquals(securityGroupRulePatchModelNew.code(), Long.valueOf("0"));
    assertEquals(securityGroupRulePatchModelNew.direction(), "inbound");
    assertEquals(securityGroupRulePatchModelNew.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePatchModelNew.portMax(), Long.valueOf("22"));
    assertEquals(securityGroupRulePatchModelNew.portMin(), Long.valueOf("22"));
    assertEquals(securityGroupRulePatchModelNew.remote().toString(), securityGroupRuleRemotePatchModel.toString());
    assertEquals(securityGroupRulePatchModelNew.type(), Long.valueOf("8"));
  }
  @Test
  public void testSecurityGroupRulePatchAsPatch() throws Throwable {
    SecurityGroupRuleRemotePatchCIDR securityGroupRuleRemotePatchModel = new SecurityGroupRuleRemotePatchCIDR.Builder()
      .cidrBlock("10.0.0.0/16")
      .build();

    SecurityGroupRulePatch securityGroupRulePatchModel = new SecurityGroupRulePatch.Builder()
      .code(Long.valueOf("0"))
      .direction("inbound")
      .ipVersion("ipv4")
      .portMax(Long.valueOf("22"))
      .portMin(Long.valueOf("22"))
      .remote(securityGroupRuleRemotePatchModel)
      .type(Long.valueOf("8"))
      .build();

    Map<String, Object> mergePatch = securityGroupRulePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("code"));
    assertEquals(mergePatch.get("direction"), "inbound");
    assertEquals(mergePatch.get("ip_version"), "ipv4");
    assertTrue(mergePatch.containsKey("port_max"));
    assertTrue(mergePatch.containsKey("port_min"));
    assertTrue(mergePatch.containsKey("remote"));
    assertTrue(mergePatch.containsKey("type"));
  }

}