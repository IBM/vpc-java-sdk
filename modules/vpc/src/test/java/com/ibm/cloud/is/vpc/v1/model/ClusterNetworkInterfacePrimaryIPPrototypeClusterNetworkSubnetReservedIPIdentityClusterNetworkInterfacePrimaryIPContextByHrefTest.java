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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref model.
 */
public class ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref() throws Throwable {
    ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByHrefModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/cluster_networks/0717-da0df18c-7598-4633-a648-fdaac28a5573/subnets/0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930/reserved_ips/0717-d4d6489a-3bf5-4104-a33a-3572faf2d117")
      .build();
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/cluster_networks/0717-da0df18c-7598-4633-a648-fdaac28a5573/subnets/0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930/reserved_ips/0717-d4d6489a-3bf5-4104-a33a-3572faf2d117");

    String json = TestUtilities.serialize(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByHrefModel);

    ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByHrefModelNew = TestUtilities.deserialize(json, ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref.class);
    assertTrue(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByHrefModelNew instanceof ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref);
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpIdentityClusterNetworkInterfacePrimaryIpContextByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/cluster_networks/0717-da0df18c-7598-4633-a648-fdaac28a5573/subnets/0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930/reserved_ips/0717-d4d6489a-3bf5-4104-a33a-3572faf2d117");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHrefError() throws Throwable {
    new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPIdentityClusterNetworkInterfacePrimaryIPContextByHref.Builder().build();
  }

}