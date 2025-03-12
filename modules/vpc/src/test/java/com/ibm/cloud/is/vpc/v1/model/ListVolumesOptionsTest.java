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

import com.ibm.cloud.is.vpc.v1.model.ListVolumesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListVolumesOptions model.
 */
public class ListVolumesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListVolumesOptions() throws Throwable {
    ListVolumesOptions listVolumesOptionsModel = new ListVolumesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .name("my-name")
      .attachmentState("attached")
      .encryption("provider_managed")
      .operatingSystemFamily("Ubuntu Server")
      .operatingSystemArchitecture("amd64")
      .zoneName("us-south-1")
      .tag("testString")
      .build();
    assertEquals(listVolumesOptionsModel.start(), "testString");
    assertEquals(listVolumesOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listVolumesOptionsModel.name(), "my-name");
    assertEquals(listVolumesOptionsModel.attachmentState(), "attached");
    assertEquals(listVolumesOptionsModel.encryption(), "provider_managed");
    assertEquals(listVolumesOptionsModel.operatingSystemFamily(), "Ubuntu Server");
    assertEquals(listVolumesOptionsModel.operatingSystemArchitecture(), "amd64");
    assertEquals(listVolumesOptionsModel.zoneName(), "us-south-1");
    assertEquals(listVolumesOptionsModel.tag(), "testString");
  }
}