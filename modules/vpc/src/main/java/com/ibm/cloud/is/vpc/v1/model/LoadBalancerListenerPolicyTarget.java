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
 * `LoadBalancerPoolReference` is in the response if `action` is `forward`.
 * `LoadBalancerListenerPolicyRedirectURL` is in the response if `action` is `redirect`.
 *
 * Classes which extend this class:
 * - LoadBalancerListenerPolicyTargetLoadBalancerPoolReference
 * - LoadBalancerListenerPolicyTargetLoadBalancerListenerPolicyRedirectURL
 */
public class LoadBalancerListenerPolicyTarget extends GenericModel {

  protected LoadBalancerPoolReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("http_status_code")
  protected Long httpStatusCode;
  protected String url;

  protected LoadBalancerListenerPolicyTarget() {
  }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
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
   * The http status code in the redirect response.
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
}

