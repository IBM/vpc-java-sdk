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
 * - If `action` is `forward`, specify a `LoadBalancerPoolIdentity`.
 * - If `action` is `redirect`, specify a `LoadBalancerListenerPolicyRedirectURLPrototype`.
 * - If `action` is `https_redirect`, specify a
 *   `LoadBalancerListenerPolicyHTTPSRedirectPrototype`.
 *
 * Classes which extend this class:
 * - LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentity
 * - LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype
 * - LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerHTTPSRedirectPrototype
 */
public class LoadBalancerListenerPolicyTargetPrototype extends GenericModel {

  protected String id;
  protected String href;
  @SerializedName("http_status_code")
  protected Long httpStatusCode;
  protected String url;
  protected LoadBalancerListenerIdentity listener;
  protected String uri;

  protected LoadBalancerListenerPolicyTargetPrototype() {
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
   * The HTTP status code for this redirect.
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

