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

import com.ibm.cloud.is.vpc.v1.model.CreateEndpointGatewayResourceBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateEndpointGatewayResourceBindingOptions model.
 */
public class CreateEndpointGatewayResourceBindingOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateEndpointGatewayResourceBindingOptions() throws Throwable {
    EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN endpointGatewayResourceBindingTargetPrototypeModel = new EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN.Builder()
      .crn("crn:v1:bluemix:public:cloud-object-storage:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:bucket-27200-lwx4cfvcue")
      .build();
    assertEquals(endpointGatewayResourceBindingTargetPrototypeModel.crn(), "crn:v1:bluemix:public:cloud-object-storage:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:bucket-27200-lwx4cfvcue");

    CreateEndpointGatewayResourceBindingOptions createEndpointGatewayResourceBindingOptionsModel = new CreateEndpointGatewayResourceBindingOptions.Builder()
      .endpointGatewayId("testString")
      .target(endpointGatewayResourceBindingTargetPrototypeModel)
      .name("my-resource-binding")
      .build();
    assertEquals(createEndpointGatewayResourceBindingOptionsModel.endpointGatewayId(), "testString");
    assertEquals(createEndpointGatewayResourceBindingOptionsModel.target(), endpointGatewayResourceBindingTargetPrototypeModel);
    assertEquals(createEndpointGatewayResourceBindingOptionsModel.name(), "my-resource-binding");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEndpointGatewayResourceBindingOptionsError() throws Throwable {
    new CreateEndpointGatewayResourceBindingOptions.Builder().build();
  }

}