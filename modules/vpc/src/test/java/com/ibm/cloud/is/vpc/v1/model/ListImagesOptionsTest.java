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

import com.ibm.cloud.is.vpc.v1.model.ListImagesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListImagesOptions model.
 */
public class ListImagesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListImagesOptions() throws Throwable {
    ListImagesOptions listImagesOptionsModel = new ListImagesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .resourceGroupId("testString")
      .name("my-name")
      .status(java.util.Arrays.asList("available"))
      .visibility("private")
      .userDataFormat(java.util.Arrays.asList("cloud_init"))
      .remoteAccountId("bb1b52262f7441a586f49068482f1e60")
      .build();
    assertEquals(listImagesOptionsModel.start(), "testString");
    assertEquals(listImagesOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listImagesOptionsModel.resourceGroupId(), "testString");
    assertEquals(listImagesOptionsModel.name(), "my-name");
    assertEquals(listImagesOptionsModel.status(), java.util.Arrays.asList("available"));
    assertEquals(listImagesOptionsModel.visibility(), "private");
    assertEquals(listImagesOptionsModel.userDataFormat(), java.util.Arrays.asList("cloud_init"));
    assertEquals(listImagesOptionsModel.remoteAccountId(), "bb1b52262f7441a586f49068482f1e60");
  }
}