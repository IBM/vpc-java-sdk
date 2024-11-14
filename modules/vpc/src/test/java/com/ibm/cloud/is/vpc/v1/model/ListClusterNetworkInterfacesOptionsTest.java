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

import com.ibm.cloud.is.vpc.v1.model.ListClusterNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListClusterNetworkInterfacesOptions model.
 */
public class ListClusterNetworkInterfacesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListClusterNetworkInterfacesOptions() throws Throwable {
    ListClusterNetworkInterfacesOptions listClusterNetworkInterfacesOptionsModel = new ListClusterNetworkInterfacesOptions.Builder()
      .clusterNetworkId("testString")
      .start("testString")
      .limit(Long.valueOf("50"))
      .name("my-name")
      .sort("name")
      .build();
    assertEquals(listClusterNetworkInterfacesOptionsModel.clusterNetworkId(), "testString");
    assertEquals(listClusterNetworkInterfacesOptionsModel.start(), "testString");
    assertEquals(listClusterNetworkInterfacesOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listClusterNetworkInterfacesOptionsModel.name(), "my-name");
    assertEquals(listClusterNetworkInterfacesOptionsModel.sort(), "name");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListClusterNetworkInterfacesOptionsError() throws Throwable {
    new ListClusterNetworkInterfacesOptions.Builder().build();
  }

}