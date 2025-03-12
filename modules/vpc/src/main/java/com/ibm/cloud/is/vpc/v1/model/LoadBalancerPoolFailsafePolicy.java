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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerPoolFailsafePolicy.
 */
public class LoadBalancerPoolFailsafePolicy extends GenericModel {

  /**
   * A load balancer failsafe policy action:
   * - `bypass`: Bypasses the members and sends requests directly to their destination IPs.
   * - `drop`: Drops requests.
   * - `fail`: Fails requests with an HTTP `503` status code.
   * - `forward`: Forwards requests to the `target` pool.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Action {
    /** bypass. */
    String BYPASS = "bypass";
    /** drop. */
    String DROP = "drop";
    /** fail. */
    String FAIL = "fail";
    /** forward. */
    String FORWARD = "forward";
  }

  protected String action;
  @SerializedName("healthy_member_threshold_count")
  protected Long healthyMemberThresholdCount;
  protected LoadBalancerPoolReference target;

  protected LoadBalancerPoolFailsafePolicy() { }

  /**
   * Gets the action.
   *
   * A load balancer failsafe policy action:
   * - `bypass`: Bypasses the members and sends requests directly to their destination IPs.
   * - `drop`: Drops requests.
   * - `fail`: Fails requests with an HTTP `503` status code.
   * - `forward`: Forwards requests to the `target` pool.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the healthyMemberThresholdCount.
   *
   * The healthy member count at which the failsafe policy action will be triggered. At present, this is always `0`, but
   * may be modifiable in the future.
   *
   * @return the healthyMemberThresholdCount
   */
  public Long getHealthyMemberThresholdCount() {
    return healthyMemberThresholdCount;
  }

  /**
   * Gets the target.
   *
   * If `action` is `forward`, the target pool to forward to.
   *
   * If `action` is not `forward`, this property will be absent.
   *
   * The targets supported by this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the target
   */
  public LoadBalancerPoolReference getTarget() {
    return target;
  }
}

