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

import com.ibm.cloud.is.vpc.v1.model.CreateSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSubnetReservedIpOptions model.
 */
public class CreateSubnetReservedIpOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSubnetReservedIpOptions() throws Throwable {
    ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById reservedIpTargetPrototypeModel = new ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityById.Builder()
      .id("d7cc5196-9864-48c4-82d8-3f30da41fcc5")
      .build();
    assertEquals(reservedIpTargetPrototypeModel.id(), "d7cc5196-9864-48c4-82d8-3f30da41fcc5");

    CreateSubnetReservedIpOptions createSubnetReservedIpOptionsModel = new CreateSubnetReservedIpOptions.Builder()
      .subnetId("testString")
      .address("192.168.3.4")
      .autoDelete(false)
      .name("my-reserved-ip")
      .target(reservedIpTargetPrototypeModel)
      .build();
    assertEquals(createSubnetReservedIpOptionsModel.subnetId(), "testString");
    assertEquals(createSubnetReservedIpOptionsModel.address(), "192.168.3.4");
    assertEquals(createSubnetReservedIpOptionsModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(createSubnetReservedIpOptionsModel.name(), "my-reserved-ip");
    assertEquals(createSubnetReservedIpOptionsModel.target(), reservedIpTargetPrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSubnetReservedIpOptionsError() throws Throwable {
    new CreateSubnetReservedIpOptions.Builder().build();
  }

}