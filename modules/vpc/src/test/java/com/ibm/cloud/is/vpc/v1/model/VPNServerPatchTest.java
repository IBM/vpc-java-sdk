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
import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsernameIdProviderByIAM;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNServerPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNServerPatch model.
 */
public class VPNServerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNServerPatch() throws Throwable {
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

    IP ipModel = new IP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(ipModel.address(), "192.168.3.4");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    VPNServerPatch vpnServerPatchModel = new VPNServerPatch.Builder()
      .certificate(certificateInstanceIdentityModel)
      .clientAuthentication(java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel))
      .clientDnsServerIps(java.util.Arrays.asList(ipModel))
      .clientIdleTimeout(Long.valueOf("600"))
      .clientIpPool("172.16.0.0/16")
      .enableSplitTunneling(true)
      .name("my-vpn-server")
      .port(Long.valueOf("443"))
      .protocol("udp")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();
    assertEquals(vpnServerPatchModel.certificate(), certificateInstanceIdentityModel);
    assertEquals(vpnServerPatchModel.clientAuthentication(), java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel));
    assertEquals(vpnServerPatchModel.clientDnsServerIps(), java.util.Arrays.asList(ipModel));
    assertEquals(vpnServerPatchModel.clientIdleTimeout(), Long.valueOf("600"));
    assertEquals(vpnServerPatchModel.clientIpPool(), "172.16.0.0/16");
    assertEquals(vpnServerPatchModel.enableSplitTunneling(), Boolean.valueOf(true));
    assertEquals(vpnServerPatchModel.name(), "my-vpn-server");
    assertEquals(vpnServerPatchModel.port(), Long.valueOf("443"));
    assertEquals(vpnServerPatchModel.protocol(), "udp");
    assertEquals(vpnServerPatchModel.subnets(), java.util.Arrays.asList(subnetIdentityModel));

    String json = TestUtilities.serialize(vpnServerPatchModel);

    VPNServerPatch vpnServerPatchModelNew = TestUtilities.deserialize(json, VPNServerPatch.class);
    assertTrue(vpnServerPatchModelNew instanceof VPNServerPatch);
    assertEquals(vpnServerPatchModelNew.certificate().toString(), certificateInstanceIdentityModel.toString());
    assertEquals(vpnServerPatchModelNew.clientIdleTimeout(), Long.valueOf("600"));
    assertEquals(vpnServerPatchModelNew.clientIpPool(), "172.16.0.0/16");
    assertEquals(vpnServerPatchModelNew.enableSplitTunneling(), Boolean.valueOf(true));
    assertEquals(vpnServerPatchModelNew.name(), "my-vpn-server");
    assertEquals(vpnServerPatchModelNew.port(), Long.valueOf("443"));
    assertEquals(vpnServerPatchModelNew.protocol(), "udp");
  }
  @Test
  public void testVPNServerPatchAsPatch() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();

    VPNServerAuthenticationByUsernameIdProviderByIAM vpnServerAuthenticationByUsernameIdProviderModel = new VPNServerAuthenticationByUsernameIdProviderByIAM.Builder()
      .providerType("iam")
      .build();

    VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype vpnServerAuthenticationPrototypeModel = new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.Builder()
      .method("username")
      .identityProvider(vpnServerAuthenticationByUsernameIdProviderModel)
      .build();

    IP ipModel = new IP.Builder()
      .address("192.168.3.4")
      .build();

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

    VPNServerPatch vpnServerPatchModel = new VPNServerPatch.Builder()
      .certificate(certificateInstanceIdentityModel)
      .clientAuthentication(java.util.Arrays.asList(vpnServerAuthenticationPrototypeModel))
      .clientDnsServerIps(java.util.Arrays.asList(ipModel))
      .clientIdleTimeout(Long.valueOf("600"))
      .clientIpPool("172.16.0.0/16")
      .enableSplitTunneling(true)
      .name("my-vpn-server")
      .port(Long.valueOf("443"))
      .protocol("udp")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();

    Map<String, Object> mergePatch = vpnServerPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("certificate"));
    assertTrue(mergePatch.containsKey("client_authentication"));
    assertTrue(mergePatch.containsKey("client_dns_server_ips"));
    assertTrue(mergePatch.containsKey("client_idle_timeout"));
    assertEquals(mergePatch.get("client_ip_pool"), "172.16.0.0/16");
    assertTrue(mergePatch.containsKey("enable_split_tunneling"));
    assertEquals(mergePatch.get("name"), "my-vpn-server");
    assertTrue(mergePatch.containsKey("port"));
    assertEquals(mergePatch.get("protocol"), "udp");
    assertTrue(mergePatch.containsKey("subnets"));
  }

}