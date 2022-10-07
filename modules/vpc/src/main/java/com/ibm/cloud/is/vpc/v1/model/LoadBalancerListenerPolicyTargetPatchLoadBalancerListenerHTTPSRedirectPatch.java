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
 * LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch.
 */
public class LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch extends LoadBalancerListenerPolicyTargetPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private Long httpStatusCode;
    private LoadBalancerListenerIdentity listener;
    private String uri;

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch instance.
     *
     * @param loadBalancerListenerPolicyTargetPatchLoadBalancerListenerHttpsRedirectPatch the instance to initialize the Builder with
     */
    public Builder(LoadBalancerListenerPolicyTargetPatch loadBalancerListenerPolicyTargetPatchLoadBalancerListenerHttpsRedirectPatch) {
      this.httpStatusCode = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerHttpsRedirectPatch.httpStatusCode;
      this.listener = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerHttpsRedirectPatch.listener;
      this.uri = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerHttpsRedirectPatch.uri;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch.
     *
     * @return the new LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch instance
     */
    public LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch build() {
      return new LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the listener.
     *
     * @param listener the listener
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch builder
     */
    public Builder listener(LoadBalancerListenerIdentity listener) {
      this.listener = listener;
      return this;
    }

    /**
     * Set the uri.
     *
     * @param uri the uri
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch builder
     */
    public Builder uri(String uri) {
      this.uri = uri;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch() { }

  protected LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch(Builder builder) {
    httpStatusCode = builder.httpStatusCode;
    listener = builder.listener;
    uri = builder.uri;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerHTTPSRedirectPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

