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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionManagerPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerActionManagerPatch model.
 */
public class InstanceGroupManagerActionManagerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerActionManagerPatch() throws Throwable {
    InstanceGroupManagerActionManagerPatch instanceGroupManagerActionManagerPatchModel = new InstanceGroupManagerActionManagerPatch.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .build();
    assertEquals(instanceGroupManagerActionManagerPatchModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerActionManagerPatchModel.minMembershipCount(), Long.valueOf("10"));

    String json = TestUtilities.serialize(instanceGroupManagerActionManagerPatchModel);

    InstanceGroupManagerActionManagerPatch instanceGroupManagerActionManagerPatchModelNew = TestUtilities.deserialize(json, InstanceGroupManagerActionManagerPatch.class);
    assertTrue(instanceGroupManagerActionManagerPatchModelNew instanceof InstanceGroupManagerActionManagerPatch);
    assertEquals(instanceGroupManagerActionManagerPatchModelNew.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerActionManagerPatchModelNew.minMembershipCount(), Long.valueOf("10"));
  }
}