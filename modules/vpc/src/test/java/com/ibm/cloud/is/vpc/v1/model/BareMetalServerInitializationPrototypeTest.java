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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationPrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerInitializationPrototype model.
 */
public class BareMetalServerInitializationPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerInitializationPrototype() throws Throwable {
    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .build();
    assertEquals(imageIdentityModel.id(), "72b27b5c-f4b0-48bb-b954-5becc7c1dcb8");

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(keyIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    BareMetalServerInitializationPrototype bareMetalServerInitializationPrototypeModel = new BareMetalServerInitializationPrototype.Builder()
      .image(imageIdentityModel)
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .userData("testString")
      .build();
    assertEquals(bareMetalServerInitializationPrototypeModel.image(), imageIdentityModel);
    assertEquals(bareMetalServerInitializationPrototypeModel.keys(), new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)));
    assertEquals(bareMetalServerInitializationPrototypeModel.userData(), "testString");

    String json = TestUtilities.serialize(bareMetalServerInitializationPrototypeModel);

    BareMetalServerInitializationPrototype bareMetalServerInitializationPrototypeModelNew = TestUtilities.deserialize(json, BareMetalServerInitializationPrototype.class);
    assertTrue(bareMetalServerInitializationPrototypeModelNew instanceof BareMetalServerInitializationPrototype);
    assertEquals(bareMetalServerInitializationPrototypeModelNew.image().toString(), imageIdentityModel.toString());
    assertEquals(bareMetalServerInitializationPrototypeModelNew.userData(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBareMetalServerInitializationPrototypeError() throws Throwable {
    new BareMetalServerInitializationPrototype.Builder().build();
  }

}