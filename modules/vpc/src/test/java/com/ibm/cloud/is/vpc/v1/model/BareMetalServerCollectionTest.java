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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServer;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerBootTargetBareMetalServerDiskReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCPU;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerDisk;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerFirmware;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerHealthReason;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerNetworkAttachmentReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileReference;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerReservationAffinity;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerStatusReason;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerTrustedPlatformModule;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceBareMetalServerContextReference;
import com.ibm.cloud.is.vpc.v1.model.PageLink;
import com.ibm.cloud.is.vpc.v1.model.ReservationReference;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SubnetReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfaceReferenceAttachmentContext;
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
 * Unit test class for the BareMetalServerCollection model.
 */
public class BareMetalServerCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerCollection() throws Throwable {
    BareMetalServerCollection bareMetalServerCollectionModel = new BareMetalServerCollection();
    assertNull(bareMetalServerCollectionModel.getBareMetalServers());
    assertNull(bareMetalServerCollectionModel.getFirst());
    assertNull(bareMetalServerCollectionModel.getLimit());
    assertNull(bareMetalServerCollectionModel.getNext());
    assertNull(bareMetalServerCollectionModel.getTotalCount());
  }
}