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
 * LoadBalancerListenerPatch.
 */
public class LoadBalancerListenerPatch extends GenericModel {

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
  @SerializedName("certificate_instance")
  protected CertificateInstanceIdentity certificateInstance;
  @SerializedName("connection_limit")
  protected Long connectionLimit;
  @SerializedName("default_pool")
  protected LoadBalancerPoolIdentity defaultPool;
  protected Long port;
  protected String protocol;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean acceptProxyProtocol;
    private CertificateInstanceIdentity certificateInstance;
    private Long connectionLimit;
    private LoadBalancerPoolIdentity defaultPool;
    private Long port;
    private String protocol;

    private Builder(LoadBalancerListenerPatch loadBalancerListenerPatch) {
      this.acceptProxyProtocol = loadBalancerListenerPatch.acceptProxyProtocol;
      this.certificateInstance = loadBalancerListenerPatch.certificateInstance;
      this.connectionLimit = loadBalancerListenerPatch.connectionLimit;
      this.defaultPool = loadBalancerListenerPatch.defaultPool;
      this.port = loadBalancerListenerPatch.port;
      this.protocol = loadBalancerListenerPatch.protocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerPatch.
     *
     * @return the new LoadBalancerListenerPatch instance
     */
    public LoadBalancerListenerPatch build() {
      return new LoadBalancerListenerPatch(this);
    }

    /**
     * Set the acceptProxyProtocol.
     *
     * @param acceptProxyProtocol the acceptProxyProtocol
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder acceptProxyProtocol(Boolean acceptProxyProtocol) {
      this.acceptProxyProtocol = acceptProxyProtocol;
      return this;
    }

    /**
     * Set the certificateInstance.
     *
     * @param certificateInstance the certificateInstance
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder certificateInstance(CertificateInstanceIdentity certificateInstance) {
      this.certificateInstance = certificateInstance;
      return this;
    }

    /**
     * Set the connectionLimit.
     *
     * @param connectionLimit the connectionLimit
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder connectionLimit(long connectionLimit) {
      this.connectionLimit = connectionLimit;
      return this;
    }

    /**
     * Set the defaultPool.
     *
     * @param defaultPool the defaultPool
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder defaultPool(LoadBalancerPoolIdentity defaultPool) {
      this.defaultPool = defaultPool;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
  }

  protected LoadBalancerListenerPatch(Builder builder) {
    acceptProxyProtocol = builder.acceptProxyProtocol;
    certificateInstance = builder.certificateInstance;
    connectionLimit = builder.connectionLimit;
    defaultPool = builder.defaultPool;
    port = builder.port;
    protocol = builder.protocol;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the acceptProxyProtocol.
   *
   * If set to `true`, this listener will accept and forward PROXY protocol information. Supported by load balancers in
   * the `application` family (otherwise always `false`).
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
   * The default pool associated with the listener. The specified pool must:
   *
   * - Belong to this load balancer
   * - Have the same `protocol` as this listener
   * - Not already be the default pool for another listener.
   *
   * @return the defaultPool
   */
  public LoadBalancerPoolIdentity defaultPool() {
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

  /**
   * Construct a JSON merge-patch from the LoadBalancerListenerPatch.
   *
   * Note that properties of the LoadBalancerListenerPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the LoadBalancerListenerPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

