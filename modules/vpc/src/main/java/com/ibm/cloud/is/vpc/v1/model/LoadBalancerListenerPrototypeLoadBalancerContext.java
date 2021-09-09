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
  protected String protocol;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean acceptProxyProtocol;
    private Long connectionLimit;
    private LoadBalancerPoolIdentityByName defaultPool;
    private Long port;
    private String protocol;

    private Builder(LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContext) {
      this.acceptProxyProtocol = loadBalancerListenerPrototypeLoadBalancerContext.acceptProxyProtocol;
      this.connectionLimit = loadBalancerListenerPrototypeLoadBalancerContext.connectionLimit;
      this.defaultPool = loadBalancerListenerPrototypeLoadBalancerContext.defaultPool;
      this.port = loadBalancerListenerPrototypeLoadBalancerContext.port;
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
     * @param port the port
     * @param protocol the protocol
     */
    public Builder(Long port, String protocol) {
      this.port = port;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    acceptProxyProtocol = builder.acceptProxyProtocol;
    connectionLimit = builder.connectionLimit;
    defaultPool = builder.defaultPool;
    port = builder.port;
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
   * The listener port number. Each listener in the load balancer must have a unique
   * `port` and `protocol` combination.
   *
   * @return the port
   */
  public Long port() {
    return port;
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

