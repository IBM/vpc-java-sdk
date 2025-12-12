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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ReplaceBareMetalServerInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceBareMetalServerInitializationOptions model.
 */
public class ReplaceBareMetalServerInitializationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceBareMetalServerInitializationOptions() throws Throwable {
    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .build();
    assertEquals(imageIdentityModel.id(), "r006-72b27b5c-f4b0-48bb-b954-5becc7c1dcb8");

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("r006-82679077-ac3b-4c10-be16-63e9c21f0f45")
      .build();
    assertEquals(keyIdentityModel.id(), "r006-82679077-ac3b-4c10-be16-63e9c21f0f45");

    TrustedProfileIdentityById trustedProfileIdentityModel = new TrustedProfileIdentityById.Builder()
      .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();
    assertEquals(trustedProfileIdentityModel.id(), "Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");

    BareMetalServerInitializationDefaultTrustedProfilePrototype bareMetalServerInitializationDefaultTrustedProfilePrototypeModel = new BareMetalServerInitializationDefaultTrustedProfilePrototype.Builder()
      .autoLink(false)
      .target(trustedProfileIdentityModel)
      .build();
    assertEquals(bareMetalServerInitializationDefaultTrustedProfilePrototypeModel.autoLink(), Boolean.valueOf(false));
    assertEquals(bareMetalServerInitializationDefaultTrustedProfilePrototypeModel.target(), trustedProfileIdentityModel);

    ReplaceBareMetalServerInitializationOptions replaceBareMetalServerInitializationOptionsModel = new ReplaceBareMetalServerInitializationOptions.Builder()
      .id("testString")
      .image(imageIdentityModel)
      .keys(java.util.Arrays.asList(keyIdentityModel))
      .defaultTrustedProfile(bareMetalServerInitializationDefaultTrustedProfilePrototypeModel)
      .userData("testString")
      .build();
    assertEquals(replaceBareMetalServerInitializationOptionsModel.id(), "testString");
    assertEquals(replaceBareMetalServerInitializationOptionsModel.image(), imageIdentityModel);
    assertEquals(replaceBareMetalServerInitializationOptionsModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(replaceBareMetalServerInitializationOptionsModel.defaultTrustedProfile(), bareMetalServerInitializationDefaultTrustedProfilePrototypeModel);
    assertEquals(replaceBareMetalServerInitializationOptionsModel.userData(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceBareMetalServerInitializationOptionsError() throws Throwable {
    new ReplaceBareMetalServerInitializationOptions.Builder().build();
  }

}