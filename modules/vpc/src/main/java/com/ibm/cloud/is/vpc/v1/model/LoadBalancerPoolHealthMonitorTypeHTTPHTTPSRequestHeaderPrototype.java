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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An HTTP request header to use for health checks.
 */
public class LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype extends GenericModel {

  protected String field;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String field;
    private String value;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype instance.
     *
     * @param loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototype) {
      this.field = loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototype.field;
      this.value = loadBalancerPoolHealthMonitorTypeHttphttpsRequestHeaderPrototype.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param field the field
     * @param value the value
     */
    public Builder(String field, String value) {
      this.field = field;
      this.value = value;
    }

    /**
     * Builds a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype.
     *
     * @return the new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype instance
     */
    public LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype build() {
      return new LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype(this);
    }

    /**
     * Set the field.
     *
     * @param field the field
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype builder
     */
    public Builder field(String field) {
      this.field = field;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype() { }

  protected LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.field,
      "field cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    field = builder.field;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolHealthMonitorTypeHTTPHTTPSRequestHeaderPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the field.
   *
   * The field of an HTTP request header to use for health checks.
   *
   * @return the field
   */
  public String field() {
    return field;
  }

  /**
   * Gets the value.
   *
   * The value of an HTTP request header to use for health checks.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

