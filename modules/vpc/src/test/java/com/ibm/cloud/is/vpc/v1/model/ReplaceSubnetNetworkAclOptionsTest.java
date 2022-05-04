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
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceSubnetNetworkAclOptions model.
 */
public class ReplaceSubnetNetworkAclOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceSubnetNetworkAclOptions() throws Throwable {
    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("8ec3e730-f2b0-4855-a1a5-88be30024658")
      .build();
    assertEquals(networkAclIdentityModel.id(), "8ec3e730-f2b0-4855-a1a5-88be30024658");

    ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptionsModel = new ReplaceSubnetNetworkAclOptions.Builder()
      .id("testString")
      .networkAclIdentity(networkAclIdentityModel)
      .build();
    assertEquals(replaceSubnetNetworkAclOptionsModel.id(), "testString");
    assertEquals(replaceSubnetNetworkAclOptionsModel.networkAclIdentity(), networkAclIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSubnetNetworkAclOptionsError() throws Throwable {
    new ReplaceSubnetNetworkAclOptions.Builder().build();
  }

}