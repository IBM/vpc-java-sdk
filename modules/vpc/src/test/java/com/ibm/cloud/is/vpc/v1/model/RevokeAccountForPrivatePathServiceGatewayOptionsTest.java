/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.AccountIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RevokeAccountForPrivatePathServiceGatewayOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RevokeAccountForPrivatePathServiceGatewayOptions model.
 */
public class RevokeAccountForPrivatePathServiceGatewayOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRevokeAccountForPrivatePathServiceGatewayOptions() throws Throwable {
    AccountIdentityById accountIdentityModel = new AccountIdentityById.Builder()
      .id("bb1b52262f7441a586f49068482f1e60")
      .build();
    assertEquals(accountIdentityModel.id(), "bb1b52262f7441a586f49068482f1e60");

    RevokeAccountForPrivatePathServiceGatewayOptions revokeAccountForPrivatePathServiceGatewayOptionsModel = new RevokeAccountForPrivatePathServiceGatewayOptions.Builder()
      .privatePathServiceGatewayId("testString")
      .account(accountIdentityModel)
      .build();
    assertEquals(revokeAccountForPrivatePathServiceGatewayOptionsModel.privatePathServiceGatewayId(), "testString");
    assertEquals(revokeAccountForPrivatePathServiceGatewayOptionsModel.account(), accountIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRevokeAccountForPrivatePathServiceGatewayOptionsError() throws Throwable {
    new RevokeAccountForPrivatePathServiceGatewayOptions.Builder().build();
  }

}