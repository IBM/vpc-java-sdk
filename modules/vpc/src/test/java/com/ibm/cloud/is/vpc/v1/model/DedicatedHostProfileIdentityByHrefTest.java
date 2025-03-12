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

import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DedicatedHostProfileIdentityByHref model.
 */
public class DedicatedHostProfileIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDedicatedHostProfileIdentityByHref() throws Throwable {
    DedicatedHostProfileIdentityByHref dedicatedHostProfileIdentityByHrefModel = new DedicatedHostProfileIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/profiles/mx2-host-152x1216")
      .build();
    assertEquals(dedicatedHostProfileIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/profiles/mx2-host-152x1216");

    String json = TestUtilities.serialize(dedicatedHostProfileIdentityByHrefModel);

    DedicatedHostProfileIdentityByHref dedicatedHostProfileIdentityByHrefModelNew = TestUtilities.deserialize(json, DedicatedHostProfileIdentityByHref.class);
    assertTrue(dedicatedHostProfileIdentityByHrefModelNew instanceof DedicatedHostProfileIdentityByHref);
    assertEquals(dedicatedHostProfileIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/profiles/mx2-host-152x1216");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDedicatedHostProfileIdentityByHrefError() throws Throwable {
    new DedicatedHostProfileIdentityByHref.Builder().build();
  }

}