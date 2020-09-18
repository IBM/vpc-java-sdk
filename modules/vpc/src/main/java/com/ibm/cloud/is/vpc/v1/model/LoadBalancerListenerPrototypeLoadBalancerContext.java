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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPrototypeLoadBalancerContext.
 */
public class LoadBalancerListenerPrototypeLoadBalancerContext extends GenericModel {

  /**
   * The listener protocol. Load balancers in the `network` family support `tcp`. Load balancers in the `application`
   * family support `tcp`, `http`, and `https`.
   */
  public interface Protocol {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
    /** tcp. */
    String TCP = "tcp";
  }

  @SerializedName("connection_limit")
  protected Long connectionLimit;
  protected Long port;
  protected String protocol;
  @SerializedName("default_pool")
  protected LoadBalancerPoolIdentityByName defaultPool;

  /**
   * Builder.
   */
  public static class Builder {
    private Long connectionLimit;
    private Long port;
    private String protocol;
    private LoadBalancerPoolIdentityByName defaultPool;

    private Builder(LoadBalancerListenerPrototypeLoadBalancerContext loadBalancerListenerPrototypeLoadBalancerContext) {
      this.connectionLimit = loadBalancerListenerPrototypeLoadBalancerContext.connectionLimit;
      this.port = loadBalancerListenerPrototypeLoadBalancerContext.port;
      this.protocol = loadBalancerListenerPrototypeLoadBalancerContext.protocol;
      this.defaultPool = loadBalancerListenerPrototypeLoadBalancerContext.defaultPool;
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
  }

  protected LoadBalancerListenerPrototypeLoadBalancerContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    connectionLimit = builder.connectionLimit;
    port = builder.port;
    protocol = builder.protocol;
    defaultPool = builder.defaultPool;
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
   * Gets the port.
   *
   * The listener port number.
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
   * family support `tcp`, `http`, and `https`.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
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
}

