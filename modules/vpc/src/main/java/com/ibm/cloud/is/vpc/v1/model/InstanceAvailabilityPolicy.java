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
 * The availability policy for this virtual server instance.
 */
public class InstanceAvailabilityPolicy extends GenericModel {

  /**
   * The action to perform if the compute host experiences a failure:
   * - `restart`: Restart the virtual server instance
   * - `stop`: Leave the virtual server instance stopped
   *
   * See [handling host failures](https://cloud.ibm.com/docs/vpc?topic=vpc-host-failure-recovery-policies) for details.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface HostFailure {
    /** restart. */
    String RESTART = "restart";
    /** stop. */
    String STOP = "stop";
  }

  /**
   * The action to perform if the virtual server instance is preempted:
   * - `delete`: Delete the virtual server instance
   * - `stop`: Leave the virtual server instance stopped
   *
   * See [virtual server instance
   * preemption](https://cloud.ibm.com/docs/vpc?topic=vpc-spot-instances-virtual-servers#spot-instances-preemption) for
   * details.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Preemption {
    /** delete. */
    String DELETE = "delete";
    /** stop. */
    String STOP = "stop";
  }

  @SerializedName("host_failure")
  protected String hostFailure;
  protected String preemption;

  protected InstanceAvailabilityPolicy() { }

  /**
   * Gets the hostFailure.
   *
   * The action to perform if the compute host experiences a failure:
   * - `restart`: Restart the virtual server instance
   * - `stop`: Leave the virtual server instance stopped
   *
   * See [handling host failures](https://cloud.ibm.com/docs/vpc?topic=vpc-host-failure-recovery-policies) for details.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the hostFailure
   */
  public String getHostFailure() {
    return hostFailure;
  }

  /**
   * Gets the preemption.
   *
   * The action to perform if the virtual server instance is preempted:
   * - `delete`: Delete the virtual server instance
   * - `stop`: Leave the virtual server instance stopped
   *
   * See [virtual server instance
   * preemption](https://cloud.ibm.com/docs/vpc?topic=vpc-spot-instances-virtual-servers#spot-instances-preemption) for
   * details.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the preemption
   */
  public String getPreemption() {
    return preemption;
  }
}

