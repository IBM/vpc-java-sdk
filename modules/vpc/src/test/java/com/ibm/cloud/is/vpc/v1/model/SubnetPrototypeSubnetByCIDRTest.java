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
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityPublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByCIDR;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SubnetPrototypeSubnetByCIDR model.
 */
public class SubnetPrototypeSubnetByCIDRTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubnetPrototypeSubnetByCIDR() throws Throwable {
    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();
    assertEquals(networkAclIdentityModel.id(), "a4e28308-8ee7-46ab-8108-9f881f22bdbf");

    PublicGatewayIdentityPublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityPublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();
    assertEquals(publicGatewayIdentityModel.id(), "dc5431ef-1fc6-4861-adc9-a59d077d1241");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
      .id("6885e83f-03b2-4603-8a86-db2a0f55c840")
      .build();
    assertEquals(routingTableIdentityModel.id(), "6885e83f-03b2-4603-8a86-db2a0f55c840");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    SubnetPrototypeSubnetByCIDR subnetPrototypeSubnetByCidrModel = new SubnetPrototypeSubnetByCIDR.Builder()
      .ipVersion("ipv4")
      .name("my-subnet")
      .networkAcl(networkAclIdentityModel)
      .publicGateway(publicGatewayIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .routingTable(routingTableIdentityModel)
      .vpc(vpcIdentityModel)
      .ipv4CidrBlock("10.0.0.0/24")
      .zone(zoneIdentityModel)
      .build();
    assertEquals(subnetPrototypeSubnetByCidrModel.ipVersion(), "ipv4");
    assertEquals(subnetPrototypeSubnetByCidrModel.name(), "my-subnet");
    assertEquals(subnetPrototypeSubnetByCidrModel.networkAcl(), networkAclIdentityModel);
    assertEquals(subnetPrototypeSubnetByCidrModel.publicGateway(), publicGatewayIdentityModel);
    assertEquals(subnetPrototypeSubnetByCidrModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(subnetPrototypeSubnetByCidrModel.routingTable(), routingTableIdentityModel);
    assertEquals(subnetPrototypeSubnetByCidrModel.vpc(), vpcIdentityModel);
    assertEquals(subnetPrototypeSubnetByCidrModel.ipv4CidrBlock(), "10.0.0.0/24");
    assertEquals(subnetPrototypeSubnetByCidrModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(subnetPrototypeSubnetByCidrModel);

    SubnetPrototypeSubnetByCIDR subnetPrototypeSubnetByCidrModelNew = TestUtilities.deserialize(json, SubnetPrototypeSubnetByCIDR.class);
    assertTrue(subnetPrototypeSubnetByCidrModelNew instanceof SubnetPrototypeSubnetByCIDR);
    assertEquals(subnetPrototypeSubnetByCidrModelNew.ipVersion(), "ipv4");
    assertEquals(subnetPrototypeSubnetByCidrModelNew.name(), "my-subnet");
    assertEquals(subnetPrototypeSubnetByCidrModelNew.networkAcl().toString(), networkAclIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCidrModelNew.publicGateway().toString(), publicGatewayIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCidrModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCidrModelNew.routingTable().toString(), routingTableIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCidrModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCidrModelNew.ipv4CidrBlock(), "10.0.0.0/24");
    assertEquals(subnetPrototypeSubnetByCidrModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubnetPrototypeSubnetByCIDRError() throws Throwable {
    new SubnetPrototypeSubnetByCIDR.Builder().build();
  }

}