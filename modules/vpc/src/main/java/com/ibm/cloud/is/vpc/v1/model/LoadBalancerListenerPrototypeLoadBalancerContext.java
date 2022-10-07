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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPrototypeLoadBalancerContext.
 */
public class LoadBalancerListenerPrototypeLoadBalancerContext extends GenericModel {

  /**
   * The listener protocol. Each listener in the load balancer must have a unique `port` and `protocol` combination.
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

  @SerializedName("accept_proxy_protocol")
  protected Boolean acceptProxyProtocol;
  @SerializedName("certificate_instance")
  protected CertificateInstanceIdentity certificateInstance;
  @SerializedName("connection_limit")
  protected Long connectionLimit;
  @SerializedName("default_pool")
  protected LoadBalancerPoolIdentityByName defaultPool;
  @SerializedName("https_redirect")
  protected LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect;
  protected Long port;
  @SerializedName("port_max")
  protected Long portMax;
  @SerializedName("port_min")
  protected Long portMin;
  protected String protocol;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean acceptProxyProtocol;
    private CertificateInstanceIdentity certificateInstance;
    private Long connectionLimit;
    private LoadBalancerPoolIdentityByName defaultPool;
    private LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect;
    private Long port;
    private Long portMax;
    private Long portMin;
    private String protocol;

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerPrototypeLoadBalancerContext instance.
     *
     * @param loadBalancerListenerPrototypeLoadBalancerContext the instance to initialize the Builder with
     */
    private Builder(LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContext) {
      this.acceptProxyProtocol = loadBalancerListenerPrototypeLoadBalancerContext.acceptProxyProtocol;
      this.certificateInstance = loadBalancerListenerPrototypeLoadBalancerContext.certificateInstance;
      this.connectionLimit = loadBalancerListenerPrototypeLoadBalancerContext.connectionLimit;
      this.defaultPool = loadBalancerListenerPrototypeLoadBalancerContext.defaultPool;
      this.httpsRedirect = loadBalancerListenerPrototypeLoadBalancerContext.httpsRedirect;
      this.port = loadBalancerListenerPrototypeLoadBalancerContext.port;
      this.portMax = loadBalancerListenerPrototypeLoadBalancerContext.portMax;
      this.portMin = loadBalancerListenerPrototypeLoadBalancerContext.portMin;
      this.protocol = loadBalancerListenerPrototypeLoadBalancerContext.protocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param protocol the protocol
     */
    public Builder(String protocol) {
      this.protocol = protocol;
    }

    /**
     * Builds a LoadBalancerListenerPrototypeLoadBalancerContext.
     *
     * @return the new LoadBalancerListenerPrototypeLoadBalancerContext instance
     */
    public LoadBalancerListenerPrototypeLoadBalancerContext build() {
      return new LoadBalancerListenerPrototypeLoadBalancerContext(this);
    }

    /**
     * Set the acceptProxyProtocol.
     *
     * @param acceptProxyProtocol the acceptProxyProtocol
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder acceptProxyProtocol(Boolean acceptProxyProtocol) {
      this.acceptProxyProtocol = acceptProxyProtocol;
      return this;
    }

    /**
     * Set the certificateInstance.
     *
     * @param certificateInstance the certificateInstance
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder certificateInstance(CertificateInstanceIdentity certificateInstance) {
      this.certificateInstance = certificateInstance;
      return this;
    }

    /**
     * Set the connectionLimit.
     *
     * @param connectionLimit the connectionLimit
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder connectionLimit(long connectionLimit) {
      this.connectionLimit = connectionLimit;
      return this;
    }

    /**
     * Set the defaultPool.
     *
     * @param defaultPool the defaultPool
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder defaultPool(LoadBalancerPoolIdentityByName defaultPool) {
      this.defaultPool = defaultPool;
      return this;
    }

    /**
     * Set the httpsRedirect.
     *
     * @param httpsRedirect the httpsRedirect
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder httpsRedirect(LoadBalancerListenerHTTPSRedirectPrototype httpsRedirect) {
      this.httpsRedirect = httpsRedirect;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the portMax.
     *
     * @param portMax the portMax
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder portMax(long portMax) {
      this.portMax = portMax;
      return this;
    }

    /**
     * Set the portMin.
     *
     * @param portMin the portMin
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder portMin(long portMin) {
      this.portMin = portMin;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the LoadBalancerListenerPrototypeLoadBalancerContext builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
  }

  protected LoadBalancerListenerPrototypeLoadBalancerContext() { }

  protected LoadBalancerListenerPrototypeLoadBalancerContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    acceptProxyProtocol = builder.acceptProxyProtocol;
    certificateInstance = builder.certificateInstance;
    connectionLimit = builder.connectionLimit;
    defaultPool = builder.defaultPool;
    httpsRedirect = builder.httpsRedirect;
    port = builder.port;
    portMax = builder.portMax;
    portMin = builder.portMin;
    protocol = builder.protocol;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPrototypeLoadBalancerContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * The default pool for this listener. If specified, the pool must:
   *   - Belong to this load balancer.
   *   - Have the same `protocol` as this listener, or have a compatible protocol.
   *     At present, the compatible protocols are `http` and `https`.
   *   - Not already be the `default_pool` for another listener.
   *
   * If unspecified, this listener will be created with no default pool, but one may be
   * subsequently set.
   *
   * @return the defaultPool
   */
  public LoadBalancerPoolIdentityByName defaultPool() {
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

  /**
   * Gets the protocol.
   *
   * The listener protocol. Each listener in the load balancer must have a unique `port` and `protocol` combination.
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
}

