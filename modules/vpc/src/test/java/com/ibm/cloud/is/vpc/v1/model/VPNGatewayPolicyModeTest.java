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

import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayMember;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayMemberHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayMemberLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPolicyMode;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayPolicyMode model.
 */
public class VPNGatewayPolicyModeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayPolicyMode() throws Throwable {
    VPNGatewayPolicyMode vpnGatewayPolicyModeModel = new VPNGatewayPolicyMode();
    assertNull(vpnGatewayPolicyModeModel.getConnections());
    assertNull(vpnGatewayPolicyModeModel.getCreatedAt());
    assertNull(vpnGatewayPolicyModeModel.getCrn());
    assertNull(vpnGatewayPolicyModeModel.getHealthReasons());
    assertNull(vpnGatewayPolicyModeModel.getHealthState());
    assertNull(vpnGatewayPolicyModeModel.getHref());
    assertNull(vpnGatewayPolicyModeModel.getId());
    assertNull(vpnGatewayPolicyModeModel.getLifecycleReasons());
    assertNull(vpnGatewayPolicyModeModel.getLifecycleState());
    assertNull(vpnGatewayPolicyModeModel.getMembers());
    assertNull(vpnGatewayPolicyModeModel.getName());
    assertNull(vpnGatewayPolicyModeModel.getResourceGroup());
    assertNull(vpnGatewayPolicyModeModel.getResourceType());
    assertNull(vpnGatewayPolicyModeModel.getSubnet());
    assertNull(vpnGatewayPolicyModeModel.getVpc());
    assertNull(vpnGatewayPolicyModeModel.getMode());
  }
}