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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLIdentityByHref model.
 */
public class NetworkACLIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLIdentityByHref() throws Throwable {
    NetworkACLIdentityByHref networkAclIdentityByHrefModel = new NetworkACLIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();
    assertEquals(networkAclIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf");

    String json = TestUtilities.serialize(networkAclIdentityByHrefModel);

    NetworkACLIdentityByHref networkAclIdentityByHrefModelNew = TestUtilities.deserialize(json, NetworkACLIdentityByHref.class);
    assertTrue(networkAclIdentityByHrefModelNew instanceof NetworkACLIdentityByHref);
    assertEquals(networkAclIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/network_acls/a4e28308-8ee7-46ab-8108-9f881f22bdbf");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLIdentityByHrefError() throws Throwable {
    new NetworkACLIdentityByHref.Builder().build();
  }

}