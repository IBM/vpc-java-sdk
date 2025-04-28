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
 * VolumeProfile.
 */
public class VolumeProfile extends GenericModel {

  /**
   * The product family this volume profile belongs to.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Family {
    /** custom. */
    String CUSTOM = "custom";
    /** defined_performance. */
    String DEFINED_PERFORMANCE = "defined_performance";
    /** tiered. */
    String TIERED = "tiered";
  }

  @SerializedName("adjustable_capacity_states")
  protected VolumeProfileAdjustableCapacityStates adjustableCapacityStates;
  @SerializedName("adjustable_iops_states")
  protected VolumeProfileAdjustableIOPSStates adjustableIopsStates;
  protected VolumeProfileBandwidth bandwidth;
  @SerializedName("boot_capacity")
  protected VolumeProfileBootCapacity bootCapacity;
  protected VolumeProfileCapacity capacity;
  protected String family;
  protected String href;
  protected VolumeProfileIOPS iops;
  protected String name;
  @SerializedName("storage_generation")
  protected VolumeProfileStorageGenerationFixed storageGeneration;

  protected VolumeProfile() { }

  /**
   * Gets the adjustableCapacityStates.
   *
   * @return the adjustableCapacityStates
   */
  public VolumeProfileAdjustableCapacityStates getAdjustableCapacityStates() {
    return adjustableCapacityStates;
  }

  /**
   * Gets the adjustableIopsStates.
   *
   * @return the adjustableIopsStates
   */
  public VolumeProfileAdjustableIOPSStates getAdjustableIopsStates() {
    return adjustableIopsStates;
  }

  /**
   * Gets the bandwidth.
   *
   * @return the bandwidth
   */
  public VolumeProfileBandwidth getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the bootCapacity.
   *
   * @return the bootCapacity
   */
  public VolumeProfileBootCapacity getBootCapacity() {
    return bootCapacity;
  }

  /**
   * Gets the capacity.
   *
   * @return the capacity
   */
  public VolumeProfileCapacity getCapacity() {
    return capacity;
  }

  /**
   * Gets the family.
   *
   * The product family this volume profile belongs to.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this volume profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the iops.
   *
   * @return the iops
   */
  public VolumeProfileIOPS getIops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this volume profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the storageGeneration.
   *
   * The storage generation value of volumes of this profile.
   *
   * @return the storageGeneration
   */
  public VolumeProfileStorageGenerationFixed getStorageGeneration() {
    return storageGeneration;
  }
}

