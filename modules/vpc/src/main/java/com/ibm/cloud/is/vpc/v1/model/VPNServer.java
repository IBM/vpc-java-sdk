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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNServer.
 */
public class VPNServer extends GenericModel {

  /**
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
   */
  public interface HealthState {
    /** degraded. */
    String DEGRADED = "degraded";
    /** faulted. */
    String FAULTED = "faulted";
    /** inapplicable. */
    String INAPPLICABLE = "inapplicable";
    /** ok. */
    String OK = "ok";
  }

  /**
   * The lifecycle state of the VPN server.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The transport protocol used by this VPN server.
   */
  public interface Protocol {
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** vpn_server. */
    String VPN_SERVER = "vpn_server";
  }

  protected CertificateInstanceReference certificate;
  @SerializedName("client_authentication")
  protected List<VPNServerAuthentication> clientAuthentication;
  @SerializedName("client_auto_delete")
  protected Boolean clientAutoDelete;
  @SerializedName("client_auto_delete_timeout")
  protected Long clientAutoDeleteTimeout;
  @SerializedName("client_dns_server_ips")
  protected List<IP> clientDnsServerIps;
  @SerializedName("client_idle_timeout")
  protected Long clientIdleTimeout;
  @SerializedName("client_ip_pool")
  protected String clientIpPool;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("enable_split_tunneling")
  protected Boolean enableSplitTunneling;
  @SerializedName("health_state")
  protected String healthState;
  protected String hostname;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  protected Long port;
  @SerializedName("private_ips")
  protected List<ReservedIPReference> privateIps;
  protected String protocol;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("security_groups")
  protected List<SecurityGroupReference> securityGroups;
  protected List<SubnetReference> subnets;
  protected VPCReference vpc;

  /**
   * Gets the certificate.
   *
   * The certificate instance for this VPN server.
   *
   * @return the certificate
   */
  public CertificateInstanceReference getCertificate() {
    return certificate;
  }

  /**
   * Gets the clientAuthentication.
   *
   * The methods used to authenticate VPN clients to this VPN server. VPN clients must authenticate against all
   * specified methods.
   *
   * @return the clientAuthentication
   */
  public List<VPNServerAuthentication> getClientAuthentication() {
    return clientAuthentication;
  }

  /**
   * Gets the clientAutoDelete.
   *
   * Indicates whether disconnected VPN clients will be automatically deleted after
   * `client_auto_delete_timeout` hours have passed. At present, this is always `true`, but may be modifiable in the
   * future.
   *
   * @return the clientAutoDelete
   */
  public Boolean isClientAutoDelete() {
    return clientAutoDelete;
  }

  /**
   * Gets the clientAutoDeleteTimeout.
   *
   * If `client_auto_delete` is `true`, the hours after which disconnected VPN clients will be automatically deleted. If
   * the value is `0`, disconnected VPN clients will be deleted immediately. This value may be modifiable in the future.
   *
   * @return the clientAutoDeleteTimeout
   */
  public Long getClientAutoDeleteTimeout() {
    return clientAutoDeleteTimeout;
  }

  /**
   * Gets the clientDnsServerIps.
   *
   * The DNS server addresses that will be provided to VPN clients that are connected to this VPN server.
   *
   * @return the clientDnsServerIps
   */
  public List<IP> getClientDnsServerIps() {
    return clientDnsServerIps;
  }

  /**
   * Gets the clientIdleTimeout.
   *
   * The seconds a VPN client can be idle before this VPN server will disconnect it.  If `0`, the server will not
   * disconnect idle clients.
   *
   * @return the clientIdleTimeout
   */
  public Long getClientIdleTimeout() {
    return clientIdleTimeout;
  }

  /**
   * Gets the clientIpPool.
   *
   * The VPN client IPv4 address pool, expressed in CIDR format.
   *
   * @return the clientIpPool
   */
  public String getClientIpPool() {
    return clientIpPool;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the VPN server was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this VPN server.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the enableSplitTunneling.
   *
   * Indicates whether the split tunneling is enabled on this VPN server.
   *
   * @return the enableSplitTunneling
   */
  public Boolean isEnableSplitTunneling() {
    return enableSplitTunneling;
  }

  /**
   * Gets the healthState.
   *
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the hostname.
   *
   * Fully qualified domain name assigned to this VPN server.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the href.
   *
   * The URL for this VPN server.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPN server.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the VPN server.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this VPN server.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the port.
   *
   * The port number used by this VPN server.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the privateIps.
   *
   * The reserved IPs bound to this VPN server.
   *
   * @return the privateIps
   */
  public List<ReservedIPReference> getPrivateIps() {
    return privateIps;
  }

  /**
   * Gets the protocol.
   *
   * The transport protocol used by this VPN server.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this VPN server.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups targeting this VPN server.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the subnets.
   *
   * The subnets this VPN server is provisioned in.
   *
   * @return the subnets
   */
  public List<SubnetReference> getSubnets() {
    return subnets;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this VPN server resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }
}

