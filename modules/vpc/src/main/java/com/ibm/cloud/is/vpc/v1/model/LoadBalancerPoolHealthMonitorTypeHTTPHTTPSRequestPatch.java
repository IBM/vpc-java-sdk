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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Supported by load balancers with `advanced_health_checks_supported` set to `true`.
 */
public class LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch extends GenericModel {

  /**
   * The HTTP request method to use for health checks. If updating to `get`, the
   * `health_monitor.request.body` property (if set) must be removed.
   */
  public interface Method {
    /** get. */
    String GET = "get";
    /** post. */
    String POST = "post";
  }

  protected String body;
  protected List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers;
  protected String method;

  /**
   * Builder.
   */
  public static class Builder {
    private String body;
    private List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers;
    private String method;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch instance.
     *
     * @param loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatch) {
      this.body = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatch.body;
      this.headers = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatch.headers;
      this.method = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPatch.method;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch.
     *
     * @return the new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch instance
     */
    public LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch build() {
      return new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch(this);
    }

    /**
     * Adds a new element to headers.
     *
     * @param headers the new element to be added
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch builder
     */
    public Builder addHeaders(LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype headers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(headers,
        "headers cannot be null");
      if (this.headers == null) {
        this.headers = new ArrayList<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype>();
      }
      this.headers.add(headers);
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch builder
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * Set the headers.
     * Existing headers will be replaced.
     *
     * @param headers the headers
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch builder
     */
    public Builder headers(List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers) {
      this.headers = headers;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch() { }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch(Builder builder) {
    body = builder.body;
    headers = builder.headers;
    method = builder.method;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the body.
   *
   * The HTTP request body to use for health checks. If set, a corresponding `Content-Type` field must be included in
   * the `request.headers` array.
   *
   * Specify `null` to remove the request body used for health checks.
   *
   * The body must be formatted in a way that will be understood by the backend server member.
   *
   * @return the body
   */
  public String body() {
    return body;
  }

  /**
   * Gets the headers.
   *
   * The HTTP request headers to use for health checks.
   *
   * Specify an empty array to remove the request headers for health checks.
   *
   * Include a `Host` field and its value to enable the `HTTP/1.1` protocol for health checks. If a `Host` header is not
   * included, `HTTP/1.0` will be used by default. More than one
   * `Host` header is not allowed.
   *
   * Include a `Content-Type` field and its value to indicate the media type of the
   * `request.body` (if set).
   *
   * A header must not exceed 1000 characters, and all headers combined must not exceed 4000 characters.
   *
   * @return the headers
   */
  public List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers() {
    return headers;
  }

  /**
   * Gets the method.
   *
   * The HTTP request method to use for health checks. If updating to `get`, the
   * `health_monitor.request.body` property (if set) must be removed.
   *
   * @return the method
   */
  public String method() {
    return method;
  }
}

