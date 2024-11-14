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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkPatch model.
 */
public class ClusterNetworkPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkPatch() throws Throwable {
    ClusterNetworkPatch clusterNetworkPatchModel = new ClusterNetworkPatch.Builder()
      .name("my-cluster-network")
      .build();
    assertEquals(clusterNetworkPatchModel.name(), "my-cluster-network");

    String json = TestUtilities.serialize(clusterNetworkPatchModel);

    ClusterNetworkPatch clusterNetworkPatchModelNew = TestUtilities.deserialize(json, ClusterNetworkPatch.class);
    assertTrue(clusterNetworkPatchModelNew instanceof ClusterNetworkPatch);
    assertEquals(clusterNetworkPatchModelNew.name(), "my-cluster-network");
  }
  @Test
  public void testClusterNetworkPatchAsPatch() throws Throwable {
    ClusterNetworkPatch clusterNetworkPatchModel = new ClusterNetworkPatch.Builder()
      .name("my-cluster-network")
      .build();

    Map<String, Object> mergePatch = clusterNetworkPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-cluster-network");
  }

}