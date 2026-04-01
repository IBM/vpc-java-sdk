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

import com.ibm.cloud.is.vpc.v1.model.VolumeJobPrototypeVolumeJobTypeMigratePrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeJobTypeMigrateParameters;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeJobPrototypeVolumeJobTypeMigratePrototype model.
 */
public class VolumeJobPrototypeVolumeJobTypeMigratePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeJobPrototypeVolumeJobTypeMigratePrototype() throws Throwable {
    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    VolumeJobTypeMigrateParameters volumeJobTypeMigrateParametersModel = new VolumeJobTypeMigrateParameters.Builder()
      .bandwidth(Long.valueOf("1000"))
      .iops(Long.valueOf("10000"))
      .profile(volumeProfileIdentityModel)
      .build();
    assertEquals(volumeJobTypeMigrateParametersModel.bandwidth(), Long.valueOf("1000"));
    assertEquals(volumeJobTypeMigrateParametersModel.iops(), Long.valueOf("10000"));
    assertEquals(volumeJobTypeMigrateParametersModel.profile(), volumeProfileIdentityModel);

    VolumeJobPrototypeVolumeJobTypeMigratePrototype volumeJobPrototypeVolumeJobTypeMigratePrototypeModel = new VolumeJobPrototypeVolumeJobTypeMigratePrototype.Builder()
      .name("my-volume-job")
      .jobType("migrate")
      .parameters(volumeJobTypeMigrateParametersModel)
      .build();
    assertEquals(volumeJobPrototypeVolumeJobTypeMigratePrototypeModel.name(), "my-volume-job");
    assertEquals(volumeJobPrototypeVolumeJobTypeMigratePrototypeModel.jobType(), "migrate");
    assertEquals(volumeJobPrototypeVolumeJobTypeMigratePrototypeModel.parameters(), volumeJobTypeMigrateParametersModel);

    String json = TestUtilities.serialize(volumeJobPrototypeVolumeJobTypeMigratePrototypeModel);

    VolumeJobPrototypeVolumeJobTypeMigratePrototype volumeJobPrototypeVolumeJobTypeMigratePrototypeModelNew = TestUtilities.deserialize(json, VolumeJobPrototypeVolumeJobTypeMigratePrototype.class);
    assertTrue(volumeJobPrototypeVolumeJobTypeMigratePrototypeModelNew instanceof VolumeJobPrototypeVolumeJobTypeMigratePrototype);
    assertEquals(volumeJobPrototypeVolumeJobTypeMigratePrototypeModelNew.name(), "my-volume-job");
    assertEquals(volumeJobPrototypeVolumeJobTypeMigratePrototypeModelNew.jobType(), "migrate");
    assertEquals(volumeJobPrototypeVolumeJobTypeMigratePrototypeModelNew.parameters().toString(), volumeJobTypeMigrateParametersModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeJobPrototypeVolumeJobTypeMigratePrototypeError() throws Throwable {
    new VolumeJobPrototypeVolumeJobTypeMigratePrototype.Builder().build();
  }

}