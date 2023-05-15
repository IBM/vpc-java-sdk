/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref model.
 */
public class FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref() throws Throwable {
    FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref floatingIpTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModel = new FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e")
      .build();
    assertEquals(floatingIpTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e");

    String json = TestUtilities.serialize(floatingIpTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModel);

    FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref floatingIpTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModelNew = TestUtilities.deserialize(json, FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.class);
    assertTrue(floatingIpTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModelNew instanceof FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref);
    assertEquals(floatingIpTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/10c02d81-0ecb-4dc5-897d-28392913b81e");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefError() throws Throwable {
    new FloatingIPTargetPatchNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.Builder().build();
  }

}