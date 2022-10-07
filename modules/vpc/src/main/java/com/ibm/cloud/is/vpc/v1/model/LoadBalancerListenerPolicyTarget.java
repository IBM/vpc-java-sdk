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
 * - If `action` is `forward`, the response is a `LoadBalancerPoolReference`
 * - If `action` is `redirect`, the response is a `LoadBalancerListenerPolicyRedirectURL`
 * - If `action` is `https_redirect`, the response is a `LoadBalancerListenerHTTPSRedirect`.
 *
 * Classes which extend this class:
 * - LoadBalancerListenerPolicyTargetLoadBalancerPoolReference
 * - LoadBalancerListenerPolicyTargetLoadBalancerListenerPolicyRedirectURL
 * - LoadBalancerListenerPolicyTargetLoadBalancerListenerHTTPSRedirect
 */
public class LoadBalancerListenerPolicyTarget extends GenericModel {

  protected LoadBalancerPoolReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("http_status_code")
  protected Long httpStatusCode;
  protected String url;
  protected LoadBalancerListenerReference listener;
  protected String uri;

  protected LoadBalancerListenerPolicyTarget() { }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public LoadBalancerPoolReferenceDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The pool's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer pool.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this load balancer pool.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the httpStatusCode.
   *
   * The HTTP status code for this redirect.
   *
   * @return the httpStatusCode
   */
  public Long getHttpStatusCode() {
    return httpStatusCode;
  }

  /**
   * Gets the url.
   *
   * The redirect target URL.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Gets the listener.
   *
   * @return the listener
   */
  public LoadBalancerListenerReference getListener() {
    return listener;
  }

  /**
   * Gets the uri.
   *
   * The redirect relative target URI.
   *
   * @return the uri
   */
  public String getUri() {
    return uri;
  }
}

