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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapathPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingPatch;
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
    DNSInstanceIdentityByCRN dnsInstanceIdentityModel = new DNSInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:dns-svcs:global:a/123456:6860c359-b2e2-46fa-a944-b38c28201c6e")
      .build();
    assertEquals(dnsInstanceIdentityModel.crn(), "crn:v1:bluemix:public:dns-svcs:global:a/123456:6860c359-b2e2-46fa-a944-b38c28201c6e");

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

    LoadBalancerLoggingDatapathPatch loadBalancerLoggingDatapathPatchModel = new LoadBalancerLoggingDatapathPatch.Builder()
      .active(true)
      .build();
    assertEquals(loadBalancerLoggingDatapathPatchModel.active(), Boolean.valueOf(true));

    LoadBalancerLoggingPatch loadBalancerLoggingPatchModel = new LoadBalancerLoggingPatch.Builder()
      .datapath(loadBalancerLoggingDatapathPatchModel)
      .build();
    assertEquals(loadBalancerLoggingPatchModel.datapath(), loadBalancerLoggingDatapathPatchModel);

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
      .dns(loadBalancerDnsPatchModel)
      .logging(loadBalancerLoggingPatchModel)
      .name("my-load-balancer")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();
    assertEquals(loadBalancerPatchModel.dns(), loadBalancerDnsPatchModel);
    assertEquals(loadBalancerPatchModel.logging(), loadBalancerLoggingPatchModel);
    assertEquals(loadBalancerPatchModel.name(), "my-load-balancer");
    assertEquals(loadBalancerPatchModel.subnets(), java.util.Arrays.asList(subnetIdentityModel));

    String json = TestUtilities.serialize(loadBalancerPatchModel);

    LoadBalancerPatch loadBalancerPatchModelNew = TestUtilities.deserialize(json, LoadBalancerPatch.class);
    assertTrue(loadBalancerPatchModelNew instanceof LoadBalancerPatch);
    assertEquals(loadBalancerPatchModelNew.dns().toString(), loadBalancerDnsPatchModel.toString());
    assertEquals(loadBalancerPatchModelNew.logging().toString(), loadBalancerLoggingPatchModel.toString());
    assertEquals(loadBalancerPatchModelNew.name(), "my-load-balancer");
  }
  @Test
  public void testLoadBalancerPatchAsPatch() throws Throwable {
    DNSInstanceIdentityByCRN dnsInstanceIdentityModel = new DNSInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:dns-svcs:global:a/123456:6860c359-b2e2-46fa-a944-b38c28201c6e")
      .build();

    DNSZoneIdentityById dnsZoneIdentityModel = new DNSZoneIdentityById.Builder()
      .id("d66662cc-aa23-4fe1-9987-858487a61f45")
      .build();

    LoadBalancerDNSPatch loadBalancerDnsPatchModel = new LoadBalancerDNSPatch.Builder()
      .instance(dnsInstanceIdentityModel)
      .zone(dnsZoneIdentityModel)
      .build();

    LoadBalancerLoggingDatapathPatch loadBalancerLoggingDatapathPatchModel = new LoadBalancerLoggingDatapathPatch.Builder()
      .active(true)
      .build();

    LoadBalancerLoggingPatch loadBalancerLoggingPatchModel = new LoadBalancerLoggingPatch.Builder()
      .datapath(loadBalancerLoggingDatapathPatchModel)
      .build();

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

    LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
      .dns(loadBalancerDnsPatchModel)
      .logging(loadBalancerLoggingPatchModel)
      .name("my-load-balancer")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();

    Map<String, Object> mergePatch = loadBalancerPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("dns"));
    assertTrue(mergePatch.containsKey("logging"));
    assertEquals(mergePatch.get("name"), "my-load-balancer");
    assertTrue(mergePatch.containsKey("subnets"));
  }

}