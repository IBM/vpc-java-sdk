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

import com.ibm.cloud.is.vpc.v1.model.CreateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.DNSServerPrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
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
 * Unit test class for the CreateVpcOptions model.
 */
public class CreateVpcOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpcOptions() throws Throwable {
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

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreateVpcOptions createVpcOptionsModel = new CreateVpcOptions.Builder()
      .addressPrefixManagement("auto")
      .classicAccess(false)
      .dns(vpcdnsPrototypeModel)
      .name("my-vpc")
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(createVpcOptionsModel.addressPrefixManagement(), "auto");
    assertEquals(createVpcOptionsModel.classicAccess(), Boolean.valueOf(false));
    assertEquals(createVpcOptionsModel.dns(), vpcdnsPrototypeModel);
    assertEquals(createVpcOptionsModel.name(), "my-vpc");
    assertEquals(createVpcOptionsModel.resourceGroup(), resourceGroupIdentityModel);
  }
}