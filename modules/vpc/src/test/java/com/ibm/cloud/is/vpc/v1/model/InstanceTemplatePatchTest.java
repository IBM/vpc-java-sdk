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

import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceTemplatePatch model.
 */
public class InstanceTemplatePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplatePatch() throws Throwable {
    InstanceTemplatePatch instanceTemplatePatchModel = new InstanceTemplatePatch.Builder()
      .name("my-instance-template")
      .build();
    assertEquals(instanceTemplatePatchModel.name(), "my-instance-template");

    String json = TestUtilities.serialize(instanceTemplatePatchModel);

    InstanceTemplatePatch instanceTemplatePatchModelNew = TestUtilities.deserialize(json, InstanceTemplatePatch.class);
    assertTrue(instanceTemplatePatchModelNew instanceof InstanceTemplatePatch);
    assertEquals(instanceTemplatePatchModelNew.name(), "my-instance-template");
  }
  @Test
  public void testInstanceTemplatePatchAsPatch() throws Throwable {
    InstanceTemplatePatch instanceTemplatePatchModel = new InstanceTemplatePatch.Builder()
      .name("my-instance-template")
      .build();

    Map<String, Object> mergePatch = instanceTemplatePatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-instance-template");
  }

}