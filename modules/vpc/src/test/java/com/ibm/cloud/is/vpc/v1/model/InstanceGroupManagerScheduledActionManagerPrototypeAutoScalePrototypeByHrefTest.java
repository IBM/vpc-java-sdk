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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref model.
 */
public class InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref() throws Throwable {
    InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModel = new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref.Builder()
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .href("https://us-south.iaas.cloud.ibm.com/v1/instance_groups/r006-7b3ac170-01f3-43d6-87ec-f0ed11ed3f60/managers/r006-bd21f31f-8a05-4451-836d-ab0347e91fea")
      .build();
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/instance_groups/r006-7b3ac170-01f3-43d6-87ec-f0ed11ed3f60/managers/r006-bd21f31f-8a05-4451-836d-ab0347e91fea");

    String json = TestUtilities.serialize(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModel);

    InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModelNew = TestUtilities.deserialize(json, InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref.class);
    assertTrue(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModelNew instanceof InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref);
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModelNew.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModelNew.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/instance_groups/r006-7b3ac170-01f3-43d6-87ec-f0ed11ed3f60/managers/r006-bd21f31f-8a05-4451-836d-ab0347e91fea");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHrefError() throws Throwable {
    new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeByHref.Builder().build();
  }

}