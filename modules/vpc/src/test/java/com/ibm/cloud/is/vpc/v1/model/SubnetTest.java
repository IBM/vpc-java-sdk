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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLReference;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayReference;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableReference;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Subnet model.
 */
public class SubnetTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSubnet() throws Throwable {
    Subnet subnetModel = new Subnet();
    assertNull(subnetModel.getAvailableIpv4AddressCount());
    assertNull(subnetModel.getCreatedAt());
    assertNull(subnetModel.getCrn());
    assertNull(subnetModel.getHref());
    assertNull(subnetModel.getId());
    assertNull(subnetModel.getIpVersion());
    assertNull(subnetModel.getIpv4CidrBlock());
    assertNull(subnetModel.getName());
    assertNull(subnetModel.getNetworkAcl());
    assertNull(subnetModel.getPublicGateway());
    assertNull(subnetModel.getResourceGroup());
    assertNull(subnetModel.getResourceType());
    assertNull(subnetModel.getRoutingTable());
    assertNull(subnetModel.getStatus());
    assertNull(subnetModel.getTotalIpv4AddressCount());
    assertNull(subnetModel.getVpc());
    assertNull(subnetModel.getZone());
  }
}