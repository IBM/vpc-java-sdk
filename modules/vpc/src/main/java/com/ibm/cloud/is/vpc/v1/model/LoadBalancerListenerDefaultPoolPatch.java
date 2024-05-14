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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The default pool for this listener. If `https_redirect` is set, the default pool will not be used. The specified pool
 * must:
 *
 * - Belong to this load balancer
 * - Have the same `protocol` as this listener, or have a compatible protocol.
 *   At present, the compatible protocols are `http` and `https`.
 * - Not already be the `default_pool` for another listener
 *
 * Specify `null` to remove an existing default pool.
 *
 * Classes which extend this class:
 * - LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityById
 * - LoadBalancerListenerDefaultPoolPatchLoadBalancerPoolIdentityByHref
 */
public class LoadBalancerListenerDefaultPoolPatch extends GenericModel {

  protected String id;
  protected String href;

  protected LoadBalancerListenerDefaultPoolPatch() { }

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
}

