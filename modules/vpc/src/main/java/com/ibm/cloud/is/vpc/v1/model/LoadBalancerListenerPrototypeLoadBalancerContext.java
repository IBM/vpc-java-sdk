/*
 * (C) Copyright IBM Corp. 2021.
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
   * The listener protocol. Load balancers in the `network` family support `tcp`. Load balancers in the `application`
   * family support `tcp`, `http`, and `https`. Each listener in the load balancer must have a unique `port` and
   * `protocol` combination.
   */
  public interface Protocol {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
    /** tcp. */
    String TCP = "tcp";
  }

  @SerializedName("accept_proxy_protocol")
  protected Boolean acceptProxyProtocol;
  @SerializedName("connection_limit")
  protected Long connectionLimit;
  @SerializedName("default_pool")
  protected LoadBalancerPoolIdentityByName defaultPool;
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
    private Long connectionLimit;
    private LoadBalancerPoolIdentityByName defaultPool;
    private Long port;
    private Long portMax;
    private Long portMin;
    private String protocol;

    private Builder(LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContext) {
      this.acceptProxyProtocol = loadBalancerListenerPrototypeLoadBalancerContext.acceptProxyProtocol;
      this.connectionLimit = loadBalancerListenerPrototypeLoadBalancerContext.connectionLimit;
      this.defaultPool = loadBalancerListenerPrototypeLoadBalancerContext.defaultPool;
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

  protected LoadBalancerListenerPrototypeLoadBalancerContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    acceptProxyProtocol = builder.acceptProxyProtocol;
    connectionLimit = builder.connectionLimit;
    defaultPool = builder.defaultPool;
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
   * The default pool associated with the listener.
   *
   * @return the defaultPool
   */
  public LoadBalancerPoolIdentityByName defaultPool() {
    return defaultPool;
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
   * At present, only load balancers operating with route mode enabled support different values for `port_min` and
   * `port_max`.  When route mode is enabled, only a value of
   * `65535` is supported for `port_max`.
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
   * At present, only load balancers operating with route mode enabled support different values for `port_min` and
   * `port_max`.  When route mode is enabled, only a value of
   * `1` is supported for `port_min`.
   *
   * @return the portMin
   */
  public Long portMin() {
    return portMin;
  }

  /**
   * Gets the protocol.
   *
   * The listener protocol. Load balancers in the `network` family support `tcp`. Load balancers in the `application`
   * family support `tcp`, `http`, and `https`. Each listener in the load balancer must have a unique `port` and
   * `protocol` combination.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }
}

