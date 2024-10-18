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

import com.ibm.cloud.is.vpc.v1.model.ListSharesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListSharesOptions model.
 */
public class ListSharesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListSharesOptions() throws Throwable {
    ListSharesOptions listSharesOptionsModel = new ListSharesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .resourceGroupId("testString")
      .name("my-name")
      .sort("name")
      .replicationRole("none")
      .build();
    assertEquals(listSharesOptionsModel.start(), "testString");
    assertEquals(listSharesOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listSharesOptionsModel.resourceGroupId(), "testString");
    assertEquals(listSharesOptionsModel.name(), "my-name");
    assertEquals(listSharesOptionsModel.sort(), "name");
    assertEquals(listSharesOptionsModel.replicationRole(), "none");
  }
}