/*
 * (C) Copyright IBM Corp. 2020.
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
 * Unit test class for the ImagePrototypeImageByFile model.
 */
public class ImagePrototypeImageByFileTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImagePrototypeImageByFile() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
      .href("cos://us-south/custom-image-vpc-bucket/customImage-0.vhd")
      .build();
    assertEquals(imageFilePrototypeModel.href(), "cos://us-south/custom-image-vpc-bucket/customImage-0.vhd");

    OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
      .name("ubuntu-16-amd64")
      .build();
    assertEquals(operatingSystemIdentityModel.name(), "ubuntu-16-amd64");

    ImagePrototypeImageByFile imagePrototypeImageByFileModel = new ImagePrototypeImageByFile.Builder()
      .name("my-image")
      .resourceGroup(resourceGroupIdentityModel)
      .file(imageFilePrototypeModel)
      .operatingSystem(operatingSystemIdentityModel)
      .build();
    assertEquals(imagePrototypeImageByFileModel.name(), "my-image");
    assertEquals(imagePrototypeImageByFileModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(imagePrototypeImageByFileModel.file(), imageFilePrototypeModel);
    assertEquals(imagePrototypeImageByFileModel.operatingSystem(), operatingSystemIdentityModel);

    String json = TestUtilities.serialize(imagePrototypeImageByFileModel);

    ImagePrototypeImageByFile imagePrototypeImageByFileModelNew = TestUtilities.deserialize(json, ImagePrototypeImageByFile.class);
    assertTrue(imagePrototypeImageByFileModelNew instanceof ImagePrototypeImageByFile);
    assertEquals(imagePrototypeImageByFileModelNew.name(), "my-image");
    assertEquals(imagePrototypeImageByFileModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(imagePrototypeImageByFileModelNew.file().toString(), imageFilePrototypeModel.toString());
    assertEquals(imagePrototypeImageByFileModelNew.operatingSystem().toString(), operatingSystemIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImagePrototypeImageByFileError() throws Throwable {
    new ImagePrototypeImageByFile.Builder().build();
  }

}