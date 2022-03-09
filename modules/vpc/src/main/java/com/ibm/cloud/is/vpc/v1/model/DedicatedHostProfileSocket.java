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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DedicatedHostProfileSocket.
 *
 * Classes which extend this class:
 * - DedicatedHostProfileSocketFixed
 * - DedicatedHostProfileSocketRange
 * - DedicatedHostProfileSocketEnum
 * - DedicatedHostProfileSocketDependent
 */
public class DedicatedHostProfileSocket extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** fixed. */
    String FIXED = "fixed";
  }

  protected String type;
  protected Long value;
  @SerializedName("default")
  protected Long xDefault;
  protected Long max;
  protected Long min;
  protected Long step;
  protected List<Long> values;

  protected DedicatedHostProfileSocket() {
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

  /**
   * Gets the value.
   *
   * The value for this profile field.
   *
   * @return the value
   */
  public Long getValue() {
    return value;
  }

  /**
   * Gets the xDefault.
   *
   * The default value for this profile field.
   *
   * @return the xDefault
   */
  public Long getXDefault() {
    return xDefault;
  }

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
   * Gets the step.
   *
   * The increment step value for this profile field.
   *
   * @return the step
   */
  public Long getStep() {
    return step;
  }

  /**
   * Gets the values.
   *
   * The permitted values for this profile field.
   *
   * @return the values
   */
  public List<Long> getValues() {
    return values;
  }
}

