/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.is.vpc.v1.model.IKEPolicyIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IKEPolicyIdentityByHref model.
 */
public class IKEPolicyIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIKEPolicyIdentityByHref() throws Throwable {
    IKEPolicyIdentityByHref ikePolicyIdentityByHrefModel = new IKEPolicyIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b")
      .build();
    assertEquals(ikePolicyIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b");

    String json = TestUtilities.serialize(ikePolicyIdentityByHrefModel);

    IKEPolicyIdentityByHref ikePolicyIdentityByHrefModelNew = TestUtilities.deserialize(json, IKEPolicyIdentityByHref.class);
    assertTrue(ikePolicyIdentityByHrefModelNew instanceof IKEPolicyIdentityByHref);
    assertEquals(ikePolicyIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/ike_policies/ddf51bec-3424-11e8-b467-0ed5f89f718b");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIKEPolicyIdentityByHrefError() throws Throwable {
    new IKEPolicyIdentityByHref.Builder().build();
  }

}