/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype.
 */
public class LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype extends LoadBalancerPoolHealthMonitorPrototype {

  /**
   * The protocol type to use for health checks.
   */
  public interface Type {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
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
    private String urlPath;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype instance.
     *
     * @param loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype the instance to initialize the Builder with
     */
    public Builder(LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype) {
      this.delay = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype.delay;
      this.maxRetries = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype.maxRetries;
      this.port = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype.port;
      this.timeout = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype.timeout;
      this.type = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype.type;
      this.urlPath = loadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsPrototype.urlPath;
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
     * Builds a LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype.
     *
     * @return the new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype instance
     */
    public LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype build() {
      return new LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype(this);
    }

    /**
     * Set the delay.
     *
     * @param delay the delay
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype builder
     */
    public Builder delay(long delay) {
      this.delay = delay;
      return this;
    }

    /**
     * Set the maxRetries.
     *
     * @param maxRetries the maxRetries
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype builder
     */
    public Builder maxRetries(long maxRetries) {
      this.maxRetries = maxRetries;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the urlPath.
     *
     * @param urlPath the urlPath
     * @return the LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype builder
     */
    public Builder urlPath(String urlPath) {
      this.urlPath = urlPath;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype() { }

  protected LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype(Builder builder) {
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
    urlPath = builder.urlPath;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

