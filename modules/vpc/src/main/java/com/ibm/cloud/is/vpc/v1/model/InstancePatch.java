/*
 * (C) Copyright IBM Corp. 2021.
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
 * InstancePatch.
 */
public class InstancePatch extends GenericModel {

  protected String name;
  protected InstancePatchProfile profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private InstancePatchProfile profile;

    private Builder(InstancePatch instancePatch) {
      this.name = instancePatch.name;
      this.profile = instancePatch.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstancePatch.
     *
     * @return the new InstancePatch instance
     */
    public InstancePatch build() {
      return new InstancePatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePatch builder
     */
    public Builder profile(InstancePatchProfile profile) {
      this.profile = profile;
      return this;
    }
  }

  protected InstancePatch(Builder builder) {
    name = builder.name;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a InstancePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this virtual server instance (and default system hostname).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this virtual server instance. For the profile to be changed,
   * the instance `status` must be `stopping` or `stopped`. In addition, the requested
   * profile must:
   * - Match the current profile's instance disk support. (Note: If the current profile
   *   supports instance storage disks, the requested profile can have a different
   *   instance storage disk configuration.)
   * - Be compatible with any `placement_target` constraints. For example, if the
   *   instance is placed on a dedicated host, the requested profile `family` must be
   *   the same as the dedicated host `family`.
   *
   * @return the profile
   */
  public InstancePatchProfile profile() {
    return profile;
  }

  /**
   * Construct a JSON merge-patch from the InstancePatch.
   *
   * Note that properties of the InstancePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstancePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

