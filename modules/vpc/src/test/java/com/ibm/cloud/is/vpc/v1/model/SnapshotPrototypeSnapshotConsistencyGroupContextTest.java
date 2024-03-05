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
 * Unit test class for the SnapshotPrototypeSnapshotConsistencyGroupContext model.
 */
public class SnapshotPrototypeSnapshotConsistencyGroupContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotPrototypeSnapshotConsistencyGroupContext() throws Throwable {
    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeIdentityModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    SnapshotPrototypeSnapshotConsistencyGroupContext snapshotPrototypeSnapshotConsistencyGroupContextModel = new SnapshotPrototypeSnapshotConsistencyGroupContext.Builder()
      .name("my-snapshot")
      .sourceVolume(volumeIdentityModel)
      .userTags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModel.name(), "my-snapshot");
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModel.sourceVolume(), volumeIdentityModel);
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModel.userTags(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(snapshotPrototypeSnapshotConsistencyGroupContextModel);

    SnapshotPrototypeSnapshotConsistencyGroupContext snapshotPrototypeSnapshotConsistencyGroupContextModelNew = TestUtilities.deserialize(json, SnapshotPrototypeSnapshotConsistencyGroupContext.class);
    assertTrue(snapshotPrototypeSnapshotConsistencyGroupContextModelNew instanceof SnapshotPrototypeSnapshotConsistencyGroupContext);
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModelNew.name(), "my-snapshot");
    assertEquals(snapshotPrototypeSnapshotConsistencyGroupContextModelNew.sourceVolume().toString(), volumeIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSnapshotPrototypeSnapshotConsistencyGroupContextError() throws Throwable {
    new SnapshotPrototypeSnapshotConsistencyGroupContext.Builder().build();
  }

}