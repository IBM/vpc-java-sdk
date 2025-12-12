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

import com.ibm.cloud.is.vpc.v1.model.ClusterNetwork;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ClusterNetworkSubnetPrefix;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClusterNetwork model.
 */
public class ClusterNetworkTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClusterNetwork() throws Throwable {
    ClusterNetwork clusterNetworkModel = new ClusterNetwork();
    assertNull(clusterNetworkModel.getCreatedAt());
    assertNull(clusterNetworkModel.getCrn());
    assertNull(clusterNetworkModel.getHref());
    assertNull(clusterNetworkModel.getId());
    assertNull(clusterNetworkModel.getLifecycleReasons());
    assertNull(clusterNetworkModel.getLifecycleState());
    assertNull(clusterNetworkModel.getName());
    assertNull(clusterNetworkModel.getProfile());
    assertNull(clusterNetworkModel.getResourceGroup());
    assertNull(clusterNetworkModel.getResourceType());
    assertNull(clusterNetworkModel.getSubnetPrefixes());
    assertNull(clusterNetworkModel.getVpc());
    assertNull(clusterNetworkModel.getZone());
  }
}