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

import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotClonePrototype;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotBySourceVolume;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotPrototypeSnapshotBySourceVolume model.
 */
public class SnapshotPrototypeSnapshotBySourceVolumeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotPrototypeSnapshotBySourceVolume() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    SnapshotClonePrototype snapshotClonePrototypeModel = new SnapshotClonePrototype.Builder()
      .zone(zoneIdentityModel)
      .build();
    assertEquals(snapshotClonePrototypeModel.zone(), zoneIdentityModel);

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeIdentityModel.id(), "r006-1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    SnapshotPrototypeSnapshotBySourceVolume snapshotPrototypeSnapshotBySourceVolumeModel = new SnapshotPrototypeSnapshotBySourceVolume.Builder()
      .clones(java.util.Arrays.asList(snapshotClonePrototypeModel))
      .name("my-snapshot")
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(java.util.Arrays.asList())
      .sourceVolume(volumeIdentityModel)
      .build();
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModel.clones(), java.util.Arrays.asList(snapshotClonePrototypeModel));
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModel.name(), "my-snapshot");
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModel.userTags(), java.util.Arrays.asList());
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModel.sourceVolume(), volumeIdentityModel);

    String json = TestUtilities.serialize(snapshotPrototypeSnapshotBySourceVolumeModel);

    SnapshotPrototypeSnapshotBySourceVolume snapshotPrototypeSnapshotBySourceVolumeModelNew = TestUtilities.deserialize(json, SnapshotPrototypeSnapshotBySourceVolume.class);
    assertTrue(snapshotPrototypeSnapshotBySourceVolumeModelNew instanceof SnapshotPrototypeSnapshotBySourceVolume);
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModelNew.name(), "my-snapshot");
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(snapshotPrototypeSnapshotBySourceVolumeModelNew.sourceVolume().toString(), volumeIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSnapshotPrototypeSnapshotBySourceVolumeError() throws Throwable {
    new SnapshotPrototypeSnapshotBySourceVolume.Builder().build();
  }

}