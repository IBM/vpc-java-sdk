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

import com.ibm.cloud.is.vpc.v1.model.AccountReference;
import com.ibm.cloud.is.vpc.v1.model.PageLink;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayEndpointGatewayBinding;
import com.ibm.cloud.is.vpc.v1.model.PrivatePathServiceGatewayEndpointGatewayBindingCollection;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrivatePathServiceGatewayEndpointGatewayBindingCollection model.
 */
public class PrivatePathServiceGatewayEndpointGatewayBindingCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrivatePathServiceGatewayEndpointGatewayBindingCollection() throws Throwable {
    PrivatePathServiceGatewayEndpointGatewayBindingCollection privatePathServiceGatewayEndpointGatewayBindingCollectionModel = new PrivatePathServiceGatewayEndpointGatewayBindingCollection();
    assertNull(privatePathServiceGatewayEndpointGatewayBindingCollectionModel.getEndpointGatewayBindings());
    assertNull(privatePathServiceGatewayEndpointGatewayBindingCollectionModel.getFirst());
    assertNull(privatePathServiceGatewayEndpointGatewayBindingCollectionModel.getLimit());
    assertNull(privatePathServiceGatewayEndpointGatewayBindingCollectionModel.getNext());
    assertNull(privatePathServiceGatewayEndpointGatewayBindingCollectionModel.getTotalCount());
  }
}