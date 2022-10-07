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
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DedicatedHost model.
 */
public class DedicatedHostTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDedicatedHost() throws Throwable {
    DedicatedHost dedicatedHostModel = new DedicatedHost();
    assertNull(dedicatedHostModel.getAvailableMemory());
    assertNull(dedicatedHostModel.getAvailableVcpu());
    assertNull(dedicatedHostModel.getCreatedAt());
    assertNull(dedicatedHostModel.getCrn());
    assertNull(dedicatedHostModel.getDisks());
    assertNull(dedicatedHostModel.getGroup());
    assertNull(dedicatedHostModel.getHref());
    assertNull(dedicatedHostModel.getId());
    assertNull(dedicatedHostModel.isInstancePlacementEnabled());
    assertNull(dedicatedHostModel.getInstances());
    assertNull(dedicatedHostModel.getLifecycleState());
    assertNull(dedicatedHostModel.getMemory());
    assertNull(dedicatedHostModel.getName());
    assertNull(dedicatedHostModel.getProfile());
    assertNull(dedicatedHostModel.isProvisionable());
    assertNull(dedicatedHostModel.getResourceGroup());
    assertNull(dedicatedHostModel.getResourceType());
    assertNull(dedicatedHostModel.getSocketCount());
    assertNull(dedicatedHostModel.getState());
    assertNull(dedicatedHostModel.getSupportedInstanceProfiles());
    assertNull(dedicatedHostModel.getVcpu());
    assertNull(dedicatedHostModel.getZone());
  }
}