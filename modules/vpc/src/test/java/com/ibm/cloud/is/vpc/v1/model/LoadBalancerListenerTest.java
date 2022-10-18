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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListener;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirect;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReference;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the LoadBalancerListener model.
 */
public class LoadBalancerListenerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListener() throws Throwable {
    LoadBalancerListener loadBalancerListenerModel = new LoadBalancerListener();
    assertNull(loadBalancerListenerModel.isAcceptProxyProtocol());
    assertNull(loadBalancerListenerModel.getCertificateInstance());
    assertNull(loadBalancerListenerModel.getConnectionLimit());
    assertNull(loadBalancerListenerModel.getCreatedAt());
    assertNull(loadBalancerListenerModel.getDefaultPool());
    assertNull(loadBalancerListenerModel.getHref());
    assertNull(loadBalancerListenerModel.getHttpsRedirect());
    assertNull(loadBalancerListenerModel.getId());
    assertNull(loadBalancerListenerModel.getPolicies());
    assertNull(loadBalancerListenerModel.getPort());
    assertNull(loadBalancerListenerModel.getPortMax());
    assertNull(loadBalancerListenerModel.getPortMin());
    assertNull(loadBalancerListenerModel.getProtocol());
    assertNull(loadBalancerListenerModel.getProvisioningStatus());
  }
}