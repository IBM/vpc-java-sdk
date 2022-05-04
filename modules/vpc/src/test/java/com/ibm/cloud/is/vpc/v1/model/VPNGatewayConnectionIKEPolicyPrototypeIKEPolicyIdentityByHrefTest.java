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

import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref model.
 */
public class VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref() throws Throwable {
    VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHrefModel = new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b");

    String json = TestUtilities.serialize(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHrefModel);

    VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHrefModelNew = TestUtilities.deserialize(json, VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref.class);
    assertTrue(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHrefModelNew instanceof VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref);
    assertEquals(vpnGatewayConnectionIkePolicyPrototypeIkePolicyIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHrefError() throws Throwable {
    new VPNGatewayConnectionIKEPolicyPrototypeIKEPolicyIdentityByHref.Builder().build();
  }

}