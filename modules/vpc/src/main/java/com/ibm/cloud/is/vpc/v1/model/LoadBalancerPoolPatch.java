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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * LoadBalancerPoolPatch.
 */
public class LoadBalancerPoolPatch extends GenericModel {

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
   * The protocol for this load balancer pool.
   *
   * Load balancers in the `network` family support `tcp` and `udp` (if `udp_supported` is `true`). Load balancers in
   * the `application` family support `tcp`, `http` and
   * `https`.
   *
   * If this pool is associated with a load balancer listener or a load balancer failsafe target pool, the specified
   * protocol must match or be compatible with each other's protocol. At present, the compatible protocols are `http`
   * and `https`.
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
  @SerializedName("failsafe_policy")
  protected LoadBalancerPoolFailsafePolicyPatch failsafePolicy;
  @SerializedName("health_monitor")
  protected LoadBalancerPoolHealthMonitorPatch healthMonitor;
  protected String name;
  protected String protocol;
  @SerializedName("proxy_protocol")
  protected String proxyProtocol;
  @SerializedName("session_persistence")
  protected LoadBalancerPoolSessionPersistencePatch sessionPersistence;

  /**
   * Builder.
   */
  public static class Builder {
    private String algorithm;
    private LoadBalancerPoolFailsafePolicyPatch failsafePolicy;
    private LoadBalancerPoolHealthMonitorPatch healthMonitor;
    private String name;
    private String protocol;
    private String proxyProtocol;
    private LoadBalancerPoolSessionPersistencePatch sessionPersistence;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolPatch instance.
     *
     * @param loadBalancerPoolPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolPatch loadBalancerPoolPatch) {
      this.algorithm = loadBalancerPoolPatch.algorithm;
      this.failsafePolicy = loadBalancerPoolPatch.failsafePolicy;
      this.healthMonitor = loadBalancerPoolPatch.healthMonitor;
      this.name = loadBalancerPoolPatch.name;
      this.protocol = loadBalancerPoolPatch.protocol;
      this.proxyProtocol = loadBalancerPoolPatch.proxyProtocol;
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
     * Set the failsafePolicy.
     *
     * @param failsafePolicy the failsafePolicy
     * @return the LoadBalancerPoolPatch builder
     */
    public Builder failsafePolicy(LoadBalancerPoolFailsafePolicyPatch failsafePolicy) {
      this.failsafePolicy = failsafePolicy;
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
     * Set the proxyProtocol.
     *
     * @param proxyProtocol the proxyProtocol
     * @return the LoadBalancerPoolPatch builder
     */
    public Builder proxyProtocol(String proxyProtocol) {
      this.proxyProtocol = proxyProtocol;
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

  protected LoadBalancerPoolPatch() { }

  protected LoadBalancerPoolPatch(Builder builder) {
    algorithm = builder.algorithm;
    failsafePolicy = builder.failsafePolicy;
    healthMonitor = builder.healthMonitor;
    name = builder.name;
    protocol = builder.protocol;
    proxyProtocol = builder.proxyProtocol;
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
   * Gets the failsafePolicy.
   *
   * The failsafe policy for this load balancer pool.
   *
   * @return the failsafePolicy
   */
  public LoadBalancerPoolFailsafePolicyPatch failsafePolicy() {
    return failsafePolicy;
  }

  /**
   * Gets the healthMonitor.
   *
   * The health monitor of this pool.
   *
   * If this pool has a member targeting a load balancer then:
   *
   * - If the targeted load balancer has multiple subnets, this health monitor will be
   *   used to direct traffic to the available subnets.
   * - The health checks spawned by this health monitor will be handled as any other
   *   traffic (that is, subject to the configuration of listeners and pools on the
   *   target load balancer).
   * - This health monitor does not affect how pool member health is determined within
   *   the target load balancer.
   *
   * For more information, see [Private Path network load balancer frequently asked
   * questions](https://cloud.ibm.com/docs/vpc?topic=vpc-nlb-faqs#ppnlb-faqs).
   *
   * @return the healthMonitor
   */
  public LoadBalancerPoolHealthMonitorPatch healthMonitor() {
    return healthMonitor;
  }

  /**
   * Gets the name.
   *
   * The name for this load balancer pool. The name must not be used by another pool for the load balancer.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The protocol for this load balancer pool.
   *
   * Load balancers in the `network` family support `tcp` and `udp` (if `udp_supported` is `true`). Load balancers in
   * the `application` family support `tcp`, `http` and
   * `https`.
   *
   * If this pool is associated with a load balancer listener or a load balancer failsafe target pool, the specified
   * protocol must match or be compatible with each other's protocol. At present, the compatible protocols are `http`
   * and `https`.
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

