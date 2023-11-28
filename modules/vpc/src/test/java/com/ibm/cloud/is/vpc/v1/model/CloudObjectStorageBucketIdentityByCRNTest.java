/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CloudObjectStorageBucketIdentityByCRN model.
 */
public class CloudObjectStorageBucketIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCloudObjectStorageBucketIdentityByCRN() throws Throwable {
    CloudObjectStorageBucketIdentityByCRN cloudObjectStorageBucketIdentityByCrnModel = new CloudObjectStorageBucketIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:cloud-object-storage:global:a/123456:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:my-bucket")
      .build();
    assertEquals(cloudObjectStorageBucketIdentityByCrnModel.crn(), "crn:v1:bluemix:public:cloud-object-storage:global:a/123456:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:my-bucket");

    String json = TestUtilities.serialize(cloudObjectStorageBucketIdentityByCrnModel);

    CloudObjectStorageBucketIdentityByCRN cloudObjectStorageBucketIdentityByCrnModelNew = TestUtilities.deserialize(json, CloudObjectStorageBucketIdentityByCRN.class);
    assertTrue(cloudObjectStorageBucketIdentityByCrnModelNew instanceof CloudObjectStorageBucketIdentityByCRN);
    assertEquals(cloudObjectStorageBucketIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:cloud-object-storage:global:a/123456:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:my-bucket");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCloudObjectStorageBucketIdentityByCRNError() throws Throwable {
    new CloudObjectStorageBucketIdentityByCRN.Builder().build();
  }

}