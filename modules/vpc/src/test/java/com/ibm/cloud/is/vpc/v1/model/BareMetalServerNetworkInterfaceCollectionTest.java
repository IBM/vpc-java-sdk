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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceByPCI;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkInterfaceCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReference;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerNetworkInterfaceCollection model.
 */
public class BareMetalServerNetworkInterfaceCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerNetworkInterfaceCollection() throws Throwable {
    BareMetalServerNetworkInterfaceCollection bareMetalServerNetworkInterfaceCollectionModel = new BareMetalServerNetworkInterfaceCollection();
    assertNull(bareMetalServerNetworkInterfaceCollectionModel.getFirst());
    assertNull(bareMetalServerNetworkInterfaceCollectionModel.getLimit());
    assertNull(bareMetalServerNetworkInterfaceCollectionModel.getNetworkInterfaces());
    assertNull(bareMetalServerNetworkInterfaceCollectionModel.getNext());
    assertNull(bareMetalServerNetworkInterfaceCollectionModel.getTotalCount());
  }
}