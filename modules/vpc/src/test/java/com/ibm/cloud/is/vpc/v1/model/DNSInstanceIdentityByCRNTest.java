/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.DNSInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DNSInstanceIdentityByCRN model.
 */
public class DNSInstanceIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDNSInstanceIdentityByCRN() throws Throwable {
    DNSInstanceIdentityByCRN dnsInstanceIdentityByCrnModel = new DNSInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:dns-svcs:global:a/bb1b52262f7441a586f49068482f1e60:f761b566-030a-4696-8649-cc9d09889e88::")
      .build();
    assertEquals(dnsInstanceIdentityByCrnModel.crn(), "crn:v1:bluemix:public:dns-svcs:global:a/bb1b52262f7441a586f49068482f1e60:f761b566-030a-4696-8649-cc9d09889e88::");

    String json = TestUtilities.serialize(dnsInstanceIdentityByCrnModel);

    DNSInstanceIdentityByCRN dnsInstanceIdentityByCrnModelNew = TestUtilities.deserialize(json, DNSInstanceIdentityByCRN.class);
    assertTrue(dnsInstanceIdentityByCrnModelNew instanceof DNSInstanceIdentityByCRN);
    assertEquals(dnsInstanceIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:dns-svcs:global:a/bb1b52262f7441a586f49068482f1e60:f761b566-030a-4696-8649-cc9d09889e88::");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDNSInstanceIdentityByCRNError() throws Throwable {
    new DNSInstanceIdentityByCRN.Builder().build();
  }

}