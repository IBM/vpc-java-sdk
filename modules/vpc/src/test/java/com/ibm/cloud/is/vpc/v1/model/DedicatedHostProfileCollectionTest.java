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

import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfile;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskInterface;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskQuantity;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskSize;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileDiskSupportedInterfaces;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileSocketFixed;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPUArchitecture;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileVCPUFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DedicatedHostProfileCollection model.
 */
public class DedicatedHostProfileCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDedicatedHostProfileCollection() throws Throwable {
    DedicatedHostProfileCollection dedicatedHostProfileCollectionModel = new DedicatedHostProfileCollection();
    assertNull(dedicatedHostProfileCollectionModel.getFirst());
    assertNull(dedicatedHostProfileCollectionModel.getLimit());
    assertNull(dedicatedHostProfileCollectionModel.getNext());
    assertNull(dedicatedHostProfileCollectionModel.getProfiles());
    assertNull(dedicatedHostProfileCollectionModel.getTotalCount());
  }
}