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

import com.ibm.cloud.is.vpc.v1.model.ReservationCapacityPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationCommittedUsePatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationProfilePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReservationPatch model.
 */
public class ReservationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReservationPatch() throws Throwable {
    ReservationCapacityPatch reservationCapacityPatchModel = new ReservationCapacityPatch.Builder()
      .total(Long.valueOf("10"))
      .build();
    assertEquals(reservationCapacityPatchModel.total(), Long.valueOf("10"));

    ReservationCommittedUsePatch reservationCommittedUsePatchModel = new ReservationCommittedUsePatch.Builder()
      .expirationPolicy("renew")
      .term("testString")
      .build();
    assertEquals(reservationCommittedUsePatchModel.expirationPolicy(), "renew");
    assertEquals(reservationCommittedUsePatchModel.term(), "testString");

    ReservationProfilePatch reservationProfilePatchModel = new ReservationProfilePatch.Builder()
      .name("bx2-4x16")
      .resourceType("bare_metal_server_profile")
      .build();
    assertEquals(reservationProfilePatchModel.name(), "bx2-4x16");
    assertEquals(reservationProfilePatchModel.resourceType(), "bare_metal_server_profile");

    ReservationPatch reservationPatchModel = new ReservationPatch.Builder()
      .affinityPolicy("automatic")
      .capacity(reservationCapacityPatchModel)
      .committedUse(reservationCommittedUsePatchModel)
      .name("my-reservation")
      .profile(reservationProfilePatchModel)
      .build();
    assertEquals(reservationPatchModel.affinityPolicy(), "automatic");
    assertEquals(reservationPatchModel.capacity(), reservationCapacityPatchModel);
    assertEquals(reservationPatchModel.committedUse(), reservationCommittedUsePatchModel);
    assertEquals(reservationPatchModel.name(), "my-reservation");
    assertEquals(reservationPatchModel.profile(), reservationProfilePatchModel);

    String json = TestUtilities.serialize(reservationPatchModel);

    ReservationPatch reservationPatchModelNew = TestUtilities.deserialize(json, ReservationPatch.class);
    assertTrue(reservationPatchModelNew instanceof ReservationPatch);
    assertEquals(reservationPatchModelNew.affinityPolicy(), "automatic");
    assertEquals(reservationPatchModelNew.capacity().toString(), reservationCapacityPatchModel.toString());
    assertEquals(reservationPatchModelNew.committedUse().toString(), reservationCommittedUsePatchModel.toString());
    assertEquals(reservationPatchModelNew.name(), "my-reservation");
    assertEquals(reservationPatchModelNew.profile().toString(), reservationProfilePatchModel.toString());
  }
  @Test
  public void testReservationPatchAsPatch() throws Throwable {
    ReservationCapacityPatch reservationCapacityPatchModel = new ReservationCapacityPatch.Builder()
      .total(Long.valueOf("10"))
      .build();

    ReservationCommittedUsePatch reservationCommittedUsePatchModel = new ReservationCommittedUsePatch.Builder()
      .expirationPolicy("renew")
      .term("testString")
      .build();

    ReservationProfilePatch reservationProfilePatchModel = new ReservationProfilePatch.Builder()
      .name("bx2-4x16")
      .resourceType("bare_metal_server_profile")
      .build();

    ReservationPatch reservationPatchModel = new ReservationPatch.Builder()
      .affinityPolicy("automatic")
      .capacity(reservationCapacityPatchModel)
      .committedUse(reservationCommittedUsePatchModel)
      .name("my-reservation")
      .profile(reservationProfilePatchModel)
      .build();

    Map<String, Object> mergePatch = reservationPatchModel.asPatch();

    assertEquals(mergePatch.get("affinity_policy"), "automatic");
    assertTrue(mergePatch.containsKey("capacity"));
    assertTrue(mergePatch.containsKey("committed_use"));
    assertEquals(mergePatch.get("name"), "my-reservation");
    assertTrue(mergePatch.containsKey("profile"));
  }

}