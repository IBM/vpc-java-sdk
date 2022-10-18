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
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype model.
 */
public class VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/123456:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModel = new VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype.Builder()
      .method("certificate")
      .clientCa(certificateInstanceIdentityModel)
      .crl("testString")
      .build();
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModel.method(), "certificate");
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModel.clientCa(), certificateInstanceIdentityModel);
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModel.crl(), "testString");

    String json = TestUtilities.serialize(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModel);

    VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModelNew = TestUtilities.deserialize(json, VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype.class);
    assertTrue(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModelNew instanceof VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype);
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModelNew.method(), "certificate");
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModelNew.clientCa().toString(), certificateInstanceIdentityModel.toString());
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByCertificatePrototypeModelNew.crl(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototypeError() throws Throwable {
    new VPNServerAuthenticationPrototypeVPNServerAuthenticationByCertificatePrototype.Builder().build();
  }

}