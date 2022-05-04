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

import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DedicatedHostGroupIdentityByHref model.
 */
public class DedicatedHostGroupIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDedicatedHostGroupIdentityByHref() throws Throwable {
    DedicatedHostGroupIdentityByHref dedicatedHostGroupIdentityByHrefModel = new DedicatedHostGroupIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/groups/bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0")
      .build();
    assertEquals(dedicatedHostGroupIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/groups/bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0");

    String json = TestUtilities.serialize(dedicatedHostGroupIdentityByHrefModel);

    DedicatedHostGroupIdentityByHref dedicatedHostGroupIdentityByHrefModelNew = TestUtilities.deserialize(json, DedicatedHostGroupIdentityByHref.class);
    assertTrue(dedicatedHostGroupIdentityByHrefModelNew instanceof DedicatedHostGroupIdentityByHref);
    assertEquals(dedicatedHostGroupIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/dedicated_host/groups/bcc5b834-1258-4b9c-c3b4-43bc9cf5cde0");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDedicatedHostGroupIdentityByHrefError() throws Throwable {
    new DedicatedHostGroupIdentityByHref.Builder().build();
  }

}