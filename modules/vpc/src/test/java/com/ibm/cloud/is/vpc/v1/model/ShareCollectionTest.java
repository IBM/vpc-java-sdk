/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.Share;
import com.ibm.cloud.is.vpc.v1.model.ShareCollection;
import com.ibm.cloud.is.vpc.v1.model.ShareCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.ShareCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.ShareJob;
import com.ibm.cloud.is.vpc.v1.model.ShareJobStatusReason;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetReference;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileReference;
import com.ibm.cloud.is.vpc.v1.model.ShareReference;
import com.ibm.cloud.is.vpc.v1.model.ShareReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ShareReplicationStatusReason;
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
 * Unit test class for the ShareCollection model.
 */
public class ShareCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testShareCollection() throws Throwable {
    ShareCollection shareCollectionModel = new ShareCollection();
    assertNull(shareCollectionModel.getFirst());
    assertNull(shareCollectionModel.getLimit());
    assertNull(shareCollectionModel.getNext());
    assertNull(shareCollectionModel.getShares());
    assertNull(shareCollectionModel.getTotalCount());
  }
}