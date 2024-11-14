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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype model.
 */
public class ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype() throws Throwable {
    ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModel = new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.Builder()
      .ipVersion("ipv4")
      .name("my-cluster-network-subnet")
      .totalIpv4AddressCount(Long.valueOf("256"))
      .build();
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModel.ipVersion(), "ipv4");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModel.name(), "my-cluster-network-subnet");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModel.totalIpv4AddressCount(), Long.valueOf("256"));

    String json = TestUtilities.serialize(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModel);

    ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModelNew = TestUtilities.deserialize(json, ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.class);
    assertTrue(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModelNew instanceof ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype);
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModelNew.name(), "my-cluster-network-subnet");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeModelNew.totalIpv4AddressCount(), Long.valueOf("256"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototypeError() throws Throwable {
    new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.Builder().build();
  }

}