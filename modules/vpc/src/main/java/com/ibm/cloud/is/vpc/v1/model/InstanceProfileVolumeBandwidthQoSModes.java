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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceProfileVolumeBandwidthQoSModes.
 *
 * Classes which extend this class:
 * - InstanceProfileVolumeBandwidthQoSModesEnum
 * - InstanceProfileVolumeBandwidthQoSModesDependent
 */
public class InstanceProfileVolumeBandwidthQoSModes extends GenericModel {

  /**
   * The default volume bandwidth QoS mode for this profile.
   */
  public interface XDefault {
    /** pooled. */
    String POOLED = "pooled";
    /** weighted. */
    String WEIGHTED = "weighted";
  }

  /**
   * The type for this profile field.
   */
  public interface Type {
    /** enum. */
    String X_ENUM = "enum";
  }

  /**
   * A volume bandwidth QoS mode:
   * - `pooled`: All volumes attached to an instance will pool and share bandwidth.
   * - `weighted`: Each volume attached to an instance will have its own bandwidth, weighted according to its IOPS.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Values {
    /** pooled. */
    String POOLED = "pooled";
    /** weighted. */
    String WEIGHTED = "weighted";
  }

  @SerializedName("default")
  protected String xDefault;
  protected String type;
  protected List<String> values;

  protected InstanceProfileVolumeBandwidthQoSModes() { }

  /**
   * Gets the xDefault.
   *
   * The default volume bandwidth QoS mode for this profile.
   *
   * @return the xDefault
   */
  public String getXDefault() {
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
   * The permitted volume bandwidth QoS modes for an instance using this profile.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }
}

