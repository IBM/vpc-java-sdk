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
 * LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch.
 */
public class LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch extends LoadBalancerListenerPolicyPatchTarget {


  /**
   * Builder.
   */
  public static class Builder {
    private Long httpStatusCode;
    private String url;

    public Builder(LoadBalancerListenerPolicyPatchTarget loadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectUrlPatch) {
      this.httpStatusCode = loadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectUrlPatch.httpStatusCode;
      this.url = loadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectUrlPatch.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch.
     *
     * @return the new LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch instance
     */
    public LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch build() {
      return new LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch(Builder builder) {
    httpStatusCode = builder.httpStatusCode;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyPatchTargetLoadBalancerListenerPolicyRedirectURLPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

