/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.VolumePatch;
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
    VolumePatch volumePatchModel = new VolumePatch.Builder()
      .name("my-volume")
      .build();
    assertEquals(volumePatchModel.name(), "my-volume");

    String json = TestUtilities.serialize(volumePatchModel);

    VolumePatch volumePatchModelNew = TestUtilities.deserialize(json, VolumePatch.class);
    assertTrue(volumePatchModelNew instanceof VolumePatch);
    assertEquals(volumePatchModelNew.name(), "my-volume");
  }
  @Test
  public void testVolumePatchAsPatch() throws Throwable {
    VolumePatch volumePatchModel = new VolumePatch.Builder()
      .name("my-volume")
      .build();

    Map<String, Object> mergePatch = volumePatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-volume");
  }

}