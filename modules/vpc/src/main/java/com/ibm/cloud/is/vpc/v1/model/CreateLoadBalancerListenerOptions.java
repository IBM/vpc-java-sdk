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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createLoadBalancerListener options.
 */
public class CreateLoadBalancerListenerOptions extends GenericModel {

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

  protected String loadBalancerId;
  protected Long port;
  protected String protocol;
  protected Boolean acceptProxyProtocol;
  protected CertificateInstanceIdentity certificateInstance;
  protected Long connectionLimit;
  protected LoadBalancerPoolIdentity defaultPool;
  protected List<LoadBalancerListenerPolicyPrototype> policies;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private Long port;
    private String protocol;
    private Boolean acceptProxyProtocol;
    private CertificateInstanceIdentity certificateInstance;
    private Long connectionLimit;
    private LoadBalancerPoolIdentity defaultPool;
    private List<LoadBalancerListenerPolicyPrototype> policies;

    private Builder(CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions) {
      this.loadBalancerId = createLoadBalancerListenerOptions.loadBalancerId;
      this.port = createLoadBalancerListenerOptions.port;
      this.protocol = createLoadBalancerListenerOptions.protocol;
      this.acceptProxyProtocol = createLoadBalancerListenerOptions.acceptProxyProtocol;
      this.certificateInstance = createLoadBalancerListenerOptions.certificateInstance;
      this.connectionLimit = createLoadBalancerListenerOptions.connectionLimit;
      this.defaultPool = createLoadBalancerListenerOptions.defaultPool;
      this.policies = createLoadBalancerListenerOptions.policies;
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
     * @param port the port
     * @param protocol the protocol
     */
    public Builder(String loadBalancerId, Long port, String protocol) {
      this.loadBalancerId = loadBalancerId;
      this.port = port;
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
  }

  protected CreateLoadBalancerListenerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    loadBalancerId = builder.loadBalancerId;
    port = builder.port;
    protocol = builder.protocol;
    acceptProxyProtocol = builder.acceptProxyProtocol;
    certificateInstance = builder.certificateInstance;
    connectionLimit = builder.connectionLimit;
    defaultPool = builder.defaultPool;
    policies = builder.policies;
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
   * Gets the policies.
   *
   * The list of policies of this listener.
   *
   * @return the policies
   */
  public List<LoadBalancerListenerPolicyPrototype> policies() {
    return policies;
  }
}

