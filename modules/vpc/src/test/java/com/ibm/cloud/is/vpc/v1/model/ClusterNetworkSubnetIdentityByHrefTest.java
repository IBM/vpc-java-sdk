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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkSubnetIdentityByHref model.
 */
public class ClusterNetworkSubnetIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkSubnetIdentityByHref() throws Throwable {
    ClusterNetworkSubnetIdentityByHref clusterNetworkSubnetIdentityByHrefModel = new ClusterNetworkSubnetIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/cluster_networks/0717-da0df18c-7598-4633-a648-fdaac28a5573/subnets/0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930")
      .build();
    assertEquals(clusterNetworkSubnetIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/cluster_networks/0717-da0df18c-7598-4633-a648-fdaac28a5573/subnets/0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930");

    String json = TestUtilities.serialize(clusterNetworkSubnetIdentityByHrefModel);

    ClusterNetworkSubnetIdentityByHref clusterNetworkSubnetIdentityByHrefModelNew = TestUtilities.deserialize(json, ClusterNetworkSubnetIdentityByHref.class);
    assertTrue(clusterNetworkSubnetIdentityByHrefModelNew instanceof ClusterNetworkSubnetIdentityByHref);
    assertEquals(clusterNetworkSubnetIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/cluster_networks/0717-da0df18c-7598-4633-a648-fdaac28a5573/subnets/0717-7931845c-65c4-4b0a-80cd-7d9c1a6d7930");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testClusterNetworkSubnetIdentityByHrefError() throws Throwable {
    new ClusterNetworkSubnetIdentityByHref.Builder().build();
  }

}