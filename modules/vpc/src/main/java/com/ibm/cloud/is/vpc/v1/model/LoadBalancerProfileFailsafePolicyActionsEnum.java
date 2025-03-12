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
 * The failsafe policy action configuration for a load balancer with this profile.
 */
public class LoadBalancerProfileFailsafePolicyActionsEnum extends LoadBalancerProfileFailsafePolicyActions {

  /**
   * The default failsafe policy action for this profile.
   */
  public interface XDefault {
    /** bypass. */
    String BYPASS = "bypass";
    /** drop. */
    String DROP = "drop";
    /** fail. */
    String FAIL = "fail";
    /** forward. */
    String FORWARD = "forward";
  }

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

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
  public interface Values {
    /** bypass. */
    String BYPASS = "bypass";
    /** drop. */
    String DROP = "drop";
    /** fail. */
    String FAIL = "fail";
    /** forward. */
    String FORWARD = "forward";
  }


  protected LoadBalancerProfileFailsafePolicyActionsEnum() { }
}

