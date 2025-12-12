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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrefixPrototype;
import com.ibm.cloud.is.vpc.v1.model.CreateClusterNetworkOptions;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateClusterNetworkOptions model.
 */
public class CreateClusterNetworkOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateClusterNetworkOptions() throws Throwable {
    ClusterNetworkProfileIdentityByName clusterNetworkProfileIdentityModel = new ClusterNetworkProfileIdentityByName.Builder()
      .name("h100")
      .build();
    assertEquals(clusterNetworkProfileIdentityModel.name(), "h100");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    ClusterNetworkSubnetPrefixPrototype clusterNetworkSubnetPrefixPrototypeModel = new ClusterNetworkSubnetPrefixPrototype.Builder()
      .cidr("10.0.0.0/24")
      .build();
    assertEquals(clusterNetworkSubnetPrefixPrototypeModel.cidr(), "10.0.0.0/24");

    CreateClusterNetworkOptions createClusterNetworkOptionsModel = new CreateClusterNetworkOptions.Builder()
      .profile(clusterNetworkProfileIdentityModel)
      .vpc(vpcIdentityModel)
      .zone(zoneIdentityModel)
      .name("my-cluster-network")
      .resourceGroup(resourceGroupIdentityModel)
      .subnetPrefixes(java.util.Arrays.asList(clusterNetworkSubnetPrefixPrototypeModel))
      .build();
    assertEquals(createClusterNetworkOptionsModel.profile(), clusterNetworkProfileIdentityModel);
    assertEquals(createClusterNetworkOptionsModel.vpc(), vpcIdentityModel);
    assertEquals(createClusterNetworkOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createClusterNetworkOptionsModel.name(), "my-cluster-network");
    assertEquals(createClusterNetworkOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createClusterNetworkOptionsModel.subnetPrefixes(), java.util.Arrays.asList(clusterNetworkSubnetPrefixPrototypeModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateClusterNetworkOptionsError() throws Throwable {
    new CreateClusterNetworkOptions.Builder().build();
  }

}