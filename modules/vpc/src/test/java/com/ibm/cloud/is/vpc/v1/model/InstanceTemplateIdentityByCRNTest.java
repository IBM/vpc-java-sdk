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

import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceTemplateIdentityByCRN model.
 */
public class InstanceTemplateIdentityByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplateIdentityByCRN() throws Throwable {
    InstanceTemplateIdentityByCRN instanceTemplateIdentityByCrnModel = new InstanceTemplateIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::instance-template:0717-e6c2c7d8-ad57-4f38-a21c-a86265b6aeb2")
      .build();
    assertEquals(instanceTemplateIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::instance-template:0717-e6c2c7d8-ad57-4f38-a21c-a86265b6aeb2");

    String json = TestUtilities.serialize(instanceTemplateIdentityByCrnModel);

    InstanceTemplateIdentityByCRN instanceTemplateIdentityByCrnModelNew = TestUtilities.deserialize(json, InstanceTemplateIdentityByCRN.class);
    assertTrue(instanceTemplateIdentityByCrnModelNew instanceof InstanceTemplateIdentityByCRN);
    assertEquals(instanceTemplateIdentityByCrnModelNew.crn(), "crn:v1:bluemix:public:is:us-south-1:a/aa2432b1fa4d4ace891e9b80fc104e34::instance-template:0717-e6c2c7d8-ad57-4f38-a21c-a86265b6aeb2");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceTemplateIdentityByCRNError() throws Throwable {
    new InstanceTemplateIdentityByCRN.Builder().build();
  }

}