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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerPoolPrototypeLoadBalancerContext.
 */
public class LoadBalancerPoolPrototypeLoadBalancerContext extends GenericModel {

  /**
   * The load balancing algorithm. The `least_connections` algorithm is only supported for load balancers that have
   * `availability` with value `subnet` in the profile.
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
   * The protocol used for this load balancer pool. Load balancers in the `network` family support `tcp` and `udp` (if
   * `udp_supported` is `true`). Load balancers in the
   * `application` family support `tcp`, `http`, and `https`.
   */
  public interface Protocol {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }

  /**
   * The PROXY protocol setting for this pool:
   * - `v1`: Enabled with version 1 (human-readable header format)
   * - `v2`: Enabled with version 2 (binary header format)
   * - `disabled`: Disabled
   *
   * For load balancers in the `network` family, this property must be `disabled`.
   */
  public interface ProxyProtocol {
    /** disabled. */
    String DISABLED = "disabled";
    /** v1. */
    String V1 = "v1";
    /** v2. */
    String V2 = "v2";
  }

  protected String algorithm;
  @SerializedName("health_monitor")
  protected LoadBalancerPoolHealthMonitorPrototype healthMonitor;
  protected List<LoadBalancerPoolMemberPrototype> members;
  protected String name;
  protected String protocol;
  @SerializedName("proxy_protocol")
  protected String proxyProtocol;
  @SerializedName("session_persistence")
  protected LoadBalancerPoolSessionPersistencePrototype sessionPersistence;

  /**
   * Builder.
   */
  public static class Builder {
    private String algorithm;
    private LoadBalancerPoolHealthMonitorPrototype healthMonitor;
    private List<LoadBalancerPoolMemberPrototype> members;
    private String name;
    private String protocol;
    private String proxyProtocol;
    private LoadBalancerPoolSessionPersistencePrototype sessionPersistence;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolPrototypeLoadBalancerContext instance.
     *
     * @param loadBalancerPoolPrototypeLoadBalancerContext the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolPrototypeLoadBalancerContext loadBalancerPoolPrototypeLoadBalancerContext) {
      this.algorithm = loadBalancerPoolPrototypeLoadBalancerContext.algorithm;
      this.healthMonitor = loadBalancerPoolPrototypeLoadBalancerContext.healthMonitor;
      this.members = loadBalancerPoolPrototypeLoadBalancerContext.members;
      this.name = loadBalancerPoolPrototypeLoadBalancerContext.name;
      this.protocol = loadBalancerPoolPrototypeLoadBalancerContext.protocol;
      this.proxyProtocol = loadBalancerPoolPrototypeLoadBalancerContext.proxyProtocol;
      this.sessionPersistence = loadBalancerPoolPrototypeLoadBalancerContext.sessionPersistence;
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
     * @param healthMonitor the healthMonitor
     * @param protocol the protocol
     */
    public Builder(String algorithm, LoadBalancerPoolHealthMonitorPrototype healthMonitor, String protocol) {
      this.algorithm = algorithm;
      this.healthMonitor = healthMonitor;
      this.protocol = protocol;
    }

    /**
     * Builds a LoadBalancerPoolPrototypeLoadBalancerContext.
     *
     * @return the new LoadBalancerPoolPrototypeLoadBalancerContext instance
     */
    public LoadBalancerPoolPrototypeLoadBalancerContext build() {
      return new LoadBalancerPoolPrototypeLoadBalancerContext(this);
    }

    /**
     * Adds a new element to members.
     *
     * @param members the new element to be added
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
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
     * Set the algorithm.
     *
     * @param algorithm the algorithm
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
     */
    public Builder algorithm(String algorithm) {
      this.algorithm = algorithm;
      return this;
    }

    /**
     * Set the healthMonitor.
     *
     * @param healthMonitor the healthMonitor
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
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
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
     */
    public Builder members(List<LoadBalancerPoolMemberPrototype> members) {
      this.members = members;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the proxyProtocol.
     *
     * @param proxyProtocol the proxyProtocol
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
     */
    public Builder proxyProtocol(String proxyProtocol) {
      this.proxyProtocol = proxyProtocol;
      return this;
    }

    /**
     * Set the sessionPersistence.
     *
     * @param sessionPersistence the sessionPersistence
     * @return the LoadBalancerPoolPrototypeLoadBalancerContext builder
     */
    public Builder sessionPersistence(LoadBalancerPoolSessionPersistencePrototype sessionPersistence) {
      this.sessionPersistence = sessionPersistence;
      return this;
    }
  }

  protected LoadBalancerPoolPrototypeLoadBalancerContext() { }

  protected LoadBalancerPoolPrototypeLoadBalancerContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.algorithm,
      "algorithm cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.healthMonitor,
      "healthMonitor cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    algorithm = builder.algorithm;
    healthMonitor = builder.healthMonitor;
    members = builder.members;
    name = builder.name;
    protocol = builder.protocol;
    proxyProtocol = builder.proxyProtocol;
    sessionPersistence = builder.sessionPersistence;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolPrototypeLoadBalancerContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the algorithm.
   *
   * The load balancing algorithm. The `least_connections` algorithm is only supported for load balancers that have
   * `availability` with value `subnet` in the profile.
   *
   * @return the algorithm
   */
  public String algorithm() {
    return algorithm;
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
   * tuple cannot be shared by a pool member of any other load balancer in the same VPC.
   *
   * @return the members
   */
  public List<LoadBalancerPoolMemberPrototype> members() {
    return members;
  }

  /**
   * Gets the name.
   *
   * The name for this load balancer pool. The name must not be used by another pool for the load balancer. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The protocol used for this load balancer pool. Load balancers in the `network` family support `tcp` and `udp` (if
   * `udp_supported` is `true`). Load balancers in the
   * `application` family support `tcp`, `http`, and `https`.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the proxyProtocol.
   *
   * The PROXY protocol setting for this pool:
   * - `v1`: Enabled with version 1 (human-readable header format)
   * - `v2`: Enabled with version 2 (binary header format)
   * - `disabled`: Disabled
   *
   * For load balancers in the `network` family, this property must be `disabled`.
   *
   * @return the proxyProtocol
   */
  public String proxyProtocol() {
    return proxyProtocol;
  }

  /**
   * Gets the sessionPersistence.
   *
   * The session persistence of this pool. If specified, the load balancer must have
   * `source_ip_session_persistence_supported` set to `true` in its profile.
   *
   * If unspecified, session persistence will be disabled, and traffic will be distributed
   * across members of the pool.
   *
   * @return the sessionPersistence
   */
  public LoadBalancerPoolSessionPersistencePrototype sessionPersistence() {
    return sessionPersistence;
  }
}

