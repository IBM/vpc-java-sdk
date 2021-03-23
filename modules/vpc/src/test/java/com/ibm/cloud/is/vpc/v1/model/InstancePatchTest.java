/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.is.vpc.v1.model.InstancePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePatch model.
 */
public class InstancePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePatch() throws Throwable {
    InstancePatch instancePatchModel = new InstancePatch.Builder()
      .name("my-instance")
      .build();
    assertEquals(instancePatchModel.name(), "my-instance");

    String json = TestUtilities.serialize(instancePatchModel);

    InstancePatch instancePatchModelNew = TestUtilities.deserialize(json, InstancePatch.class);
    assertTrue(instancePatchModelNew instanceof InstancePatch);
    assertEquals(instancePatchModelNew.name(), "my-instance");
  }
  @Test
  public void testInstancePatchAsPatch() throws Throwable {
    InstancePatch instancePatchModel = new InstancePatch.Builder()
      .name("my-instance")
      .build();

    Map<String, Object> mergePatch = instancePatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-instance");
  }

}