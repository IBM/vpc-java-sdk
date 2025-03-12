/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch.
 */
public class LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch extends LoadBalancerListenerPolicyTargetPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private Long httpStatusCode;
    private LoadBalancerListenerIdentity listener;
    private String uri;

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch instance.
     *
     * @param loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatch the instance to initialize the Builder with
     */
    public Builder(LoadBalancerListenerPolicyTargetPatch loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatch) {
      this.httpStatusCode = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatch.httpStatusCode;
      this.listener = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatch.listener;
      this.uri = loadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHttpsRedirectPatch.uri;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch.
     *
     * @return the new LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch instance
     */
    public LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch build() {
      return new LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch(this);
    }

    /**
     * Set the httpStatusCode.
     *
     * @param httpStatusCode the httpStatusCode
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch builder
     */
    public Builder httpStatusCode(long httpStatusCode) {
      this.httpStatusCode = httpStatusCode;
      return this;
    }

    /**
     * Set the listener.
     *
     * @param listener the listener
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch builder
     */
    public Builder listener(LoadBalancerListenerIdentity listener) {
      this.listener = listener;
      return this;
    }

    /**
     * Set the uri.
     *
     * @param uri the uri
     * @return the LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch builder
     */
    public Builder uri(String uri) {
      this.uri = uri;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch() { }

  protected LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch(Builder builder) {
    httpStatusCode = builder.httpStatusCode;
    listener = builder.listener;
    uri = builder.uri;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyHTTPSRedirectPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

