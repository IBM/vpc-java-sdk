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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The HTTP response to use for health checks. If unspecified, a `response.codes` value of
 * `["200"]` will be used with no `response.body_regex`.
 *
 * Supported by load balancers with `advanced_health_checks_supported` set to `true`.
 */
public class LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype extends GenericModel {

  @SerializedName("body_regex")
  protected String bodyRegex;
  protected List<String> codes;

  /**
   * Builder.
   */
  public static class Builder {
    private String bodyRegex;
    private List<String> codes;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype instance.
     *
     * @param loadBalancerPoolHealthMonitorTypeHttphttpsResponsePrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype loadBalancerPoolHealthMonitorTypeHttphttpsResponsePrototype) {
      this.bodyRegex = loadBalancerPoolHealthMonitorTypeHttphttpsResponsePrototype.bodyRegex;
      this.codes = loadBalancerPoolHealthMonitorTypeHttphttpsResponsePrototype.codes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype.
     *
     * @return the new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype instance
     */
    public LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype build() {
      return new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype(this);
    }

    /**
     * Adds a new element to codes.
     *
     * @param codes the new element to be added
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype builder
     */
    public Builder addCodes(String codes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(codes,
        "codes cannot be null");
      if (this.codes == null) {
        this.codes = new ArrayList<String>();
      }
      this.codes.add(codes);
      return this;
    }

    /**
     * Set the bodyRegex.
     *
     * @param bodyRegex the bodyRegex
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype builder
     */
    public Builder bodyRegex(String bodyRegex) {
      this.bodyRegex = bodyRegex;
      return this;
    }

    /**
     * Set the codes.
     * Existing codes will be replaced.
     *
     * @param codes the codes
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype builder
     */
    public Builder codes(List<String> codes) {
      this.codes = codes;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype() { }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype(Builder builder) {
    bodyRegex = builder.bodyRegex;
    codes = builder.codes;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSResponsePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bodyRegex.
   *
   * The PCRE-flavor regular expression that HTTP response bodies will be expected to match for successful health
   * checks.
   *
   * If unspecified, health checks will ignore any response body.
   *
   * @return the bodyRegex
   */
  public String bodyRegex() {
    return bodyRegex;
  }

  /**
   * Gets the codes.
   *
   * The HTTP response codes to expect for successful health checks.
   *
   * @return the codes
   */
  public List<String> codes() {
    return codes;
  }
}

