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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The HTTP request to use for health checks. If unspecified, a `request.method` value of
 * `get` will be used with no `request.headers`.
 *
 * Supported by load balancers with `advanced_health_checks_supported` set to `true`.
 *
 * Classes which extend this class:
 * - LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype
 * - LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype
 */
public class LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype extends GenericModel {

  /**
   * The HTTP request method to use for health checks.
   */
  public interface Method {
    /** get. */
    String GET = "get";
  }

  protected List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers;
  protected String method;
  protected String body;

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype() { }

  /**
   * Gets the headers.
   *
   * The HTTP request headers to use for health checks. If empty, health check HTTP requests will not have headers.
   *
   * Include a `Host` field and its value to enable the `HTTP/1.1` protocol for health checks. If a `Host` header is not
   * included, `HTTP/1.0` will be used by default. More than one
   * `Host` header is not allowed.
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
   * The HTTP request method to use for health checks.
   *
   * @return the method
   */
  public String method() {
    return method;
  }

  /**
   * Gets the body.
   *
   * The HTTP request body to use for health checks. If unspecified, health check requests will not have a request body.
   *
   * The body must be formatted in a way that is understood by the backend member. If specified, the `request.headers`
   * array must include a corresponding `Content-Type` header.
   *
   * @return the body
   */
  public String body() {
    return body;
  }
}

