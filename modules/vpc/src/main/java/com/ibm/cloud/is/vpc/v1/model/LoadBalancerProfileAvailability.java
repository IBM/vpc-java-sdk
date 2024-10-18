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
 * LoadBalancerProfileAvailability.
 *
 * Classes which extend this class:
 * - LoadBalancerProfileAvailabilityFixed
 * - LoadBalancerProfileAvailabilityDependent
 */
public class LoadBalancerProfileAvailability extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** fixed. */
    String FIXED = "fixed";
  }

  /**
   * The availability of this load balancer:
   * - `subnet`: remains available if at least one zone that the load balancer's subnets reside
   *   in is available
   * - `region`: remains available if at least one zone in the region is available.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Value {
    /** region. */
    String REGION = "region";
    /** subnet. */
    String SUBNET = "subnet";
  }

  protected String type;
  protected String value;

  protected LoadBalancerProfileAvailability() { }

  /**
   * Gets the type.
   *
   * The type for this profile field.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * The availability of this load balancer:
   * - `subnet`: remains available if at least one zone that the load balancer's subnets reside
   *   in is available
   * - `region`: remains available if at least one zone in the region is available.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

