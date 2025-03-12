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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The failsafe target pool to forward to.
 *
 * The specified pool must:
 * - Belong to this load balancer
 * - Have the same `protocol` as this pool, or have a compatible protocol.
 *   At present, the compatible protocols are `http` and `https`.
 * - Not have a `failsafe_policy.action` of `forward` or `bypass`.
 *
 * If specified, `action` must be `forward`.
 *
 * Specify `null` to remove an existing failsafe target pool.
 *
 * Classes which extend this class:
 * - LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityById
 * - LoadBalancerPoolFailsafePolicyTargetPatchLoadBalancerPoolIdentityByHref
 */
public class LoadBalancerPoolFailsafePolicyTargetPatch extends GenericModel {

  protected String id;
  protected String href;

  protected LoadBalancerPoolFailsafePolicyTargetPatch() { }

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
}

