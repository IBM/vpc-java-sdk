/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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

import com.ibm.cloud.is.vpc.v1.model.CreateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateFlowLogCollectorOptions model.
 */
public class CreateFlowLogCollectorOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateFlowLogCollectorOptions() throws Throwable {
    LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName legacyCloudObjectStorageBucketIdentityModel = new LegacyCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
      .name("bucket-27200-lwx4cfvcue")
      .build();
    assertEquals(legacyCloudObjectStorageBucketIdentityModel.name(), "bucket-27200-lwx4cfvcue");

    FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById flowLogCollectorTargetPrototypeModel = new FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
      .id("10c02d81-0ecb-4dc5-897d-28392913b81e")
      .build();
    assertEquals(flowLogCollectorTargetPrototypeModel.id(), "10c02d81-0ecb-4dc5-897d-28392913b81e");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreateFlowLogCollectorOptions createFlowLogCollectorOptionsModel = new CreateFlowLogCollectorOptions.Builder()
      .storageBucket(legacyCloudObjectStorageBucketIdentityModel)
      .target(flowLogCollectorTargetPrototypeModel)
      .active(false)
      .name("my-flow-log-collector")
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(createFlowLogCollectorOptionsModel.storageBucket(), legacyCloudObjectStorageBucketIdentityModel);
    assertEquals(createFlowLogCollectorOptionsModel.target(), flowLogCollectorTargetPrototypeModel);
    assertEquals(createFlowLogCollectorOptionsModel.active(), Boolean.valueOf(false));
    assertEquals(createFlowLogCollectorOptionsModel.name(), "my-flow-log-collector");
    assertEquals(createFlowLogCollectorOptionsModel.resourceGroup(), resourceGroupIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateFlowLogCollectorOptionsError() throws Throwable {
    new CreateFlowLogCollectorOptions.Builder().build();
  }

}