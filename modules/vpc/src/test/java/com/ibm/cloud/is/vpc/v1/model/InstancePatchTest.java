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

import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePatch;
import com.ibm.cloud.is.vpc.v1.model.InstancePatch;
import com.ibm.cloud.is.vpc.v1.model.InstancePatchProfileInstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceReservationAffinityPatch;
import com.ibm.cloud.is.vpc.v1.model.ReservationIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstancePatch model.
 */
public class InstancePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstancePatch() throws Throwable {
    InstanceAvailabilityPolicyPatch instanceAvailabilityPolicyPatchModel = new InstanceAvailabilityPolicyPatch.Builder()
      .hostFailure("restart")
      .build();
    assertEquals(instanceAvailabilityPolicyPatchModel.hostFailure(), "restart");

    InstanceMetadataServicePatch instanceMetadataServicePatchModel = new InstanceMetadataServicePatch.Builder()
      .enabled(true)
      .protocol("http")
      .responseHopLimit(Long.valueOf("1"))
      .build();
    assertEquals(instanceMetadataServicePatchModel.enabled(), Boolean.valueOf(true));
    assertEquals(instanceMetadataServicePatchModel.protocol(), "http");
    assertEquals(instanceMetadataServicePatchModel.responseHopLimit(), Long.valueOf("1"));

    InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPatchModel = new InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(instancePlacementTargetPatchModel.id(), "0717-1e09281b-f177-46fb-baf1-bc152b2e391a");

    InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileModel = new InstancePatchProfileInstanceProfileIdentityByName.Builder()
      .name("bx2-4x16")
      .build();
    assertEquals(instancePatchProfileModel.name(), "bx2-4x16");

    ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
      .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .build();
    assertEquals(reservationIdentityModel.id(), "0717-ba49df72-37b8-43ac-98da-f8e029de0e63");

    InstanceReservationAffinityPatch instanceReservationAffinityPatchModel = new InstanceReservationAffinityPatch.Builder()
      .policy("automatic")
      .pool(java.util.Arrays.asList(reservationIdentityModel))
      .build();
    assertEquals(instanceReservationAffinityPatchModel.policy(), "automatic");
    assertEquals(instanceReservationAffinityPatchModel.pool(), java.util.Arrays.asList(reservationIdentityModel));

    InstancePatch instancePatchModel = new InstancePatch.Builder()
      .availabilityPolicy(instanceAvailabilityPolicyPatchModel)
      .confidentialComputeMode("disabled")
      .enableSecureBoot(true)
      .metadataService(instanceMetadataServicePatchModel)
      .name("my-instance")
      .placementTarget(instancePlacementTargetPatchModel)
      .profile(instancePatchProfileModel)
      .reservationAffinity(instanceReservationAffinityPatchModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .build();
    assertEquals(instancePatchModel.availabilityPolicy(), instanceAvailabilityPolicyPatchModel);
    assertEquals(instancePatchModel.confidentialComputeMode(), "disabled");
    assertEquals(instancePatchModel.enableSecureBoot(), Boolean.valueOf(true));
    assertEquals(instancePatchModel.metadataService(), instanceMetadataServicePatchModel);
    assertEquals(instancePatchModel.name(), "my-instance");
    assertEquals(instancePatchModel.placementTarget(), instancePlacementTargetPatchModel);
    assertEquals(instancePatchModel.profile(), instancePatchProfileModel);
    assertEquals(instancePatchModel.reservationAffinity(), instanceReservationAffinityPatchModel);
    assertEquals(instancePatchModel.totalVolumeBandwidth(), Long.valueOf("500"));

    String json = TestUtilities.serialize(instancePatchModel);

    InstancePatch instancePatchModelNew = TestUtilities.deserialize(json, InstancePatch.class);
    assertTrue(instancePatchModelNew instanceof InstancePatch);
    assertEquals(instancePatchModelNew.availabilityPolicy().toString(), instanceAvailabilityPolicyPatchModel.toString());
    assertEquals(instancePatchModelNew.confidentialComputeMode(), "disabled");
    assertEquals(instancePatchModelNew.enableSecureBoot(), Boolean.valueOf(true));
    assertEquals(instancePatchModelNew.metadataService().toString(), instanceMetadataServicePatchModel.toString());
    assertEquals(instancePatchModelNew.name(), "my-instance");
    assertEquals(instancePatchModelNew.placementTarget().toString(), instancePlacementTargetPatchModel.toString());
    assertEquals(instancePatchModelNew.profile().toString(), instancePatchProfileModel.toString());
    assertEquals(instancePatchModelNew.reservationAffinity().toString(), instanceReservationAffinityPatchModel.toString());
    assertEquals(instancePatchModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
  }
  @Test
  public void testInstancePatchAsPatch() throws Throwable {
    InstanceAvailabilityPolicyPatch instanceAvailabilityPolicyPatchModel = new InstanceAvailabilityPolicyPatch.Builder()
      .hostFailure("restart")
      .build();

    InstanceMetadataServicePatch instanceMetadataServicePatchModel = new InstanceMetadataServicePatch.Builder()
      .enabled(true)
      .protocol("http")
      .responseHopLimit(Long.valueOf("1"))
      .build();

    InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPatchModel = new InstancePlacementTargetPatchDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();

    InstancePatchProfileInstanceProfileIdentityByName instancePatchProfileModel = new InstancePatchProfileInstanceProfileIdentityByName.Builder()
      .name("bx2-4x16")
      .build();

    ReservationIdentityById reservationIdentityModel = new ReservationIdentityById.Builder()
      .id("0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .build();

    InstanceReservationAffinityPatch instanceReservationAffinityPatchModel = new InstanceReservationAffinityPatch.Builder()
      .policy("automatic")
      .pool(java.util.Arrays.asList(reservationIdentityModel))
      .build();

    InstancePatch instancePatchModel = new InstancePatch.Builder()
      .availabilityPolicy(instanceAvailabilityPolicyPatchModel)
      .confidentialComputeMode("disabled")
      .enableSecureBoot(true)
      .metadataService(instanceMetadataServicePatchModel)
      .name("my-instance")
      .placementTarget(instancePlacementTargetPatchModel)
      .profile(instancePatchProfileModel)
      .reservationAffinity(instanceReservationAffinityPatchModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .build();

    Map<String, Object> mergePatch = instancePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("availability_policy"));
    assertEquals(mergePatch.get("confidential_compute_mode"), "disabled");
    assertTrue(mergePatch.containsKey("enable_secure_boot"));
    assertTrue(mergePatch.containsKey("metadata_service"));
    assertEquals(mergePatch.get("name"), "my-instance");
    assertTrue(mergePatch.containsKey("placement_target"));
    assertTrue(mergePatch.containsKey("profile"));
    assertTrue(mergePatch.containsKey("reservation_affinity"));
    assertTrue(mergePatch.containsKey("total_volume_bandwidth"));
  }

}