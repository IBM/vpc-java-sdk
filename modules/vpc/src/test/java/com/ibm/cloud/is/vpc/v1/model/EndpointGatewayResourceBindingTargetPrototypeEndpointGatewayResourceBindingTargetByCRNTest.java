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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN model.
 */
public class EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN() throws Throwable {
    EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN endpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCrnModel = new EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN.Builder()
      .crn("crn:v1:bluemix:public:cloud-object-storage:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:bucket-27200-lwx4cfvcue")
      .build();
    assertEquals(endpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCrnModel.crn(), "crn:v1:bluemix:public:cloud-object-storage:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:bucket-27200-lwx4cfvcue");

    String json = TestUtilities.serialize(endpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCrnModel);

    EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN endpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCrnModelNew = TestUtilities.deserialize(json, EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN.class);
    assertTrue(endpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCrnModelNew instanceof EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN);
    assertEquals(endpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCrnModelNew.crn(), "crn:v1:bluemix:public:cloud-object-storage:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1a0ec336-f391-4091-a6fb-5e084a4c56f4:bucket:bucket-27200-lwx4cfvcue");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRNError() throws Throwable {
    new EndpointGatewayResourceBindingTargetPrototypeEndpointGatewayResourceBindingTargetByCRN.Builder().build();
  }

}