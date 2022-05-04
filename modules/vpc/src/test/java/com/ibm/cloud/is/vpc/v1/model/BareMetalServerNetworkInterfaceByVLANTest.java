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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceByVLAN;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerNetworkInterfaceByVLAN model.
 */
public class BareMetalServerNetworkInterfaceByVLANTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerNetworkInterfaceByVLAN() throws Throwable {
    BareMetalServerNetworkInterfaceByVLAN bareMetalServerNetworkInterfaceByVlanModel = new BareMetalServerNetworkInterfaceByVLAN();
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.isAllowIpSpoofing());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getCreatedAt());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.isEnableInfrastructureNat());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getFloatingIps());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getHref());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getId());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getInterfaceType());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getMacAddress());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getName());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getPortSpeed());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getPrimaryIp());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getResourceType());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getSecurityGroups());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getStatus());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getSubnet());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getType());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.isAllowInterfaceToFloat());
    assertNull(bareMetalServerNetworkInterfaceByVlanModel.getVlan());
  }
}