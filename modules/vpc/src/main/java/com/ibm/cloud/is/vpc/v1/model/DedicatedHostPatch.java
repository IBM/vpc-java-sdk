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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * DedicatedHostPatch.
 */
public class DedicatedHostPatch extends GenericModel {

  @SerializedName("instance_placement_enabled")
  protected Boolean instancePlacementEnabled;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean instancePlacementEnabled;
    private String name;

    /**
     * Instantiates a new Builder from an existing DedicatedHostPatch instance.
     *
     * @param dedicatedHostPatch the instance to initialize the Builder with
     */
    private Builder(DedicatedHostPatch dedicatedHostPatch) {
      this.instancePlacementEnabled = dedicatedHostPatch.instancePlacementEnabled;
      this.name = dedicatedHostPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DedicatedHostPatch.
     *
     * @return the new DedicatedHostPatch instance
     */
    public DedicatedHostPatch build() {
      return new DedicatedHostPatch(this);
    }

    /**
     * Set the instancePlacementEnabled.
     *
     * @param instancePlacementEnabled the instancePlacementEnabled
     * @return the DedicatedHostPatch builder
     */
    public Builder instancePlacementEnabled(Boolean instancePlacementEnabled) {
      this.instancePlacementEnabled = instancePlacementEnabled;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DedicatedHostPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected DedicatedHostPatch() { }

  protected DedicatedHostPatch(Builder builder) {
    instancePlacementEnabled = builder.instancePlacementEnabled;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a DedicatedHostPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instancePlacementEnabled.
   *
   * If set to true, instances can be placed on this dedicated host.
   *
   * @return the instancePlacementEnabled
   */
  public Boolean instancePlacementEnabled() {
    return instancePlacementEnabled;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this dedicated host.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the DedicatedHostPatch.
   *
   * Note that properties of the DedicatedHostPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the DedicatedHostPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

