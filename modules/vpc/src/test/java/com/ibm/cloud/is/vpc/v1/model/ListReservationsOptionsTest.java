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

import com.ibm.cloud.is.vpc.v1.model.ListReservationsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListReservationsOptions model.
 */
public class ListReservationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListReservationsOptions() throws Throwable {
    ListReservationsOptions listReservationsOptionsModel = new ListReservationsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .name("my-name")
      .profileResourceType("testString")
      .affinityPolicy("automatic")
      .resourceGroupId("testString")
      .zoneName("us-south-1")
      .build();
    assertEquals(listReservationsOptionsModel.start(), "testString");
    assertEquals(listReservationsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listReservationsOptionsModel.name(), "my-name");
    assertEquals(listReservationsOptionsModel.profileResourceType(), "testString");
    assertEquals(listReservationsOptionsModel.affinityPolicy(), "automatic");
    assertEquals(listReservationsOptionsModel.resourceGroupId(), "testString");
    assertEquals(listReservationsOptionsModel.zoneName(), "us-south-1");
  }
}