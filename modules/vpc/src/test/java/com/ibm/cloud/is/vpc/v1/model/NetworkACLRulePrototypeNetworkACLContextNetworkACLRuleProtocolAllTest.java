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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll model.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll() throws Throwable {
    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll.Builder()
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .protocol("all")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel.protocol(), "all");

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModel);

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll.class);
    assertTrue(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew instanceof NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll);
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllModelNew.protocol(), "all");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll.Builder().build();
  }

}