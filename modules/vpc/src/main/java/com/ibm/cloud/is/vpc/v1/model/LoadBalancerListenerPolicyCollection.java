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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPolicyCollection.
 */
public class LoadBalancerListenerPolicyCollection extends GenericModel {

  protected List<LoadBalancerListenerPolicy> policies;

  protected LoadBalancerListenerPolicyCollection() { }

  /**
   * Gets the policies.
   *
   * The policies for the load balancer listener.
   *
   * @return the policies
   */
  public List<LoadBalancerListenerPolicy> getPolicies() {
    return policies;
  }
}

