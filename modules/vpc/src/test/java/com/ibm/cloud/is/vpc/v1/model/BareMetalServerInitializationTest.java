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

import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitialization;
import com.ibm.cloud.is.vpc.v1.model.BareMetalServerInitializationUserAccountBareMetalServerInitializationHostUserAccount;
import com.ibm.cloud.is.vpc.v1.model.ImageReference;
import com.ibm.cloud.is.vpc.v1.model.ImageReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.KeyReference;
import com.ibm.cloud.is.vpc.v1.model.KeyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BareMetalServerInitialization model.
 */
public class BareMetalServerInitializationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBareMetalServerInitialization() throws Throwable {
    BareMetalServerInitialization bareMetalServerInitializationModel = new BareMetalServerInitialization();
    assertNull(bareMetalServerInitializationModel.getImage());
    assertNull(bareMetalServerInitializationModel.getKeys());
    assertNull(bareMetalServerInitializationModel.getUserAccounts());
  }
}