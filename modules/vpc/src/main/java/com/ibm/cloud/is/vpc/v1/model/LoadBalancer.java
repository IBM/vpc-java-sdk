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
 * LoadBalancer.
 */
public class LoadBalancer extends GenericModel {

  /**
   * The operating status of this load balancer.
   */
  public interface OperatingStatus {
    /** offline. */
    String OFFLINE = "offline";
    /** online. */
    String ONLINE = "online";
  }

  /**
   * The provisioning status of this load balancer.
   */
  public interface ProvisioningStatus {
    /** active. */
    String ACTIVE = "active";
    /** create_pending. */
    String CREATE_PENDING = "create_pending";
    /** delete_pending. */
    String DELETE_PENDING = "delete_pending";
    /** failed. */
    String FAILED = "failed";
    /** maintenance_pending. */
    String MAINTENANCE_PENDING = "maintenance_pending";
    /** update_pending. */
    String UPDATE_PENDING = "update_pending";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** load_balancer. */
    String LOAD_BALANCER = "load_balancer";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String hostname;
  protected String href;
  protected String id;
  @SerializedName("is_public")
  protected Boolean isPublic;
  protected List<LoadBalancerListenerReference> listeners;
  protected LoadBalancerLogging logging;
  protected String name;
  @SerializedName("operating_status")
  protected String operatingStatus;
  protected List<LoadBalancerPoolReference> pools;
  @SerializedName("private_ips")
  protected List<LoadBalancerPrivateIpsItem> privateIps;
  protected LoadBalancerProfileReference profile;
  @SerializedName("provisioning_status")
  protected String provisioningStatus;
  @SerializedName("public_ips")
  protected List<IP> publicIps;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("route_mode")
  protected Boolean routeMode;
  @SerializedName("security_groups")
  protected List<SecurityGroupReference> securityGroups;
  @SerializedName("security_groups_supported")
  protected Boolean securityGroupsSupported;
  protected List<SubnetReference> subnets;
  @SerializedName("udp_supported")
  protected Boolean udpSupported;

  /**
   * Gets the createdAt.
   *
   * The date and time that this load balancer was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The load balancer's CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the hostname.
   *
   * Fully qualified domain name assigned to this load balancer.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the href.
   *
   * The load balancer's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the isPublic.
   *
   * The type of this load balancer, public or private.
   *
   * @return the isPublic
   */
  public Boolean isIsPublic() {
    return isPublic;
  }

  /**
   * Gets the listeners.
   *
   * The listeners of this load balancer.
   *
   * @return the listeners
   */
  public List<LoadBalancerListenerReference> getListeners() {
    return listeners;
  }

  /**
   * Gets the logging.
   *
   * The logging configuration for this load balancer.
   *
   * @return the logging
   */
  public LoadBalancerLogging getLogging() {
    return logging;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this load balancer.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the operatingStatus.
   *
   * The operating status of this load balancer.
   *
   * @return the operatingStatus
   */
  public String getOperatingStatus() {
    return operatingStatus;
  }

  /**
   * Gets the pools.
   *
   * The pools of this load balancer.
   *
   * @return the pools
   */
  public List<LoadBalancerPoolReference> getPools() {
    return pools;
  }

  /**
   * Gets the privateIps.
   *
   * The private IP addresses assigned to this load balancer.
   *
   * @return the privateIps
   */
  public List<LoadBalancerPrivateIpsItem> getPrivateIps() {
    return privateIps;
  }

  /**
   * Gets the profile.
   *
   * The profile for this load balancer.
   *
   * @return the profile
   */
  public LoadBalancerProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this load balancer.
   *
   * @return the provisioningStatus
   */
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  /**
   * Gets the publicIps.
   *
   * The public IP addresses assigned to this load balancer.
   *
   * Applicable only for public load balancers.
   *
   * @return the publicIps
   */
  public List<IP> getPublicIps() {
    return publicIps;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this load balancer.
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
   * Gets the routeMode.
   *
   * Indicates whether route mode is enabled for this load balancer.
   *
   * At present, public load balancers are not supported with route mode enabled.
   *
   * @return the routeMode
   */
  public Boolean isRouteMode() {
    return routeMode;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups targeting this load balancer.
   *
   * Applicable only for load balancers that support security groups.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the securityGroupsSupported.
   *
   * Indicates whether this load balancer supports security groups.
   *
   * @return the securityGroupsSupported
   */
  public Boolean isSecurityGroupsSupported() {
    return securityGroupsSupported;
  }

  /**
   * Gets the subnets.
   *
   * The subnets this load balancer is part of.
   *
   * @return the subnets
   */
  public List<SubnetReference> getSubnets() {
    return subnets;
  }

  /**
   * Gets the udpSupported.
   *
   * Indicates whether this load balancer supports UDP.
   *
   * @return the udpSupported
   */
  public Boolean isUdpSupported() {
    return udpSupported;
  }
}

