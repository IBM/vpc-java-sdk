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

import com.ibm.cloud.is.vpc.v1.model.ListSubnetReservedIpsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListSubnetReservedIpsOptions model.
 */
public class ListSubnetReservedIpsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListSubnetReservedIpsOptions() throws Throwable {
    ListSubnetReservedIpsOptions listSubnetReservedIpsOptionsModel = new ListSubnetReservedIpsOptions.Builder()
      .subnetId("testString")
      .start("testString")
      .limit(Long.valueOf("50"))
      .sort("name")
      .targetId("testString")
      .targetCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::load-balancer:r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .targetName("my-resource")
      .targetResourceType("testString")
      .build();
    assertEquals(listSubnetReservedIpsOptionsModel.subnetId(), "testString");
    assertEquals(listSubnetReservedIpsOptionsModel.start(), "testString");
    assertEquals(listSubnetReservedIpsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listSubnetReservedIpsOptionsModel.sort(), "name");
    assertEquals(listSubnetReservedIpsOptionsModel.targetId(), "testString");
    assertEquals(listSubnetReservedIpsOptionsModel.targetCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::load-balancer:r006-dd754295-e9e0-4c9d-bf6c-58fbc59e5727");
    assertEquals(listSubnetReservedIpsOptionsModel.targetName(), "my-resource");
    assertEquals(listSubnetReservedIpsOptionsModel.targetResourceType(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSubnetReservedIpsOptionsError() throws Throwable {
    new ListSubnetReservedIpsOptions.Builder().build();
  }

}