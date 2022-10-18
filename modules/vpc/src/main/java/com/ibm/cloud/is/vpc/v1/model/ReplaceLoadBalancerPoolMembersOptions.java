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
 * The replaceLoadBalancerPoolMembers options.
 */
public class ReplaceLoadBalancerPoolMembersOptions extends GenericModel {

  protected String loadBalancerId;
  protected String poolId;
  protected List<LoadBalancerPoolMemberPrototype> members;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String poolId;
    private List<LoadBalancerPoolMemberPrototype> members;

    /**
     * Instantiates a new Builder from an existing ReplaceLoadBalancerPoolMembersOptions instance.
     *
     * @param replaceLoadBalancerPoolMembersOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptions) {
      this.loadBalancerId = replaceLoadBalancerPoolMembersOptions.loadBalancerId;
      this.poolId = replaceLoadBalancerPoolMembersOptions.poolId;
      this.members = replaceLoadBalancerPoolMembersOptions.members;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param loadBalancerId the loadBalancerId
     * @param poolId the poolId
     * @param members the members
     */
    public Builder(String loadBalancerId, String poolId, List<LoadBalancerPoolMemberPrototype> members) {
      this.loadBalancerId = loadBalancerId;
      this.poolId = poolId;
      this.members = members;
    }

    /**
     * Builds a ReplaceLoadBalancerPoolMembersOptions.
     *
     * @return the new ReplaceLoadBalancerPoolMembersOptions instance
     */
    public ReplaceLoadBalancerPoolMembersOptions build() {
      return new ReplaceLoadBalancerPoolMembersOptions(this);
    }

    /**
     * Adds an members to members.
     *
     * @param members the new members
     * @return the ReplaceLoadBalancerPoolMembersOptions builder
     */
    public Builder addMembers(LoadBalancerPoolMemberPrototype members) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(members,
        "members cannot be null");
      if (this.members == null) {
        this.members = new ArrayList<LoadBalancerPoolMemberPrototype>();
      }
      this.members.add(members);
      return this;
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the ReplaceLoadBalancerPoolMembersOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the poolId.
     *
     * @param poolId the poolId
     * @return the ReplaceLoadBalancerPoolMembersOptions builder
     */
    public Builder poolId(String poolId) {
      this.poolId = poolId;
      return this;
    }

    /**
     * Set the members.
     * Existing members will be replaced.
     *
     * @param members the members
     * @return the ReplaceLoadBalancerPoolMembersOptions builder
     */
    public Builder members(List<LoadBalancerPoolMemberPrototype> members) {
      this.members = members;
      return this;
    }
  }

  protected ReplaceLoadBalancerPoolMembersOptions() { }

  protected ReplaceLoadBalancerPoolMembersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.poolId,
      "poolId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.members,
      "members cannot be null");
    loadBalancerId = builder.loadBalancerId;
    poolId = builder.poolId;
    members = builder.members;
  }

  /**
   * New builder.
   *
   * @return a ReplaceLoadBalancerPoolMembersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the loadBalancerId.
   *
   * The load balancer identifier.
   *
   * @return the loadBalancerId
   */
  public String loadBalancerId() {
    return loadBalancerId;
  }

  /**
   * Gets the poolId.
   *
   * The pool identifier.
   *
   * @return the poolId
   */
  public String poolId() {
    return poolId;
  }

  /**
   * Gets the members.
   *
   * The member prototype objects for this pool.
   *
   * @return the members
   */
  public List<LoadBalancerPoolMemberPrototype> members() {
    return members;
  }
}

