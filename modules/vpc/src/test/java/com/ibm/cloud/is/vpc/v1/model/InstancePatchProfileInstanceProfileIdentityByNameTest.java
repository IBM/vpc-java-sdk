/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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

import com.ibm.cloud.is.vpc.v1.model.InstancePatchProfileInstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePatchProfileInstanceProfileIdentityByName model.
 */
public class InstancePatchProfileInstanceProfileIdentityByNameTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePatchProfileInstanceProfileIdentityByName() throws Throwable {
    InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileInstanceProfileIdentityByNameModel = new InstancePatchProfileInstanceProfileIdentityByName.Builder()
      .name("bx2-4x16")
      .build();
    assertEquals(instancePatchProfileInstanceProfileIdentityByNameModel.name(), "bx2-4x16");

    String json = TestUtilities.serialize(instancePatchProfileInstanceProfileIdentityByNameModel);

    InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileInstanceProfileIdentityByNameModelNew = TestUtilities.deserialize(json, InstancePatchProfileInstanceProfileIdentityByName.class);
    assertTrue(instancePatchProfileInstanceProfileIdentityByNameModelNew instanceof InstancePatchProfileInstanceProfileIdentityByName);
    assertEquals(instancePatchProfileInstanceProfileIdentityByNameModelNew.name(), "bx2-4x16");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstancePatchProfileInstanceProfileIdentityByNameError() throws Throwable {
    new InstancePatchProfileInstanceProfileIdentityByName.Builder().build();
  }

}