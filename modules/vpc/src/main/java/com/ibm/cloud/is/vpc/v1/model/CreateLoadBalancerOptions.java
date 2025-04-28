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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createLoadBalancer options.
 */
public class CreateLoadBalancerOptions extends GenericModel {

  protected Boolean isPublic;
  protected List<SubnetIdentity> subnets;
  protected LoadBalancerDNSPrototype dns;
  protected Boolean isPrivatePath;
  protected List<LoadBalancerListenerPrototypeLoadBalancerContext> listeners;
  protected LoadBalancerLoggingPrototype logging;
  protected String name;
  protected List<LoadBalancerPoolPrototypeLoadBalancerContext> pools;
  protected LoadBalancerProfileIdentity profile;
  protected ResourceGroupIdentity resourceGroup;
  protected Boolean routeMode;
  protected List<SecurityGroupIdentity> securityGroups;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean isPublic;
    private List<SubnetIdentity> subnets;
    private LoadBalancerDNSPrototype dns;
    private Boolean isPrivatePath;
    private List<LoadBalancerListenerPrototypeLoadBalancerContext> listeners;
    private LoadBalancerLoggingPrototype logging;
    private String name;
    private List<LoadBalancerPoolPrototypeLoadBalancerContext> pools;
    private LoadBalancerProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private Boolean routeMode;
    private List<SecurityGroupIdentity> securityGroups;

