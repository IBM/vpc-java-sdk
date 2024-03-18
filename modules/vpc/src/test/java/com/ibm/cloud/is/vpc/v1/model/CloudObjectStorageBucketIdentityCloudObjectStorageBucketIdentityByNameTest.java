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

import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName model.
 */
public class CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName() throws Throwable {
    CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameModel = new CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder()
      .name("bucket-27200-lwx4cfvcue")
      .build();
    assertEquals(cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameModel.name(), "bucket-27200-lwx4cfvcue");

    String json = TestUtilities.serialize(cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameModel);

    CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameModelNew = TestUtilities.deserialize(json, CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.class);
    assertTrue(cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameModelNew instanceof CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName);
    assertEquals(cloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameModelNew.name(), "bucket-27200-lwx4cfvcue");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByNameError() throws Throwable {
    new CloudObjectStorageBucketIdentityCloudObjectStorageBucketIdentityByName.Builder().build();
  }

}