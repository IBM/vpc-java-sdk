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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerPolicyPatch model.
 */
public class InstanceGroupManagerPolicyPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerPolicyPatch() throws Throwable {
    InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModel = new InstanceGroupManagerPolicyPatch.Builder()
      .metricType("cpu")
      .metricValue(Long.valueOf("26"))
      .name("my-instance-group-manager-policy")
      .build();
    assertEquals(instanceGroupManagerPolicyPatchModel.metricType(), "cpu");
    assertEquals(instanceGroupManagerPolicyPatchModel.metricValue(), Long.valueOf("26"));
    assertEquals(instanceGroupManagerPolicyPatchModel.name(), "my-instance-group-manager-policy");

    String json = TestUtilities.serialize(instanceGroupManagerPolicyPatchModel);

    InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModelNew = TestUtilities.deserialize(json, InstanceGroupManagerPolicyPatch.class);
    assertTrue(instanceGroupManagerPolicyPatchModelNew instanceof InstanceGroupManagerPolicyPatch);
    assertEquals(instanceGroupManagerPolicyPatchModelNew.metricType(), "cpu");
    assertEquals(instanceGroupManagerPolicyPatchModelNew.metricValue(), Long.valueOf("26"));
    assertEquals(instanceGroupManagerPolicyPatchModelNew.name(), "my-instance-group-manager-policy");
  }
  @Test
  public void testInstanceGroupManagerPolicyPatchAsPatch() throws Throwable {
    InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModel = new InstanceGroupManagerPolicyPatch.Builder()
      .metricType("cpu")
      .metricValue(Long.valueOf("26"))
      .name("my-instance-group-manager-policy")
      .build();

    Map<String, Object> mergePatch = instanceGroupManagerPolicyPatchModel.asPatch();

    assertEquals(mergePatch.get("metric_type"), "cpu");
    assertTrue(mergePatch.containsKey("metric_value"));
    assertEquals(mergePatch.get("name"), "my-instance-group-manager-policy");
  }

}