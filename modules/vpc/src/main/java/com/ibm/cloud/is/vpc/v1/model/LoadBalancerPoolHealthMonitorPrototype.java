/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 *
 * Classes which extend this class:
 * - LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeTCPPrototype
 * - LoadBalancerPoolHealthMonitorPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSPrototype
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
  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype request;
  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype response;
  @SerializedName("url_path")
  protected String urlPath;

  protected LoadBalancerPoolHealthMonitorPrototype() { }

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
   * Gets the request.
   *
   * The HTTP request to use for health checks. If unspecified, a `request.method` value of
   * `get` will be used with no `request.headers`.
   *
   * Supported by load balancers with `advanced_health_checks_supported` set to `true`.
   *
   * @return the request
   */
  public LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype request() {
    return request;
  }

  /**
   * Gets the response.
   *
   * The HTTP response to use for health checks. If unspecified, a `response.codes` value of
   * `["200"]` will be used with no `response.body_regex`.
   *
   * Supported by load balancers with `advanced_health_checks_supported` set to `true`.
   *
   * @return the response
   */
  public LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype response() {
    return response;
  }

  /**
   * Gets the urlPath.
   *
   * The health check URL path to use.
   *
   * Must be in the format of an [origin-form request target](https://tools.ietf.org/html/rfc7230#section-5.3.1).
   *
   * @return the urlPath
   */
  public String urlPath() {
    return urlPath;
  }
}

