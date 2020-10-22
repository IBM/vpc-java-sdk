/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CloudObjectStorageBucketIdentityByName model.
 */
public class CloudObjectStorageBucketIdentityByNameTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCloudObjectStorageBucketIdentityByName() throws Throwable {
    CloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityByNameModel = new CloudObjectStorageBucketIdentityByName.Builder()
      .name("bucket-27200-lwx4cfvcue")
      .build();
    assertEquals(cloudObjectStorageBucketIdentityByNameModel.name(), "bucket-27200-lwx4cfvcue");

    String json = TestUtilities.serialize(cloudObjectStorageBucketIdentityByNameModel);

    CloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityByNameModelNew = TestUtilities.deserialize(json, CloudObjectStorageBucketIdentityByName.class);
    assertTrue(cloudObjectStorageBucketIdentityByNameModelNew instanceof CloudObjectStorageBucketIdentityByName);
    assertEquals(cloudObjectStorageBucketIdentityByNameModelNew.name(), "bucket-27200-lwx4cfvcue");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCloudObjectStorageBucketIdentityByNameError() throws Throwable {
    new CloudObjectStorageBucketIdentityByName.Builder().build();
  }

}