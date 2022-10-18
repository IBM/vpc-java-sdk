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

import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceDefaultTrustedProfilePrototype model.
 */
public class InstanceDefaultTrustedProfilePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceDefaultTrustedProfilePrototype() throws Throwable {
    TrustedProfileIdentityTrustedProfileById trustedProfileIdentityModel = new TrustedProfileIdentityTrustedProfileById.Builder()
      .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();
    assertEquals(trustedProfileIdentityModel.id(), "Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");

    InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
      .autoLink(false)
      .target(trustedProfileIdentityModel)
      .build();
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.autoLink(), Boolean.valueOf(false));
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.target(), trustedProfileIdentityModel);

    String json = TestUtilities.serialize(instanceDefaultTrustedProfilePrototypeModel);

    InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModelNew = TestUtilities.deserialize(json, InstanceDefaultTrustedProfilePrototype.class);
    assertTrue(instanceDefaultTrustedProfilePrototypeModelNew instanceof InstanceDefaultTrustedProfilePrototype);
    assertEquals(instanceDefaultTrustedProfilePrototypeModelNew.autoLink(), Boolean.valueOf(false));
    assertEquals(instanceDefaultTrustedProfilePrototypeModelNew.target().toString(), trustedProfileIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceDefaultTrustedProfilePrototypeError() throws Throwable {
    new InstanceDefaultTrustedProfilePrototype.Builder().build();
  }

}