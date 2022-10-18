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

import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RoutingTableIdentityById model.
 */
public class RoutingTableIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoutingTableIdentityById() throws Throwable {
    RoutingTableIdentityById routingTableIdentityByIdModel = new RoutingTableIdentityById.Builder()
      .id("1a15dca5-7e33-45e1-b7c5-bc690e569531")
      .build();
    assertEquals(routingTableIdentityByIdModel.id(), "1a15dca5-7e33-45e1-b7c5-bc690e569531");

    String json = TestUtilities.serialize(routingTableIdentityByIdModel);

    RoutingTableIdentityById routingTableIdentityByIdModelNew = TestUtilities.deserialize(json, RoutingTableIdentityById.class);
    assertTrue(routingTableIdentityByIdModelNew instanceof RoutingTableIdentityById);
    assertEquals(routingTableIdentityByIdModelNew.id(), "1a15dca5-7e33-45e1-b7c5-bc690e569531");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRoutingTableIdentityByIdError() throws Throwable {
    new RoutingTableIdentityById.Builder().build();
  }

}