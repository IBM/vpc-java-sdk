/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.CreateImageExportJobOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateImageExportJobOptions model.
 */
public class CreateImageExportJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateImageExportJobOptions() throws Throwable {
    CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityModel = new CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
      .name("bucket-27200-lwx4cfvcue")
      .build();
    assertEquals(cloudObjectStorageBucketIdentityModel.name(), "bucket-27200-lwx4cfvcue");

    CreateImageExportJobOptions createImageExportJobOptionsModel = new CreateImageExportJobOptions.Builder()
      .imageId("testString")
      .storageBucket(cloudObjectStorageBucketIdentityModel)
      .format("qcow2")
      .name("my-image-export-job")
      .build();
    assertEquals(createImageExportJobOptionsModel.imageId(), "testString");
    assertEquals(createImageExportJobOptionsModel.storageBucket(), cloudObjectStorageBucketIdentityModel);
    assertEquals(createImageExportJobOptionsModel.format(), "qcow2");
    assertEquals(createImageExportJobOptionsModel.name(), "my-image-export-job");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateImageExportJobOptionsError() throws Throwable {
    new CreateImageExportJobOptions.Builder().build();
  }

}