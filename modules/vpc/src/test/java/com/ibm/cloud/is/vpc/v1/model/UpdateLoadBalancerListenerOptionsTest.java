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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateLoadBalancerListenerOptions model.
 */
public class UpdateLoadBalancerListenerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateLoadBalancerListenerOptions() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758");

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolIdentityModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptionsModel = new UpdateLoadBalancerListenerOptions.Builder()
      .loadBalancerId("testString")
      .id("testString")
      .connectionLimit(Long.valueOf("2000"))
      .port(Long.valueOf("443"))
      .protocol("http")
      .certificateInstance(certificateInstanceIdentityModel)
      .defaultPool(loadBalancerPoolIdentityModel)
      .build();
    assertEquals(updateLoadBalancerListenerOptionsModel.loadBalancerId(), "testString");
    assertEquals(updateLoadBalancerListenerOptionsModel.id(), "testString");
    assertEquals(updateLoadBalancerListenerOptionsModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(updateLoadBalancerListenerOptionsModel.port(), Long.valueOf("443"));
    assertEquals(updateLoadBalancerListenerOptionsModel.protocol(), "http");
    assertEquals(updateLoadBalancerListenerOptionsModel.certificateInstance(), certificateInstanceIdentityModel);
    assertEquals(updateLoadBalancerListenerOptionsModel.defaultPool(), loadBalancerPoolIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateLoadBalancerListenerOptionsError() throws Throwable {
    new UpdateLoadBalancerListenerOptions.Builder().build();
  }

}