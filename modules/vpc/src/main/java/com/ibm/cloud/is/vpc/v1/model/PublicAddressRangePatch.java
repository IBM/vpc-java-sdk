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
 * PublicAddressRangePatch.
 */
public class PublicAddressRangePatch extends GenericModel {

  protected String name;
  protected PublicAddressRangeTargetPatch target;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private PublicAddressRangeTargetPatch target;

    /**
     * Instantiates a new Builder from an existing PublicAddressRangePatch instance.
     *
     * @param publicAddressRangePatch the instance to initialize the Builder with
     */
    private Builder(PublicAddressRangePatch publicAddressRangePatch) {
      this.name = publicAddressRangePatch.name;
      this.target = publicAddressRangePatch.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublicAddressRangePatch.
     *
     * @return the new PublicAddressRangePatch instance
     */
    public PublicAddressRangePatch build() {
      return new PublicAddressRangePatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PublicAddressRangePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the PublicAddressRangePatch builder
     */
    public Builder target(PublicAddressRangeTargetPatch target) {
      this.target = target;
      return this;
    }
  }

  protected PublicAddressRangePatch() { }

  protected PublicAddressRangePatch(Builder builder) {
    name = builder.name;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a PublicAddressRangePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this public address range. The name must not be used by another public address range in the region.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the target.
   *
   * The target to bind this public address range to.
   *
   * If the public address range is not currently bound to a target, both `target.vpc` and
   * `target.zone` must be specified.
   *
   * Specify `null` to unbind the public address range from any existing target.
   *
   * @return the target
   */
  public PublicAddressRangeTargetPatch target() {
    return target;
  }

  /**
   * Construct a JSON merge-patch from the PublicAddressRangePatch.
   *
   * Note that properties of the PublicAddressRangePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PublicAddressRangePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

