/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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

import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByZone;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FloatingIPPrototypeFloatingIPByZone model.
 */
public class FloatingIPPrototypeFloatingIPByZoneTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFloatingIPPrototypeFloatingIPByZone() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    FloatingIPPrototypeFloatingIPByZone floatingIpPrototypeFloatingIpByZoneModel = new FloatingIPPrototypeFloatingIPByZone.Builder()
      .name("my-floating-ip")
      .resourceGroup(resourceGroupIdentityModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(floatingIpPrototypeFloatingIpByZoneModel.name(), "my-floating-ip");
    assertEquals(floatingIpPrototypeFloatingIpByZoneModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(floatingIpPrototypeFloatingIpByZoneModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(floatingIpPrototypeFloatingIpByZoneModel);

    FloatingIPPrototypeFloatingIPByZone floatingIpPrototypeFloatingIpByZoneModelNew = TestUtilities.deserialize(json, FloatingIPPrototypeFloatingIPByZone.class);
    assertTrue(floatingIpPrototypeFloatingIpByZoneModelNew instanceof FloatingIPPrototypeFloatingIPByZone);
    assertEquals(floatingIpPrototypeFloatingIpByZoneModelNew.name(), "my-floating-ip");
    assertEquals(floatingIpPrototypeFloatingIpByZoneModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(floatingIpPrototypeFloatingIpByZoneModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFloatingIPPrototypeFloatingIPByZoneError() throws Throwable {
    new FloatingIPPrototypeFloatingIPByZone.Builder().build();
  }

}