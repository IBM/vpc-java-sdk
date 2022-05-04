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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype model.
 */
public class InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype() throws Throwable {
    InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModel = new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.Builder()
      .name("my-instance-group-manager-policy")
      .metricType("cpu")
      .metricValue(Long.valueOf("26"))
      .policyType("target")
      .build();
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModel.name(), "my-instance-group-manager-policy");
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModel.metricType(), "cpu");
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModel.metricValue(), Long.valueOf("26"));
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModel.policyType(), "target");

    String json = TestUtilities.serialize(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModel);

    InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModelNew = TestUtilities.deserialize(json, InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.class);
    assertTrue(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModelNew instanceof InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype);
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModelNew.name(), "my-instance-group-manager-policy");
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModelNew.metricType(), "cpu");
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModelNew.metricValue(), Long.valueOf("26"));
    assertEquals(instanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeModelNew.policyType(), "target");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototypeError() throws Throwable {
    new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.Builder().build();
  }

}