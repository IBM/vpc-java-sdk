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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemotePrototypeIP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll model.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolAllTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolAll() throws Throwable {
    SecurityGroupRuleRemotePrototypeIP securityGroupRuleRemotePrototypeModel = new SecurityGroupRuleRemotePrototypeIP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(securityGroupRuleRemotePrototypeModel.address(), "192.168.3.4");

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll securityGroupRulePrototypeSecurityGroupRuleProtocolAllModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll.Builder()
      .direction("inbound")
      .ipVersion("ipv4")
      .protocol("all")
      .remote(securityGroupRuleRemotePrototypeModel)
      .build();
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModel.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModel.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModel.protocol(), "all");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModel.remote(), securityGroupRuleRemotePrototypeModel);

    String json = TestUtilities.serialize(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModel);

    SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll securityGroupRulePrototypeSecurityGroupRuleProtocolAllModelNew = TestUtilities.deserialize(json, SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll.class);
    assertTrue(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModelNew instanceof SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll);
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModelNew.direction(), "inbound");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModelNew.ipVersion(), "ipv4");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModelNew.protocol(), "all");
    assertEquals(securityGroupRulePrototypeSecurityGroupRuleProtocolAllModelNew.remote().toString(), securityGroupRuleRemotePrototypeModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRulePrototypeSecurityGroupRuleProtocolAllError() throws Throwable {
    new SecurityGroupRulePrototypeSecurityGroupRuleProtocolAll.Builder().build();
  }

}