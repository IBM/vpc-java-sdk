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

import com.ibm.cloud.is.vpc.v1.model.CreateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageByFile;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateImageOptions model.
 */
public class CreateImageOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateImageOptions() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
      .href("cos://us-south/custom-image-vpc-bucket/customImage-0.vhd")
      .build();
    assertEquals(imageFilePrototypeModel.href(), "cos://us-south/custom-image-vpc-bucket/customImage-0.vhd");

    OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
      .name("ubuntu-16-amd64")
      .build();
    assertEquals(operatingSystemIdentityModel.name(), "ubuntu-16-amd64");

    ImagePrototypeImageByFile imagePrototypeModel = new ImagePrototypeImageByFile.Builder()
      .name("my-image")
      .resourceGroup(resourceGroupIdentityModel)
      .encryptedDataKey("testString")
      .encryptionKey(encryptionKeyIdentityModel)
      .file(imageFilePrototypeModel)
      .operatingSystem(operatingSystemIdentityModel)
      .build();
    assertEquals(imagePrototypeModel.name(), "my-image");
    assertEquals(imagePrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(imagePrototypeModel.encryptedDataKey(), "testString");
    assertEquals(imagePrototypeModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(imagePrototypeModel.file(), imageFilePrototypeModel);
    assertEquals(imagePrototypeModel.operatingSystem(), operatingSystemIdentityModel);

    CreateImageOptions createImageOptionsModel = new CreateImageOptions.Builder()
      .imagePrototype(imagePrototypeModel)
      .build();
    assertEquals(createImageOptionsModel.imagePrototype(), imagePrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateImageOptionsError() throws Throwable {
    new CreateImageOptions.Builder().build();
  }

}