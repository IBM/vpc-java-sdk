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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * When `action` is `forward`, `LoadBalancerPoolIdentity` specifies which pool the load balancer forwards the traffic
 * to. When `action` is `redirect`,
 * `LoadBalancerListenerPolicyRedirectURLPatch` specifies the url and http status code used in the redirect response.
 *
 * Classes which extend this class:
 * - LoadBalancerListenerPolicyTargetPatchLoadBalancerPoolIdentity
 * - LoadBalancerListenerPolicyTargetPatchLoadBalancerListenerPolicyRedirectURLPatch
 */
public class LoadBalancerListenerPolicyTargetPatch extends GenericModel {

  protected String id;
  protected String href;
  @SerializedName("http_status_code")
  protected Long httpStatusCode;
  protected String url;

  protected LoadBalancerListenerPolicyTargetPatch() {
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer pool.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The pool's canonical URL.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the httpStatusCode.
   *
   * The http status code in the redirect response.
   *
   * @return the httpStatusCode
   */
  public Long httpStatusCode() {
    return httpStatusCode;
  }

  /**
   * Gets the url.
   *
   * The redirect target URL.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

