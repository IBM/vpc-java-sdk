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

import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionPlanIdentityCatalogOfferingVersionPlanByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOfferingPrototypeCatalogOfferingByVersion;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceCatalogOfferingPrototypeCatalogOfferingByVersion model.
 */
public class InstanceCatalogOfferingPrototypeCatalogOfferingByVersionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceCatalogOfferingPrototypeCatalogOfferingByVersion() throws Throwable {
    CatalogOfferingVersionPlanIdentityCatalogOfferingVersionPlanByCRN catalogOfferingVersionPlanIdentityModel = new CatalogOfferingVersionPlanIdentityCatalogOfferingVersionPlanByCRN.Builder()
      .crn("crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:51c9e0db-2911-45a6-adb0-ac5332d27cf2:plan:sw.51c9e0db-2911-45a6-adb0-ac5332d27cf2.772c0dbe-aa62-482e-adbe-a3fc20101e0e")
      .build();
    assertEquals(catalogOfferingVersionPlanIdentityModel.crn(), "crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:51c9e0db-2911-45a6-adb0-ac5332d27cf2:plan:sw.51c9e0db-2911-45a6-adb0-ac5332d27cf2.772c0dbe-aa62-482e-adbe-a3fc20101e0e");

    CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN catalogOfferingVersionIdentityModel = new CatalogOfferingVersionIdentityCatalogOfferingVersionByCRN.Builder()
      .crn("crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:version:00111601-0ec5-41ac-b142-96d1e64e6442/ec66bec2-6a33-42d6-9323-26dd4dc8875d")
      .build();
    assertEquals(catalogOfferingVersionIdentityModel.crn(), "crn:v1:bluemix:public:globalcatalog-collection:global:a/aa2432b1fa4d4ace891e9b80fc104e34:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:version:00111601-0ec5-41ac-b142-96d1e64e6442/ec66bec2-6a33-42d6-9323-26dd4dc8875d");

    InstanceCatalogOfferingPrototypeCatalogOfferingByVersion instanceCatalogOfferingPrototypeCatalogOfferingByVersionModel = new InstanceCatalogOfferingPrototypeCatalogOfferingByVersion.Builder()
      .plan(catalogOfferingVersionPlanIdentityModel)
      .version(catalogOfferingVersionIdentityModel)
      .build();
    assertEquals(instanceCatalogOfferingPrototypeCatalogOfferingByVersionModel.plan(), catalogOfferingVersionPlanIdentityModel);
    assertEquals(instanceCatalogOfferingPrototypeCatalogOfferingByVersionModel.version(), catalogOfferingVersionIdentityModel);

    String json = TestUtilities.serialize(instanceCatalogOfferingPrototypeCatalogOfferingByVersionModel);

    InstanceCatalogOfferingPrototypeCatalogOfferingByVersion instanceCatalogOfferingPrototypeCatalogOfferingByVersionModelNew = TestUtilities.deserialize(json, InstanceCatalogOfferingPrototypeCatalogOfferingByVersion.class);
    assertTrue(instanceCatalogOfferingPrototypeCatalogOfferingByVersionModelNew instanceof InstanceCatalogOfferingPrototypeCatalogOfferingByVersion);
    assertEquals(instanceCatalogOfferingPrototypeCatalogOfferingByVersionModelNew.plan().toString(), catalogOfferingVersionPlanIdentityModel.toString());
    assertEquals(instanceCatalogOfferingPrototypeCatalogOfferingByVersionModelNew.version().toString(), catalogOfferingVersionIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceCatalogOfferingPrototypeCatalogOfferingByVersionError() throws Throwable {
    new InstanceCatalogOfferingPrototypeCatalogOfferingByVersion.Builder().build();
  }

}