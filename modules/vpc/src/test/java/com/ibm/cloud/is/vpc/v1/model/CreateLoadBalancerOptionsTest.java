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

import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLogging;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapath;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateLoadBalancerOptions model.
 */
public class CreateLoadBalancerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateLoadBalancerOptions() throws Throwable {
    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
      .name("my-load-balancer-pool")
      .build();
    assertEquals(loadBalancerPoolIdentityByNameModel.name(), "my-load-balancer-pool");

    LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModel = new LoadBalancerListenerPrototypeLoadBalancerContext.Builder()
      .acceptProxyProtocol(true)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityByNameModel)
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .protocol("http")
      .build();
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.defaultPool(), loadBalancerPoolIdentityByNameModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMax(), Long.valueOf("499"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMin(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.protocol(), "http");

    LoadBalancerLoggingDatapath loadBalancerLoggingDatapathModel = new LoadBalancerLoggingDatapath.Builder()
      .active(true)
      .build();
    assertEquals(loadBalancerLoggingDatapathModel.active(), Boolean.valueOf(true));

    LoadBalancerLogging loadBalancerLoggingModel = new LoadBalancerLogging.Builder()
      .datapath(loadBalancerLoggingDatapathModel)
      .build();
    assertEquals(loadBalancerLoggingModel.datapath(), loadBalancerLoggingDatapathModel);

    LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("http")
      .urlPath("/")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.type(), "http");
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.urlPath(), "/");

    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
      .port(Long.valueOf("80"))
      .target(loadBalancerPoolMemberTargetPrototypeModel)
      .weight(Long.valueOf("50"))
      .build();
    assertEquals(loadBalancerPoolMemberPrototypeModel.port(), Long.valueOf("80"));
    assertEquals(loadBalancerPoolMemberPrototypeModel.target(), loadBalancerPoolMemberTargetPrototypeModel);
    assertEquals(loadBalancerPoolMemberPrototypeModel.weight(), Long.valueOf("50"));

    LoadBalancerPoolSessionPersistencePrototype loadBalancerPoolSessionPersistencePrototypeModel = new LoadBalancerPoolSessionPersistencePrototype.Builder()
      .cookieName("my-cookie-name")
      .type("app_cookie")
      .build();
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModel.cookieName(), "my-cookie-name");
    assertEquals(loadBalancerPoolSessionPersistencePrototypeModel.type(), "app_cookie");

    LoadBalancerPoolPrototype loadBalancerPoolPrototypeModel = new LoadBalancerPoolPrototype.Builder()
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
      .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
      .build();
    assertEquals(loadBalancerPoolPrototypeModel.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPrototypeModel.healthMonitor(), loadBalancerPoolHealthMonitorPrototypeModel);
    assertEquals(loadBalancerPoolPrototypeModel.members(), new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)));
    assertEquals(loadBalancerPoolPrototypeModel.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPrototypeModel.protocol(), "http");
    assertEquals(loadBalancerPoolPrototypeModel.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPrototypeModel.sessionPersistence(), loadBalancerPoolSessionPersistencePrototypeModel);

    LoadBalancerProfileIdentityByName loadBalancerProfileIdentityModel = new LoadBalancerProfileIdentityByName.Builder()
      .name("network-fixed")
      .build();
    assertEquals(loadBalancerProfileIdentityModel.name(), "network-fixed");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    CreateLoadBalancerOptions createLoadBalancerOptionsModel = new CreateLoadBalancerOptions.Builder()
      .isPublic(true)
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
      .listeners(new java.util.ArrayList<LoadBalancerListenerPrototypeLoadBalancerContext>(java.util.Arrays.asList(loadBalancerListenerPrototypeLoadBalancerContextModel)))
      .logging(loadBalancerLoggingModel)
      .name("my-load-balancer")
      .pools(new java.util.ArrayList<LoadBalancerPoolPrototype>(java.util.Arrays.asList(loadBalancerPoolPrototypeModel)))
      .profile(loadBalancerProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .routeMode(true)
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .build();
    assertEquals(createLoadBalancerOptionsModel.isPublic(), Boolean.valueOf(true));
    assertEquals(createLoadBalancerOptionsModel.subnets(), new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)));
    assertEquals(createLoadBalancerOptionsModel.listeners(), new java.util.ArrayList<LoadBalancerListenerPrototypeLoadBalancerContext>(java.util.Arrays.asList(loadBalancerListenerPrototypeLoadBalancerContextModel)));
    assertEquals(createLoadBalancerOptionsModel.logging(), loadBalancerLoggingModel);
    assertEquals(createLoadBalancerOptionsModel.name(), "my-load-balancer");
    assertEquals(createLoadBalancerOptionsModel.pools(), new java.util.ArrayList<LoadBalancerPoolPrototype>(java.util.Arrays.asList(loadBalancerPoolPrototypeModel)));
    assertEquals(createLoadBalancerOptionsModel.profile(), loadBalancerProfileIdentityModel);
    assertEquals(createLoadBalancerOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createLoadBalancerOptionsModel.routeMode(), Boolean.valueOf(true));
    assertEquals(createLoadBalancerOptionsModel.securityGroups(), new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerOptionsError() throws Throwable {
    new CreateLoadBalancerOptions.Builder().build();
  }

}