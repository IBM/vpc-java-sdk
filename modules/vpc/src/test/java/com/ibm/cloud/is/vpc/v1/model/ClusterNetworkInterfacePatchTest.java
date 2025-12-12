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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetworkInterfacePatch model.
 */
public class ClusterNetworkInterfacePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetworkInterfacePatch() throws Throwable {
    ClusterNetworkInterfacePatch clusterNetworkInterfacePatchModel = new ClusterNetworkInterfacePatch.Builder()
      .autoDelete(false)
      .name("my-cluster-network-interface")
      .build();
    assertEquals(clusterNetworkInterfacePatchModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(clusterNetworkInterfacePatchModel.name(), "my-cluster-network-interface");

    String json = TestUtilities.serialize(clusterNetworkInterfacePatchModel);

    ClusterNetworkInterfacePatch clusterNetworkInterfacePatchModelNew = TestUtilities.deserialize(json, ClusterNetworkInterfacePatch.class);
    assertTrue(clusterNetworkInterfacePatchModelNew instanceof ClusterNetworkInterfacePatch);
    assertEquals(clusterNetworkInterfacePatchModelNew.autoDelete(), Boolean.valueOf(false));
    assertEquals(clusterNetworkInterfacePatchModelNew.name(), "my-cluster-network-interface");
  }
  @Test
  public void testClusterNetworkInterfacePatchAsPatch() throws Throwable {
    ClusterNetworkInterfacePatch clusterNetworkInterfacePatchModel = new ClusterNetworkInterfacePatch.Builder()
      .autoDelete(false)
      .name("my-cluster-network-interface")
      .build();

    Map<String, Object> mergePatch = clusterNetworkInterfacePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("auto_delete"));
    assertEquals(mergePatch.get("name"), "my-cluster-network-interface");
  }

}