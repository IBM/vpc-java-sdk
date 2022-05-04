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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLIdentityById model.
 */
public class NetworkACLIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLIdentityById() throws Throwable {
    NetworkACLIdentityById networkAclIdentityByIdModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();
    assertEquals(networkAclIdentityByIdModel.id(), "a4e28308-8ee7-46ab-8108-9f881f22bdbf");

    String json = TestUtilities.serialize(networkAclIdentityByIdModel);

    NetworkACLIdentityById networkAclIdentityByIdModelNew = TestUtilities.deserialize(json, NetworkACLIdentityById.class);
    assertTrue(networkAclIdentityByIdModelNew instanceof NetworkACLIdentityById);
    assertEquals(networkAclIdentityByIdModelNew.id(), "a4e28308-8ee7-46ab-8108-9f881f22bdbf");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLIdentityByIdError() throws Throwable {
    new NetworkACLIdentityById.Builder().build();
  }

}