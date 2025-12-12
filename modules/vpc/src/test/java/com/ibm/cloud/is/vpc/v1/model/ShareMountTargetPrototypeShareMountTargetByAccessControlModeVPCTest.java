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

import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC model.
 */
public class ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPCTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC() throws Throwable {
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("r006-4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "r006-4727d842-f94f-4a2d-824a-9bc9b02c523b");

    ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModel = new ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC.Builder()
      .accessProtocol("nfs4")
      .name("my-share-mount-target")
      .transitEncryption("none")
      .vpc(vpcIdentityModel)
      .build();
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModel.accessProtocol(), "nfs4");
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModel.name(), "my-share-mount-target");
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModel.transitEncryption(), "none");
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModel.vpc(), vpcIdentityModel);

    String json = TestUtilities.serialize(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModel);

    ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModelNew = TestUtilities.deserialize(json, ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC.class);
    assertTrue(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModelNew instanceof ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC);
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModelNew.accessProtocol(), "nfs4");
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModelNew.name(), "my-share-mount-target");
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModelNew.transitEncryption(), "none");
    assertEquals(shareMountTargetPrototypeShareMountTargetByAccessControlModeVpcModelNew.vpc().toString(), vpcIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testShareMountTargetPrototypeShareMountTargetByAccessControlModeVPCError() throws Throwable {
    new ShareMountTargetPrototypeShareMountTargetByAccessControlModeVPC.Builder().build();
  }

}