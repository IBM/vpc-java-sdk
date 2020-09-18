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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateLoadBalancerPool options.
 */
public class UpdateLoadBalancerPoolOptions extends GenericModel {

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

  protected String loadBalancerId;
  protected String id;
  protected String name;
  protected String algorithm;
  protected String protocol;
  protected LoadBalancerPoolHealthMonitorPatch healthMonitor;
  protected LoadBalancerPoolSessionPersistencePatch sessionPersistence;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String id;
    private String name;
    private String algorithm;
    private String protocol;
    private LoadBalancerPoolHealthMonitorPatch healthMonitor;
    private LoadBalancerPoolSessionPersistencePatch sessionPersistence;

    private Builder(UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptions) {
      this.loadBalancerId = updateLoadBalancerPoolOptions.loadBalancerId;
      this.id = updateLoadBalancerPoolOptions.id;
      this.name = updateLoadBalancerPoolOptions.name;
      this.algorithm = updateLoadBalancerPoolOptions.algorithm;
      this.protocol = updateLoadBalancerPoolOptions.protocol;
      this.healthMonitor = updateLoadBalancerPoolOptions.healthMonitor;
      this.sessionPersistence = updateLoadBalancerPoolOptions.sessionPersistence;
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
     * @param id the id
     */
    public Builder(String loadBalancerId, String id) {
      this.loadBalancerId = loadBalancerId;
      this.id = id;
    }

    /**
     * Builds a UpdateLoadBalancerPoolOptions.
     *
     * @return the new UpdateLoadBalancerPoolOptions instance
     */
    public UpdateLoadBalancerPoolOptions build() {
      return new UpdateLoadBalancerPoolOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the algorithm.
     *
     * @param algorithm the algorithm
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder algorithm(String algorithm) {
      this.algorithm = algorithm;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the healthMonitor.
     *
     * @param healthMonitor the healthMonitor
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder healthMonitor(LoadBalancerPoolHealthMonitorPatch healthMonitor) {
      this.healthMonitor = healthMonitor;
      return this;
    }

    /**
     * Set the sessionPersistence.
     *
     * @param sessionPersistence the sessionPersistence
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder sessionPersistence(LoadBalancerPoolSessionPersistencePatch sessionPersistence) {
      this.sessionPersistence = sessionPersistence;
      return this;
    }
  }

  protected UpdateLoadBalancerPoolOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    id = builder.id;
    name = builder.name;
    algorithm = builder.algorithm;
    protocol = builder.protocol;
    healthMonitor = builder.healthMonitor;
    sessionPersistence = builder.sessionPersistence;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerPoolOptions builder
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
   * Gets the id.
   *
   * The pool identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this load balancer pool.
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
  public LoadBalancerPoolHealthMonitorPatch healthMonitor() {
    return healthMonitor;
  }

  /**
   * Gets the sessionPersistence.
   *
   * The session persistence of this pool.
   *
   * @return the sessionPersistence
   */
  public LoadBalancerPoolSessionPersistencePatch sessionPersistence() {
    return sessionPersistence;
  }
}