    /**
     * Instantiates a new Builder from an existing CreateLoadBalancerOptions instance.
     *
     * @param createLoadBalancerOptions the instance to initialize the Builder with
     */
    private Builder(CreateLoadBalancerOptions createLoadBalancerOptions) {
      this.isPublic = createLoadBalancerOptions.isPublic;
      this.subnets = createLoadBalancerOptions.subnets;
      this.dns = createLoadBalancerOptions.dns;
      this.isPrivatePath = createLoadBalancerOptions.isPrivatePath;
      this.listeners = createLoadBalancerOptions.listeners;
      this.logging = createLoadBalancerOptions.logging;
      this.name = createLoadBalancerOptions.name;
      this.pools = createLoadBalancerOptions.pools;
      this.profile = createLoadBalancerOptions.profile;
      this.resourceGroup = createLoadBalancerOptions.resourceGroup;
      this.routeMode = createLoadBalancerOptions.routeMode;
      this.securityGroups = createLoadBalancerOptions.securityGroups;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param isPublic the isPublic
     * @param subnets the subnets
     */
    public Builder(Boolean isPublic, List<SubnetIdentity> subnets) {
      this.isPublic = isPublic;
      this.subnets = subnets;
    }

    /**
     * Builds a CreateLoadBalancerOptions.
     *
     * @return the new CreateLoadBalancerOptions instance
     */
    public CreateLoadBalancerOptions build() {
      return new CreateLoadBalancerOptions(this);
    }

    /**
     * Adds a new element to subnets.
     *
     * @param subnets the new element to be added
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder addSubnets(SubnetIdentity subnets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subnets,
        "subnets cannot be null");
      if (this.subnets == null) {
        this.subnets = new ArrayList<SubnetIdentity>();
      }
      this.subnets.add(subnets);
      return this;
    }

    /**
     * Adds a new element to listeners.
     *
     * @param listeners the new element to be added
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder addListeners(LoadBalancerListenerPrototypeLoadBalancerContext listeners) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(listeners,
        "listeners cannot be null");
      if (this.listeners == null) {
        this.listeners = new ArrayList<LoadBalancerListenerPrototypeLoadBalancerContext>();
      }
      this.listeners.add(listeners);
      return this;
    }

    /**
     * Adds a new element to pools.
     *
     * @param pools the new element to be added
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder addPools(LoadBalancerPoolPrototypeLoadBalancerContext pools) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(pools,
        "pools cannot be null");
      if (this.pools == null) {
        this.pools = new ArrayList<LoadBalancerPoolPrototypeLoadBalancerContext>();
      }
      this.pools.add(pools);
      return this;
    }

    /**
     * Adds a new element to securityGroups.
     *
     * @param securityGroups the new element to be added
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder addSecurityGroups(SecurityGroupIdentity securityGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(securityGroups,
        "securityGroups cannot be null");
      if (this.securityGroups == null) {
        this.securityGroups = new ArrayList<SecurityGroupIdentity>();
      }
      this.securityGroups.add(securityGroups);
      return this;
    }

    /**
     * Set the isPublic.
     *
     * @param isPublic the isPublic
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder isPublic(Boolean isPublic) {
      this.isPublic = isPublic;
      return this;
    }

    /**
     * Set the subnets.
     * Existing subnets will be replaced.
     *
     * @param subnets the subnets
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder subnets(List<SubnetIdentity> subnets) {
      this.subnets = subnets;
      return this;
    }

    /**
     * Set the dns.
     *
     * @param dns the dns
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder dns(LoadBalancerDNSPrototype dns) {
      this.dns = dns;
      return this;
    }

    /**
     * Set the isPrivatePath.
     *
     * @param isPrivatePath the isPrivatePath
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder isPrivatePath(Boolean isPrivatePath) {
      this.isPrivatePath = isPrivatePath;
      return this;
    }

    /**
     * Set the listeners.
     * Existing listeners will be replaced.
     *
     * @param listeners the listeners
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder listeners(List<LoadBalancerListenerPrototypeLoadBalancerContext> listeners) {
      this.listeners = listeners;
      return this;
    }

    /**
     * Set the logging.
     *
     * @param logging the logging
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder logging(LoadBalancerLoggingPrototype logging) {
      this.logging = logging;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the pools.
     * Existing pools will be replaced.
     *
     * @param pools the pools
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder pools(List<LoadBalancerPoolPrototypeLoadBalancerContext> pools) {
      this.pools = pools;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder profile(LoadBalancerProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the routeMode.
     *
     * @param routeMode the routeMode
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder routeMode(Boolean routeMode) {
      this.routeMode = routeMode;
      return this;
    }

    /**
     * Set the securityGroups.
     * Existing securityGroups will be replaced.
     *
     * @param securityGroups the securityGroups
     * @return the CreateLoadBalancerOptions builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }
  }

  protected CreateLoadBalancerOptions() { }

  protected CreateLoadBalancerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.isPublic,
      "isPublic cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnets,
      "subnets cannot be null");
    isPublic = builder.isPublic;
    subnets = builder.subnets;
    dns = builder.dns;
    isPrivatePath = builder.isPrivatePath;
    listeners = builder.listeners;
    logging = builder.logging;
    name = builder.name;
    pools = builder.pools;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    routeMode = builder.routeMode;
    securityGroups = builder.securityGroups;
  }

  /**
   * New builder.
   *
   * @return a CreateLoadBalancerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the isPublic.
   *
   * Indicates whether this load balancer is public.
   *
   * At present,
   * - If `route_mode` is set to `true`, the load balancer must be private.
   * - If `is_private_path` is specified, it must be set to `false`.
   *
   * @return the isPublic
   */
  public Boolean isPublic() {
    return isPublic;
  }

  /**
   * Gets the subnets.
   *
   * The subnets to provision this load balancer in.  The subnets must be in the same VPC.
   * - If 'availability' is specified as `subnet` in the profile, the load balancer's availability will depend on the
   * availability of the zones that the subnets reside in.
   * - If 'availability' is specified as `region` in the profile, the load balancer remains available as long as any
   * zone in the region is available. Only members in healthy zones will be sent new connections.
   *
   * Load balancers in the `network` family allow only one subnet to be specified.
   *
   * @return the subnets
   */
  public List<SubnetIdentity> subnets() {
    return subnets;
  }

  /**
   * Gets the dns.
   *
   * The DNS configuration for this load balancer.
   *
   * If unspecified, DNS `A` records for this load balancer's `hostname` property will be added
   * to the public DNS zone `lb.appdomain.cloud`. Otherwise, those DNS `A` records will be
   * added to the specified `zone`.
   *
   * Not supported by private path load balancers.
   *
   * @return the dns
   */
  public LoadBalancerDNSPrototype dns() {
    return dns;
  }

  /**
   * Gets the isPrivatePath.
   *
   * Indicates whether this is a private path load balancer.
   *
   * @return the isPrivatePath
   */
  public Boolean isPrivatePath() {
    return isPrivatePath;
  }

  /**
   * Gets the listeners.
   *
   * The listeners of this load balancer.
   *
   * @return the listeners
   */
  public List<LoadBalancerListenerPrototypeLoadBalancerContext> listeners() {
    return listeners;
  }

  /**
   * Gets the logging.
   *
   * The logging configuration to use for this load balancer. See [VPC Datapath
   * Logging](https://cloud.ibm.com/docs/vpc?topic=vpc-datapath-logging) on the logging
   * format, fields and permitted values. If unspecified, `datapath.active` will be `false`.
   *
   * To activate logging, the load balancer profile must support the specified logging type.
   *
   * @return the logging
   */
  public LoadBalancerLoggingPrototype logging() {
    return logging;
  }

  /**
   * Gets the name.
   *
   * The name for this load balancer. The name must not be used by another load balancer in the VPC.  If unspecified,
   * the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the pools.
   *
   * The pools of this load balancer.
   *
   * @return the pools
   */
  public List<LoadBalancerPoolPrototypeLoadBalancerContext> pools() {
    return pools;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this load balancer.
   *
   * If unspecified, `application` will be used.
   *
   * @return the profile
   */
  public LoadBalancerProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
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
  public Boolean routeMode() {
    return routeMode;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups to use for this load balancer. If unspecified, the VPC's default security group is used.
   *
   * The load balancer profile must support security groups.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupIdentity> securityGroups() {
    return securityGroups;
  }
}

