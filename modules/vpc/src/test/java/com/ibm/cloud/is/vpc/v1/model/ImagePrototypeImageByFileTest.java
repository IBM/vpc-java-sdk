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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageAllowedUsePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageByFile;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImagePrototypeImageByFile model.
 */
public class ImagePrototypeImageByFileTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImagePrototypeImageByFile() throws Throwable {
    ImageAllowedUsePrototype imageAllowedUsePrototypeModel = new ImageAllowedUsePrototype.Builder()
      .apiVersion("2024-06-23")
      .bareMetalServer("enable_secure_boot == true")
      .instance("gpu.count > 0 && enable_secure_boot == true")
      .build();
    assertEquals(imageAllowedUsePrototypeModel.apiVersion(), "2024-06-23");
    assertEquals(imageAllowedUsePrototypeModel.bareMetalServer(), "enable_secure_boot == true");
    assertEquals(imageAllowedUsePrototypeModel.instance(), "gpu.count > 0 && enable_secure_boot == true");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
      .href("cos://us-south/custom-image-vpc-bucket/customImage-0.vhd")
      .build();
    assertEquals(imageFilePrototypeModel.href(), "cos://us-south/custom-image-vpc-bucket/customImage-0.vhd");

    OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
      .name("ubuntu-24-04-amd64")
      .build();
    assertEquals(operatingSystemIdentityModel.name(), "ubuntu-24-04-amd64");

    ImagePrototypeImageByFile imagePrototypeImageByFileModel = new ImagePrototypeImageByFile.Builder()
      .allowedUse(imageAllowedUsePrototypeModel)
      .deprecationAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .name("my-image")
      .obsolescenceAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .resourceGroup(resourceGroupIdentityModel)
      .encryptedDataKey("testString")
      .encryptionKey(encryptionKeyIdentityModel)
      .file(imageFilePrototypeModel)
      .operatingSystem(operatingSystemIdentityModel)
      .build();
    assertEquals(imagePrototypeImageByFileModel.allowedUse(), imageAllowedUsePrototypeModel);
    assertEquals(imagePrototypeImageByFileModel.deprecationAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageByFileModel.name(), "my-image");
    assertEquals(imagePrototypeImageByFileModel.obsolescenceAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageByFileModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(imagePrototypeImageByFileModel.encryptedDataKey(), "testString");
    assertEquals(imagePrototypeImageByFileModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(imagePrototypeImageByFileModel.file(), imageFilePrototypeModel);
    assertEquals(imagePrototypeImageByFileModel.operatingSystem(), operatingSystemIdentityModel);

    String json = TestUtilities.serialize(imagePrototypeImageByFileModel);

    ImagePrototypeImageByFile imagePrototypeImageByFileModelNew = TestUtilities.deserialize(json, ImagePrototypeImageByFile.class);
    assertTrue(imagePrototypeImageByFileModelNew instanceof ImagePrototypeImageByFile);
    assertEquals(imagePrototypeImageByFileModelNew.allowedUse().toString(), imageAllowedUsePrototypeModel.toString());
    assertEquals(imagePrototypeImageByFileModelNew.deprecationAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageByFileModelNew.name(), "my-image");
    assertEquals(imagePrototypeImageByFileModelNew.obsolescenceAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageByFileModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(imagePrototypeImageByFileModelNew.encryptedDataKey(), "testString");
    assertEquals(imagePrototypeImageByFileModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(imagePrototypeImageByFileModelNew.file().toString(), imageFilePrototypeModel.toString());
    assertEquals(imagePrototypeImageByFileModelNew.operatingSystem().toString(), operatingSystemIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImagePrototypeImageByFileError() throws Throwable {
    new ImagePrototypeImageByFile.Builder().build();
  }

}