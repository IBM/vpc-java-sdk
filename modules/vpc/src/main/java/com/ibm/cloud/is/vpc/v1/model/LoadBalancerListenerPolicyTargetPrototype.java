/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * - If `action` is `https_redirect`, specify a
 * `LoadBalancerListenerPolicyHTTPSRedirectPrototype`.
 * - If `action` is `redirect`, specify a `LoadBalancerListenerPolicyRedirectURLPrototype`.
 *
 * Classes which extend this class:
 * - LoadBalancerListenerPolicyTargetPrototypeLoadBalancerPoolIdentity
 * - LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyHTTPSRedirectPrototype
 * - LoadBalancerListenerPolicyTargetPrototypeLoadBalancerListenerPolicyRedirectURLPrototype
 */
public class LoadBalancerListenerPolicyTargetPrototype extends GenericModel {

  protected String id;
  protected String href;
  @SerializedName("http_status_code")
  protected Long httpStatusCode;
  protected LoadBalancerListenerIdentity listener;
  protected String uri;
  protected String url;

  protected LoadBalancerListenerPolicyTargetPrototype() { }

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
   * The URL for this load balancer pool.
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

  /**
   * Gets the url.
   *
   * The redirect target URL. The URL supports [RFC 6570 level 1
   * expressions](https://datatracker.ietf.org/doc/html/rfc6570#section-1.2) for the following variables which expand to
   * values from the originally requested URL (or the indicated defaults if the request did not include them):
   *
   * - `protocol`
   * - `host`
   * - `port`  (default: `80` for HTTP requests, `443` for HTTPS requests)
   * - `path`  (default: '/')
   * - `query` (default: '')
   *
   * The protocol, host, and port segments of the URL, must only contain at most one instance of the `protocol`, `host`,
   * and `port` variables, respectively. The path and query segments of the URL may contain any combination of
   * variables. If the substitution of `path` results in consecutive leading slashes, the leading slash from the
   * substitution will be removed. Additional examples:
   * - `https://{host}:8080/{port}/{host}/{path}`
   * - `https://www.example.com`
   * - `{protocol}://test.{host}:80/{path}`.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

