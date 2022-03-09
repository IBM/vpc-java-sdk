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
 * LoadBalancerListenerHTTPSRedirectPatch.
 */
public class LoadBalancerListenerHTTPSRedirectPatch extends GenericModel {

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

    private Builder(LoadBalancerListenerHTTPSRedirectPatch loadBalancerListenerHttpsRedirectPatch) {
      this.httpStatusCode = loadBalancerListenerHttpsRedirectPatch.httpStatusCode;
      this.listener = loadBalancerListenerHttpsRedirectPatch.listener;
      this.uri = loadBalancerListenerHttpsRedirectPatch.uri;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerHTTPSRedirectPatch.
     *
     * @return the new LoadBalancerListenerHTTPSRedirectPatch instance
     */
    public LoadBalancerListenerHTTPSRedirectPatch build() {
      return new LoadBalancerListenerHTTPSRedirectPatch(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerHTTPSRedirectPatch builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the listener.
     *
     * @param listener the listener
     * @return the LoadBalancerListenerHTTPSRedirectPatch builder
     */
    public Builder listener(LoadBalancerListenerIdentity listener) {
      this.listener = listener;
      return this;
    }

    /**
     * Set the uri.
     *
     * @param uri the uri
     * @return the LoadBalancerListenerHTTPSRedirectPatch builder
     */
    public Builder uri(String uri) {
      this.uri = uri;
      return this;
    }
  }

  protected LoadBalancerListenerHTTPSRedirectPatch(Builder builder) {
    httpStatusCode = builder.httpStatusCode;
    listener = builder.listener;
    uri = builder.uri;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerHTTPSRedirectPatch builder
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

