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
 * The createLoadBalancerListener options.
 */
public class CreateLoadBalancerListenerOptions extends GenericModel {

  /**
   * The listener protocol. Each listener in the load balancer must have a unique `port` and `protocol` combination.
   * Additional restrictions:
   * - If this load balancer is in the `network` family:
   *   - The protocol must be `tcp` or `udp` (if `udp_supported` is `true`).
   *   - If `default_pool` is set, the pool protocol must match.
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
    private List<LoadBalancerListenerPolicyPrototype> policies;
    private Long port;
    private Long portMax;
    private Long portMin;

    private Builder(CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions) {
      this.loadBalancerId = createLoadBalancerListenerOptions.loadBalancerId;
      this.protocol = createLoadBalancerListenerOptions.protocol;
      this.acceptProxyProtocol = createLoadBalancerListenerOptions.acceptProxyProtocol;
      this.certificateInstance = createLoadBalancerListenerOptions.certificateInstance;
      this.connectionLimit = createLoadBalancerListenerOptions.connectionLimit;
      this.defaultPool = createLoadBalancerListenerOptions.defaultPool;
      this.httpsRedirect = createLoadBalancerListenerOptions.httpsRedirect;
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
     * Adds an policies to policies.
     *
     * @param policies the new policies
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
   * The listener protocol. Each listener in the load balancer must have a unique `port` and `protocol` combination.
   * Additional restrictions:
   * - If this load balancer is in the `network` family:
   *   - The protocol must be `tcp` or `udp` (if `udp_supported` is `true`).
   *   - If `default_pool` is set, the pool protocol must match.
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
   * The certificate instance used for SSL termination. It is applicable only to `https`
   * protocol.
   *
   * @return the certificateInstance
   */
  public CertificateInstanceIdentity certificateInstance() {
    return certificateInstance;
  }

  /**
   * Gets the connectionLimit.
   *
   * The connection limit of the listener.
   *
   * @return the connectionLimit
   */
  public Long connectionLimit() {
    return connectionLimit;
  }

  /**
   * Gets the defaultPool.
   *
   * The default pool for this listener. The specified pool must:
   *
   * - Belong to this load balancer
   * - Have the same `protocol` as this listener, or have a compatible protocol.
   *   At present, the compatible protocols are `http` and `https`.
   * - Not already be the `default_pool` for another listener.
   *
   * @return the defaultPool
   */
  public LoadBalancerPoolIdentity defaultPool() {
    return defaultPool;
  }

  /**
   * Gets the httpsRedirect.
   *
   * The target listener that requests will be redirected to. This listener must have a
   * `protocol` of `http`, and the target listener must have a `protocol` of `https`.
   *
   * @return the httpsRedirect
   */
  public LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect() {
    return httpsRedirect;
  }

  /**
   * Gets the policies.
   *
   * The policy prototype objects for this listener.
   *
   * @return the policies
   */
  public List<LoadBalancerListenerPolicyPrototype> policies() {
    return policies;
  }

  /**
   * Gets the port.
   *
   * The listener port number, or the inclusive lower bound of the port range. Each listener in the load balancer must
   * have a unique `port` and `protocol` combination.
   *
   * Not supported for load balancers operating with route mode enabled.
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
   * At present, only load balancers operating with route mode enabled, and public load balancers in the `network`
   * family support different values for `port_min` and
   * `port_max`. When route mode is enabled, the value `65535` must be specified.
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
   * At present, only load balancers operating with route mode enabled, and public load balancers in the `network`
   * family support different values for `port_min` and
   * `port_max`. When route mode is enabled, the value `1` must be specified.
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

