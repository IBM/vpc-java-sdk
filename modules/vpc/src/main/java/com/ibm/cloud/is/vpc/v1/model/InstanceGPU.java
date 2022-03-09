/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
 * The virtual server instance GPU configuration.
 */
public class InstanceGPU extends GenericModel {

  protected Long count;
  protected String manufacturer;
  protected Long memory;
  protected String model;

  /**
   * Gets the count.
   *
   * The number of GPUs assigned to the instance.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the manufacturer.
   *
   * The GPU manufacturer.
   *
   * @return the manufacturer
   */
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * Gets the memory.
   *
   * The overall amount of GPU memory in GiB (gibibytes).
   *
   * @return the memory
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Gets the model.
   *
   * The GPU model.
   *
   * @return the model
   */
  public String getModel() {
    return model;
  }
}

