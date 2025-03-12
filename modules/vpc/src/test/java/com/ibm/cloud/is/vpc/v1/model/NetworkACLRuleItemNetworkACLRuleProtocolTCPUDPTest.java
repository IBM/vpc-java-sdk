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

import com.ibm.cloud.is.vpc.v1.model.Deleted;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP model.
 */
public class NetworkACLRuleItemNetworkACLRuleProtocolTCPUDPTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRuleItemNetworkACLRuleProtocolTCPUDP() throws Throwable {
    NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP networkAclRuleItemNetworkAclRuleProtocolTcpudpModel = new NetworkACLRuleItemNetworkACLRuleProtocolTCPUDP();
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getAction());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getBefore());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getCreatedAt());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getDestination());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getDirection());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getHref());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getId());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getIpVersion());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getName());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getSource());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getDestinationPortMax());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getDestinationPortMin());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getProtocol());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getSourcePortMax());
    assertNull(networkAclRuleItemNetworkAclRuleProtocolTcpudpModel.getSourcePortMin());
  }
}