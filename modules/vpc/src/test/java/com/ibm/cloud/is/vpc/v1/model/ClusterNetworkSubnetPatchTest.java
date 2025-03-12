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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkSubnetPatch model.
 */
public class ClusterNetworkSubnetPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkSubnetPatch() throws Throwable {
    ClusterNetworkSubnetPatch clusterNetworkSubnetPatchModel = new ClusterNetworkSubnetPatch.Builder()
      .name("my-cluster-network-subnet")
      .build();
    assertEquals(clusterNetworkSubnetPatchModel.name(), "my-cluster-network-subnet");

    String json = TestUtilities.serialize(clusterNetworkSubnetPatchModel);

    ClusterNetworkSubnetPatch clusterNetworkSubnetPatchModelNew = TestUtilities.deserialize(json, ClusterNetworkSubnetPatch.class);
    assertTrue(clusterNetworkSubnetPatchModelNew instanceof ClusterNetworkSubnetPatch);
    assertEquals(clusterNetworkSubnetPatchModelNew.name(), "my-cluster-network-subnet");
  }
  @Test
  public void testClusterNetworkSubnetPatchAsPatch() throws Throwable {
    ClusterNetworkSubnetPatch clusterNetworkSubnetPatchModel = new ClusterNetworkSubnetPatch.Builder()
      .name("my-cluster-network-subnet")
      .build();

    Map<String, Object> mergePatch = clusterNetworkSubnetPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-cluster-network-subnet");
  }

}