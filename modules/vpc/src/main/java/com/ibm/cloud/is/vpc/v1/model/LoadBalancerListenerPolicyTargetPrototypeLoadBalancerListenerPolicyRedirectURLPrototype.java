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

/**
 * LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype.
 */
public class LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype extends LoadBalancerListenerPolicyTargetPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Long httpStatusCode;
    private String url;

    public Builder(LoadBalancerListenerPolicyTargetPrototype loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototype) {
      this.httpStatusCode = loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototype.httpStatusCode;
      this.url = loadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectUrlPrototype.url;
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
     * Builds a LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype.
     *
     * @return the new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype instance
     */
    public LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype build() {
      return new LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype(Builder builder) {
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
   * @return a LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

