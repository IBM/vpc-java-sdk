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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayPatch model.
 */
public class EndpointGatewayPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayPatch() throws Throwable {
    EndpointGatewayPatch endpointGatewayPatchModel = new EndpointGatewayPatch.Builder()
      .name("my-endpoint-gateway")
      .build();
    assertEquals(endpointGatewayPatchModel.name(), "my-endpoint-gateway");

    String json = TestUtilities.serialize(endpointGatewayPatchModel);

    EndpointGatewayPatch endpointGatewayPatchModelNew = TestUtilities.deserialize(json, EndpointGatewayPatch.class);
    assertTrue(endpointGatewayPatchModelNew instanceof EndpointGatewayPatch);
    assertEquals(endpointGatewayPatchModelNew.name(), "my-endpoint-gateway");
  }
  @Test
  public void testEndpointGatewayPatchAsPatch() throws Throwable {
    EndpointGatewayPatch endpointGatewayPatchModel = new EndpointGatewayPatch.Builder()
      .name("my-endpoint-gateway")
      .build();

    Map<String, Object> mergePatch = endpointGatewayPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "my-endpoint-gateway");
  }

}