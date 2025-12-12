/*
 * (C) Copyright IBM Corp. 2025.
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
 * A range of addresses available for subnets for this cluster network.
 */
public class ClusterNetworkSubnetPrefix extends GenericModel {

  /**
   * The allocation policy for this subnet prefix:
   * - `auto`: Subnets created by total count in this cluster network can use this prefix.
   */
  public interface AllocationPolicy {
    /** auto. */
    String AUTO = "auto";
  }

  @SerializedName("allocation_policy")
  protected String allocationPolicy;
  protected String cidr;

  protected ClusterNetworkSubnetPrefix() { }

  /**
   * Gets the allocationPolicy.
   *
   * The allocation policy for this subnet prefix:
   * - `auto`: Subnets created by total count in this cluster network can use this prefix.
   *
   * @return the allocationPolicy
   */
  public String getAllocationPolicy() {
    return allocationPolicy;
  }

  /**
   * Gets the cidr.
   *
   * The CIDR block for this prefix.
   *
   * @return the cidr
   */
  public String getCidr() {
    return cidr;
  }
}

