/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.ReservationCommittedUsePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReservationCommittedUsePrototype model.
 */
public class ReservationCommittedUsePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReservationCommittedUsePrototype() throws Throwable {
    ReservationCommittedUsePrototype reservationCommittedUsePrototypeModel = new ReservationCommittedUsePrototype.Builder()
      .expirationPolicy("release")
      .term("testString")
      .build();
    assertEquals(reservationCommittedUsePrototypeModel.expirationPolicy(), "release");
    assertEquals(reservationCommittedUsePrototypeModel.term(), "testString");

    String json = TestUtilities.serialize(reservationCommittedUsePrototypeModel);

    ReservationCommittedUsePrototype reservationCommittedUsePrototypeModelNew = TestUtilities.deserialize(json, ReservationCommittedUsePrototype.class);
    assertTrue(reservationCommittedUsePrototypeModelNew instanceof ReservationCommittedUsePrototype);
    assertEquals(reservationCommittedUsePrototypeModelNew.expirationPolicy(), "release");
    assertEquals(reservationCommittedUsePrototypeModelNew.term(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReservationCommittedUsePrototypeError() throws Throwable {
    new ReservationCommittedUsePrototype.Builder().build();
  }

}