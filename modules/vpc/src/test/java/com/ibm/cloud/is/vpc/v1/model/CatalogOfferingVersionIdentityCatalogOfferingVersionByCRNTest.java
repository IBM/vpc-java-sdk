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

import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN model.
 */
public class CatalogOfferingVersionIdentityCatalogOfferingVersionByCRNTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogOfferingVersionIdentityCatalogOfferingVersionByCRN() throws Throwable {
    CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN catalogOfferingVersionIdentityCatalogOfferingVersionByCrnModel = new CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN.Builder()
      .crn("crn:v1:bluemix:public:globalcatalog-collection:global:a/123456:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:version:00111601-0ec5-41ac-b142-96d1e64e6442/ec66bec2-6a33-42d6-9323-26dd4dc8875d")
      .build();
    assertEquals(catalogOfferingVersionIdentityCatalogOfferingVersionByCrnModel.crn(), "crn:v1:bluemix:public:globalcatalog-collection:global:a/123456:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:version:00111601-0ec5-41ac-b142-96d1e64e6442/ec66bec2-6a33-42d6-9323-26dd4dc8875d");

    String json = TestUtilities.serialize(catalogOfferingVersionIdentityCatalogOfferingVersionByCrnModel);

    CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN catalogOfferingVersionIdentityCatalogOfferingVersionByCrnModelNew = TestUtilities.deserialize(json, CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN.class);
    assertTrue(catalogOfferingVersionIdentityCatalogOfferingVersionByCrnModelNew instanceof CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN);
    assertEquals(catalogOfferingVersionIdentityCatalogOfferingVersionByCrnModelNew.crn(), "crn:v1:bluemix:public:globalcatalog-collection:global:a/123456:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:version:00111601-0ec5-41ac-b142-96d1e64e6442/ec66bec2-6a33-42d6-9323-26dd4dc8875d");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCatalogOfferingVersionIdentityCatalogOfferingVersionByCRNError() throws Throwable {
    new CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN.Builder().build();
  }

}