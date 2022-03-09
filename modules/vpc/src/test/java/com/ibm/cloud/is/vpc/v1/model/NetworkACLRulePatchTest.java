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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePatchNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePatch model.
 */
public class NetworkACLRulePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePatch() throws Throwable {
    NetworkACLRuleBeforePatchNetworkACLRuleIdentityById networkAclRuleBeforePatchModel = new NetworkACLRuleBeforePatchNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePatchModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePatch networkAclRulePatchModel = new NetworkACLRulePatch.Builder()
      .action("allow")
      .before(networkAclRuleBeforePatchModel)
      .code(Long.valueOf("0"))
      .destination("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .sourcePortMax(Long.valueOf("65535"))
      .sourcePortMin(Long.valueOf("49152"))
      .type(Long.valueOf("8"))
      .build();
    assertEquals(networkAclRulePatchModel.action(), "allow");
    assertEquals(networkAclRulePatchModel.before(), networkAclRuleBeforePatchModel);
    assertEquals(networkAclRulePatchModel.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePatchModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePatchModel.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePatchModel.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePatchModel.direction(), "inbound");
    assertEquals(networkAclRulePatchModel.name(), "my-rule-2");
    assertEquals(networkAclRulePatchModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePatchModel.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePatchModel.sourcePortMin(), Long.valueOf("49152"));
    assertEquals(networkAclRulePatchModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(networkAclRulePatchModel);

    NetworkACLRulePatch networkAclRulePatchModelNew = TestUtilities.deserialize(json, NetworkACLRulePatch.class);
    assertTrue(networkAclRulePatchModelNew instanceof NetworkACLRulePatch);
    assertEquals(networkAclRulePatchModelNew.action(), "allow");
    assertEquals(networkAclRulePatchModelNew.before().toString(), networkAclRuleBeforePatchModel.toString());
    assertEquals(networkAclRulePatchModelNew.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePatchModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePatchModelNew.destinationPortMax(), Long.valueOf("22"));
    assertEquals(networkAclRulePatchModelNew.destinationPortMin(), Long.valueOf("22"));
    assertEquals(networkAclRulePatchModelNew.direction(), "inbound");
    assertEquals(networkAclRulePatchModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePatchModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePatchModelNew.sourcePortMax(), Long.valueOf("65535"));
    assertEquals(networkAclRulePatchModelNew.sourcePortMin(), Long.valueOf("49152"));
    assertEquals(networkAclRulePatchModelNew.type(), Long.valueOf("8"));
  }
  @Test
  public void testNetworkACLRulePatchAsPatch() throws Throwable {
    NetworkACLRuleBeforePatchNetworkACLRuleIdentityById networkAclRuleBeforePatchModel = new NetworkACLRuleBeforePatchNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();

    NetworkACLRulePatch networkAclRulePatchModel = new NetworkACLRulePatch.Builder()
      .action("allow")
      .before(networkAclRuleBeforePatchModel)
      .code(Long.valueOf("0"))
      .destination("192.168.3.2/32")
      .destinationPortMax(Long.valueOf("22"))
      .destinationPortMin(Long.valueOf("22"))
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .sourcePortMax(Long.valueOf("65535"))
      .sourcePortMin(Long.valueOf("49152"))
      .type(Long.valueOf("8"))
      .build();

    Map<String, Object> mergePatch = networkAclRulePatchModel.asPatch();

    assertEquals(mergePatch.get("action"), "allow");
    assertTrue(mergePatch.containsKey("before"));
    assertTrue(mergePatch.containsKey("code"));
    assertEquals(mergePatch.get("destination"), "192.168.3.2/32");
    assertTrue(mergePatch.containsKey("destination_port_max"));
    assertTrue(mergePatch.containsKey("destination_port_min"));
    assertEquals(mergePatch.get("direction"), "inbound");
    assertEquals(mergePatch.get("name"), "my-rule-2");
    assertEquals(mergePatch.get("source"), "192.168.3.2/32");
    assertTrue(mergePatch.containsKey("source_port_max"));
    assertTrue(mergePatch.containsKey("source_port_min"));
    assertTrue(mergePatch.containsKey("type"));
  }

}