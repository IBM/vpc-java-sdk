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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPPrototypeTargetContext;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayReservedIPReservedIPPrototypeTargetContext model.
 */
public class EndpointGatewayReservedIPReservedIPPrototypeTargetContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayReservedIPReservedIPPrototypeTargetContext() throws Throwable {
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    EndpointGatewayReservedIPReservedIPPrototypeTargetContext endpointGatewayReservedIpReservedIpPrototypeTargetContextModel = new EndpointGatewayReservedIPReservedIPPrototypeTargetContext.Builder()
      .address("192.168.3.4")
      .autoDelete(false)
      .name("my-reserved-ip")
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModel.address(), "192.168.3.4");
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModel.name(), "my-reserved-ip");
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModel.subnet(), subnetIdentityModel);

    String json = TestUtilities.serialize(endpointGatewayReservedIpReservedIpPrototypeTargetContextModel);

    EndpointGatewayReservedIPReservedIPPrototypeTargetContext endpointGatewayReservedIpReservedIpPrototypeTargetContextModelNew = TestUtilities.deserialize(json, EndpointGatewayReservedIPReservedIPPrototypeTargetContext.class);
    assertTrue(endpointGatewayReservedIpReservedIpPrototypeTargetContextModelNew instanceof EndpointGatewayReservedIPReservedIPPrototypeTargetContext);
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModelNew.address(), "192.168.3.4");
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModelNew.autoDelete(), Boolean.valueOf(false));
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModelNew.name(), "my-reserved-ip");
    assertEquals(endpointGatewayReservedIpReservedIpPrototypeTargetContextModelNew.subnet().toString(), subnetIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayReservedIPReservedIPPrototypeTargetContextError() throws Throwable {
    new EndpointGatewayReservedIPReservedIPPrototypeTargetContext.Builder().build();
  }

}