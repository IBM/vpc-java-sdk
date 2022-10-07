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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createInstanceGroup options.
 */
public class CreateInstanceGroupOptions extends GenericModel {

  protected InstanceTemplateIdentity instanceTemplate;
  protected List<SubnetIdentity> subnets;
  protected Long applicationPort;
  protected LoadBalancerIdentity loadBalancer;
  protected LoadBalancerPoolIdentity loadBalancerPool;
  protected Long membershipCount;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private InstanceTemplateIdentity instanceTemplate;
    private List<SubnetIdentity> subnets;
    private Long applicationPort;
    private LoadBalancerIdentity loadBalancer;
    private LoadBalancerPoolIdentity loadBalancerPool;
    private Long membershipCount;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateInstanceGroupOptions instance.
     *
     * @param createInstanceGroupOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceGroupOptions createInstanceGroupOptions) {
      this.instanceTemplate = createInstanceGroupOptions.instanceTemplate;
      this.subnets = createInstanceGroupOptions.subnets;
      this.applicationPort = createInstanceGroupOptions.applicationPort;
      this.loadBalancer = createInstanceGroupOptions.loadBalancer;
      this.loadBalancerPool = createInstanceGroupOptions.loadBalancerPool;
      this.membershipCount = createInstanceGroupOptions.membershipCount;
      this.name = createInstanceGroupOptions.name;
      this.resourceGroup = createInstanceGroupOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceTemplate the instanceTemplate
     * @param subnets the subnets
     */
    public Builder(InstanceTemplateIdentity instanceTemplate, List<SubnetIdentity> subnets) {
      this.instanceTemplate = instanceTemplate;
      this.subnets = subnets;
    }

    /**
     * Builds a CreateInstanceGroupOptions.
     *
     * @return the new CreateInstanceGroupOptions instance
     */
    public CreateInstanceGroupOptions build() {
      return new CreateInstanceGroupOptions(this);
    }

    /**
     * Adds an subnets to subnets.
     *
     * @param subnets the new subnets
     * @return the CreateInstanceGroupOptions builder
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
     * Set the instanceTemplate.
     *
     * @param instanceTemplate the instanceTemplate
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder instanceTemplate(InstanceTemplateIdentity instanceTemplate) {
      this.instanceTemplate = instanceTemplate;
      return this;
    }

    /**
     * Set the subnets.
     * Existing subnets will be replaced.
     *
     * @param subnets the subnets
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder subnets(List<SubnetIdentity> subnets) {
      this.subnets = subnets;
      return this;
    }

    /**
     * Set the applicationPort.
     *
     * @param applicationPort the applicationPort
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder applicationPort(long applicationPort) {
      this.applicationPort = applicationPort;
      return this;
    }

    /**
     * Set the loadBalancer.
     *
     * @param loadBalancer the loadBalancer
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder loadBalancer(LoadBalancerIdentity loadBalancer) {
      this.loadBalancer = loadBalancer;
      return this;
    }

    /**
     * Set the loadBalancerPool.
     *
     * @param loadBalancerPool the loadBalancerPool
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder loadBalancerPool(LoadBalancerPoolIdentity loadBalancerPool) {
      this.loadBalancerPool = loadBalancerPool;
      return this;
    }

    /**
     * Set the membershipCount.
     *
     * @param membershipCount the membershipCount
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder membershipCount(long membershipCount) {
      this.membershipCount = membershipCount;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateInstanceGroupOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateInstanceGroupOptions() { }

  protected CreateInstanceGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceTemplate,
      "instanceTemplate cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnets,
      "subnets cannot be null");
    instanceTemplate = builder.instanceTemplate;
    subnets = builder.subnets;
    applicationPort = builder.applicationPort;
    loadBalancer = builder.loadBalancer;
    loadBalancerPool = builder.loadBalancerPool;
    membershipCount = builder.membershipCount;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceTemplate.
   *
   * Instance template to use when creating new instances.
   *
   * Instance groups are not compatible with instance templates that specify `true` for
   * `default_trusted_profile.auto_link`.
   *
   * @return the instanceTemplate
   */
  public InstanceTemplateIdentity instanceTemplate() {
    return instanceTemplate;
  }

  /**
   * Gets the subnets.
   *
   * The subnets to use when creating new instances.
   *
   * @return the subnets
   */
  public List<SubnetIdentity> subnets() {
    return subnets;
  }

  /**
   * Gets the applicationPort.
   *
   * The port to use for new load balancer pool members created by this instance group.
   *
   * This property must be specified if and only if `load_balancer_pool` has been specified.
   *
   * @return the applicationPort
   */
  public Long applicationPort() {
    return applicationPort;
  }

  /**
   * Gets the loadBalancer.
   *
   * The load balancer associated with `load_balancer_pool`.
   *
   * This property must be specified if and only if `load_balancer_pool` has been
   * specified.
   *
   * At present, only load balancers in the `application` family are supported.
   *
   * @return the loadBalancer
   */
  public LoadBalancerIdentity loadBalancer() {
    return loadBalancer;
  }

  /**
   * Gets the loadBalancerPool.
   *
   * If specified, the load balancer pool this instance group will manage. A pool member
   * will be created for each instance created by this group.
   *
   * If specified, `load_balancer` and `application_port` must also be specified.
   *
   * @return the loadBalancerPool
   */
  public LoadBalancerPoolIdentity loadBalancerPool() {
    return loadBalancerPool;
  }

  /**
   * Gets the membershipCount.
   *
   * The number of instances in the instance group.
   *
   * @return the membershipCount
   */
  public Long membershipCount() {
    return membershipCount;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this instance group. If unspecified, the name will be a hyphenated list of
   * randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

