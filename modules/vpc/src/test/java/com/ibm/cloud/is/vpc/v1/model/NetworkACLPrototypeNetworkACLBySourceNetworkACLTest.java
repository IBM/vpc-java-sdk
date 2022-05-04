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

import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLBySourceNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLPrototypeNetworkACLBySourceNetworkACL model.
 */
public class NetworkACLPrototypeNetworkACLBySourceNetworkACLTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLPrototypeNetworkACLBySourceNetworkACL() throws Throwable {
    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("cf7cd5a-2f30-4336-a495-6addc820cd61")
      .build();
    assertEquals(vpcIdentityModel.id(), "cf7cd5a-2f30-4336-a495-6addc820cd61");

    NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
      .id("a4e28308-8ee7-46ab-8108-9f881f22bdbf")
      .build();
    assertEquals(networkAclIdentityModel.id(), "a4e28308-8ee7-46ab-8108-9f881f22bdbf");

    NetworkACLPrototypeNetworkACLBySourceNetworkACL networkAclPrototypeNetworkAclBySourceNetworkAclModel = new NetworkACLPrototypeNetworkACLBySourceNetworkACL.Builder()
      .name("my-network-acl")
      .resourceGroup(resourceGroupIdentityModel)
      .vpc(vpcIdentityModel)
      .sourceNetworkAcl(networkAclIdentityModel)
      .build();
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModel.name(), "my-network-acl");
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModel.vpc(), vpcIdentityModel);
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModel.sourceNetworkAcl(), networkAclIdentityModel);

    String json = TestUtilities.serialize(networkAclPrototypeNetworkAclBySourceNetworkAclModel);

    NetworkACLPrototypeNetworkACLBySourceNetworkACL networkAclPrototypeNetworkAclBySourceNetworkAclModelNew = TestUtilities.deserialize(json, NetworkACLPrototypeNetworkACLBySourceNetworkACL.class);
    assertTrue(networkAclPrototypeNetworkAclBySourceNetworkAclModelNew instanceof NetworkACLPrototypeNetworkACLBySourceNetworkACL);
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModelNew.name(), "my-network-acl");
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(networkAclPrototypeNetworkAclBySourceNetworkAclModelNew.sourceNetworkAcl().toString(), networkAclIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLPrototypeNetworkACLBySourceNetworkACLError() throws Throwable {
    new NetworkACLPrototypeNetworkACLBySourceNetworkACL.Builder().build();
  }

}