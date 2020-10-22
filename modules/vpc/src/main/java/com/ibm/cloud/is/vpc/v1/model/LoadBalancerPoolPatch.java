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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * LoadBalancerPoolPatch.
 */
public class LoadBalancerPoolPatch extends GenericModel {

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
  protected LoadBalancerPoolHealthMonitorPatch healthMonitor;
  @SerializedName("session_persistence")
  protected LoadBalancerPoolSessionPersistencePatch sessionPersistence;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String algorithm;
    private String protocol;
    private LoadBalancerPoolHealthMonitorPatch healthMonitor;
    private LoadBalancerPoolSessionPersistencePatch sessionPersistence;

    private Builder(LoadBalancerPoolPatch loadBalancerPoolPatch) {
      this.name = loadBalancerPoolPatch.name;
      this.algorithm = loadBalancerPoolPatch.algorithm;
      this.protocol = loadBalancerPoolPatch.protocol;
      this.healthMonitor = loadBalancerPoolPatch.healthMonitor;
      this.sessionPersistence = loadBalancerPoolPatch.sessionPersistence;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolPatch.
     *
     * @return the new LoadBalancerPoolPatch instance
     */
    public LoadBalancerPoolPatch build() {
      return new LoadBalancerPoolPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerPoolPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the algorithm.
     *
     * @param algorithm the algorithm
     * @return the LoadBalancerPoolPatch builder
     */
    public Builder algorithm(String algorithm) {
      this.algorithm = algorithm;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the LoadBalancerPoolPatch builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the healthMonitor.
     *
     * @param healthMonitor the healthMonitor
     * @return the LoadBalancerPoolPatch builder
     */
    public Builder healthMonitor(LoadBalancerPoolHealthMonitorPatch healthMonitor) {
      this.healthMonitor = healthMonitor;
      return this;
    }

    /**
     * Set the sessionPersistence.
     *
     * @param sessionPersistence the sessionPersistence
     * @return the LoadBalancerPoolPatch builder
     */
    public Builder sessionPersistence(LoadBalancerPoolSessionPersistencePatch sessionPersistence) {
      this.sessionPersistence = sessionPersistence;
      return this;
    }
  }

  protected LoadBalancerPoolPatch(Builder builder) {
    name = builder.name;
    algorithm = builder.algorithm;
    protocol = builder.protocol;
    healthMonitor = builder.healthMonitor;
    sessionPersistence = builder.sessionPersistence;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Construct a JSON merge-patch from the LoadBalancerPoolPatch.
   *
   * Note that properties of the LoadBalancerPoolPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the LoadBalancerPoolPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}
