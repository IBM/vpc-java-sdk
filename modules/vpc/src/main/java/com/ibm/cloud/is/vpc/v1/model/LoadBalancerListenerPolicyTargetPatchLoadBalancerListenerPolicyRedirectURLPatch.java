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
 * LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch.
 */
public class LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch extends LoadBalancerListenerPolicyTargetPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private Long httpStatusCode;
    private String url;

    public Builder(LoadBalancerListenerPolicyTargetPatch loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectUrlPatch) {
      this.httpStatusCode = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectUrlPatch.httpStatusCode;
      this.url = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectUrlPatch.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch.
     *
     * @return the new LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch instance
     */
    public LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch build() {
      return new LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch(Builder builder) {
    httpStatusCode = builder.httpStatusCode;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

