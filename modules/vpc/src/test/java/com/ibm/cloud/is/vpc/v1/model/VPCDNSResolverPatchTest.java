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
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverPatch;
import com.ibm.cloud.is.vpc.v1.model.VPCDNSResolverVPCPatchVPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPCDNSResolverPatch model.
 */
public class VPCDNSResolverPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPCDNSResolverPatch() throws Throwable {
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

    VPCDNSResolverVPCPatchVPCIdentityById vpcdnsResolverVpcPatchModel = new VPCDNSResolverVPCPatchVPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcdnsResolverVpcPatchModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    VPCDNSResolverPatch vpcdnsResolverPatchModel = new VPCDNSResolverPatch.Builder()
      .manualServers(java.util.Arrays.asList(dnsServerPrototypeModel))
      .type("delegated")
      .vpc(vpcdnsResolverVpcPatchModel)
      .build();
    assertEquals(vpcdnsResolverPatchModel.manualServers(), java.util.Arrays.asList(dnsServerPrototypeModel));
    assertEquals(vpcdnsResolverPatchModel.type(), "delegated");
    assertEquals(vpcdnsResolverPatchModel.vpc(), vpcdnsResolverVpcPatchModel);

    String json = TestUtilities.serialize(vpcdnsResolverPatchModel);

    VPCDNSResolverPatch vpcdnsResolverPatchModelNew = TestUtilities.deserialize(json, VPCDNSResolverPatch.class);
    assertTrue(vpcdnsResolverPatchModelNew instanceof VPCDNSResolverPatch);
    assertEquals(vpcdnsResolverPatchModelNew.type(), "delegated");
    assertEquals(vpcdnsResolverPatchModelNew.vpc().toString(), vpcdnsResolverVpcPatchModel.toString());
  }
}