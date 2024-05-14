/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref model.
 */
public class FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref() throws Throwable {
    FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref floatingIpTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModel = new FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/0717-10c02d81-0ecb-4dc5-897d-28392913b81e")
      .build();
    assertEquals(floatingIpTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/0717-10c02d81-0ecb-4dc5-897d-28392913b81e");

    String json = TestUtilities.serialize(floatingIpTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModel);

    FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref floatingIpTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModelNew = TestUtilities.deserialize(json, FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.class);
    assertTrue(floatingIpTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModelNew instanceof FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref);
    assertEquals(floatingIpTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/instances/1e09281b-f177-46fb-baf1-bc152b2e391a/network_interfaces/0717-10c02d81-0ecb-4dc5-897d-28392913b81e");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHrefError() throws Throwable {
    new FloatingIPTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.Builder().build();
  }

}