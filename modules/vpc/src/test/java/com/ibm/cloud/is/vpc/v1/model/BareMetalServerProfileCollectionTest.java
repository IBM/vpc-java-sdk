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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfile;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUArchitecture;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUCoreCountFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCPUSocketCountFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDisk;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskQuantityFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSizeFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileDiskSupportedInterfaces;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileOSArchitecture;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerProfileSupportedTrustedPlatformModuleModes;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerProfileCollection model.
 */
public class BareMetalServerProfileCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerProfileCollection() throws Throwable {
    BareMetalServerProfileCollection bareMetalServerProfileCollectionModel = new BareMetalServerProfileCollection();
    assertNull(bareMetalServerProfileCollectionModel.getFirst());
    assertNull(bareMetalServerProfileCollectionModel.getLimit());
    assertNull(bareMetalServerProfileCollectionModel.getNext());
    assertNull(bareMetalServerProfileCollectionModel.getProfiles());
    assertNull(bareMetalServerProfileCollectionModel.getTotalCount());
  }
}