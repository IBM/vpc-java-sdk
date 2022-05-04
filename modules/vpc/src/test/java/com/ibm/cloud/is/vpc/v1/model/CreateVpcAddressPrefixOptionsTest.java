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

import com.ibm.cloud.is.vpc.v1.model.CreateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateVpcAddressPrefixOptions model.
 */
public class CreateVpcAddressPrefixOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateVpcAddressPrefixOptions() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    CreateVpcAddressPrefixOptions createVpcAddressPrefixOptionsModel = new CreateVpcAddressPrefixOptions.Builder()
      .vpcId("testString")
      .cidr("10.0.0.0/24")
      .zone(zoneIdentityModel)
      .isDefault(true)
      .name("my-address-prefix-2")
      .build();
    assertEquals(createVpcAddressPrefixOptionsModel.vpcId(), "testString");
    assertEquals(createVpcAddressPrefixOptionsModel.cidr(), "10.0.0.0/24");
    assertEquals(createVpcAddressPrefixOptionsModel.zone(), zoneIdentityModel);
    assertEquals(createVpcAddressPrefixOptionsModel.isDefault(), Boolean.valueOf(true));
    assertEquals(createVpcAddressPrefixOptionsModel.name(), "my-address-prefix-2");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVpcAddressPrefixOptionsError() throws Throwable {
    new CreateVpcAddressPrefixOptions.Builder().build();
  }

}