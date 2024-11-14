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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext model.
 */
public class ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext() throws Throwable {
    ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModel = new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.Builder()
      .address("192.168.3.4")
      .autoDelete(false)
      .name("my-cluster-network-subnet-reserved-ip")
      .build();
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModel.address(), "192.168.3.4");
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModel.name(), "my-cluster-network-subnet-reserved-ip");

    String json = TestUtilities.serialize(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModel);

    ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModelNew = TestUtilities.deserialize(json, ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.class);
    assertTrue(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModelNew instanceof ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext);
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModelNew.address(), "192.168.3.4");
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModelNew.autoDelete(), Boolean.valueOf(false));
    assertEquals(clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContextModelNew.name(), "my-cluster-network-subnet-reserved-ip");
  }
}