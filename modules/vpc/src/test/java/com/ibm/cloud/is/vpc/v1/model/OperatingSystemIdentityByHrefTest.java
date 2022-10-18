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

import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the OperatingSystemIdentityByHref model.
 */
public class OperatingSystemIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOperatingSystemIdentityByHref() throws Throwable {
    OperatingSystemIdentityByHref operatingSystemIdentityByHrefModel = new OperatingSystemIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64")
      .build();
    assertEquals(operatingSystemIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64");

    String json = TestUtilities.serialize(operatingSystemIdentityByHrefModel);

    OperatingSystemIdentityByHref operatingSystemIdentityByHrefModelNew = TestUtilities.deserialize(json, OperatingSystemIdentityByHref.class);
    assertTrue(operatingSystemIdentityByHrefModelNew instanceof OperatingSystemIdentityByHref);
    assertEquals(operatingSystemIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/operating_systems/ubuntu-16-amd64");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testOperatingSystemIdentityByHrefError() throws Throwable {
    new OperatingSystemIdentityByHref.Builder().build();
  }

}