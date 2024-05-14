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

import com.ibm.cloud.is.vpc.v1.model.ListSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListSnapshotsOptions model.
 */
public class ListSnapshotsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListSnapshotsOptions() throws Throwable {
    ListSnapshotsOptions listSnapshotsOptionsModel = new ListSnapshotsOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .tag("testString")
      .resourceGroupId("testString")
      .name("testString")
      .sourceVolumeId("testString")
      .sourceVolumeCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .sourceImageId("testString")
      .sourceImageCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .sort("name")
      .backupPolicyPlanId("testString")
      .copiesId("testString")
      .copiesName("my-snapshot-copy")
      .copiesCrn("testString")
      .copiesRemoteRegionName("us-south")
      .sourceSnapshotId("testString")
      .sourceSnapshotRemoteRegionName("us-south")
      .sourceVolumeRemoteRegionName("us-south")
      .sourceImageRemoteRegionName("us-south")
      .clonesZoneName("us-south-1")
      .snapshotConsistencyGroupId("testString")
      .snapshotConsistencyGroupCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot-consistency-group:r134-fa329f6b-0e36-433f-a3bb-0df632e79263")
      .build();
    assertEquals(listSnapshotsOptionsModel.start(), "testString");
    assertEquals(listSnapshotsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listSnapshotsOptionsModel.tag(), "testString");
    assertEquals(listSnapshotsOptionsModel.resourceGroupId(), "testString");
    assertEquals(listSnapshotsOptionsModel.name(), "testString");
    assertEquals(listSnapshotsOptionsModel.sourceVolumeId(), "testString");
    assertEquals(listSnapshotsOptionsModel.sourceVolumeCrn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5");
    assertEquals(listSnapshotsOptionsModel.sourceImageId(), "testString");
    assertEquals(listSnapshotsOptionsModel.sourceImageCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::image:72b27b5c-f4b0-48bb-b954-5becc7c1dcb8");
    assertEquals(listSnapshotsOptionsModel.sort(), "name");
    assertEquals(listSnapshotsOptionsModel.backupPolicyPlanId(), "testString");
    assertEquals(listSnapshotsOptionsModel.copiesId(), "testString");
    assertEquals(listSnapshotsOptionsModel.copiesName(), "my-snapshot-copy");
    assertEquals(listSnapshotsOptionsModel.copiesCrn(), "testString");
    assertEquals(listSnapshotsOptionsModel.copiesRemoteRegionName(), "us-south");
    assertEquals(listSnapshotsOptionsModel.sourceSnapshotId(), "testString");
    assertEquals(listSnapshotsOptionsModel.sourceSnapshotRemoteRegionName(), "us-south");
    assertEquals(listSnapshotsOptionsModel.sourceVolumeRemoteRegionName(), "us-south");
    assertEquals(listSnapshotsOptionsModel.sourceImageRemoteRegionName(), "us-south");
    assertEquals(listSnapshotsOptionsModel.clonesZoneName(), "us-south-1");
    assertEquals(listSnapshotsOptionsModel.snapshotConsistencyGroupId(), "testString");
    assertEquals(listSnapshotsOptionsModel.snapshotConsistencyGroupCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::snapshot-consistency-group:r134-fa329f6b-0e36-433f-a3bb-0df632e79263");
  }
}