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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerPoolSessionPersistencePrototype model.
 */
public class LoadBalancerPoolSessionPersistencePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerPoolSessionPersistencePrototype() throws Throwable {
    LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModel = new LoadBalancerPoolSessionPersistencePrototype.Builder()
      .cookieName("my-cookie-name")
      .type("app_cookie")
      .build();
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModel.cookieName(), "my-cookie-name");
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModel.type(), "app_cookie");

    String json = TestUtilities.serialize(loadBalancerPoolSessionPersistencePrototypeModel);

    LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerPoolSessionPersistencePrototype.class);
    assertTrue(loadBalancerPoolSessionPersistencePrototypeModelNew instanceof LoadBalancerPoolSessionPersistencePrototype);
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModelNew.cookieName(), "my-cookie-name");
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModelNew.type(), "app_cookie");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerPoolSessionPersistencePrototypeError() throws Throwable {
    new LoadBalancerPoolSessionPersistencePrototype.Builder().build();
  }

}