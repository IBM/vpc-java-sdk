/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateInstanceGroup options.
 */
public class UpdateInstanceGroupOptions extends GenericModel {

  protected String id;
  protected String name;
  protected Long membershipCount;
  protected InstanceTemplateIdentity instanceTemplate;
  protected List<SubnetIdentity> subnets;
  protected Long applicationPort;
  protected LoadBalancerIdentity loadBalancer;
  protected LoadBalancerPoolIdentity loadBalancerPool;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private Long membershipCount;
    private InstanceTemplateIdentity instanceTemplate;
    private List<SubnetIdentity> subnets;
    private Long applicationPort;
    private LoadBalancerIdentity loadBalancer;
    private LoadBalancerPoolIdentity loadBalancerPool;

    private Builder(UpdateInstanceGroupOptions updateInstanceGroupOptions) {
      this.id = updateInstanceGroupOptions.id;
      this.name = updateInstanceGroupOptions.name;
      this.membershipCount = updateInstanceGroupOptions.membershipCount;
      this.instanceTemplate = updateInstanceGroupOptions.instanceTemplate;
      this.subnets = updateInstanceGroupOptions.subnets;
      this.applicationPort = updateInstanceGroupOptions.applicationPort;
      this.loadBalancer = updateInstanceGroupOptions.loadBalancer;
      this.loadBalancerPool = updateInstanceGroupOptions.loadBalancerPool;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateInstanceGroupOptions.
     *
     * @return the new UpdateInstanceGroupOptions instance
     */
    public UpdateInstanceGroupOptions build() {
      return new UpdateInstanceGroupOptions(this);
    }

    /**
     * Adds an subnets to subnets.
     *
     * @param subnets the new subnets
     * @return the UpdateInstanceGroupOptions builder
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
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the membershipCount.
     *
     * @param membershipCount the membershipCount
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder membershipCount(long membershipCount) {
      this.membershipCount = membershipCount;
      return this;
    }

    /**
     * Set the instanceTemplate.
     *
     * @param instanceTemplate the instanceTemplate
     * @return the UpdateInstanceGroupOptions builder
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
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder subnets(List<SubnetIdentity> subnets) {
      this.subnets = subnets;
      return this;
    }

    /**
     * Set the applicationPort.
     *
     * @param applicationPort the applicationPort
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder applicationPort(long applicationPort) {
      this.applicationPort = applicationPort;
      return this;
    }

    /**
     * Set the loadBalancer.
     *
     * @param loadBalancer the loadBalancer
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder loadBalancer(LoadBalancerIdentity loadBalancer) {
      this.loadBalancer = loadBalancer;
      return this;
    }

    /**
     * Set the loadBalancerPool.
     *
     * @param loadBalancerPool the loadBalancerPool
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder loadBalancerPool(LoadBalancerPoolIdentity loadBalancerPool) {
      this.loadBalancerPool = loadBalancerPool;
      return this;
    }
  }

  protected UpdateInstanceGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
    membershipCount = builder.membershipCount;
    instanceTemplate = builder.instanceTemplate;
    subnets = builder.subnets;
    applicationPort = builder.applicationPort;
    loadBalancer = builder.loadBalancer;
    loadBalancerPool = builder.loadBalancerPool;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The instance group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Gets the instanceTemplate.
   *
   * Instance template to use when creating new instances.
   *
   * @return the instanceTemplate
   */
  public InstanceTemplateIdentity instanceTemplate() {
    return instanceTemplate;
  }

  /**
   * Gets the subnets.
   *
   * Array of identities to subnets to use when creating new instances.
   *
   * @return the subnets
   */
  public List<SubnetIdentity> subnets() {
    return subnets;
  }

  /**
   * Gets the applicationPort.
   *
   * Required if specifying a load balancer pool only. Used by the instance group when scaling up instances to supply
   * the port for the load balancer pool member.
   *
   * @return the applicationPort
   */
  public Long applicationPort() {
    return applicationPort;
  }

  /**
   * Gets the loadBalancer.
   *
   * The load balancer that the load balancer pool used by this group
   * is in. Must be supplied when using a load balancer pool.
   *
   * @return the loadBalancer
   */
  public LoadBalancerIdentity loadBalancer() {
    return loadBalancer;
  }

  /**
   * Gets the loadBalancerPool.
   *
   * When specified, the load balancer pool will be managed by this
   * group. Instances created by this group will have a new load
   * balancer pool member in that pool created. Must be used with
   * `application_port`.
   *
   * @return the loadBalancerPool
   */
  public LoadBalancerPoolIdentity loadBalancerPool() {
    return loadBalancerPool;
  }
}

