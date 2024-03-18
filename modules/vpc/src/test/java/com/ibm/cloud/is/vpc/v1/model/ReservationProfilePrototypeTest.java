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

import com.ibm.cloud.is.vpc.v1.model.ReservationProfilePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReservationProfilePrototype model.
 */
public class ReservationProfilePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReservationProfilePrototype() throws Throwable {
    ReservationProfilePrototype reservationProfilePrototypeModel = new ReservationProfilePrototype.Builder()
      .name("bx2-4x16")
      .resourceType("instance_profile")
      .build();
    assertEquals(reservationProfilePrototypeModel.name(), "bx2-4x16");
    assertEquals(reservationProfilePrototypeModel.resourceType(), "instance_profile");

    String json = TestUtilities.serialize(reservationProfilePrototypeModel);

    ReservationProfilePrototype reservationProfilePrototypeModelNew = TestUtilities.deserialize(json, ReservationProfilePrototype.class);
    assertTrue(reservationProfilePrototypeModelNew instanceof ReservationProfilePrototype);
    assertEquals(reservationProfilePrototypeModelNew.name(), "bx2-4x16");
    assertEquals(reservationProfilePrototypeModelNew.resourceType(), "instance_profile");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReservationProfilePrototypeError() throws Throwable {
    new ReservationProfilePrototype.Builder().build();
  }

}