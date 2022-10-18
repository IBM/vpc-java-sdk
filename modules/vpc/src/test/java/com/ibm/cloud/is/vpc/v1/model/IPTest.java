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

import com.ibm.cloud.is.vpc.v1.model.IP;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IP model.
 */
public class IPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIP() throws Throwable {
    IP ipModel = new IP.Builder()
      .address("192.168.3.4")
      .build();
    assertEquals(ipModel.address(), "192.168.3.4");

    String json = TestUtilities.serialize(ipModel);

    IP ipModelNew = TestUtilities.deserialize(json, IP.class);
    assertTrue(ipModelNew instanceof IP);
    assertEquals(ipModelNew.address(), "192.168.3.4");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testIPError() throws Throwable {
    new IP.Builder().build();
  }

}