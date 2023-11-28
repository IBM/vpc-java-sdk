/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerDNSPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerDNSPrototype model.
 */
public class LoadBalancerDNSPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerDNSPrototype() throws Throwable {
    DNSInstanceIdentityByCRN dnsInstanceIdentityModel = new DNSInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:dns-svcs:global:a/123456:6860c359-b2e2-46fa-a944-b38c28201c6e")
      .build();
    assertEquals(dnsInstanceIdentityModel.crn(), "crn:v1:bluemix:public:dns-svcs:global:a/123456:6860c359-b2e2-46fa-a944-b38c28201c6e");

    DNSZoneIdentityById dnsZoneIdentityModel = new DNSZoneIdentityById.Builder()
      .id("d66662cc-aa23-4fe1-9987-858487a61f45")
      .build();
    assertEquals(dnsZoneIdentityModel.id(), "d66662cc-aa23-4fe1-9987-858487a61f45");

    LoadBalancerDNSPrototype loadBalancerDnsPrototypeModel = new LoadBalancerDNSPrototype.Builder()
      .instance(dnsInstanceIdentityModel)
      .zone(dnsZoneIdentityModel)
      .build();
    assertEquals(loadBalancerDnsPrototypeModel.instance(), dnsInstanceIdentityModel);
    assertEquals(loadBalancerDnsPrototypeModel.zone(), dnsZoneIdentityModel);

    String json = TestUtilities.serialize(loadBalancerDnsPrototypeModel);

    LoadBalancerDNSPrototype loadBalancerDnsPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerDNSPrototype.class);
    assertTrue(loadBalancerDnsPrototypeModelNew instanceof LoadBalancerDNSPrototype);
    assertEquals(loadBalancerDnsPrototypeModelNew.instance().toString(), dnsInstanceIdentityModel.toString());
    assertEquals(loadBalancerDnsPrototypeModelNew.zone().toString(), dnsZoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerDNSPrototypeError() throws Throwable {
    new LoadBalancerDNSPrototype.Builder().build();
  }

}