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

import com.ibm.cloud.is.vpc.v1.model.AccountReference;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.Share;
import com.ibm.cloud.is.vpc.v1.model.ShareAccessorBindingReference;
import com.ibm.cloud.is.vpc.v1.model.ShareJob;
import com.ibm.cloud.is.vpc.v1.model.ShareJobStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ShareLatestSync;
import com.ibm.cloud.is.vpc.v1.model.ShareLifecycleReason;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetReference;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ShareReference;
import com.ibm.cloud.is.vpc.v1.model.ShareRemote;
import com.ibm.cloud.is.vpc.v1.model.ShareReplicationStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ShareSourceSnapshotShareSnapshotReference;
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
 * Unit test class for the Share model.
 */
public class ShareTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShare() throws Throwable {
    Share shareModel = new Share();
    assertNull(shareModel.getAccessControlMode());
    assertNull(shareModel.getAccessorBindingRole());
    assertNull(shareModel.getAccessorBindings());
    assertNull(shareModel.getAllowedTransitEncryptionModes());
    assertNull(shareModel.getCreatedAt());
    assertNull(shareModel.getCrn());
    assertNull(shareModel.getEncryption());
    assertNull(shareModel.getEncryptionKey());
    assertNull(shareModel.getHref());
    assertNull(shareModel.getId());
    assertNull(shareModel.getIops());
    assertNull(shareModel.getLatestJob());
    assertNull(shareModel.getLatestSync());
    assertNull(shareModel.getLifecycleReasons());
    assertNull(shareModel.getLifecycleState());
    assertNull(shareModel.getMountTargets());
    assertNull(shareModel.getName());
    assertNull(shareModel.getOriginShare());
    assertNull(shareModel.getProfile());
    assertNull(shareModel.getReplicaShare());
    assertNull(shareModel.getReplicationCronSpec());
    assertNull(shareModel.getReplicationRole());
    assertNull(shareModel.getReplicationStatus());
    assertNull(shareModel.getReplicationStatusReasons());
    assertNull(shareModel.getResourceGroup());
    assertNull(shareModel.getResourceType());
    assertNull(shareModel.getSize());
    assertNull(shareModel.getSnapshotCount());
    assertNull(shareModel.getSnapshotSize());
    assertNull(shareModel.getSourceShare());
    assertNull(shareModel.getSourceSnapshot());
    assertNull(shareModel.getUserTags());
    assertNull(shareModel.getZone());
  }
}