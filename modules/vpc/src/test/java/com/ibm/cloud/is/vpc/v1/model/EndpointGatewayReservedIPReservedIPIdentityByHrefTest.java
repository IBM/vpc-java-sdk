/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReservedIPReservedIPIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EndpointGatewayReservedIPReservedIPIdentityByHref model.
 */
public class EndpointGatewayReservedIPReservedIPIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEndpointGatewayReservedIPReservedIPIdentityByHref() throws Throwable {
    EndpointGatewayReservedIPReservedIPIdentityByHref endpointGatewayReservedIpReservedIpIdentityByHrefModel = new EndpointGatewayReservedIPReservedIPIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/subnets/0717-bea6a632-5e13-42a4-b4b8-31dc877abfe4/reserved_ips/0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb")
      .build();
    assertEquals(endpointGatewayReservedIpReservedIpIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/subnets/0717-bea6a632-5e13-42a4-b4b8-31dc877abfe4/reserved_ips/0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb");

    String json = TestUtilities.serialize(endpointGatewayReservedIpReservedIpIdentityByHrefModel);

    EndpointGatewayReservedIPReservedIPIdentityByHref endpointGatewayReservedIpReservedIpIdentityByHrefModelNew = TestUtilities.deserialize(json, EndpointGatewayReservedIPReservedIPIdentityByHref.class);
    assertTrue(endpointGatewayReservedIpReservedIpIdentityByHrefModelNew instanceof EndpointGatewayReservedIPReservedIPIdentityByHref);
    assertEquals(endpointGatewayReservedIpReservedIpIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/subnets/0717-bea6a632-5e13-42a4-b4b8-31dc877abfe4/reserved_ips/0717-6d353a0f-aeb1-4ae1-832e-1110d10981bb");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEndpointGatewayReservedIPReservedIPIdentityByHrefError() throws Throwable {
    new EndpointGatewayReservedIPReservedIPIdentityByHref.Builder().build();
  }

}