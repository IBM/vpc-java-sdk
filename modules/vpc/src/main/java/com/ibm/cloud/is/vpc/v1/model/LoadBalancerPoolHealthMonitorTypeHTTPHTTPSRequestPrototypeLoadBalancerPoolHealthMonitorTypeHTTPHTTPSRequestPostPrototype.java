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
 * LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype.
 */
public class LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype extends LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype {

  /**
   * The HTTP request method to use for health checks.
   */
  public interface Method {
    /** post. */
    String POST = "post";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String body;
    private List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers;
    private String method;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype instance.
     *
     * @param loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestPostPrototype the instance to initialize the Builder with
     */
    public Builder(LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototype loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestPostPrototype) {
      this.body = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestPostPrototype.body;
      this.headers = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestPostPrototype.headers;
      this.method = loadBalancerPoolHealthMonitorTypeHttphttpsRequestPrototypeLoadBalancerPoolHealthMonitorTypeHttphttpsRequestPostPrototype.method;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype.
     *
     * @return the new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype instance
     */
    public LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype build() {
      return new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype(this);
    }

    /**
     * Adds a new element to headers.
     *
     * @param headers the new element to be added
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype builder
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
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype builder
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
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype builder
     */
    public Builder headers(List<LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype> headers) {
      this.headers = headers;
      return this;
    }

    /**
     * Set the method.
     *
     * @param method the method
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype builder
     */
    public Builder method(String method) {
      this.method = method;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype() { }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype(Builder builder) {
    body = builder.body;
    headers = builder.headers;
    method = builder.method;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPrototypeLoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestPostPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

