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

import com.ibm.cloud.is.vpc.v1.model.DefaultSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceReferenceTargetContextDeleted;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleRemoteIP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleSecurityGroupRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReferenceNetworkInterfaceReferenceTargetContext;
import com.ibm.cloud.is.vpc.v1.model.VPCReference;
import com.ibm.cloud.is.vpc.v1.model.VPCReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DefaultSecurityGroup model.
 */
public class DefaultSecurityGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDefaultSecurityGroup() throws Throwable {
    DefaultSecurityGroup defaultSecurityGroupModel = new DefaultSecurityGroup();
    assertNull(defaultSecurityGroupModel.getCreatedAt());
    assertNull(defaultSecurityGroupModel.getCrn());
    assertNull(defaultSecurityGroupModel.getHref());
    assertNull(defaultSecurityGroupModel.getId());
    assertNull(defaultSecurityGroupModel.getName());
    assertNull(defaultSecurityGroupModel.getResourceGroup());
    assertNull(defaultSecurityGroupModel.getRules());
    assertNull(defaultSecurityGroupModel.getTargets());
    assertNull(defaultSecurityGroupModel.getVpc());
  }
}