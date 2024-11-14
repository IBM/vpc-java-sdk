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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype model.
 */
public class ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype() throws Throwable {
    ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModel = new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype.Builder()
      .ipVersion("ipv4")
      .name("my-cluster-network-subnet")
      .ipv4CidrBlock("10.0.0.0/24")
      .build();
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModel.ipVersion(), "ipv4");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModel.name(), "my-cluster-network-subnet");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModel.ipv4CidrBlock(), "10.0.0.0/24");

    String json = TestUtilities.serialize(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModel);

    ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModelNew = TestUtilities.deserialize(json, ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype.class);
    assertTrue(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModelNew instanceof ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype);
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModelNew.ipVersion(), "ipv4");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModelNew.name(), "my-cluster-network-subnet");
    assertEquals(clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototypeModelNew.ipv4CidrBlock(), "10.0.0.0/24");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototypeError() throws Throwable {
    new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype.Builder().build();
  }

}