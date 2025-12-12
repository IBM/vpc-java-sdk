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

import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotConsistencyGroupContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots model.
 */
public class SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeIdentityModel.id(), "r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    SnapshotPrototypeSnapshotConsistencyGroupContext snapshotPrototypeSnapshotConsistencyGroupContextModel = new SnapshotPrototypeSnapshotConsistencyGroupContext.Builder()
      .name("my-snapshot")
      .sourceVolume(volumeIdentityModel)
      .userTags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModel.name(), "my-snapshot");
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModel.sourceVolume(), volumeIdentityModel);
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModel.userTags(), java.util.Arrays.asList("testString"));

    SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModel = new SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.Builder()
      .deleteSnapshotsOnDelete(true)
      .name("my-snapshot-consistency-group")
      .resourceGroup(resourceGroupIdentityModel)
      .snapshots(java.util.Arrays.asList(snapshotPrototypeSnapshotConsistencyGroupContextModel))
      .build();
    assertEquals(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModel.deleteSnapshotsOnDelete(), Boolean.valueOf(true));
    assertEquals(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModel.name(), "my-snapshot-consistency-group");
    assertEquals(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModel.snapshots(), java.util.Arrays.asList(snapshotPrototypeSnapshotConsistencyGroupContextModel));

    String json = TestUtilities.serialize(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModel);

    SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModelNew = TestUtilities.deserialize(json, SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.class);
    assertTrue(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModelNew instanceof SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots);
    assertEquals(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModelNew.deleteSnapshotsOnDelete(), Boolean.valueOf(true));
    assertEquals(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModelNew.name(), "my-snapshot-consistency-group");
    assertEquals(snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshotsError() throws Throwable {
    new SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.Builder().build();
  }

}