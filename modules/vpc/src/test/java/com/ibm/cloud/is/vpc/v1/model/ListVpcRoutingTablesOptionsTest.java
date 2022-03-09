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

import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutingTablesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListVpcRoutingTablesOptions model.
 */
public class ListVpcRoutingTablesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListVpcRoutingTablesOptions() throws Throwable {
    ListVpcRoutingTablesOptions listVpcRoutingTablesOptionsModel = new ListVpcRoutingTablesOptions.Builder()
      .vpcId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .isDefault(true)
      .build();
    assertEquals(listVpcRoutingTablesOptionsModel.vpcId(), "testString");
    assertEquals(listVpcRoutingTablesOptionsModel.start(), "testString");
    assertEquals(listVpcRoutingTablesOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(listVpcRoutingTablesOptionsModel.isDefault(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpcRoutingTablesOptionsError() throws Throwable {
    new ListVpcRoutingTablesOptions.Builder().build();
  }

}