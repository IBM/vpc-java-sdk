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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPNServer;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsername;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsernameIdProviderByIAM;
import com.ibm.cloud.is.vpc.v1.model.VPNServerHealthReason;
import com.ibm.cloud.is.vpc.v1.model.VPNServerLifecycleReason;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNServer model.
 */
public class VPNServerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNServer() throws Throwable {
    VPNServer vpnServerModel = new VPNServer();
    assertNull(vpnServerModel.getCertificate());
    assertNull(vpnServerModel.getClientAuthentication());
    assertNull(vpnServerModel.isClientAutoDelete());
    assertNull(vpnServerModel.getClientAutoDeleteTimeout());
    assertNull(vpnServerModel.getClientDnsServerIps());
    assertNull(vpnServerModel.getClientIdleTimeout());
    assertNull(vpnServerModel.getClientIpPool());
    assertNull(vpnServerModel.getCreatedAt());
    assertNull(vpnServerModel.getCrn());
    assertNull(vpnServerModel.isEnableSplitTunneling());
    assertNull(vpnServerModel.getHealthReasons());
    assertNull(vpnServerModel.getHealthState());
    assertNull(vpnServerModel.getHostname());
    assertNull(vpnServerModel.getHref());
    assertNull(vpnServerModel.getId());
    assertNull(vpnServerModel.getLifecycleReasons());
    assertNull(vpnServerModel.getLifecycleState());
    assertNull(vpnServerModel.getName());
    assertNull(vpnServerModel.getPort());
    assertNull(vpnServerModel.getPrivateIps());
    assertNull(vpnServerModel.getProtocol());
    assertNull(vpnServerModel.getResourceGroup());
    assertNull(vpnServerModel.getResourceType());
    assertNull(vpnServerModel.getSecurityGroups());
    assertNull(vpnServerModel.getSubnets());
    assertNull(vpnServerModel.getVpc());
  }
}