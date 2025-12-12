/*
 * (C) Copyright IBM Corp. 2025.
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

/**
 * LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.
 */
public class LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype extends LoadBalancerPoolHealthMonitorPrototype {

  /**
   * The protocol type to use for health checks.
   */
  public interface Type {
    /** tcp. */
    String TCP = "tcp";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Long delay;
    private Long maxRetries;
    private Long port;
    private Long timeout;
    private String type;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype instance.
     *
     * @param loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototype the instance to initialize the Builder with
     */
    public Builder(LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototype) {
      this.delay = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototype.delay;
      this.maxRetries = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototype.maxRetries;
      this.port = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototype.port;
      this.timeout = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototype.timeout;
      this.type = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTcpPrototype.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param delay the delay
     * @param maxRetries the maxRetries
     * @param timeout the timeout
     * @param type the type
     */
    public Builder(Long delay, Long maxRetries, Long timeout, String type) {
      this.delay = delay;
      this.maxRetries = maxRetries;
      this.timeout = timeout;
      this.type = type;
    }

    /**
     * Builds a LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype.
     *
     * @return the new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype instance
     */
    public LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype build() {
      return new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype(this);
    }

    /**
     * Set the delay.
     *
     * @param delay the delay
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype builder
     */
    public Builder delay(long delay) {
      this.delay = delay;
      return this;
    }

    /**
     * Set the maxRetries.
     *
     * @param maxRetries the maxRetries
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype builder
     */
    public Builder maxRetries(long maxRetries) {
      this.maxRetries = maxRetries;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype() { }

  protected LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.delay,
      "delay cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maxRetries,
      "maxRetries cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.timeout,
      "timeout cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    delay = builder.delay;
    maxRetries = builder.maxRetries;
    port = builder.port;
    timeout = builder.timeout;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

