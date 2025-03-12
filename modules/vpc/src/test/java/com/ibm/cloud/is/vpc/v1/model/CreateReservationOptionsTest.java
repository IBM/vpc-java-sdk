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

import com.ibm.cloud.is.vpc.v1.model.CreateReservationOptions;
import com.ibm.cloud.is.vpc.v1.model.ReservationCapacityPrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationCommittedUsePrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfilePrototype;
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
 * Unit test class for the CreateReservationOptions model.
 */
public class CreateReservationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateReservationOptions() throws Throwable {
    ReservationCapacityPrototype reservationCapacityPrototypeModel = new ReservationCapacityPrototype.Builder()
      .total(Long.valueOf("10"))
      .build();
    assertEquals(reservationCapacityPrototypeModel.total(), Long.valueOf("10"));

    ReservationCommittedUsePrototype reservationCommittedUsePrototypeModel = new ReservationCommittedUsePrototype.Builder()
      .expirationPolicy("release")
      .term("testString")
      .build();
    assertEquals(reservationCommittedUsePrototypeModel.expirationPolicy(), "release");
    assertEquals(reservationCommittedUsePrototypeModel.term(), "testString");

    ReservationProfilePrototype reservationProfilePrototypeModel = new ReservationProfilePrototype.Builder()
      .name("bx2-4x16")
      .resourceType("bare_metal_server_profile")
      .build();
    assertEquals(reservationProfilePrototypeModel.name(), "bx2-4x16");
    assertEquals(reservationProfilePrototypeModel.resourceType(), "bare_metal_server_profile");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreateReservationOptions createReservationOptionsModel = new CreateReservationOptions.Builder()
      .capacity(reservationCapacityPrototypeModel)
      .committedUse(reservationCommittedUsePrototypeModel)
      .profile(reservationProfilePrototypeModel)
      .zone(zoneIdentityModel)
      .affinityPolicy("automatic")
      .name("my-reservation")
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(createReservationOptionsModel.capacity(), reservationCapacityPrototypeModel);
    assertEquals(createReservationOptionsModel.committedUse(), reservationCommittedUsePrototypeModel);
    assertEquals(createReservationOptionsModel.profile(), reservationProfilePrototypeModel);
    assertEquals(createReservationOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createReservationOptionsModel.affinityPolicy(), "automatic");
    assertEquals(createReservationOptionsModel.name(), "my-reservation");
    assertEquals(createReservationOptionsModel.resourceGroup(), resourceGroupIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateReservationOptionsError() throws Throwable {
    new CreateReservationOptions.Builder().build();
  }

}