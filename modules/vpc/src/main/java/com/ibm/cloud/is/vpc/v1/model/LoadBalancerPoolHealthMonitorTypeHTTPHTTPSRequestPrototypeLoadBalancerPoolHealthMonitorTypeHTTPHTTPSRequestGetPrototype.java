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

/**
 * LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype.
 */
public class LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype extends LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype {

  /**
   * The HTTP request method to use for health checks.
   */
  public interface Method {
    /** get. */
    String GET = "get";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers;
    private String method;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype instance.
     *
     * @param loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestGetPrototype the instance to initialize the Builder with
     */
    public Builder(LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestGetPrototype) {
      this.headers = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestGetPrototype.headers;
      this.method = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestGetPrototype.method;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype.
     *
     * @return the new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype instance
     */
    public LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype build() {
      return new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype(this);
    }

    /**
     * Adds a new element to headers.
     *
     * @param headers the new element to be added
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype builder
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
     * Set the headers.
     * Existing headers will be replaced.
     *
     * @param headers the headers
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype builder
     */
    public Builder headers(List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers) {
      this.headers = headers;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype() { }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype(Builder builder) {
    headers = builder.headers;
    method = builder.method;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestGetPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

