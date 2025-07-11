/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.ibm.cloud.is.vpc.v1.model.DNSServer;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLReference;
import com.ibm.cloud.is.vpc.v1.model.PublicAddressRangeReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.VPC;
import com.ibm.cloud.is.vpc.v1.model.VPCCSESourceIP;
import com.ibm.cloud.is.vpc.v1.model.VPCDNS;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverTypeSystem;
import com.ibm.cloud.is.vpc.v1.model.VPCHealthReason;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPC model.
 */
public class VPCTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPC() throws Throwable {
    VPC vpcModel = new VPC();
    assertNull(vpcModel.isClassicAccess());
    assertNull(vpcModel.getCreatedAt());
    assertNull(vpcModel.getCrn());
    assertNull(vpcModel.getCseSourceIps());
    assertNull(vpcModel.getDefaultNetworkAcl());
    assertNull(vpcModel.getDefaultRoutingTable());
    assertNull(vpcModel.getDefaultSecurityGroup());
    assertNull(vpcModel.getDns());
    assertNull(vpcModel.getHealthReasons());
    assertNull(vpcModel.getHealthState());
    assertNull(vpcModel.getHref());
    assertNull(vpcModel.getId());
    assertNull(vpcModel.getName());
    assertNull(vpcModel.getPublicAddressRanges());
    assertNull(vpcModel.getResourceGroup());
    assertNull(vpcModel.getResourceType());
    assertNull(vpcModel.getStatus());
  }
}