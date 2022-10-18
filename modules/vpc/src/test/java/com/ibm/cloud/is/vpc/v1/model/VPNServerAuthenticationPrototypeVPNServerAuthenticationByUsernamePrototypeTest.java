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

import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationByUsernameIdProviderByIAM;
import com.ibm.cloud.is.vpc.v1.model.VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype model.
 */
public class VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype() throws Throwable {
    VPNServerAuthenticationByUsernameIdProviderByIAM vpnServerAuthenticationByUsernameIdProviderModel = new VPNServerAuthenticationByUsernameIdProviderByIAM.Builder()
      .providerType("iam")
      .build();
    assertEquals(vpnServerAuthenticationByUsernameIdProviderModel.providerType(), "iam");

    VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModel = new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.Builder()
      .method("username")
      .identityProvider(vpnServerAuthenticationByUsernameIdProviderModel)
      .build();
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModel.method(), "username");
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModel.identityProvider(), vpnServerAuthenticationByUsernameIdProviderModel);

    String json = TestUtilities.serialize(vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModel);

    VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModelNew = TestUtilities.deserialize(json, VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.class);
    assertTrue(vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModelNew instanceof VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype);
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModelNew.method(), "username");
    assertEquals(vpnServerAuthenticationPrototypeVpnServerAuthenticationByUsernamePrototypeModelNew.identityProvider().toString(), vpnServerAuthenticationByUsernameIdProviderModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototypeError() throws Throwable {
    new VPNServerAuthenticationPrototypeVPNServerAuthenticationByUsernamePrototype.Builder().build();
  }

}