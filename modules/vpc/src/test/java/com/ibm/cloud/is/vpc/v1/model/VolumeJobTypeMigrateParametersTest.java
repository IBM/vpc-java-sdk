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
 * Unit test class for the VolumeJobTypeMigrateParameters model.
 */
public class VolumeJobTypeMigrateParametersTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeJobTypeMigrateParameters() throws Throwable {
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

    String json = TestUtilities.serialize(volumeJobTypeMigrateParametersModel);

    VolumeJobTypeMigrateParameters volumeJobTypeMigrateParametersModelNew = TestUtilities.deserialize(json, VolumeJobTypeMigrateParameters.class);
    assertTrue(volumeJobTypeMigrateParametersModelNew instanceof VolumeJobTypeMigrateParameters);
    assertEquals(volumeJobTypeMigrateParametersModelNew.bandwidth(), Long.valueOf("1000"));
    assertEquals(volumeJobTypeMigrateParametersModelNew.iops(), Long.valueOf("10000"));
    assertEquals(volumeJobTypeMigrateParametersModelNew.profile().toString(), volumeProfileIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeJobTypeMigrateParametersError() throws Throwable {
    new VolumeJobTypeMigrateParameters.Builder().build();
  }

}