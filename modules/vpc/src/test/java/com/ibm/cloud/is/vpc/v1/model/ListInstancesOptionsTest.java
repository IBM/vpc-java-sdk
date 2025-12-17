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

import com.ibm.cloud.is.vpc.v1.model.ListInstancesOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListInstancesOptions model.
 */
public class ListInstancesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListInstancesOptions() throws Throwable {
    ListInstancesOptions listInstancesOptionsModel = new ListInstancesOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("50"))
      .resourceGroupId("testString")
      .name("my-name")
      .clusterNetworkId("testString")
      .clusterNetworkCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::cluster-network:0717-da0df18c-7598-4633-a648-fdaac28a5573")
      .clusterNetworkName("my-cluster-network")
      .dedicatedHostId("testString")
      .dedicatedHostCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::dedicated-host:0717-1e09281b-f177-46fb-baf1-bc152b2e391a")
      .dedicatedHostName("my-dedicated-host")
      .instanceGroupMembershipInstanceGroupId("r006-7b3ac170-01f3-43d6-87ec-f0ed11ed3f60")
      .instanceGroupMembershipInstanceGroupCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::instance-group:r006-7b3ac170-01f3-43d6-87ec-f0ed11ed3f60")
      .placementGroupId("testString")
      .placementGroupCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::placement-group:r006-418fe842-a3e9-47b9-a938-1aa5bd632871")
      .placementGroupName("my-placement-group")
      .reservationAffinityPolicy("automatic")
      .reservationId("testString")
      .reservationCrn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::reservation:0717-ba49df72-37b8-43ac-98da-f8e029de0e63")
      .reservationName("my-reservation")
      .vpcId("testString")
      .vpcCrn("crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .vpcName("my-vpc")
      .build();
    assertEquals(listInstancesOptionsModel.start(), "testString");
    assertEquals(listInstancesOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listInstancesOptionsModel.resourceGroupId(), "testString");
    assertEquals(listInstancesOptionsModel.name(), "my-name");
    assertEquals(listInstancesOptionsModel.clusterNetworkId(), "testString");
    assertEquals(listInstancesOptionsModel.clusterNetworkCrn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::cluster-network:0717-da0df18c-7598-4633-a648-fdaac28a5573");
    assertEquals(listInstancesOptionsModel.clusterNetworkName(), "my-cluster-network");
    assertEquals(listInstancesOptionsModel.dedicatedHostId(), "testString");
    assertEquals(listInstancesOptionsModel.dedicatedHostCrn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::dedicated-host:0717-1e09281b-f177-46fb-baf1-bc152b2e391a");
    assertEquals(listInstancesOptionsModel.dedicatedHostName(), "my-dedicated-host");
    assertEquals(listInstancesOptionsModel.instanceGroupMembershipInstanceGroupId(), "r006-7b3ac170-01f3-43d6-87ec-f0ed11ed3f60");
    assertEquals(listInstancesOptionsModel.instanceGroupMembershipInstanceGroupCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::instance-group:r006-7b3ac170-01f3-43d6-87ec-f0ed11ed3f60");
    assertEquals(listInstancesOptionsModel.placementGroupId(), "testString");
    assertEquals(listInstancesOptionsModel.placementGroupCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::placement-group:r006-418fe842-a3e9-47b9-a938-1aa5bd632871");
    assertEquals(listInstancesOptionsModel.placementGroupName(), "my-placement-group");
    assertEquals(listInstancesOptionsModel.reservationAffinityPolicy(), "automatic");
    assertEquals(listInstancesOptionsModel.reservationId(), "testString");
    assertEquals(listInstancesOptionsModel.reservationCrn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::reservation:0717-ba49df72-37b8-43ac-98da-f8e029de0e63");
    assertEquals(listInstancesOptionsModel.reservationName(), "my-reservation");
    assertEquals(listInstancesOptionsModel.vpcId(), "testString");
    assertEquals(listInstancesOptionsModel.vpcCrn(), "crn:v1:bluemix:public:is:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34::vpc:r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(listInstancesOptionsModel.vpcName(), "my-vpc");
  }
}