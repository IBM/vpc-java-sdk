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

import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListVpcRoutesOptions model.
 */
public class ListVpcRoutesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListVpcRoutesOptions() throws Throwable {
    ListVpcRoutesOptions listVpcRoutesOptionsModel = new ListVpcRoutesOptions.Builder()
      .vpcId("testString")
      .zoneName("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();
    assertEquals(listVpcRoutesOptionsModel.vpcId(), "testString");
    assertEquals(listVpcRoutesOptionsModel.zoneName(), "testString");
    assertEquals(listVpcRoutesOptionsModel.start(), "testString");
    assertEquals(listVpcRoutesOptionsModel.limit(), Long.valueOf("1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpcRoutesOptionsError() throws Throwable {
    new ListVpcRoutesOptions.Builder().build();
  }

}