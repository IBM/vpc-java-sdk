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
 * The updateLoadBalancerListener options.
 */
public class UpdateLoadBalancerListenerOptions extends GenericModel {

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

  protected String loadBalancerId;
  protected String id;
  protected Long connectionLimit;
  protected Long port;
  protected String protocol;
  protected CertificateInstanceIdentity certificateInstance;
  protected LoadBalancerPoolIdentity defaultPool;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String id;
    private Long connectionLimit;
    private Long port;
    private String protocol;
    private CertificateInstanceIdentity certificateInstance;
    private LoadBalancerPoolIdentity defaultPool;

    private Builder(UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptions) {
      this.loadBalancerId = updateLoadBalancerListenerOptions.loadBalancerId;
      this.id = updateLoadBalancerListenerOptions.id;
      this.connectionLimit = updateLoadBalancerListenerOptions.connectionLimit;
      this.port = updateLoadBalancerListenerOptions.port;
      this.protocol = updateLoadBalancerListenerOptions.protocol;
      this.certificateInstance = updateLoadBalancerListenerOptions.certificateInstance;
      this.defaultPool = updateLoadBalancerListenerOptions.defaultPool;
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
     * Builds a UpdateLoadBalancerListenerOptions.
     *
     * @return the new UpdateLoadBalancerListenerOptions instance
     */
    public UpdateLoadBalancerListenerOptions build() {
      return new UpdateLoadBalancerListenerOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the connectionLimit.
     *
     * @param connectionLimit the connectionLimit
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder connectionLimit(long connectionLimit) {
      this.connectionLimit = connectionLimit;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the certificateInstance.
     *
     * @param certificateInstance the certificateInstance
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder certificateInstance(CertificateInstanceIdentity certificateInstance) {
      this.certificateInstance = certificateInstance;
      return this;
    }

    /**
     * Set the defaultPool.
     *
     * @param defaultPool the defaultPool
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder defaultPool(LoadBalancerPoolIdentity defaultPool) {
      this.defaultPool = defaultPool;
      return this;
    }
  }

  protected UpdateLoadBalancerListenerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    id = builder.id;
    connectionLimit = builder.connectionLimit;
    port = builder.port;
    protocol = builder.protocol;
    certificateInstance = builder.certificateInstance;
    defaultPool = builder.defaultPool;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerListenerOptions builder
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
   * The listener identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * Gets the defaultPool.
   *
   * The default pool associated with the listener.
   *
   * @return the defaultPool
   */
  public LoadBalancerPoolIdentity defaultPool() {
    return defaultPool;
  }
}

