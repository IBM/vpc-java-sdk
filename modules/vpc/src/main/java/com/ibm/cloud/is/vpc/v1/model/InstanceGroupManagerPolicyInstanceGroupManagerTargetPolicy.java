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
 * InstanceGroupManagerPolicyInstanceGroupManagerTargetPolicy.
 */
public class InstanceGroupManagerPolicyInstanceGroupManagerTargetPolicy extends InstanceGroupManagerPolicy {

  /**
   * The type of metric to be evaluated
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface MetricType {
    /** cpu. */
    String CPU = "cpu";
    /** memory. */
    String MEMORY = "memory";
    /** network_in. */
    String NETWORK_IN = "network_in";
    /** network_out. */
    String NETWORK_OUT = "network_out";
  }

  /**
   * The type of policy for the instance group
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface PolicyType {
    /** target. */
    String TARGET = "target";
  }


  protected InstanceGroupManagerPolicyInstanceGroupManagerTargetPolicy() { }
}

