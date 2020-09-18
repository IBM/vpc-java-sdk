/*
 * (C) Copyright IBM Corp. 2020.
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

/**
 * LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype.
 */
public class LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype extends LoadBalancerListenerPolicyPrototypeTarget {


  /**
   * Builder.
   */
  public static class Builder {
    private Long httpStatusCode;
    private String url;

    public Builder(LoadBalancerListenerPolicyPrototypeTarget loadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectUrlPrototype) {
      this.httpStatusCode = loadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectUrlPrototype.httpStatusCode;
      this.url = loadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectUrlPrototype.url;
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
     * @param url the url
     */
    public Builder(Long httpStatusCode, String url) {
      this.httpStatusCode = httpStatusCode;
      this.url = url;
    }

    /**
     * Builds a LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype.
     *
     * @return the new LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype instance
     */
    public LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype build() {
      return new LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.httpStatusCode,
      "httpStatusCode cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    httpStatusCode = builder.httpStatusCode;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyPrototypeTargetLoadBalancerListenerPolicyRedirectURLPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

