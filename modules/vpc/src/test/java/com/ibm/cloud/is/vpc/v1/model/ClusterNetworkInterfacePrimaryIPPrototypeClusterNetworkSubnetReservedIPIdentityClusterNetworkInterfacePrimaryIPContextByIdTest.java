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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById model.
 */
public class ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById() throws Throwable {
    ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByIdModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById.Builder()
      .id("0717-d4d6489a-3bf5-4104-a33a-3572faf2d117")
      .build();
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByIdModel.id(), "0717-d4d6489a-3bf5-4104-a33a-3572faf2d117");

    String json = TestUtilities.serialize(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByIdModel);

    ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByIdModelNew = TestUtilities.deserialize(json, ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById.class);
    assertTrue(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByIdModelNew instanceof ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById);
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByIdModelNew.id(), "0717-d4d6489a-3bf5-4104-a33a-3572faf2d117");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByIdError() throws Throwable {
    new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextById.Builder().build();
  }

}