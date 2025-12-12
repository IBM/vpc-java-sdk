/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.is.vpc.v1.model.InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById model.
 */
public class InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById() throws Throwable {
    InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdModel = new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById.Builder()
      .id("0717-ffc092f7-5d02-4b93-ab69-26860529b9fb")
      .build();
    assertEquals(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdModel.id(), "0717-ffc092f7-5d02-4b93-ab69-26860529b9fb");

    String json = TestUtilities.serialize(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdModel);

    InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdModelNew = TestUtilities.deserialize(json, InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById.class);
    assertTrue(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdModelNew instanceof InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById);
    assertEquals(instanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdModelNew.id(), "0717-ffc092f7-5d02-4b93-ab69-26860529b9fb");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityByIdError() throws Throwable {
    new InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentityClusterNetworkInterfaceIdentityById.Builder().build();
  }

}