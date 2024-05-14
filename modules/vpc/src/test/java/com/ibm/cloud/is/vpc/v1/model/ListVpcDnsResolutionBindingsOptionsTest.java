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

import com.ibm.cloud.is.vpc.v1.model.ListVpcDnsResolutionBindingsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListVpcDnsResolutionBindingsOptions model.
 */
public class ListVpcDnsResolutionBindingsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListVpcDnsResolutionBindingsOptions() throws Throwable {
    ListVpcDnsResolutionBindingsOptions listVpcDnsResolutionBindingsOptionsModel = new ListVpcDnsResolutionBindingsOptions.Builder()
      .vpcId("testString")
      .sort("name")
      .start("testString")
      .limit(Long.valueOf("50"))
      .name("testString")
      .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .vpcName("my-vpc")
      .accountId("bb1b52262f7441a586f49068482f1e60")
      .build();
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.vpcId(), "testString");
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.sort(), "name");
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.start(), "testString");
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.name(), "testString");
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.vpcCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.vpcName(), "my-vpc");
    assertEquals(listVpcDnsResolutionBindingsOptionsModel.accountId(), "bb1b52262f7441a586f49068482f1e60");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListVpcDnsResolutionBindingsOptionsError() throws Throwable {
    new ListVpcDnsResolutionBindingsOptions.Builder().build();
  }

}