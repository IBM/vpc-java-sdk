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

import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IPsecPolicyCollection model.
 */
public class IPsecPolicyCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIPsecPolicyCollection() throws Throwable {
    IPsecPolicyCollection iPsecPolicyCollectionModel = new IPsecPolicyCollection();
    assertNull(iPsecPolicyCollectionModel.getFirst());
    assertNull(iPsecPolicyCollectionModel.getIpsecPolicies());
    assertNull(iPsecPolicyCollectionModel.getLimit());
    assertNull(iPsecPolicyCollectionModel.getNext());
    assertNull(iPsecPolicyCollectionModel.getTotalCount());
  }
}