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
 * The dedicated host NUMA node configuration.
 */
public class DedicatedHostNUMANode extends GenericModel {

  @SerializedName("available_vcpu")
  protected Long availableVcpu;
  protected Long vcpu;

  protected DedicatedHostNUMANode() { }

  /**
   * Gets the availableVcpu.
   *
   * The available VCPU for this NUMA node.
   *
   * @return the availableVcpu
   */
  public Long getAvailableVcpu() {
    return availableVcpu;
  }

  /**
   * Gets the vcpu.
   *
   * The total VCPU capacity for this NUMA node.
   *
   * @return the vcpu
   */
  public Long getVcpu() {
    return vcpu;
  }
}

