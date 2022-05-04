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

import com.ibm.cloud.is.vpc.v1.model.DedicatedHost;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupReference;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceReference;
import com.ibm.cloud.is.vpc.v1.model.InstanceReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.VCPU;
import com.ibm.cloud.is.vpc.v1.model.ZoneReference;
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
 * Unit test class for the DedicatedHostCollection model.
 */
public class DedicatedHostCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDedicatedHostCollection() throws Throwable {
    DedicatedHostCollection dedicatedHostCollectionModel = new DedicatedHostCollection();
    assertNull(dedicatedHostCollectionModel.getDedicatedHosts());
    assertNull(dedicatedHostCollectionModel.getFirst());
    assertNull(dedicatedHostCollectionModel.getLimit());
    assertNull(dedicatedHostCollectionModel.getNext());
    assertNull(dedicatedHostCollectionModel.getTotalCount());
  }
}