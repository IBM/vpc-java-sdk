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

import com.ibm.cloud.is.vpc.v1.model.DeleteClusterNetworkSubnetOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteClusterNetworkSubnetOptions model.
 */
public class DeleteClusterNetworkSubnetOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteClusterNetworkSubnetOptions() throws Throwable {
    DeleteClusterNetworkSubnetOptions deleteClusterNetworkSubnetOptionsModel = new DeleteClusterNetworkSubnetOptions.Builder()
      .clusterNetworkId("testString")
      .id("testString")
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .build();
    assertEquals(deleteClusterNetworkSubnetOptionsModel.clusterNetworkId(), "testString");
    assertEquals(deleteClusterNetworkSubnetOptionsModel.id(), "testString");
    assertEquals(deleteClusterNetworkSubnetOptionsModel.ifMatch(), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteClusterNetworkSubnetOptionsError() throws Throwable {
    new DeleteClusterNetworkSubnetOptions.Builder().build();
  }

}