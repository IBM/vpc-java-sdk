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

import com.ibm.cloud.is.vpc.v1.model.CertificateInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.DNSInstanceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.DNSZoneIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerDNSPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerHTTPSRedirectPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingDatapathPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerLoggingPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPrototypeLoadBalancerContext;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolSessionPersistencePrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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
      .id("0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "0717-7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    DNSInstanceIdentityByCRN dnsInstanceIdentityModel = new DNSInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:dns-svcs:global:a/bb1b52262f7441a586f49068482f1e60:f761b566-030a-4696-8649-cc9d09889e88::")
      .build();
    assertEquals(dnsInstanceIdentityModel.crn(), "crn:v1:bluemix:public:dns-svcs:global:a/bb1b52262f7441a586f49068482f1e60:f761b566-030a-4696-8649-cc9d09889e88::");

    DNSZoneIdentityById dnsZoneIdentityModel = new DNSZoneIdentityById.Builder()
      .id("d66662cc-aa23-4fe1-9987-858487a61f45")
      .build();
    assertEquals(dnsZoneIdentityModel.id(), "d66662cc-aa23-4fe1-9987-858487a61f45");

    LoadBalancerDNSPrototype loadBalancerDnsPrototypeModel = new LoadBalancerDNSPrototype.Builder()
      .instance(dnsInstanceIdentityModel)
      .zone(dnsZoneIdentityModel)
      .build();
    assertEquals(loadBalancerDnsPrototypeModel.instance(), dnsInstanceIdentityModel);
    assertEquals(loadBalancerDnsPrototypeModel.zone(), dnsZoneIdentityModel);

    CertificateInstanceIdentityByCRN certificateInstanceIdentityModel = new CertificateInstanceIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5")
      .build();
    assertEquals(certificateInstanceIdentityModel.crn(), "crn:v1:bluemix:public:secrets-manager:us-south:a/aa2432b1fa4d4ace891e9b80fc104e34:36fa422d-080d-4d83-8d2d-86851b4001df:secret:2e786aab-42fa-63ed-14f8-d66d552f4dd5");

    LoadBalancerPoolIdentityByName loadBalancerPoolIdentityByNameModel = new LoadBalancerPoolIdentityByName.Builder()
      .name("my-load-balancer-pool")
      .build();
    assertEquals(loadBalancerPoolIdentityByNameModel.name(), "my-load-balancer-pool");

    LoadBalancerListenerIdentityById loadBalancerListenerIdentityModel = new LoadBalancerListenerIdentityById.Builder()
      .id("r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091")
      .build();
    assertEquals(loadBalancerListenerIdentityModel.id(), "r006-97c05c26-4748-4db8-ac3f-d8a9c79a7091");

    LoadBalancerListenerHTTPSRedirectPrototype loadBalancerListenerHttpsRedirectPrototypeModel = new LoadBalancerListenerHTTPSRedirectPrototype.Builder()
      .httpStatusCode(Long.valueOf("301"))
      .listener(loadBalancerListenerIdentityModel)
      .uri("/example?doc=get")
      .build();
    assertEquals(loadBalancerListenerHttpsRedirectPrototypeModel.httpStatusCode(), Long.valueOf("301"));
    assertEquals(loadBalancerListenerHttpsRedirectPrototypeModel.listener(), loadBalancerListenerIdentityModel);
    assertEquals(loadBalancerListenerHttpsRedirectPrototypeModel.uri(), "/example?doc=get");

    LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContextModel = new LoadBalancerListenerPrototypeLoadBalancerContext.Builder()
      .acceptProxyProtocol(true)
      .certificateInstance(certificateInstanceIdentityModel)
      .connectionLimit(Long.valueOf("2000"))
      .defaultPool(loadBalancerPoolIdentityByNameModel)
      .httpsRedirect(loadBalancerListenerHttpsRedirectPrototypeModel)
      .idleConnectionTimeout(Long.valueOf("100"))
      .port(Long.valueOf("443"))
      .portMax(Long.valueOf("499"))
      .portMin(Long.valueOf("443"))
      .protocol("http")
      .build();
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.acceptProxyProtocol(), Boolean.valueOf(true));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.certificateInstance(), certificateInstanceIdentityModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.connectionLimit(), Long.valueOf("2000"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.defaultPool(), loadBalancerPoolIdentityByNameModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.httpsRedirect(), loadBalancerListenerHttpsRedirectPrototypeModel);
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.idleConnectionTimeout(), Long.valueOf("100"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.port(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMax(), Long.valueOf("499"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.portMin(), Long.valueOf("443"));
    assertEquals(loadBalancerListenerPrototypeLoadBalancerContextModel.protocol(), "http");

    LoadBalancerLoggingDatapathPrototype loadBalancerLoggingDatapathPrototypeModel = new LoadBalancerLoggingDatapathPrototype.Builder()
      .active(true)
      .build();
    assertEquals(loadBalancerLoggingDatapathPrototypeModel.active(), Boolean.valueOf(true));

    LoadBalancerLoggingPrototype loadBalancerLoggingPrototypeModel = new LoadBalancerLoggingPrototype.Builder()
      .datapath(loadBalancerLoggingDatapathPrototypeModel)
      .build();
    assertEquals(loadBalancerLoggingPrototypeModel.datapath(), loadBalancerLoggingDatapathPrototypeModel);

    LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.Builder()
      .delay(Long.valueOf("5"))
      .maxRetries(Long.valueOf("2"))
      .port(Long.valueOf("22"))
      .timeout(Long.valueOf("2"))
      .type("tcp")
      .build();
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.delay(), Long.valueOf("5"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.maxRetries(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.port(), Long.valueOf("22"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.timeout(), Long.valueOf("2"));
    assertEquals(loadBalancerPoolHealthMonitorPrototypeModel.type(), "tcp");

    LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
      .id("0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0")
      .build();
    assertEquals(loadBalancerPoolMemberTargetPrototypeModel.id(), "0717_e21b7391-2ca2-4ab5-84a8-b92157a633b0");

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

    LoadBalancerPoolPrototypeLoadBalancerContext loadBalancerPoolPrototypeLoadBalancerContextModel = new LoadBalancerPoolPrototypeLoadBalancerContext.Builder()
      .algorithm("least_connections")
      .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
      .members(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel))
      .name("my-load-balancer-pool")
      .protocol("http")
      .proxyProtocol("disabled")
      .sessionPersistence(loadBalancerPoolSessionPersistencePrototypeModel)
      .build();
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.algorithm(), "least_connections");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.healthMonitor(), loadBalancerPoolHealthMonitorPrototypeModel);
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.members(), java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel));
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.name(), "my-load-balancer-pool");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.protocol(), "http");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.proxyProtocol(), "disabled");
    assertEquals(loadBalancerPoolPrototypeLoadBalancerContextModel.sessionPersistence(), loadBalancerPoolSessionPersistencePrototypeModel);

    LoadBalancerProfileIdentityByName loadBalancerProfileIdentityModel = new LoadBalancerProfileIdentityByName.Builder()
      .name("network-fixed")
      .build();
    assertEquals(loadBalancerProfileIdentityModel.name(), "network-fixed");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "r006-be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    CreateLoadBalancerOptions createLoadBalancerOptionsModel = new CreateLoadBalancerOptions.Builder()
      .isPublic(true)
      .subnets(java.util.Arrays.asList(subnetIdentityModel))
      .dns(loadBalancerDnsPrototypeModel)
      .isPrivatePath(true)
      .listeners(java.util.Arrays.asList(loadBalancerListenerPrototypeLoadBalancerContextModel))
      .logging(loadBalancerLoggingPrototypeModel)
      .name("my-load-balancer")
      .pools(java.util.Arrays.asList(loadBalancerPoolPrototypeLoadBalancerContextModel))
      .profile(loadBalancerProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .routeMode(true)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .build();
    assertEquals(createLoadBalancerOptionsModel.isPublic(), Boolean.valueOf(true));
    assertEquals(createLoadBalancerOptionsModel.subnets(), java.util.Arrays.asList(subnetIdentityModel));
    assertEquals(createLoadBalancerOptionsModel.dns(), loadBalancerDnsPrototypeModel);
    assertEquals(createLoadBalancerOptionsModel.isPrivatePath(), Boolean.valueOf(true));
    assertEquals(createLoadBalancerOptionsModel.listeners(), java.util.Arrays.asList(loadBalancerListenerPrototypeLoadBalancerContextModel));
    assertEquals(createLoadBalancerOptionsModel.logging(), loadBalancerLoggingPrototypeModel);
    assertEquals(createLoadBalancerOptionsModel.name(), "my-load-balancer");
    assertEquals(createLoadBalancerOptionsModel.pools(), java.util.Arrays.asList(loadBalancerPoolPrototypeLoadBalancerContextModel));
    assertEquals(createLoadBalancerOptionsModel.profile(), loadBalancerProfileIdentityModel);
    assertEquals(createLoadBalancerOptionsModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(createLoadBalancerOptionsModel.routeMode(), Boolean.valueOf(true));
    assertEquals(createLoadBalancerOptionsModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateLoadBalancerOptionsError() throws Throwable {
    new CreateLoadBalancerOptions.Builder().build();
  }

}