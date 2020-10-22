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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
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

    PublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityById.Builder()
      .id("dc5431ef-1fc6-4861-adc9-a59d077d1241")
      .build();
    assertEquals(publicGatewayIdentityModel.id(), "dc5431ef-1fc6-4861-adc9-a59d077d1241");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    SubnetPrototypeSubnetByCIDR subnetPrototypeSubnetByCIDRModel = new SubnetPrototypeSubnetByCIDR.Builder()
      .name("my-subnet")
      .networkAcl(networkAclIdentityModel)
      .publicGateway(publicGatewayIdentityModel)
      .ipVersion("ipv4")
      .resourceGroup(resourceGroupIdentityModel)
      .vpc(vpcIdentityModel)
      .ipv4CIDRBlock("10.0.0.0/24")
      .zone(zoneIdentityModel)
      .build();
    assertEquals(subnetPrototypeSubnetByCIDRModel.name(), "my-subnet");
    assertEquals(subnetPrototypeSubnetByCIDRModel.networkAcl(), networkAclIdentityModel);
    assertEquals(subnetPrototypeSubnetByCIDRModel.publicGateway(), publicGatewayIdentityModel);
    assertEquals(subnetPrototypeSubnetByCIDRModel.ipVersion(), "ipv4");
    assertEquals(subnetPrototypeSubnetByCIDRModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(subnetPrototypeSubnetByCIDRModel.vpc(), vpcIdentityModel);
    assertEquals(subnetPrototypeSubnetByCIDRModel.ipv4CIDRBlock(), "10.0.0.0/24");
    assertEquals(subnetPrototypeSubnetByCIDRModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(subnetPrototypeSubnetByCIDRModel);

    SubnetPrototypeSubnetByCIDR subnetPrototypeSubnetByCIDRModelNew = TestUtilities.deserialize(json, SubnetPrototypeSubnetByCIDR.class);
    assertTrue(subnetPrototypeSubnetByCIDRModelNew instanceof SubnetPrototypeSubnetByCIDR);
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.name(), "my-subnet");
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.networkAcl().toString(), networkAclIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.publicGateway().toString(), publicGatewayIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.ipVersion(), "ipv4");
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.ipv4CIDRBlock(), "10.0.0.0/24");
    assertEquals(subnetPrototypeSubnetByCIDRModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSubnetPrototypeSubnetByCIDRError() throws Throwable {
    new SubnetPrototypeSubnetByCIDR.Builder().build();
  }

}