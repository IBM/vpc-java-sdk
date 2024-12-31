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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerReservationAffinityPrototype;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerReservationAffinityPrototype model.
 */
public class BareMetalServerReservationAffinityPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerReservationAffinityPrototype() throws Throwable {
    ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
      .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .build();
    assertEquals(reservationIdentityModel.id(), "0717-ba49df72-37b8-43ac-98da-f8e029de0e63");

    BareMetalServerReservationAffinityPrototype bareMetalServerReservationAffinityPrototypeModel = new BareMetalServerReservationAffinityPrototype.Builder()
      .policy("automatic")
      .pool(java.util.Arrays.asList(reservationIdentityModel))
      .build();
    assertEquals(bareMetalServerReservationAffinityPrototypeModel.policy(), "automatic");
    assertEquals(bareMetalServerReservationAffinityPrototypeModel.pool(), java.util.Arrays.asList(reservationIdentityModel));

    String json = TestUtilities.serialize(bareMetalServerReservationAffinityPrototypeModel);

    BareMetalServerReservationAffinityPrototype bareMetalServerReservationAffinityPrototypeModelNew = TestUtilities.deserialize(json, BareMetalServerReservationAffinityPrototype.class);
    assertTrue(bareMetalServerReservationAffinityPrototypeModelNew instanceof BareMetalServerReservationAffinityPrototype);
    assertEquals(bareMetalServerReservationAffinityPrototypeModelNew.policy(), "automatic");
  }
}