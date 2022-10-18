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
 * LoadBalancerPoolHealthMonitorPrototype.
 */
public class LoadBalancerPoolHealthMonitorPrototype extends GenericModel {

  /**
   * The protocol type to use for health checks.
   */
  public interface Type {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
    /** tcp. */
    String TCP = "tcp";
  }

  protected Long delay;
  @SerializedName("max_retries")
  protected Long maxRetries;
  protected Long port;
  protected Long timeout;
  protected String type;
  @SerializedName("url_path")
  protected String urlPath;

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
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorPrototype instance.
     *
     * @param loadBalancerPoolHealthMonitorPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototype) {
      this.delay = loadBalancerPoolHealthMonitorPrototype.delay;
      this.maxRetries = loadBalancerPoolHealthMonitorPrototype.maxRetries;
      this.port = loadBalancerPoolHealthMonitorPrototype.port;
      this.timeout = loadBalancerPoolHealthMonitorPrototype.timeout;
      this.type = loadBalancerPoolHealthMonitorPrototype.type;
      this.urlPath = loadBalancerPoolHealthMonitorPrototype.urlPath;
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
     * Builds a LoadBalancerPoolHealthMonitorPrototype.
     *
     * @return the new LoadBalancerPoolHealthMonitorPrototype instance
     */
    public LoadBalancerPoolHealthMonitorPrototype build() {
      return new LoadBalancerPoolHealthMonitorPrototype(this);
    }

    /**
     * Set the delay.
     *
     * @param delay the delay
     * @return the LoadBalancerPoolHealthMonitorPrototype builder
     */
    public Builder delay(long delay) {
      this.delay = delay;
      return this;
    }

    /**
     * Set the maxRetries.
     *
     * @param maxRetries the maxRetries
     * @return the LoadBalancerPoolHealthMonitorPrototype builder
     */
    public Builder maxRetries(long maxRetries) {
      this.maxRetries = maxRetries;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the LoadBalancerPoolHealthMonitorPrototype builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the LoadBalancerPoolHealthMonitorPrototype builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerPoolHealthMonitorPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the urlPath.
     *
     * @param urlPath the urlPath
     * @return the LoadBalancerPoolHealthMonitorPrototype builder
     */
    public Builder urlPath(String urlPath) {
      this.urlPath = urlPath;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorPrototype() { }

  protected LoadBalancerPoolHealthMonitorPrototype(Builder builder) {
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
   * @return a LoadBalancerPoolHealthMonitorPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the delay.
   *
   * The seconds to wait between health checks.  Must be greater than `timeout`.
   *
   * @return the delay
   */
  public Long delay() {
    return delay;
  }

  /**
   * Gets the maxRetries.
   *
   * The health check max retries.
   *
   * @return the maxRetries
   */
  public Long maxRetries() {
    return maxRetries;
  }

  /**
   * Gets the port.
   *
   * The health check port.
   *
   * If specified, this overrides the pool member port values.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the timeout.
   *
   * The seconds to wait for a response to a health check.  Must be less than `delay`.
   *
   * @return the timeout
   */
  public Long timeout() {
    return timeout;
  }

  /**
   * Gets the type.
   *
   * The protocol type to use for health checks.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the urlPath.
   *
   * The health check URL path. Applicable when `type` is `http` or `https`.
   *
   * Must be in the format of an [origin-form request target](https://tools.ietf.org/html/rfc7230#section-5.3.1).
   *
   * @return the urlPath
   */
  public String urlPath() {
    return urlPath;
  }
}

