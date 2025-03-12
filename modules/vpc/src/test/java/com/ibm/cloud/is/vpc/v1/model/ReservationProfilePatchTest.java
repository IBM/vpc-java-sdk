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

import com.ibm.cloud.is.vpc.v1.model.ReservationProfilePatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReservationProfilePatch model.
 */
public class ReservationProfilePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReservationProfilePatch() throws Throwable {
    ReservationProfilePatch reservationProfilePatchModel = new ReservationProfilePatch.Builder()
      .name("bx2-4x16")
      .resourceType("bare_metal_server_profile")
      .build();
    assertEquals(reservationProfilePatchModel.name(), "bx2-4x16");
    assertEquals(reservationProfilePatchModel.resourceType(), "bare_metal_server_profile");

    String json = TestUtilities.serialize(reservationProfilePatchModel);

    ReservationProfilePatch reservationProfilePatchModelNew = TestUtilities.deserialize(json, ReservationProfilePatch.class);
    assertTrue(reservationProfilePatchModelNew instanceof ReservationProfilePatch);
    assertEquals(reservationProfilePatchModelNew.name(), "bx2-4x16");
    assertEquals(reservationProfilePatchModelNew.resourceType(), "bare_metal_server_profile");
  }
}