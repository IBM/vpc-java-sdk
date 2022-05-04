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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerPolicyRulePatch model.
 */
public class LoadBalancerListenerPolicyRulePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyRulePatch() throws Throwable {
    LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModel = new LoadBalancerListenerPolicyRulePatch.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("body")
      .value("testString")
      .build();
    assertEquals(loadBalancerListenerPolicyRulePatchModel.condition(), "contains");
    assertEquals(loadBalancerListenerPolicyRulePatchModel.field(), "MY-APP-HEADER");
    assertEquals(loadBalancerListenerPolicyRulePatchModel.type(), "body");
    assertEquals(loadBalancerListenerPolicyRulePatchModel.value(), "testString");

    String json = TestUtilities.serialize(loadBalancerListenerPolicyRulePatchModel);

    LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyRulePatch.class);
    assertTrue(loadBalancerListenerPolicyRulePatchModelNew instanceof LoadBalancerListenerPolicyRulePatch);
    assertEquals(loadBalancerListenerPolicyRulePatchModelNew.condition(), "contains");
    assertEquals(loadBalancerListenerPolicyRulePatchModelNew.field(), "MY-APP-HEADER");
    assertEquals(loadBalancerListenerPolicyRulePatchModelNew.type(), "body");
    assertEquals(loadBalancerListenerPolicyRulePatchModelNew.value(), "testString");
  }
  @Test
  public void testLoadBalancerListenerPolicyRulePatchAsPatch() throws Throwable {
    LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModel = new LoadBalancerListenerPolicyRulePatch.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("body")
      .value("testString")
      .build();

    Map<String, Object> mergePatch = loadBalancerListenerPolicyRulePatchModel.asPatch();

    assertEquals(mergePatch.get("condition"), "contains");
    assertEquals(mergePatch.get("field"), "MY-APP-HEADER");
    assertEquals(mergePatch.get("type"), "body");
    assertEquals(mergePatch.get("value"), "testString");
  }

}