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

import com.ibm.cloud.is.vpc.v1.model.ListClusterNetworksOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListClusterNetworksOptions model.
 */
public class ListClusterNetworksOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListClusterNetworksOptions() throws Throwable {
    ListClusterNetworksOptions listClusterNetworksOptionsModel = new ListClusterNetworksOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .resourceGroupId("testString")
      .name("my-name")
      .sort("name")
      .vpcId("testString")
      .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .vpcName("my-vpc")
      .build();
    assertEquals(listClusterNetworksOptionsModel.start(), "testString");
    assertEquals(listClusterNetworksOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listClusterNetworksOptionsModel.resourceGroupId(), "testString");
    assertEquals(listClusterNetworksOptionsModel.name(), "my-name");
    assertEquals(listClusterNetworksOptionsModel.sort(), "name");
    assertEquals(listClusterNetworksOptionsModel.vpcId(), "testString");
    assertEquals(listClusterNetworksOptionsModel.vpcCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(listClusterNetworksOptionsModel.vpcName(), "my-vpc");
  }
}