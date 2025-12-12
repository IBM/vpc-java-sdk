/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref model.
 */
public class FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref() throws Throwable {
    FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref floatingIpTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefModel = new FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/bare_metal_servers/0717-aad10fd7-8a02-4f3e-97f3-b18bd82cf304/network_interfaces/0717-da8c43ec-b6ca-4bd2-871e-72e288c66ee6")
      .build();
    assertEquals(floatingIpTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/bare_metal_servers/0717-aad10fd7-8a02-4f3e-97f3-b18bd82cf304/network_interfaces/0717-da8c43ec-b6ca-4bd2-871e-72e288c66ee6");

    String json = TestUtilities.serialize(floatingIpTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefModel);

    FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref floatingIpTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefModelNew = TestUtilities.deserialize(json, FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref.class);
    assertTrue(floatingIpTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefModelNew instanceof FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref);
    assertEquals(floatingIpTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/bare_metal_servers/0717-aad10fd7-8a02-4f3e-97f3-b18bd82cf304/network_interfaces/0717-da8c43ec-b6ca-4bd2-871e-72e288c66ee6");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHrefError() throws Throwable {
    new FloatingIPTargetPrototypeBareMetalServerNetworkInterfaceIdentityBareMetalServerNetworkInterfaceIdentityByHref.Builder().build();
  }

}