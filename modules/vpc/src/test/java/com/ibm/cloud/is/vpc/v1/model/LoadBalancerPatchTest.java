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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLogging;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapath;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPatch;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPatch model.
 */
public class LoadBalancerPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPatch() throws Throwable {
    LoadBalancerLoggingDatapath loadBalancerLoggingDatapathModel = new LoadBalancerLoggingDatapath.Builder()
      .active(true)
      .build();
    assertEquals(loadBalancerLoggingDatapathModel.active(), Boolean.valueOf(true));

    LoadBalancerLogging loadBalancerLoggingModel = new LoadBalancerLogging.Builder()
      .datapath(loadBalancerLoggingDatapathModel)
      .build();
    assertEquals(loadBalancerLoggingModel.datapath(), loadBalancerLoggingDatapathModel);

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
      .logging(loadBalancerLoggingModel)
      .name("my-load-balancer")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();
    assertEquals(loadBalancerPatchModel.logging(), loadBalancerLoggingModel);
    assertEquals(loadBalancerPatchModel.name(), "my-load-balancer");
    assertEquals(loadBalancerPatchModel.subnets(), java.util.Arrays.asList(subnetIdentityModel));

    String json = TestUtilities.serialize(loadBalancerPatchModel);

    LoadBalancerPatch loadBalancerPatchModelNew = TestUtilities.deserialize(json, LoadBalancerPatch.class);
    assertTrue(loadBalancerPatchModelNew instanceof LoadBalancerPatch);
    assertEquals(loadBalancerPatchModelNew.logging().toString(), loadBalancerLoggingModel.toString());
    assertEquals(loadBalancerPatchModelNew.name(), "my-load-balancer");
  }
  @Test
  public void testLoadBalancerPatchAsPatch() throws Throwable {
    LoadBalancerLoggingDatapath loadBalancerLoggingDatapathModel = new LoadBalancerLoggingDatapath.Builder()
      .active(true)
      .build();

    LoadBalancerLogging loadBalancerLoggingModel = new LoadBalancerLogging.Builder()
      .datapath(loadBalancerLoggingDatapathModel)
      .build();

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

    LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
      .logging(loadBalancerLoggingModel)
      .name("my-load-balancer")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();

    Map<String, Object> mergePatch = loadBalancerPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("logging"));
    assertEquals(mergePatch.get("name"), "my-load-balancer");
    assertTrue(mergePatch.containsKey("subnets"));
  }

}