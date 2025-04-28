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

import com.ibm.cloud.is.vpc.v1.model.SharePatch;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SharePatch model.
 */
public class SharePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSharePatch() throws Throwable {
    ShareProfileIdentityByName shareProfileIdentityModel = new ShareProfileIdentityByName.Builder()
      .name("tier-3iops")
      .build();
    assertEquals(shareProfileIdentityModel.name(), "tier-3iops");

    SharePatch sharePatchModel = new SharePatch.Builder()
      .accessControlMode("security_group")
      .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
      .iops(Long.valueOf("100"))
      .name("my-share")
      .profile(shareProfileIdentityModel)
      .replicationCronSpec("0 */5 * * *")
      .size(Long.valueOf("26"))
      .userTags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(sharePatchModel.accessControlMode(), "security_group");
    assertEquals(sharePatchModel.allowedTransitEncryptionModes(), java.util.Arrays.asList("none"));
    assertEquals(sharePatchModel.iops(), Long.valueOf("100"));
    assertEquals(sharePatchModel.name(), "my-share");
    assertEquals(sharePatchModel.profile(), shareProfileIdentityModel);
    assertEquals(sharePatchModel.replicationCronSpec(), "0 */5 * * *");
    assertEquals(sharePatchModel.size(), Long.valueOf("26"));
    assertEquals(sharePatchModel.userTags(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(sharePatchModel);

    SharePatch sharePatchModelNew = TestUtilities.deserialize(json, SharePatch.class);
    assertTrue(sharePatchModelNew instanceof SharePatch);
    assertEquals(sharePatchModelNew.accessControlMode(), "security_group");
    assertEquals(sharePatchModelNew.iops(), Long.valueOf("100"));
    assertEquals(sharePatchModelNew.name(), "my-share");
    assertEquals(sharePatchModelNew.profile().toString(), shareProfileIdentityModel.toString());
    assertEquals(sharePatchModelNew.replicationCronSpec(), "0 */5 * * *");
    assertEquals(sharePatchModelNew.size(), Long.valueOf("26"));
  }
  @Test
  public void testSharePatchAsPatch() throws Throwable {
    ShareProfileIdentityByName shareProfileIdentityModel = new ShareProfileIdentityByName.Builder()
      .name("tier-3iops")
      .build();

    SharePatch sharePatchModel = new SharePatch.Builder()
      .accessControlMode("security_group")
      .allowedTransitEncryptionModes(java.util.Arrays.asList("none"))
      .iops(Long.valueOf("100"))
      .name("my-share")
      .profile(shareProfileIdentityModel)
      .replicationCronSpec("0 */5 * * *")
      .size(Long.valueOf("26"))
      .userTags(java.util.Arrays.asList("testString"))
      .build();

    Map<String, Object> mergePatch = sharePatchModel.asPatch();

    assertEquals(mergePatch.get("access_control_mode"), "security_group");
    assertTrue(mergePatch.containsKey("allowed_transit_encryption_modes"));
    assertTrue(mergePatch.containsKey("iops"));
    assertEquals(mergePatch.get("name"), "my-share");
    assertTrue(mergePatch.containsKey("profile"));
    assertEquals(mergePatch.get("replication_cron_spec"), "0 */5 * * *");
    assertTrue(mergePatch.containsKey("size"));
    assertTrue(mergePatch.containsKey("user_tags"));
  }

}