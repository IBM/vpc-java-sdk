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
import com.ibm.cloud.is.vpc.v1.model.UpdateNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateNetworkAclRuleOptions model.
 */
public class UpdateNetworkAclRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateNetworkAclRuleOptions() throws Throwable {
    NetworkACLRuleIdentityById networkAclRuleIdentityModel = new NetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleIdentityModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    UpdateNetworkAclRuleOptions updateNetworkAclRuleOptionsModel = new UpdateNetworkAclRuleOptions.Builder()
      .networkAclId("testString")
      .id("testString")
      .name("my-rule-2")
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .source("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .sourcePortMax(Long.valueOf("65535"))
      .sourcePortMin(Long.valueOf("49152"))
      .code(Long.valueOf("0"))
      .type(Long.valueOf("8"))
      .before(networkAclRuleIdentityModel)
      .build();
    assertEquals(updateNetworkAclRuleOptionsModel.networkAclId(), "testString");
    assertEquals(updateNetworkAclRuleOptionsModel.id(), "testString");
    assertEquals(updateNetworkAclRuleOptionsModel.name(), "my-rule-2");
    assertEquals(updateNetworkAclRuleOptionsModel.action(), "allow");
    assertEquals(updateNetworkAclRuleOptionsModel.destination(), "192.168.3.2/32");
    assertEquals(updateNetworkAclRuleOptionsModel.direction(), "inbound");
    assertEquals(updateNetworkAclRuleOptionsModel.source(), "192.168.3.2/32");
    assertEquals(updateNetworkAclRuleOptionsModel.destinationPortMax(), Long.valueOf("22"));
    assertEquals(updateNetworkAclRuleOptionsModel.destinationPortMin(), Long.valueOf("22"));
    assertEquals(updateNetworkAclRuleOptionsModel.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(updateNetworkAclRuleOptionsModel.sourcePortMin(), Long.valueOf("49152"));
    assertEquals(updateNetworkAclRuleOptionsModel.code(), Long.valueOf("0"));
    assertEquals(updateNetworkAclRuleOptionsModel.type(), Long.valueOf("8"));
    assertEquals(updateNetworkAclRuleOptionsModel.before(), networkAclRuleIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateNetworkAclRuleOptionsError() throws Throwable {
    new UpdateNetworkAclRuleOptions.Builder().build();
  }

}