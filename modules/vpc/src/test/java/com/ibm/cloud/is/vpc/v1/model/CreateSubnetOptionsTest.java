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

import com.ibm.cloud.is.vpc.v1.model.CreateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityPublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
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
 * Unit test class for the CreateSubnetOptions model.
 */
public class CreateSubnetOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSubnetOptions() throws Throwable {
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

    SubnetPrototypeSubnetByTotalCount subnetPrototypeModel = new SubnetPrototypeSubnetByTotalCount.Builder()
      .ipVersion("ipv4")
      .name("my-subnet")
      .networkAcl(networkAclIdentityModel)
      .publicGateway(publicGatewayIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .routingTable(routingTableIdentityModel)
      .vpc(vpcIdentityModel)
      .totalIpv4AddressCount(Long.valueOf("256"))
      .zone(zoneIdentityModel)
      .build();
    assertEquals(subnetPrototypeModel.ipVersion(), "ipv4");
    assertEquals(subnetPrototypeModel.name(), "my-subnet");
    assertEquals(subnetPrototypeModel.networkAcl(), networkAclIdentityModel);
    assertEquals(subnetPrototypeModel.publicGateway(), publicGatewayIdentityModel);
    assertEquals(subnetPrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(subnetPrototypeModel.routingTable(), routingTableIdentityModel);
    assertEquals(subnetPrototypeModel.vpc(), vpcIdentityModel);
    assertEquals(subnetPrototypeModel.totalIpv4AddressCount(), Long.valueOf("256"));
    assertEquals(subnetPrototypeModel.zone(), zoneIdentityModel);

    CreateSubnetOptions createSubnetOptionsModel = new CreateSubnetOptions.Builder()
      .subnetPrototype(subnetPrototypeModel)
      .build();
    assertEquals(createSubnetOptionsModel.subnetPrototype(), subnetPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSubnetOptionsError() throws Throwable {
    new CreateSubnetOptions.Builder().build();
  }

}