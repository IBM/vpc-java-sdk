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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SnapshotClonePrototype;
import com.ibm.cloud.is.vpc.v1.model.SnapshotIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPrototypeSnapshotBySourceSnapshot;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotPrototypeSnapshotBySourceSnapshot model.
 */
public class SnapshotPrototypeSnapshotBySourceSnapshotTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotPrototypeSnapshotBySourceSnapshot() throws Throwable {
    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    SnapshotClonePrototype snapshotClonePrototypeModel = new SnapshotClonePrototype.Builder()
      .zone(zoneIdentityModel)
      .build();
    assertEquals(snapshotClonePrototypeModel.zone(), zoneIdentityModel);

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/123456:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/123456:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    SnapshotIdentityByCRN snapshotIdentityByCrnModel = new SnapshotIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:is:us-south:a/123456::snapshot:r134-f6bfa329-0e36-433f-a3bb-0df632e79263")
      .build();
    assertEquals(snapshotIdentityByCrnModel.crn(), "crn:v1:bluemix:public:is:us-south:a/123456::snapshot:r134-f6bfa329-0e36-433f-a3bb-0df632e79263");

    SnapshotPrototypeSnapshotBySourceSnapshot snapshotPrototypeSnapshotBySourceSnapshotModel = new SnapshotPrototypeSnapshotBySourceSnapshot.Builder()
      .clones(java.util.Arrays.asList(snapshotClonePrototypeModel))
      .name("my-snapshot")
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(java.util.Arrays.asList())
      .encryptionKey(encryptionKeyIdentityModel)
      .sourceSnapshot(snapshotIdentityByCrnModel)
      .build();
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModel.clones(), java.util.Arrays.asList(snapshotClonePrototypeModel));
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModel.name(), "my-snapshot");
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModel.userTags(), java.util.Arrays.asList());
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModel.sourceSnapshot(), snapshotIdentityByCrnModel);

    String json = TestUtilities.serialize(snapshotPrototypeSnapshotBySourceSnapshotModel);

    SnapshotPrototypeSnapshotBySourceSnapshot snapshotPrototypeSnapshotBySourceSnapshotModelNew = TestUtilities.deserialize(json, SnapshotPrototypeSnapshotBySourceSnapshot.class);
    assertTrue(snapshotPrototypeSnapshotBySourceSnapshotModelNew instanceof SnapshotPrototypeSnapshotBySourceSnapshot);
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModelNew.name(), "my-snapshot");
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModelNew.encryptionKey().toString(), encryptionKeyIdentityModel.toString());
    assertEquals(snapshotPrototypeSnapshotBySourceSnapshotModelNew.sourceSnapshot().toString(), snapshotIdentityByCrnModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSnapshotPrototypeSnapshotBySourceSnapshotError() throws Throwable {
    new SnapshotPrototypeSnapshotBySourceSnapshot.Builder().build();
  }

}