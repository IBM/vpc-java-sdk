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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById model.
 */
public class VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById() throws Throwable {
    VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByIdModel = new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById.Builder()
      .id("r006-e98f46a3-1e4e-4195-b4e5-b8155192689d")
      .build();
    assertEquals(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByIdModel.id(), "r006-e98f46a3-1e4e-4195-b4e5-b8155192689d");

    String json = TestUtilities.serialize(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByIdModel);

    VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByIdModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById.class);
    assertTrue(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByIdModelNew instanceof VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById);
    assertEquals(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByIdModelNew.id(), "r006-e98f46a3-1e4e-4195-b4e5-b8155192689d");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByIdError() throws Throwable {
    new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityById.Builder().build();
  }

}