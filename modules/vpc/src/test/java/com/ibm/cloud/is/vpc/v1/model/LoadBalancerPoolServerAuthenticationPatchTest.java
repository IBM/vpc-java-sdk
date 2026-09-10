/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolServerAuthenticationPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolServerAuthenticationPatch model.
 */
public class LoadBalancerPoolServerAuthenticationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolServerAuthenticationPatch() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    LoadBalancerPoolServerAuthenticationPatch loadBalancerPoolServerAuthenticationPatchModel = new LoadBalancerPoolServerAuthenticationPatch.Builder()
      .certificateAuthority(certificateInstanceIdentityModel)
      .verifyCertificate(false)
      .build();
    assertEquals(loadBalancerPoolServerAuthenticationPatchModel.certificateAuthority(), certificateInstanceIdentityModel);
    assertEquals(loadBalancerPoolServerAuthenticationPatchModel.verifyCertificate(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(loadBalancerPoolServerAuthenticationPatchModel);

    LoadBalancerPoolServerAuthenticationPatch loadBalancerPoolServerAuthenticationPatchModelNew = TestUtilities.deserialize(json, LoadBalancerPoolServerAuthenticationPatch.class);
    assertTrue(loadBalancerPoolServerAuthenticationPatchModelNew instanceof LoadBalancerPoolServerAuthenticationPatch);
    assertEquals(loadBalancerPoolServerAuthenticationPatchModelNew.certificateAuthority().toString(), certificateInstanceIdentityModel.toString());
    assertEquals(loadBalancerPoolServerAuthenticationPatchModelNew.verifyCertificate(), Boolean.valueOf(false));
  }
}