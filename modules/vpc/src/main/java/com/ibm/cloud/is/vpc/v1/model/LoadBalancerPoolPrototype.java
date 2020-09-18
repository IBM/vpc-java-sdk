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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerPoolPrototype.
 */
public class LoadBalancerPoolPrototype extends GenericModel {

  /**
   * The load balancing algorithm.
   */
  public interface Algorithm {
    /** least_connections. */
    String LEAST_CONNECTIONS = "least_connections";
    /** round_robin. */
    String ROUND_ROBIN = "round_robin";
    /** weighted_round_robin. */
    String WEIGHTED_ROUND_ROBIN = "weighted_round_robin";
  }

  /**
   * The protocol used for this load balancer pool.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the pool on which the
   * unexpected property value was encountered.
   */
  public interface Protocol {
    /** http. */
    String HTTP = "http";
    /** tcp. */
    String TCP = "tcp";
    /** https. */
    String HTTPS = "https";
  }

  protected String name;
  protected String algorithm;
  protected String protocol;
  @SerializedName("health_monitor")
  protected LoadBalancerPoolHealthMonitorPrototype healthMonitor;
  protected List<LoadBalancerPoolMemberPrototype> members;
  @SerializedName("session_persistence")
  protected LoadBalancerPoolSessionPersistencePrototype sessionPersistence;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String algorithm;
    private String protocol;
    private LoadBalancerPoolHealthMonitorPrototype healthMonitor;
    private List<LoadBalancerPoolMemberPrototype> members;
    private LoadBalancerPoolSessionPersistencePrototype sessionPersistence;

    private Builder(LoadBalancerPoolPrototype loadBalancerPoolPrototype) {
      this.name = loadBalancerPoolPrototype.name;
      this.algorithm = loadBalancerPoolPrototype.algorithm;
      this.protocol = loadBalancerPoolPrototype.protocol;
      this.healthMonitor = loadBalancerPoolPrototype.healthMonitor;
      this.members = loadBalancerPoolPrototype.members;
      this.sessionPersistence = loadBalancerPoolPrototype.sessionPersistence;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param algorithm the algorithm
     * @param protocol the protocol
     * @param healthMonitor the healthMonitor
     */
    public Builder(String algorithm, String protocol, LoadBalancerPoolHealthMonitorPrototype healthMonitor) {
      this.algorithm = algorithm;
      this.protocol = protocol;
      this.healthMonitor = healthMonitor;
    }

    /**
     * Builds a LoadBalancerPoolPrototype.
     *
     * @return the new LoadBalancerPoolPrototype instance
     */
    public LoadBalancerPoolPrototype build() {
      return new LoadBalancerPoolPrototype(this);
    }

    /**
     * Adds an members to members.
     *
     * @param members the new members
     * @return the LoadBalancerPoolPrototype builder
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
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerPoolPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the algorithm.
     *
     * @param algorithm the algorithm
     * @return the LoadBalancerPoolPrototype builder
     */
    public Builder algorithm(String algorithm) {
      this.algorithm = algorithm;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the LoadBalancerPoolPrototype builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the healthMonitor.
     *
     * @param healthMonitor the healthMonitor
     * @return the LoadBalancerPoolPrototype builder
     */
    public Builder healthMonitor(LoadBalancerPoolHealthMonitorPrototype healthMonitor) {
      this.healthMonitor = healthMonitor;
      return this;
    }

    /**
     * Set the members.
     * Existing members will be replaced.
     *
     * @param members the members
     * @return the LoadBalancerPoolPrototype builder
     */
    public Builder members(List<LoadBalancerPoolMemberPrototype> members) {
      this.members = members;
      return this;
    }

    /**
     * Set the sessionPersistence.
     *
     * @param sessionPersistence the sessionPersistence
     * @return the LoadBalancerPoolPrototype builder
     */
    public Builder sessionPersistence(LoadBalancerPoolSessionPersistencePrototype sessionPersistence) {
      this.sessionPersistence = sessionPersistence;
      return this;
    }
  }

  protected LoadBalancerPoolPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.algorithm,
      "algorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.healthMonitor,
      "healthMonitor cannot be null");
    name = builder.name;
    algorithm = builder.algorithm;
    protocol = builder.protocol;
    healthMonitor = builder.healthMonitor;
    members = builder.members;
    sessionPersistence = builder.sessionPersistence;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this load balancer pool. If unspecified, the name will be a hyphenated list of
   * randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the algorithm.
   *
   * The load balancing algorithm.
   *
   * @return the algorithm
   */
  public String algorithm() {
    return algorithm;
  }

  /**
   * Gets the protocol.
   *
   * The protocol used for this load balancer pool.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the pool on which the
   * unexpected property value was encountered.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the healthMonitor.
   *
   * The health monitor of this pool.
   *
   * @return the healthMonitor
   */
  public LoadBalancerPoolHealthMonitorPrototype healthMonitor() {
    return healthMonitor;
  }

  /**
   * Gets the members.
   *
   * The members for this load balancer pool. For load balancers in the `network` family, the same `port` and `target`
   * tuple cannot be shared by a member of any other load balancer.
   *
   * @return the members
   */
  public List<LoadBalancerPoolMemberPrototype> members() {
    return members;
  }

  /**
   * Gets the sessionPersistence.
   *
   * The session persistence of this pool.
   *
   * @return the sessionPersistence
   */
  public LoadBalancerPoolSessionPersistencePrototype sessionPersistence() {
    return sessionPersistence;
  }
}

