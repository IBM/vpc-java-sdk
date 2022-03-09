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

import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ZoneIdentityByHref model.
 */
public class ZoneIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testZoneIdentityByHref() throws Throwable {
    ZoneIdentityByHref zoneIdentityByHrefModel = new ZoneIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1")
      .build();
    assertEquals(zoneIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1");

    String json = TestUtilities.serialize(zoneIdentityByHrefModel);

    ZoneIdentityByHref zoneIdentityByHrefModelNew = TestUtilities.deserialize(json, ZoneIdentityByHref.class);
    assertTrue(zoneIdentityByHrefModelNew instanceof ZoneIdentityByHref);
    assertEquals(zoneIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/regions/us-south/zones/us-south-1");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testZoneIdentityByHrefError() throws Throwable {
    new ZoneIdentityByHref.Builder().build();
  }

}