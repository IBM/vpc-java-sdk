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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstanceDiskPatch.
 */
public class InstanceDiskPatch extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing InstanceDiskPatch instance.
     *
     * @param instanceDiskPatch the instance to initialize the Builder with
     */
    private Builder(InstanceDiskPatch instanceDiskPatch) {
      this.name = instanceDiskPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceDiskPatch.
     *
     * @return the new InstanceDiskPatch instance
     */
    public InstanceDiskPatch build() {
      return new InstanceDiskPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceDiskPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected InstanceDiskPatch() { }

  protected InstanceDiskPatch(Builder builder) {
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a InstanceDiskPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this instance disk. The name must not be used by another disk on the instance.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the InstanceDiskPatch.
   *
   * Note that properties of the InstanceDiskPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceDiskPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

