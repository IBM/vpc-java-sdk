/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerProfile.
 */
public class LoadBalancerProfile extends GenericModel {

  /**
   * The product family this load balancer profile belongs to.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Family {
    /** application. */
    String APPLICATION = "application";
    /** network. */
    String NETWORK = "network";
  }

  protected String family;
  protected String href;
  @SerializedName("instance_groups_supported")
  protected LoadBalancerProfileInstanceGroupsSupported instanceGroupsSupported;
  @SerializedName("logging_supported")
  protected LoadBalancerProfileLoggingSupported loggingSupported;
  protected String name;
  @SerializedName("route_mode_supported")
  protected LoadBalancerProfileRouteModeSupported routeModeSupported;
  @SerializedName("security_groups_supported")
  protected LoadBalancerProfileSecurityGroupsSupported securityGroupsSupported;
  @SerializedName("udp_supported")
  protected LoadBalancerProfileUDPSupported udpSupported;

  protected LoadBalancerProfile() { }

  /**
   * Gets the family.
   *
   * The product family this load balancer profile belongs to.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this load balancer profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the instanceGroupsSupported.
   *
   * @return the instanceGroupsSupported
   */
  public LoadBalancerProfileInstanceGroupsSupported getInstanceGroupsSupported() {
    return instanceGroupsSupported;
  }

  /**
   * Gets the loggingSupported.
   *
   * Indicates which logging type(s) are supported for a load balancer with this profile.
   *
   * @return the loggingSupported
   */
  public LoadBalancerProfileLoggingSupported getLoggingSupported() {
    return loggingSupported;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this load balancer profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the routeModeSupported.
   *
   * @return the routeModeSupported
   */
  public LoadBalancerProfileRouteModeSupported getRouteModeSupported() {
    return routeModeSupported;
  }

  /**
   * Gets the securityGroupsSupported.
   *
   * @return the securityGroupsSupported
   */
  public LoadBalancerProfileSecurityGroupsSupported getSecurityGroupsSupported() {
    return securityGroupsSupported;
  }

  /**
   * Gets the udpSupported.
   *
   * @return the udpSupported
   */
  public LoadBalancerProfileUDPSupported getUdpSupported() {
    return udpSupported;
  }
}

