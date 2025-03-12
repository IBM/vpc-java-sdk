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

import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN model.
 */
public class ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN() throws Throwable {
    ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN shareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCrnModel = new ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::virtual-network-interface:0717-54eb57ee-86f2-4796-90bb-d7874e0831ef")
      .build();
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::virtual-network-interface:0717-54eb57ee-86f2-4796-90bb-d7874e0831ef");

    String json = TestUtilities.serialize(shareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCrnModel);

    ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN shareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCrnModelNew = TestUtilities.deserialize(json, ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN.class);
    assertTrue(shareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCrnModelNew instanceof ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN);
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::virtual-network-interface:0717-54eb57ee-86f2-4796-90bb-d7874e0831ef");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRNError() throws Throwable {
    new ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfaceIdentityVirtualNetworkInterfaceIdentityByCRN.Builder().build();
  }

}