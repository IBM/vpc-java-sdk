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
 * The createLoadBalancerListener options.
 */
public class CreateLoadBalancerListenerOptions extends GenericModel {

  /**
   * The listener protocol. Each listener in the load balancer must have a non-overlapping port range and `protocol`
   * combination.
   *
   * Load balancers in the `network` family support `tcp` and `udp` (if `udp_supported` is `true`). Load balancers in
   * the `application` family support `tcp`, `http` and
   * `https`.
   *
   * Additional restrictions:
   * - If `default_pool` is set, the pool's protocol must match, or be compatible with
   *   the listener's protocol. At present, the compatible protocols are `http` and
   *   `https`.
   * - If `https_redirect` is set, the protocol must be `http`.
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

  protected String loadBalancerId;
  protected String protocol;
  protected Boolean acceptProxyProtocol;
  protected CertificateInstanceIdentity certificateInstance;
  protected Long connectionLimit;
  protected LoadBalancerPoolIdentity defaultPool;
  protected LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect;
  protected Long idleConnectionTimeout;
  protected List<LoadBalancerListenerPolicyPrototype> policies;
  protected Long port;
  protected Long portMax;
  protected Long portMin;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String protocol;
    private Boolean acceptProxyProtocol;
    private CertificateInstanceIdentity certificateInstance;
    private Long connectionLimit;
    private LoadBalancerPoolIdentity defaultPool;
    private LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect;
    private Long idleConnectionTimeout;
    private List<LoadBalancerListenerPolicyPrototype> policies;
    private Long port;
    private Long portMax;
    private Long portMin;

    /**
     * Instantiates a new Builder from an existing CreateLoadBalancerListenerOptions instance.
     *
     * @param createLoadBalancerListenerOptions the instance to initialize the Builder with
     */
    private Builder(CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions) {
      this.loadBalancerId = createLoadBalancerListenerOptions.loadBalancerId;
      this.protocol = createLoadBalancerListenerOptions.protocol;
      this.acceptProxyProtocol = createLoadBalancerListenerOptions.acceptProxyProtocol;
      this.certificateInstance = createLoadBalancerListenerOptions.certificateInstance;
      this.connectionLimit = createLoadBalancerListenerOptions.connectionLimit;
      this.defaultPool = createLoadBalancerListenerOptions.defaultPool;
      this.httpsRedirect = createLoadBalancerListenerOptions.httpsRedirect;
      this.idleConnectionTimeout = createLoadBalancerListenerOptions.idleConnectionTimeout;
      this.policies = createLoadBalancerListenerOptions.policies;
      this.port = createLoadBalancerListenerOptions.port;
      this.portMax = createLoadBalancerListenerOptions.portMax;
      this.portMin = createLoadBalancerListenerOptions.portMin;
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
     * @param protocol the protocol
     */
    public Builder(String loadBalancerId, String protocol) {
      this.loadBalancerId = loadBalancerId;
      this.protocol = protocol;
    }

    /**
     * Builds a CreateLoadBalancerListenerOptions.
     *
     * @return the new CreateLoadBalancerListenerOptions instance
     */
    public CreateLoadBalancerListenerOptions build() {
      return new CreateLoadBalancerListenerOptions(this);
    }

    /**
     * Adds a new element to policies.
     *
     * @param policies the new element to be added
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder addPolicies(LoadBalancerListenerPolicyPrototype policies) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(policies,
        "policies cannot be null");
      if (this.policies == null) {
        this.policies = new ArrayList<LoadBalancerListenerPolicyPrototype>();
      }
      this.policies.add(policies);
      return this;
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the acceptProxyProtocol.
     *
     * @param acceptProxyProtocol the acceptProxyProtocol
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder acceptProxyProtocol(Boolean acceptProxyProtocol) {
      this.acceptProxyProtocol = acceptProxyProtocol;
      return this;
    }

    /**
     * Set the certificateInstance.
     *
     * @param certificateInstance the certificateInstance
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder certificateInstance(CertificateInstanceIdentity certificateInstance) {
      this.certificateInstance = certificateInstance;
      return this;
    }

    /**
     * Set the connectionLimit.
     *
     * @param connectionLimit the connectionLimit
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder connectionLimit(long connectionLimit) {
      this.connectionLimit = connectionLimit;
      return this;
    }

    /**
     * Set the defaultPool.
     *
     * @param defaultPool the defaultPool
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder defaultPool(LoadBalancerPoolIdentity defaultPool) {
      this.defaultPool = defaultPool;
      return this;
    }

    /**
     * Set the httpsRedirect.
     *
     * @param httpsRedirect the httpsRedirect
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder httpsRedirect(LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect) {
      this.httpsRedirect = httpsRedirect;
      return this;
    }

    /**
     * Set the idleConnectionTimeout.
     *
     * @param idleConnectionTimeout the idleConnectionTimeout
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder idleConnectionTimeout(long idleConnectionTimeout) {
      this.idleConnectionTimeout = idleConnectionTimeout;
      return this;
    }

    /**
     * Set the policies.
     * Existing policies will be replaced.
     *
     * @param policies the policies
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder policies(List<LoadBalancerListenerPolicyPrototype> policies) {
      this.policies = policies;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the portMax.
     *
     * @param portMax the portMax
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder portMax(long portMax) {
      this.portMax = portMax;
      return this;
    }

    /**
     * Set the portMin.
     *
     * @param portMin the portMin
     * @return the CreateLoadBalancerListenerOptions builder
     */
    public Builder portMin(long portMin) {
      this.portMin = portMin;
      return this;
    }
  }

  protected CreateLoadBalancerListenerOptions() { }

  protected CreateLoadBalancerListenerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    loadBalancerId = builder.loadBalancerId;
    protocol = builder.protocol;
    acceptProxyProtocol = builder.acceptProxyProtocol;
    certificateInstance = builder.certificateInstance;
    connectionLimit = builder.connectionLimit;
    defaultPool = builder.defaultPool;
    httpsRedirect = builder.httpsRedirect;
    idleConnectionTimeout = builder.idleConnectionTimeout;
    policies = builder.policies;
    port = builder.port;
    portMax = builder.portMax;
    portMin = builder.portMin;
  }

  /**
   * New builder.
   *
   * @return a CreateLoadBalancerListenerOptions builder
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
   * Gets the protocol.
   *
   * The listener protocol. Each listener in the load balancer must have a non-overlapping port range and `protocol`
   * combination.
   *
   * Load balancers in the `network` family support `tcp` and `udp` (if `udp_supported` is `true`). Load balancers in
   * the `application` family support `tcp`, `http` and
   * `https`.
   *
   * Additional restrictions:
   * - If `default_pool` is set, the pool's protocol must match, or be compatible with
   *   the listener's protocol. At present, the compatible protocols are `http` and
   *   `https`.
   * - If `https_redirect` is set, the protocol must be `http`.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the acceptProxyProtocol.
   *
   * If set to `true`, this listener will accept and forward PROXY protocol information. Supported by load balancers in
   * the `application` family (otherwise always `false`). Additional restrictions:
   * - If this listener has `https_redirect` specified, its `accept_proxy_protocol` value must
   *   match the `accept_proxy_protocol` value of the `https_redirect` listener.
   * - If this listener is the target of another listener's `https_redirect`, its
   *   `accept_proxy_protocol` value must match that listener's `accept_proxy_protocol` value.
   *
   * @return the acceptProxyProtocol
   */
  public Boolean acceptProxyProtocol() {
    return acceptProxyProtocol;
  }

  /**
   * Gets the certificateInstance.
   *
   * The certificate instance to use for SSL termination. The listener must have a
   * `protocol` of `https`.
   *
   * @return the certificateInstance
   */
  public CertificateInstanceIdentity certificateInstance() {
    return certificateInstance;
  }

  /**
   * Gets the connectionLimit.
   *
   * The concurrent connection limit for the listener. If reached, incoming connections may be queued or rejected.
   *
   * Supported for load balancers in the `application` family.
   *
   * If unspecified, the limit will be `15000` for load balancers in the `application` family.
   *
   * @return the connectionLimit
   */
  public Long connectionLimit() {
    return connectionLimit;
  }

  /**
   * Gets the defaultPool.
   *
   * The default pool for this listener. If `https_redirect` is specified, the
   * default pool will not be used.
   * If specified, the pool must:
   *
   * - Belong to this load balancer.
   * - Have the same `protocol` as this listener, or have a compatible protocol.
   *   At present, the compatible protocols are `http` and `https`.
   * - Not already be the `default_pool` for another listener.
   *
   * If unspecified, this listener will be created with no default pool, but one may be
   * subsequently set.
   *
   * @return the defaultPool
   */
  public LoadBalancerPoolIdentity defaultPool() {
    return defaultPool;
  }

  /**
   * Gets the httpsRedirect.
   *
   * The target listener that requests will be redirected to if none of the listener's
   * `policies` match.
   *
   * If specified, this listener must have a `protocol` of `http`, and the target
   * listener must have a `protocol` of `https`.
   *
   * @return the httpsRedirect
   */
  public LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect() {
    return httpsRedirect;
  }

  /**
   * Gets the idleConnectionTimeout.
   *
   * The idle connection timeout of the listener in seconds.
   *
   * Supported for load balancers in the `application` family.
   *
   * If unspecified, the timeout will be `50` for load balancers in the `application` family.
   *
   * @return the idleConnectionTimeout
   */
  public Long idleConnectionTimeout() {
    return idleConnectionTimeout;
  }

  /**
   * Gets the policies.
   *
   * The policy prototype objects for this listener. The load balancer must be in the
   * `application` family.
   *
   * @return the policies
   */
  public List<LoadBalancerListenerPolicyPrototype> policies() {
    return policies;
  }

  /**
   * Gets the port.
   *
   * The listener port number. Each listener in the load balancer must have a non-overlapping port range and `protocol`
   * combination.
   *
   * If `port_min` is also specified, `port` must have the same value as `port_min`.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the portMax.
   *
   * The inclusive upper bound of the range of ports used by this listener. Must not be less than `port_min`.
   *
   * Only load balancers with route mode enabled, or network load balancers with
   * `is_public` or `is_private_path` set to `true` support different values for `port_min` and `port_max`. When route
   * mode is enabled, `65535` must be specified.
   *
   * The specified port range must not overlap with port ranges used by other listeners for this load balancer using the
   * same protocol.
   *
   * @return the portMax
   */
  public Long portMax() {
    return portMax;
  }

  /**
   * Gets the portMin.
   *
   * The inclusive lower bound of the range of ports used by this listener. Must not be greater than `port_max`.
   *
   * If specified, `port_max` must also be specified, and must not be smaller. If unspecified, `port_max` must also be
   * unspecified.
   *
   * If `port` is also specified, `port_min` must have the same value as `port`.
   *
   * Only load balancers with route mode enabled, or network load balancers with
   * `is_public` or `is_private_path` set to `true` support different values for `port_min` and `port_max`. When route
   * mode is enabled, `1` must be specified.
   *
   * The specified port range must not overlap with port ranges used by other listeners for this load balancer using the
   * same protocol.
   *
   * @return the portMin
   */
  public Long portMin() {
    return portMin;
  }
}

