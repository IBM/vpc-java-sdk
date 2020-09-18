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
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CertificateInstanceIdentityByCRN model.
 */
public class CertificateInstanceIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCertificateInstanceIdentityByCRN() throws Throwable {
    CertificateInstanceIdentityByCRN certificateInstanceIdentityByCrnModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758")
      .build();
    assertEquals(certificateInstanceIdentityByCrnModel.crn(), "crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758");

    String json = TestUtilities.serialize(certificateInstanceIdentityByCrnModel);

    CertificateInstanceIdentityByCRN certificateInstanceIdentityByCrnModelNew = TestUtilities.deserialize(json, CertificateInstanceIdentityByCRN.class);
    assertTrue(certificateInstanceIdentityByCrnModelNew instanceof CertificateInstanceIdentityByCRN);
    assertEquals(certificateInstanceIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:cloudcerts:us-south:a/123456:b8866ea4-b8df-467e-801a-da1db7e020bf:certificate:78ff9c4c97d013fb2a95b21dddde7758");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCertificateInstanceIdentityByCRNError() throws Throwable {
    new CertificateInstanceIdentityByCRN.Builder().build();
  }

}