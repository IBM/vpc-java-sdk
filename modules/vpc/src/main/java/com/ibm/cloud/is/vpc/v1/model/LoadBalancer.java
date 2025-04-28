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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancer.
 */
public class LoadBalancer extends GenericModel {

  /**
   * The access mode for this load balancer:
   * - `private`: reachable from within its VPC, at IP addresses in `private_ips`
   * - `private_path`: reachable through an endpoint gateway
   * - `public`: reachable from the internet at the IP addresses in `public_ips`.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface AccessMode {
    /** private. */
    String X_PRIVATE = "private";
    /** private_path. */
    String PRIVATE_PATH = "private_path";
    /** public. */
    String X_PUBLIC = "public";
  }

  /**
   * The availability of this load balancer:
   * - `subnet`: remains available if at least one zone that the load balancer's subnets reside
   *   in is available
   * - `region`: remains available if at least one zone in the region is available.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Availability {
    /** region. */
    String REGION = "region";
    /** subnet. */
    String SUBNET = "subnet";
  }

  /**
   * A load balancer failsafe policy action:
   * - `bypass`: Bypasses the members and sends requests directly to their destination IPs.
   * - `drop`: Drops requests.
   * - `fail`: Fails requests with an HTTP `503` status code.
   * - `forward`: Forwards requests to the `target` pool.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface FailsafePolicyActions {
    /** bypass. */
    String BYPASS = "bypass";
    /** drop. */
    String DROP = "drop";
    /** fail. */
    String FAIL = "fail";
    /** forward. */
    String FORWARD = "forward";
  }

  /**
   * The operating status of this load balancer.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface OperatingStatus {
    /** offline. */
    String OFFLINE = "offline";
    /** online. */
    String ONLINE = "online";
  }

  /**
   * The provisioning status of this load balancer:
   * - `active`: The load balancer is running.
   * - `create_pending`: The load balancer is being created.
   * - `delete_pending`: The load balancer is being deleted.
   * - `maintenance_pending`: The load balancer is unavailable due to an internal
   *                           error (contact IBM support).
   * - `migrate_pending`: The load balancer is migrating to the requested configuration.
   *                       Performance may be degraded.
   * - `update_pending`: The load balancer is being updated
   *     to the requested configuration.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
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
    /** migrate_pending. */
    String MIGRATE_PENDING = "migrate_pending";
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

  @SerializedName("access_mode")
  protected String accessMode;
  @SerializedName("attached_load_balancer_pool_members")
  protected List<LoadBalancerPoolMemberReference> attachedLoadBalancerPoolMembers;
  protected String availability;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected LoadBalancerDNS dns;
  @SerializedName("failsafe_policy_actions")
  protected List<String> failsafePolicyActions;
  protected String hostname;
  protected String href;
  protected String id;
  @SerializedName("instance_groups_supported")
  protected Boolean instanceGroupsSupported;
  @SerializedName("is_private_path")
  protected Boolean isPrivatePath;
  @SerializedName("is_public")
  protected Boolean isPublic;
  protected List<LoadBalancerListenerReference> listeners;
  protected LoadBalancerLogging logging;
  protected String name;
  @SerializedName("operating_status")
  protected String operatingStatus;
  protected List<LoadBalancerPoolReference> pools;
  @SerializedName("private_ips")
  protected List<ReservedIPReference> privateIps;
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
  @SerializedName("source_ip_session_persistence_supported")
  protected Boolean sourceIpSessionPersistenceSupported;
  protected List<SubnetReference> subnets;
  @SerializedName("udp_supported")
  protected Boolean udpSupported;

  protected LoadBalancer() { }

  /**
   * Gets the accessMode.
   *
   * The access mode for this load balancer:
   * - `private`: reachable from within its VPC, at IP addresses in `private_ips`
   * - `private_path`: reachable through an endpoint gateway
   * - `public`: reachable from the internet at the IP addresses in `public_ips`.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the accessMode
   */
  public String getAccessMode() {
    return accessMode;
  }

  /**
   * Gets the attachedLoadBalancerPoolMembers.
   *
   * The load balancer pool members attached to this load balancer.
   *
   * @return the attachedLoadBalancerPoolMembers
   */
  public List<LoadBalancerPoolMemberReference> getAttachedLoadBalancerPoolMembers() {
    return attachedLoadBalancerPoolMembers;
  }

  /**
   * Gets the availability.
   *
   * The availability of this load balancer:
   * - `subnet`: remains available if at least one zone that the load balancer's subnets reside
   *   in is available
   * - `region`: remains available if at least one zone in the region is available.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the availability
   */
  public String getAvailability() {
    return availability;
  }

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
   * The CRN for this load balancer.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the dns.
   *
   * The DNS configuration for this load balancer.
   *
   * If absent, DNS `A` records for this load balancer's `hostname` property will be added to
   * the public DNS zone `lb.appdomain.cloud`.
   *
   * Not supported by private path load balancers.
   *
   * @return the dns
   */
  public LoadBalancerDNS getDns() {
    return dns;
  }

  /**
   * Gets the failsafePolicyActions.
   *
   * The supported `failsafe_policy.action` values for this load balancer's pools.
   *
   * @return the failsafePolicyActions
   */
  public List<String> getFailsafePolicyActions() {
    return failsafePolicyActions;
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
   * The URL for this load balancer.
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
   * Gets the instanceGroupsSupported.
   *
   * Indicates whether this load balancer supports instance groups.
   *
   * @return the instanceGroupsSupported
   */
  public Boolean isInstanceGroupsSupported() {
    return instanceGroupsSupported;
  }

  /**
   * Gets the isPrivatePath.
   *
   * Indicates whether this is a private path load balancer.
   *
   * @return the isPrivatePath
   */
  public Boolean isIsPrivatePath() {
    return isPrivatePath;
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
   * The name for this load balancer. The name is unique across all load balancers in the VPC.
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
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
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
   * Will be empty if `is_private` is `false`.
   *
   * @return the privateIps
   */
  public List<ReservedIPReference> getPrivateIps() {
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
   * The provisioning status of this load balancer:
   * - `active`: The load balancer is running.
   * - `create_pending`: The load balancer is being created.
   * - `delete_pending`: The load balancer is being deleted.
   * - `maintenance_pending`: The load balancer is unavailable due to an internal
   *                           error (contact IBM support).
   * - `migrate_pending`: The load balancer is migrating to the requested configuration.
   *                       Performance may be degraded.
   * - `update_pending`: The load balancer is being updated
   *     to the requested configuration.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
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
   * Will be empty if `is_public` is `false`.
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
   * Indicates whether [route mode](https://cloud.ibm.com/docs/vpc?topic=vpc-nlb-vnf&amp;interface=ui) is enabled for
   * this load balancer.
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
   * If empty, all inbound and outbound traffic is allowed.
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
   * Gets the sourceIpSessionPersistenceSupported.
   *
   * Indicates whether this load balancer supports source IP session persistence.
   *
   * @return the sourceIpSessionPersistenceSupported
   */
  public Boolean isSourceIpSessionPersistenceSupported() {
    return sourceIpSessionPersistenceSupported;
  }

  /**
   * Gets the subnets.
   *
   * The subnets this load balancer is provisioned in.
   *
   * All subnets will be in the same VPC.
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

