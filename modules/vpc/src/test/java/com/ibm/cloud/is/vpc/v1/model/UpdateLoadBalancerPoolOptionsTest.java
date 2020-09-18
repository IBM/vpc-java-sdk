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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePatch;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLoadBalancerPoolOptions model.
 */
public class UpdateLoadBalancerPoolOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLoadBalancerPoolOptions() throws Throwable {
    LoadBalancerPoolHealthMonitorPatch loadBalancerPoolHealthMonitorPatchModel = new LoadBalancerPoolHealthMonitorPatch.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPatchModel.urlPath(), "/");

    LoadBalancerPoolSessionPersistencePatch loadBalancerPoolSessionPersistencePatchModel = new LoadBalancerPoolSessionPersistencePatch.Builder()
      .type("source_ip")
      .build();
    assertEquals(loadBalancerPoolSessionPersistencePatchModel.type(), "source_ip");

    UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptionsModel = new UpdateLoadBalancerPoolOptions.Builder()
      .loadBalancerId("testString")
      .id("testString")
      .name("my-load-balancer-pool")
      .algorithm("least_connections")
      .protocol("http")
      .healthMonitor(loadBalancerPoolHealthMonitorPatchModel)
      .sessionPersistence(loadBalancerPoolSessionPersistencePatchModel)
      .build();
    assertEquals(updateLoadBalancerPoolOptionsModel.loadBalancerId(), "testString");
    assertEquals(updateLoadBalancerPoolOptionsModel.id(), "testString");
    assertEquals(updateLoadBalancerPoolOptionsModel.name(), "my-load-balancer-pool");
    assertEquals(updateLoadBalancerPoolOptionsModel.algorithm(), "least_connections");
    assertEquals(updateLoadBalancerPoolOptionsModel.protocol(), "http");
    assertEquals(updateLoadBalancerPoolOptionsModel.healthMonitor(), loadBalancerPoolHealthMonitorPatchModel);
    assertEquals(updateLoadBalancerPoolOptionsModel.sessionPersistence(), loadBalancerPoolSessionPersistencePatchModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerPoolOptionsError() throws Throwable {
    new UpdateLoadBalancerPoolOptions.Builder().build();
  }

}