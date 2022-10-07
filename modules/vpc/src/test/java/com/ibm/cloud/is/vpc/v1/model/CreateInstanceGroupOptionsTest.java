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

import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInstanceGroupOptions model.
 */
public class CreateInstanceGroupOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInstanceGroupOptions() throws Throwable {
    InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(instanceTemplateIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();
    assertEquals(loadBalancerIdentityModel.id(), "dd754295-e9e0-4c9d-bf6c-58fbc59e5727");

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolIdentityModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    CreateInstanceGroupOptions createInstanceGroupOptionsModel = new CreateInstanceGroupOptions.Builder()
      .instanceTemplate(instanceTemplateIdentityModel)
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .applicationPort(Long.valueOf("22"))
      .loadBalancer(loadBalancerIdentityModel)
      .loadBalancerPool(loadBalancerPoolIdentityModel)
      .membershipCount(Long.valueOf("10"))
      .name("my-instance-group")
      .resourceGroup(resourceGroupIdentityModel)
      .build();
    assertEquals(createInstanceGroupOptionsModel.instanceTemplate(), instanceTemplateIdentityModel);
    assertEquals(createInstanceGroupOptionsModel.subnets(), java.util.Arrays.asList(subnetIdentityModel));
    assertEquals(createInstanceGroupOptionsModel.applicationPort(), Long.valueOf("22"));
    assertEquals(createInstanceGroupOptionsModel.loadBalancer(), loadBalancerIdentityModel);
    assertEquals(createInstanceGroupOptionsModel.loadBalancerPool(), loadBalancerPoolIdentityModel);
    assertEquals(createInstanceGroupOptionsModel.membershipCount(), Long.valueOf("10"));
    assertEquals(createInstanceGroupOptionsModel.name(), "my-instance-group");
    assertEquals(createInstanceGroupOptionsModel.resourceGroup(), resourceGroupIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceGroupOptionsError() throws Throwable {
    new CreateInstanceGroupOptions.Builder().build();
  }

}