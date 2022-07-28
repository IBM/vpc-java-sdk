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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnServerOptions;
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsernameIdProviderByIAM;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateVpnServerOptions model.
 */
public class CreateVpnServerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpnServerOptions() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    VPNServerAuthenticationByUsernameIdProviderByIAM vpnServerAuthenticationByUsernameIdProviderModel = new VPNServerAuthenticationByUsernameIdProviderByIAM.Builder()
      .providerType("iam")
      .build();
    assertEquals(vpnServerAuthenticationByUsernameIdProviderModel.providerType(), "iam");

    VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype vpnServerAuthenticationPrototypeModel = new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.Builder()
      .method("username")
      .identityProvider(vpnServerAuthenticationByUsernameIdProviderModel)
      .build();
    assertEquals(vpnServerAuthenticationPrototypeModel.method(), "username");
    assertEquals(vpnServerAuthenticationPrototypeModel.identityProvider(), vpnServerAuthenticationByUsernameIdProviderModel);

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    IP ipModel = new IP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(ipModel.address(), "192.168.3.4");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    CreateVpnServerOptions createVpnServerOptionsModel = new CreateVpnServerOptions.Builder()
      .certificate(certificateInstanceIdentityModel)
      .clientAuthentication(new java.util.ArrayList<VPNServerAuthenticationPrototype>(java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel)))
      .clientIpPool("172.16.0.0/16")
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
      .clientDnsServerIps(new java.util.ArrayList<IP>(java.util.Arrays.asList(ipModel)))
      .clientIdleTimeout(Long.valueOf("600"))
      .enableSplitTunneling(false)
      .name("my-vpn-server")
      .port(Long.valueOf("443"))
      .protocol("udp")
      .resourceGroup(resourceGroupIdentityModel)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .build();
    assertEquals(createVpnServerOptionsModel.certificate(), certificateInstanceIdentityModel);
    assertEquals(createVpnServerOptionsModel.clientAuthentication(), new java.util.ArrayList<VPNServerAuthenticationPrototype>(java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel)));
    assertEquals(createVpnServerOptionsModel.clientIpPool(), "172.16.0.0/16");
    assertEquals(createVpnServerOptionsModel.subnets(), new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)));
    assertEquals(createVpnServerOptionsModel.clientDnsServerIps(), new java.util.ArrayList<IP>(java.util.Arrays.asList(ipModel)));
    assertEquals(createVpnServerOptionsModel.clientIdleTimeout(), Long.valueOf("600"));
    assertEquals(createVpnServerOptionsModel.enableSplitTunneling(), Boolean.valueOf(false));
    assertEquals(createVpnServerOptionsModel.name(), "my-vpn-server");
    assertEquals(createVpnServerOptionsModel.port(), Long.valueOf("443"));
    assertEquals(createVpnServerOptionsModel.protocol(), "udp");
    assertEquals(createVpnServerOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createVpnServerOptionsModel.securityGroups(), new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpnServerOptionsError() throws Throwable {
    new CreateVpnServerOptions.Builder().build();
  }

}