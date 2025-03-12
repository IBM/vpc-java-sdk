/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.ibm.cloud.is.vpc.v1.model.DNSServerPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPCDNSPrototype model.
 */
public class VPCDNSPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPCDNSPrototype() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    DNSServerPrototype dnsServerPrototypeModel = new DNSServerPrototype.Builder()
      .address("192.168.3.4")
      .zoneAffinity(zoneIdentityModel)
      .build();
    assertEquals(dnsServerPrototypeModel.address(), "192.168.3.4");
    assertEquals(dnsServerPrototypeModel.zoneAffinity(), zoneIdentityModel);

    VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype vpcdnsResolverPrototypeModel = new VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype.Builder()
      .manualServers(java.util.Arrays.asList(dnsServerPrototypeModel))
      .type("manual")
      .build();
    assertEquals(vpcdnsResolverPrototypeModel.manualServers(), java.util.Arrays.asList(dnsServerPrototypeModel));
    assertEquals(vpcdnsResolverPrototypeModel.type(), "manual");

    VPCDNSPrototype vpcdnsPrototypeModel = new VPCDNSPrototype.Builder()
      .enableHub(false)
      .resolver(vpcdnsResolverPrototypeModel)
      .build();
    assertEquals(vpcdnsPrototypeModel.enableHub(), Boolean.valueOf(false));
    assertEquals(vpcdnsPrototypeModel.resolver(), vpcdnsResolverPrototypeModel);

    String json = TestUtilities.serialize(vpcdnsPrototypeModel);

    VPCDNSPrototype vpcdnsPrototypeModelNew = TestUtilities.deserialize(json, VPCDNSPrototype.class);
    assertTrue(vpcdnsPrototypeModelNew instanceof VPCDNSPrototype);
    assertEquals(vpcdnsPrototypeModelNew.enableHub(), Boolean.valueOf(false));
    assertEquals(vpcdnsPrototypeModelNew.resolver().toString(), vpcdnsResolverPrototypeModel.toString());
  }
}