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

import com.ibm.cloud.is.vpc.v1.model.DNSServerPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype;
import com.ibm.cloud.is.vpc.v1.model.VPCPrototypeDns;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPCPrototypeDns model.
 */
public class VPCPrototypeDnsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPCPrototypeDns() throws Throwable {
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

    VPCPrototypeDns vpcPrototypeDnsModel = new VPCPrototypeDns.Builder()
      .enableHub(false)
      .resolver(vpcdnsResolverPrototypeModel)
      .build();
    assertEquals(vpcPrototypeDnsModel.enableHub(), Boolean.valueOf(false));
    assertEquals(vpcPrototypeDnsModel.resolver(), vpcdnsResolverPrototypeModel);

    String json = TestUtilities.serialize(vpcPrototypeDnsModel);

    VPCPrototypeDns vpcPrototypeDnsModelNew = TestUtilities.deserialize(json, VPCPrototypeDns.class);
    assertTrue(vpcPrototypeDnsModelNew instanceof VPCPrototypeDns);
    assertEquals(vpcPrototypeDnsModelNew.enableHub(), Boolean.valueOf(false));
    assertEquals(vpcPrototypeDnsModelNew.resolver().toString(), vpcdnsResolverPrototypeModel.toString());
  }
}