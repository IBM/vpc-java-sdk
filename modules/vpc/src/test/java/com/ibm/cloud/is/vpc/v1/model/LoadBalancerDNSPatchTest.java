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
import com.ibm.cloud.is.vpc.v1.model.DNSZoneIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerDNSPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerDNSPatch model.
 */
public class LoadBalancerDNSPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerDNSPatch() throws Throwable {
    DNSInstanceIdentityByCRN dnsInstanceIdentityModel = new DNSInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:dns-svcs:global:a/aa2432b1fa4d4ace891e9b80fc104e34:6860c359-b2e2-46fa-a944-b38c28201c6e")
      .build();
    assertEquals(dnsInstanceIdentityModel.crn(), "crn:v1:bluemix:public:dns-svcs:global:a/aa2432b1fa4d4ace891e9b80fc104e34:6860c359-b2e2-46fa-a944-b38c28201c6e");

    DNSZoneIdentityById dnsZoneIdentityModel = new DNSZoneIdentityById.Builder()
      .id("d66662cc-aa23-4fe1-9987-858487a61f45")
      .build();
    assertEquals(dnsZoneIdentityModel.id(), "d66662cc-aa23-4fe1-9987-858487a61f45");

    LoadBalancerDNSPatch loadBalancerDnsPatchModel = new LoadBalancerDNSPatch.Builder()
      .instance(dnsInstanceIdentityModel)
      .zone(dnsZoneIdentityModel)
      .build();
    assertEquals(loadBalancerDnsPatchModel.instance(), dnsInstanceIdentityModel);
    assertEquals(loadBalancerDnsPatchModel.zone(), dnsZoneIdentityModel);

    String json = TestUtilities.serialize(loadBalancerDnsPatchModel);

    LoadBalancerDNSPatch loadBalancerDnsPatchModelNew = TestUtilities.deserialize(json, LoadBalancerDNSPatch.class);
    assertTrue(loadBalancerDnsPatchModelNew instanceof LoadBalancerDNSPatch);
    assertEquals(loadBalancerDnsPatchModelNew.instance().toString(), dnsInstanceIdentityModel.toString());
    assertEquals(loadBalancerDnsPatchModelNew.zone().toString(), dnsZoneIdentityModel.toString());
  }
}