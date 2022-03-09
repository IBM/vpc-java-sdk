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

import com.ibm.cloud.is.vpc.v1.model.InstanceProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileBandwidthFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskQuantityFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSizeFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileDiskSupportedInterfaces;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUManufacturer;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileGPUModel;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileMemoryFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileOSArchitecture;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfilePortSpeedFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUArchitecture;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVCPUFixed;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileVolumeBandwidthFixed;
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
 * Unit test class for the InstanceProfile model.
 */
public class InstanceProfileTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceProfile() throws Throwable {
    InstanceProfile instanceProfileModel = new InstanceProfile();
    assertNull(instanceProfileModel.getBandwidth());
    assertNull(instanceProfileModel.getDisks());
    assertNull(instanceProfileModel.getFamily());
    assertNull(instanceProfileModel.getGpuCount());
    assertNull(instanceProfileModel.getGpuManufacturer());
    assertNull(instanceProfileModel.getGpuMemory());
    assertNull(instanceProfileModel.getGpuModel());
    assertNull(instanceProfileModel.getHref());
    assertNull(instanceProfileModel.getMemory());
    assertNull(instanceProfileModel.getName());
    assertNull(instanceProfileModel.getOsArchitecture());
    assertNull(instanceProfileModel.getPortSpeed());
    assertNull(instanceProfileModel.getTotalVolumeBandwidth());
    assertNull(instanceProfileModel.getVcpuArchitecture());
    assertNull(instanceProfileModel.getVcpuCount());
  }
}