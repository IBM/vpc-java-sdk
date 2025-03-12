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
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageBySourceVolume;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImagePrototypeImageBySourceVolume model.
 */
public class ImagePrototypeImageBySourceVolumeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImagePrototypeImageBySourceVolume() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(volumeIdentityModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    ImagePrototypeImageBySourceVolume imagePrototypeImageBySourceVolumeModel = new ImagePrototypeImageBySourceVolume.Builder()
      .deprecationAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .name("my-image")
      .obsolescenceAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .resourceGroup(resourceGroupIdentityModel)
      .encryptionKey(encryptionKeyIdentityModel)
      .sourceVolume(volumeIdentityModel)
      .build();
    assertEquals(imagePrototypeImageBySourceVolumeModel.deprecationAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageBySourceVolumeModel.name(), "my-image");
    assertEquals(imagePrototypeImageBySourceVolumeModel.obsolescenceAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageBySourceVolumeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(imagePrototypeImageBySourceVolumeModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(imagePrototypeImageBySourceVolumeModel.sourceVolume(), volumeIdentityModel);

    String json = TestUtilities.serialize(imagePrototypeImageBySourceVolumeModel);

    ImagePrototypeImageBySourceVolume imagePrototypeImageBySourceVolumeModelNew = TestUtilities.deserialize(json, ImagePrototypeImageBySourceVolume.class);
    assertTrue(imagePrototypeImageBySourceVolumeModelNew instanceof ImagePrototypeImageBySourceVolume);
    assertEquals(imagePrototypeImageBySourceVolumeModelNew.deprecationAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageBySourceVolumeModelNew.name(), "my-image");
    assertEquals(imagePrototypeImageBySourceVolumeModelNew.obsolescenceAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(imagePrototypeImageBySourceVolumeModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(imagePrototypeImageBySourceVolumeModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(imagePrototypeImageBySourceVolumeModelNew.sourceVolume().toString(), volumeIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testImagePrototypeImageBySourceVolumeError() throws Throwable {
    new ImagePrototypeImageBySourceVolume.Builder().build();
  }

}