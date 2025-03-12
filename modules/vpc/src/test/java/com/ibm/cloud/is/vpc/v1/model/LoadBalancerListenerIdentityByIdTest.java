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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListenerIdentityById model.
 */
public class LoadBalancerListenerIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerIdentityById() throws Throwable {
    LoadBalancerListenerIdentityById loadBalancerListenerIdentityByIdModel = new LoadBalancerListenerIdentityById.Builder()
      .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
      .build();
    assertEquals(loadBalancerListenerIdentityByIdModel.id(), "r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091");

    String json = TestUtilities.serialize(loadBalancerListenerIdentityByIdModel);

    LoadBalancerListenerIdentityById loadBalancerListenerIdentityByIdModelNew = TestUtilities.deserialize(json, LoadBalancerListenerIdentityById.class);
    assertTrue(loadBalancerListenerIdentityByIdModelNew instanceof LoadBalancerListenerIdentityById);
    assertEquals(loadBalancerListenerIdentityByIdModelNew.id(), "r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerIdentityByIdError() throws Throwable {
    new LoadBalancerListenerIdentityById.Builder().build();
  }

}