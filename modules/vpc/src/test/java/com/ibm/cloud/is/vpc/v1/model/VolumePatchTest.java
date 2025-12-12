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

import com.ibm.cloud.is.vpc.v1.model.VolumeAllowedUsePatch;
import com.ibm.cloud.is.vpc.v1.model.VolumePatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumePatch model.
 */
public class VolumePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumePatch() throws Throwable {
    VolumeAllowedUsePatch volumeAllowedUsePatchModel = new VolumeAllowedUsePatch.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();
    assertEquals(volumeAllowedUsePatchModel.apiVersion(), "2024-06-23");
    assertEquals(volumeAllowedUsePatchModel.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(volumeAllowedUsePatchModel.instance(), "gpu.count > 0 && enable_secure_boot == true");

    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    VolumePatch volumePatchModel = new VolumePatch.Builder()
      .allowedUse(volumeAllowedUsePatchModel)
      .bandwidth(Long.valueOf("1000"))
      .capacity(Long.valueOf("100"))
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .userTags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(volumePatchModel.allowedUse(), volumeAllowedUsePatchModel);
    assertEquals(volumePatchModel.bandwidth(), Long.valueOf("1000"));
    assertEquals(volumePatchModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePatchModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePatchModel.name(), "my-volume");
    assertEquals(volumePatchModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePatchModel.userTags(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(volumePatchModel);

    VolumePatch volumePatchModelNew = TestUtilities.deserialize(json, VolumePatch.class);
    assertTrue(volumePatchModelNew instanceof VolumePatch);
    assertEquals(volumePatchModelNew.allowedUse().toString(), volumeAllowedUsePatchModel.toString());
    assertEquals(volumePatchModelNew.bandwidth(), Long.valueOf("1000"));
    assertEquals(volumePatchModelNew.capacity(), Long.valueOf("100"));
    assertEquals(volumePatchModelNew.iops(), Long.valueOf("10000"));
    assertEquals(volumePatchModelNew.name(), "my-volume");
    assertEquals(volumePatchModelNew.profile().toString(), volumeProfileIdentityModel.toString());
  }
  @Test
  public void testVolumePatchAsPatch() throws Throwable {
    VolumeAllowedUsePatch volumeAllowedUsePatchModel = new VolumeAllowedUsePatch.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();

    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();

    VolumePatch volumePatchModel = new VolumePatch.Builder()
      .allowedUse(volumeAllowedUsePatchModel)
      .bandwidth(Long.valueOf("1000"))
      .capacity(Long.valueOf("100"))
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .userTags(java.util.Arrays.asList("testString"))
      .build();

    Map<String, Object> mergePatch = volumePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("allowed_use"));
    assertTrue(mergePatch.containsKey("bandwidth"));
    assertTrue(mergePatch.containsKey("capacity"));
    assertTrue(mergePatch.containsKey("iops"));
    assertEquals(mergePatch.get("name"), "my-volume");
    assertTrue(mergePatch.containsKey("profile"));
    assertTrue(mergePatch.containsKey("user_tags"));
  }

}