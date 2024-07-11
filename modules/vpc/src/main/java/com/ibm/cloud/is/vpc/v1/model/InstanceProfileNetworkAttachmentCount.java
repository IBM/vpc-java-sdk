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
 * InstanceProfileNetworkAttachmentCount.
 *
 * Classes which extend this class:
 * - InstanceProfileNetworkAttachmentCountRange
 * - InstanceProfileNetworkAttachmentCountDependent
 */
public class InstanceProfileNetworkAttachmentCount extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** range. */
    String RANGE = "range";
  }

  protected Long max;
  protected Long min;
  protected String type;

  protected InstanceProfileNetworkAttachmentCount() { }

  /**
   * Gets the max.
   *
   * The maximum value for this profile field.
   *
   * @return the max
   */
  public Long getMax() {
    return max;
  }

  /**
   * Gets the min.
   *
   * The minimum value for this profile field.
   *
   * @return the min
   */
  public Long getMin() {
    return min;
  }

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
}

