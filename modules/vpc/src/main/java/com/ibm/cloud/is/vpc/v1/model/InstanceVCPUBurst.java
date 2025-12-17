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
 * InstanceVCPUBurst.
 */
public class InstanceVCPUBurst extends GenericModel {

  protected Long limit;

  protected InstanceVCPUBurst() { }

  /**
   * Gets the limit.
   *
   * The maximum percentage of the base VCPU capacity the virtual server may exceed. For example, if `vcpu.count` is 1,
   * `vcpu.percentage` is 50 and `vcpu.burst.limit` is 200, the instance may burst to using one full VCPU.
   *
   * The maximum value for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }
}

