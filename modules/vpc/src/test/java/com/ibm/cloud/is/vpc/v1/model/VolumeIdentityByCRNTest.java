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

import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeIdentityByCRN model.
 */
public class VolumeIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeIdentityByCRN() throws Throwable {
    VolumeIdentityByCRN volumeIdentityByCrnModel = new VolumeIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    String json = TestUtilities.serialize(volumeIdentityByCrnModel);

    VolumeIdentityByCRN volumeIdentityByCrnModelNew = TestUtilities.deserialize(json, VolumeIdentityByCRN.class);
    assertTrue(volumeIdentityByCrnModelNew instanceof VolumeIdentityByCRN);
    assertEquals(volumeIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south-1:a/123456::volume:1a6b7274-678d-4dfb-8981-c71dd9d4daa5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeIdentityByCRNError() throws Throwable {
    new VolumeIdentityByCRN.Builder().build();
  }

}