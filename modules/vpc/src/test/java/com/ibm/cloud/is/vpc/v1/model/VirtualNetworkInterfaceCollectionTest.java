/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceTargetShareMountTargetReference;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VirtualNetworkInterfaceCollection model.
 */
public class VirtualNetworkInterfaceCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVirtualNetworkInterfaceCollection() throws Throwable {
    VirtualNetworkInterfaceCollection virtualNetworkInterfaceCollectionModel = new VirtualNetworkInterfaceCollection();
    assertNull(virtualNetworkInterfaceCollectionModel.getFirst());
    assertNull(virtualNetworkInterfaceCollectionModel.getLimit());
    assertNull(virtualNetworkInterfaceCollectionModel.getNext());
    assertNull(virtualNetworkInterfaceCollectionModel.getTotalCount());
    assertNull(virtualNetworkInterfaceCollectionModel.getVirtualNetworkInterfaces());
  }
}