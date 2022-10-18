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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupPatch model.
 */
public class InstanceGroupPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupPatch() throws Throwable {
    InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(instanceTemplateIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();
    assertEquals(loadBalancerIdentityModel.id(), "dd754295-e9e0-4c9d-bf6c-58fbc59e5727");

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolIdentityModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    InstanceGroupPatch instanceGroupPatchModel = new InstanceGroupPatch.Builder()
      .applicationPort(Long.valueOf("22"))
      .instanceTemplate(instanceTemplateIdentityModel)
      .loadBalancer(loadBalancerIdentityModel)
      .loadBalancerPool(loadBalancerPoolIdentityModel)
      .membershipCount(Long.valueOf("10"))
      .name("my-instance-group")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();
    assertEquals(instanceGroupPatchModel.applicationPort(), Long.valueOf("22"));
    assertEquals(instanceGroupPatchModel.instanceTemplate(), instanceTemplateIdentityModel);
    assertEquals(instanceGroupPatchModel.loadBalancer(), loadBalancerIdentityModel);
    assertEquals(instanceGroupPatchModel.loadBalancerPool(), loadBalancerPoolIdentityModel);
    assertEquals(instanceGroupPatchModel.membershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupPatchModel.name(), "my-instance-group");
    assertEquals(instanceGroupPatchModel.subnets(), java.util.Arrays.asList(subnetIdentityModel));

    String json = TestUtilities.serialize(instanceGroupPatchModel);

    InstanceGroupPatch instanceGroupPatchModelNew = TestUtilities.deserialize(json, InstanceGroupPatch.class);
    assertTrue(instanceGroupPatchModelNew instanceof InstanceGroupPatch);
    assertEquals(instanceGroupPatchModelNew.applicationPort(), Long.valueOf("22"));
    assertEquals(instanceGroupPatchModelNew.instanceTemplate().toString(), instanceTemplateIdentityModel.toString());
    assertEquals(instanceGroupPatchModelNew.loadBalancer().toString(), loadBalancerIdentityModel.toString());
    assertEquals(instanceGroupPatchModelNew.loadBalancerPool().toString(), loadBalancerPoolIdentityModel.toString());
    assertEquals(instanceGroupPatchModelNew.membershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupPatchModelNew.name(), "my-instance-group");
  }
  @Test
  public void testInstanceGroupPatchAsPatch() throws Throwable {
    InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();

    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();

    InstanceGroupPatch instanceGroupPatchModel = new InstanceGroupPatch.Builder()
      .applicationPort(Long.valueOf("22"))
      .instanceTemplate(instanceTemplateIdentityModel)
      .loadBalancer(loadBalancerIdentityModel)
      .loadBalancerPool(loadBalancerPoolIdentityModel)
      .membershipCount(Long.valueOf("10"))
      .name("my-instance-group")
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .build();

    Map<String, Object> mergePatch = instanceGroupPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("application_port"));
    assertTrue(mergePatch.containsKey("instance_template"));
    assertTrue(mergePatch.containsKey("load_balancer"));
    assertTrue(mergePatch.containsKey("load_balancer_pool"));
    assertTrue(mergePatch.containsKey("membership_count"));
    assertEquals(mergePatch.get("name"), "my-instance-group");
    assertTrue(mergePatch.containsKey("subnets"));
  }

}