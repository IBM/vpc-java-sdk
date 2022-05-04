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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * To add or update load balancer specification for an instance group the `membership_count` must first be set to 0.
 */
public class InstanceGroupPatch extends GenericModel {

  @SerializedName("application_port")
  protected Long applicationPort;
  @SerializedName("instance_template")
  protected InstanceTemplateIdentity instanceTemplate;
  @SerializedName("load_balancer")
  protected LoadBalancerIdentity loadBalancer;
  @SerializedName("load_balancer_pool")
  protected LoadBalancerPoolIdentity loadBalancerPool;
  @SerializedName("membership_count")
  protected Long membershipCount;
  protected String name;
  protected List<SubnetIdentity> subnets;

  /**
   * Builder.
   */
  public static class Builder {
    private Long applicationPort;
    private InstanceTemplateIdentity instanceTemplate;
    private LoadBalancerIdentity loadBalancer;
    private LoadBalancerPoolIdentity loadBalancerPool;
    private Long membershipCount;
    private String name;
    private List<SubnetIdentity> subnets;

    private Builder(InstanceGroupPatch instanceGroupPatch) {
      this.applicationPort = instanceGroupPatch.applicationPort;
      this.instanceTemplate = instanceGroupPatch.instanceTemplate;
      this.loadBalancer = instanceGroupPatch.loadBalancer;
      this.loadBalancerPool = instanceGroupPatch.loadBalancerPool;
      this.membershipCount = instanceGroupPatch.membershipCount;
      this.name = instanceGroupPatch.name;
      this.subnets = instanceGroupPatch.subnets;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupPatch.
     *
     * @return the new InstanceGroupPatch instance
     */
    public InstanceGroupPatch build() {
      return new InstanceGroupPatch(this);
    }

    /**
     * Adds an subnets to subnets.
     *
     * @param subnets the new subnets
     * @return the InstanceGroupPatch builder
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
     * Set the applicationPort.
     *
     * @param applicationPort the applicationPort
     * @return the InstanceGroupPatch builder
     */
    public Builder applicationPort(long applicationPort) {
      this.applicationPort = applicationPort;
      return this;
    }

    /**
     * Set the instanceTemplate.
     *
     * @param instanceTemplate the instanceTemplate
     * @return the InstanceGroupPatch builder
     */
    public Builder instanceTemplate(InstanceTemplateIdentity instanceTemplate) {
      this.instanceTemplate = instanceTemplate;
      return this;
    }

    /**
     * Set the loadBalancer.
     *
     * @param loadBalancer the loadBalancer
     * @return the InstanceGroupPatch builder
     */
    public Builder loadBalancer(LoadBalancerIdentity loadBalancer) {
      this.loadBalancer = loadBalancer;
      return this;
    }

    /**
     * Set the loadBalancerPool.
     *
     * @param loadBalancerPool the loadBalancerPool
     * @return the InstanceGroupPatch builder
     */
    public Builder loadBalancerPool(LoadBalancerPoolIdentity loadBalancerPool) {
      this.loadBalancerPool = loadBalancerPool;
      return this;
    }

    /**
     * Set the membershipCount.
     *
     * @param membershipCount the membershipCount
     * @return the InstanceGroupPatch builder
     */
    public Builder membershipCount(long membershipCount) {
      this.membershipCount = membershipCount;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the subnets.
     * Existing subnets will be replaced.
     *
     * @param subnets the subnets
     * @return the InstanceGroupPatch builder
     */
    public Builder subnets(List<SubnetIdentity> subnets) {
      this.subnets = subnets;
      return this;
    }
  }

  protected InstanceGroupPatch(Builder builder) {
    applicationPort = builder.applicationPort;
    instanceTemplate = builder.instanceTemplate;
    loadBalancer = builder.loadBalancer;
    loadBalancerPool = builder.loadBalancerPool;
    membershipCount = builder.membershipCount;
    name = builder.name;
    subnets = builder.subnets;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the loadBalancer.
   *
   * The load balancer that the load balancer pool used by this group
   * is in. Required when using a load balancer pool.
   *
   * @return the loadBalancer
   */
  public LoadBalancerIdentity loadBalancer() {
    return loadBalancer;
  }

  /**
   * Gets the loadBalancerPool.
   *
   * If specified, the load balancer pool will be managed by this
   * group. Instances created by this group will have a new load
   * balancer pool member in that pool created. Must be used with
   * `application_port`.
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
   * The user-defined name for this instance group.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Construct a JSON merge-patch from the InstanceGroupPatch.
   *
   * Note that properties of the InstanceGroupPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceGroupPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

