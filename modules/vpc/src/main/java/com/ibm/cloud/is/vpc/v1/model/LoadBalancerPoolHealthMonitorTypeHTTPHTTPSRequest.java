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
 * LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequest.
 */
public class LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequest extends GenericModel {

  /**
   * The HTTP request method used for health checks.
   */
  public interface Method {
    /** get. */
    String GET = "get";
    /** post. */
    String POST = "post";
  }

  protected String body;
  protected List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeader> headers;
  protected String method;

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequest() { }

  /**
   * Gets the body.
   *
   * The HTTP request body used for health checks.
   *
   * If absent, the health checks will ignore the request body.
   *
   * @return the body
   */
  public String getBody() {
    return body;
  }

  /**
   * Gets the headers.
   *
   * The HTTP request headers used for health checks.
   *
   * If empty, the health checks will ignore the request headers.
   *
   * @return the headers
   */
  public List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeader> getHeaders() {
    return headers;
  }

  /**
   * Gets the method.
   *
   * The HTTP request method used for health checks.
   *
   * @return the method
   */
  public String getMethod() {
    return method;
  }
}

