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
 * LoadBalancerListenerHTTPSRedirectPrototype.
 */
public class LoadBalancerListenerHTTPSRedirectPrototype extends GenericModel {

  @SerializedName("http_status_code")
  protected Long httpStatusCode;
  protected LoadBalancerListenerIdentity listener;
  protected String uri;

  /**
   * Builder.
   */
  public static class Builder {
    private Long httpStatusCode;
    private LoadBalancerListenerIdentity listener;
    private String uri;

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerHTTPSRedirectPrototype instance.
     *
     * @param loadBalancerListenerHttpsRedirectPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerListenerHTTPSRedirectPrototype loadBalancerListenerHttpsRedirectPrototype) {
      this.httpStatusCode = loadBalancerListenerHttpsRedirectPrototype.httpStatusCode;
      this.listener = loadBalancerListenerHttpsRedirectPrototype.listener;
      this.uri = loadBalancerListenerHttpsRedirectPrototype.uri;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param httpStatusCode the httpStatusCode
     * @param listener the listener
     */
    public Builder(Long httpStatusCode, LoadBalancerListenerIdentity listener) {
      this.httpStatusCode = httpStatusCode;
      this.listener = listener;
    }

    /**
     * Builds a LoadBalancerListenerHTTPSRedirectPrototype.
     *
     * @return the new LoadBalancerListenerHTTPSRedirectPrototype instance
     */
    public LoadBalancerListenerHTTPSRedirectPrototype build() {
      return new LoadBalancerListenerHTTPSRedirectPrototype(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerHTTPSRedirectPrototype builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the listener.
     *
     * @param listener the listener
     * @return the LoadBalancerListenerHTTPSRedirectPrototype builder
     */
    public Builder listener(LoadBalancerListenerIdentity listener) {
      this.listener = listener;
      return this;
    }

    /**
     * Set the uri.
     *
     * @param uri the uri
     * @return the LoadBalancerListenerHTTPSRedirectPrototype builder
     */
    public Builder uri(String uri) {
      this.uri = uri;
      return this;
    }
  }

  protected LoadBalancerListenerHTTPSRedirectPrototype() { }

  protected LoadBalancerListenerHTTPSRedirectPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.httpStatusCode,
      "httpStatusCode cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.listener,
      "listener cannot be null");
    httpStatusCode = builder.httpStatusCode;
    listener = builder.listener;
    uri = builder.uri;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerHTTPSRedirectPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the httpStatusCode.
   *
   * The HTTP status code for this redirect.
   *
   * @return the httpStatusCode
   */
  public Long httpStatusCode() {
    return httpStatusCode;
  }

  /**
   * Gets the listener.
   *
   * Identifies a load balancer listener by a unique property.
   *
   * @return the listener
   */
  public LoadBalancerListenerIdentity listener() {
    return listener;
  }

  /**
   * Gets the uri.
   *
   * The redirect relative target URI.
   *
   * @return the uri
   */
  public String uri() {
    return uri;
  }
}

