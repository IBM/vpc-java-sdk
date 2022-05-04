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

import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImageFilePrototype model.
 */
public class ImageFilePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImageFilePrototype() throws Throwable {
    ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
      .href("cos://us-south/custom-image-vpc-bucket/customImage-0.vhd")
      .build();
    assertEquals(imageFilePrototypeModel.href(), "cos://us-south/custom-image-vpc-bucket/customImage-0.vhd");

    String json = TestUtilities.serialize(imageFilePrototypeModel);

    ImageFilePrototype imageFilePrototypeModelNew = TestUtilities.deserialize(json, ImageFilePrototype.class);
    assertTrue(imageFilePrototypeModelNew instanceof ImageFilePrototype);
    assertEquals(imageFilePrototypeModelNew.href(), "cos://us-south/custom-image-vpc-bucket/customImage-0.vhd");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImageFilePrototypeError() throws Throwable {
    new ImageFilePrototype.Builder().build();
  }

}