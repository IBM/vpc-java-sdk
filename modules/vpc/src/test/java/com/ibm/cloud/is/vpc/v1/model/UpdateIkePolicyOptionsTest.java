/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.is.vpc.v1.model.UpdateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateIkePolicyOptions model.
 */
public class UpdateIkePolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateIkePolicyOptions() throws Throwable {
    UpdateIkePolicyOptions updateIkePolicyOptionsModel = new UpdateIkePolicyOptions.Builder()
      .id("testString")
      .name("my-ike-policy")
      .authenticationAlgorithm("md5")
      .dhGroup(Long.valueOf("2"))
      .encryptionAlgorithm("triple_des")
      .ikeVersion(Long.valueOf("1"))
      .keyLifetime(Long.valueOf("28800"))
      .build();
    assertEquals(updateIkePolicyOptionsModel.id(), "testString");
    assertEquals(updateIkePolicyOptionsModel.name(), "my-ike-policy");
    assertEquals(updateIkePolicyOptionsModel.authenticationAlgorithm(), "md5");
    assertEquals(updateIkePolicyOptionsModel.dhGroup(), Long.valueOf("2"));
    assertEquals(updateIkePolicyOptionsModel.encryptionAlgorithm(), "triple_des");
    assertEquals(updateIkePolicyOptionsModel.ikeVersion(), Long.valueOf("1"));
    assertEquals(updateIkePolicyOptionsModel.keyLifetime(), Long.valueOf("28800"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateIkePolicyOptionsError() throws Throwable {
    new UpdateIkePolicyOptions.Builder().build();
  }

}