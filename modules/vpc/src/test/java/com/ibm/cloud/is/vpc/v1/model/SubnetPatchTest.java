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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPatch;
import com.ibm.cloud.is.vpc.v1.model.SubnetPublicGatewayPatchPublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubnetPatch model.
 */
public class SubnetPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubnetPatch() throws Throwable {
    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();
    assertEquals(networkAclIdentityModel.id(), "a4e28308-8ee7-46ab-8108-9f881f22bdbf");

    SubnetPublicGatewayPatchPublicGatewayIdentityById subnetPublicGatewayPatchModel = new SubnetPublicGatewayPatchPublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();
    assertEquals(subnetPublicGatewayPatchModel.id(), "dc5431ef-1fc6-4861-adc9-a59d077d1241");

    RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
      .id("6885e83f-03b2-4603-8a86-db2a0f55c840")
      .build();
    assertEquals(routingTableIdentityModel.id(), "6885e83f-03b2-4603-8a86-db2a0f55c840");

    SubnetPatch subnetPatchModel = new SubnetPatch.Builder()
      .name("my-subnet")
      .networkAcl(networkAclIdentityModel)
      .publicGateway(subnetPublicGatewayPatchModel)
      .routingTable(routingTableIdentityModel)
      .build();
    assertEquals(subnetPatchModel.name(), "my-subnet");
    assertEquals(subnetPatchModel.networkAcl(), networkAclIdentityModel);
    assertEquals(subnetPatchModel.publicGateway(), subnetPublicGatewayPatchModel);
    assertEquals(subnetPatchModel.routingTable(), routingTableIdentityModel);

    String json = TestUtilities.serialize(subnetPatchModel);

    SubnetPatch subnetPatchModelNew = TestUtilities.deserialize(json, SubnetPatch.class);
    assertTrue(subnetPatchModelNew instanceof SubnetPatch);
    assertEquals(subnetPatchModelNew.name(), "my-subnet");
    assertEquals(subnetPatchModelNew.networkAcl().toString(), networkAclIdentityModel.toString());
    assertEquals(subnetPatchModelNew.publicGateway().toString(), subnetPublicGatewayPatchModel.toString());
    assertEquals(subnetPatchModelNew.routingTable().toString(), routingTableIdentityModel.toString());
  }
  @Test
  public void testSubnetPatchAsPatch() throws Throwable {
    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();

    SubnetPublicGatewayPatchPublicGatewayIdentityById subnetPublicGatewayPatchModel = new SubnetPublicGatewayPatchPublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();

    RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
      .id("6885e83f-03b2-4603-8a86-db2a0f55c840")
      .build();

    SubnetPatch subnetPatchModel = new SubnetPatch.Builder()
      .name("my-subnet")
      .networkAcl(networkAclIdentityModel)
      .publicGateway(subnetPublicGatewayPatchModel)
      .routingTable(routingTableIdentityModel)
      .build();

    Map<String, Object> mergePatch = subnetPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-subnet");
    assertTrue(mergePatch.containsKey("network_acl"));
    assertTrue(mergePatch.containsKey("public_gateway"));
    assertTrue(mergePatch.containsKey("routing_table"));
  }

}