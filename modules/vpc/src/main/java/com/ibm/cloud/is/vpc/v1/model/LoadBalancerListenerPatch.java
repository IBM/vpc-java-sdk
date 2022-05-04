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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * LoadBalancerListenerPatch.
 */
public class LoadBalancerListenerPatch extends GenericModel {

  /**
   * The listener protocol. Each listener in the load balancer must have a unique `port` and `protocol` combination.
   * Additional restrictions:
   * - If this load balancer is in the `network` family, the protocol must be `tcp`
   *   or `udp` (if `udp_supported` is `true`) , and it cannot be changed while
   *   `default_pool` is set.
   * - If `https_redirect` is set, the protocol must be `http`.
   * - If this listener is a listener's `https_redirect` target, the protocol must be
   *   `https`.
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
  protected LoadBalancerPoolIdentity defaultPool;
  @SerializedName("https_redirect")
  protected LoadBalancerListenerHTTPSRedirectPatch httpsRedirect;
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
    private LoadBalancerPoolIdentity defaultPool;
    private LoadBalancerListenerHTTPSRedirectPatch httpsRedirect;
    private Long port;
    private Long portMax;
    private Long portMin;
    private String protocol;

    private Builder(LoadBalancerListenerPatch loadBalancerListenerPatch) {
      this.acceptProxyProtocol = loadBalancerListenerPatch.acceptProxyProtocol;
      this.certificateInstance = loadBalancerListenerPatch.certificateInstance;
      this.connectionLimit = loadBalancerListenerPatch.connectionLimit;
      this.defaultPool = loadBalancerListenerPatch.defaultPool;
      this.httpsRedirect = loadBalancerListenerPatch.httpsRedirect;
      this.port = loadBalancerListenerPatch.port;
      this.portMax = loadBalancerListenerPatch.portMax;
      this.portMin = loadBalancerListenerPatch.portMin;
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
     * Set the httpsRedirect.
     *
     * @param httpsRedirect the httpsRedirect
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder httpsRedirect(LoadBalancerListenerHTTPSRedirectPatch httpsRedirect) {
      this.httpsRedirect = httpsRedirect;
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
     * Set the portMax.
     *
     * @param portMax the portMax
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder portMax(long portMax) {
      this.portMax = portMax;
      return this;
    }

    /**
     * Set the portMin.
     *
     * @param portMin the portMin
     * @return the LoadBalancerListenerPatch builder
     */
    public Builder portMin(long portMin) {
      this.portMin = portMin;
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
    httpsRedirect = builder.httpsRedirect;
    port = builder.port;
    portMax = builder.portMax;
    portMin = builder.portMin;
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
   * - Not already be the `default_pool` for another listener
   *
   * Specify `null` to remove an existing default pool.
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
   * Specify `null` to remove any existing https redirect.
   *
   * @return the httpsRedirect
   */
  public LoadBalancerListenerHTTPSRedirectPatch httpsRedirect() {
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
   * Additional restrictions:
   * - If this load balancer is in the `network` family, the protocol must be `tcp`
   *   or `udp` (if `udp_supported` is `true`) , and it cannot be changed while
   *   `default_pool` is set.
   * - If `https_redirect` is set, the protocol must be `http`.
   * - If this listener is a listener's `https_redirect` target, the protocol must be
   *   `https`.
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

