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

import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupTargetsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListSecurityGroupTargetsOptions model.
 */
public class ListSecurityGroupTargetsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListSecurityGroupTargetsOptions() throws Throwable {
    ListSecurityGroupTargetsOptions listSecurityGroupTargetsOptionsModel = new ListSecurityGroupTargetsOptions.Builder()
      .securityGroupId("testString")
      .start("testString")
      .limit(Long.valueOf("1"))
      .build();
    assertEquals(listSecurityGroupTargetsOptionsModel.securityGroupId(), "testString");
    assertEquals(listSecurityGroupTargetsOptionsModel.start(), "testString");
    assertEquals(listSecurityGroupTargetsOptionsModel.limit(), Long.valueOf("1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSecurityGroupTargetsOptionsError() throws Throwable {
    new ListSecurityGroupTargetsOptions.Builder().build();
  }

}