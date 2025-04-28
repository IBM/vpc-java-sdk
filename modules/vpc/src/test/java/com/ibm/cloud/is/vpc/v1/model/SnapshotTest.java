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
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemote;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionPlanReference;
import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingVersionReference;
import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.ImageReference;
import com.ibm.cloud.is.vpc.v1.model.ImageRemoteContextImageReference;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.Snapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.SnapshotClone;
import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCopiesItem;
import com.ibm.cloud.is.vpc.v1.model.SnapshotRemote;
import com.ibm.cloud.is.vpc.v1.model.SnapshotSourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.VolumeReference;
import com.ibm.cloud.is.vpc.v1.model.VolumeRemote;
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
 * Unit test class for the Snapshot model.
 */
public class SnapshotTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshot() throws Throwable {
    Snapshot snapshotModel = new Snapshot();
    assertNull(snapshotModel.getBackupPolicyPlan());
    assertNull(snapshotModel.isBootable());
    assertNull(snapshotModel.getCapturedAt());
    assertNull(snapshotModel.getCatalogOffering());
    assertNull(snapshotModel.getClones());
    assertNull(snapshotModel.getCopies());
    assertNull(snapshotModel.getCreatedAt());
    assertNull(snapshotModel.getCrn());
    assertNull(snapshotModel.isDeletable());
    assertNull(snapshotModel.getEncryption());
    assertNull(snapshotModel.getEncryptionKey());
    assertNull(snapshotModel.getHref());
    assertNull(snapshotModel.getId());
    assertNull(snapshotModel.getLifecycleState());
    assertNull(snapshotModel.getMinimumCapacity());
    assertNull(snapshotModel.getName());
    assertNull(snapshotModel.getOperatingSystem());
    assertNull(snapshotModel.getProgress());
    assertNull(snapshotModel.getResourceGroup());
    assertNull(snapshotModel.getResourceType());
    assertNull(snapshotModel.getServiceTags());
    assertNull(snapshotModel.getSize());
    assertNull(snapshotModel.getSnapshotConsistencyGroup());
    assertNull(snapshotModel.getSourceImage());
    assertNull(snapshotModel.getSourceSnapshot());
    assertNull(snapshotModel.getSourceVolume());
    assertNull(snapshotModel.getStorageGeneration());
    assertNull(snapshotModel.getUserTags());
  }
}