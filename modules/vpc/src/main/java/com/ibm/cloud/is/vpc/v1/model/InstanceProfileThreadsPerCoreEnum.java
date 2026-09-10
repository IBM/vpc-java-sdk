/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * InstanceProfileThreadsPerCoreEnum.
 */
public class InstanceProfileThreadsPerCoreEnum extends GenericModel {

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  @SerializedName("default")
  protected Long xDefault;
  protected String type;
  protected List<Long> values;

  protected InstanceProfileThreadsPerCoreEnum() { }

  /**
   * Gets the xDefault.
   *
   * The default threads per core value for an instance with this profile.
   *
   * @return the xDefault
   */
  public Long getXDefault() {
    return xDefault;
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
   * Gets the values.
   *
   * The permitted threads per core values for an instance with this profile.
   *
   * @return the values
   */
  public List<Long> getValues() {
    return values;
  }
}

