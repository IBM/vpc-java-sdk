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

import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReservationIdentityById model.
 */
public class ReservationIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReservationIdentityById() throws Throwable {
    ReservationIdentityById reservationIdentityByIdModel = new ReservationIdentityById.Builder()
      .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .build();
    assertEquals(reservationIdentityByIdModel.id(), "0717-ba49df72-37b8-43ac-98da-f8e029de0e63");

    String json = TestUtilities.serialize(reservationIdentityByIdModel);

    ReservationIdentityById reservationIdentityByIdModelNew = TestUtilities.deserialize(json, ReservationIdentityById.class);
    assertTrue(reservationIdentityByIdModelNew instanceof ReservationIdentityById);
    assertEquals(reservationIdentityByIdModelNew.id(), "0717-ba49df72-37b8-43ac-98da-f8e029de0e63");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReservationIdentityByIdError() throws Throwable {
    new ReservationIdentityById.Builder().build();
  }

}