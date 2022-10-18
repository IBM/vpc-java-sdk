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

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * FloatingIPPatch.
 */
public class FloatingIPPatch extends GenericModel {

  protected String name;
  protected FloatingIPTargetPatch target;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private FloatingIPTargetPatch target;

    /**
     * Instantiates a new Builder from an existing FloatingIPPatch instance.
     *
     * @param floatingIpPatch the instance to initialize the Builder with
     */
    private Builder(FloatingIPPatch floatingIpPatch) {
      this.name = floatingIpPatch.name;
      this.target = floatingIpPatch.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a FloatingIPPatch.
     *
     * @return the new FloatingIPPatch instance
     */
    public FloatingIPPatch build() {
      return new FloatingIPPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the FloatingIPPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the FloatingIPPatch builder
     */
    public Builder target(FloatingIPTargetPatch target) {
      this.target = target;
      return this;
    }
  }

  protected FloatingIPPatch() { }

  protected FloatingIPPatch(Builder builder) {
    name = builder.name;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a FloatingIPPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this floating IP.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the target.
   *
   * The network interface to bind the floating IP to, replacing any existing binding. For
   * this request to succeed, the floating IP must not be required by another resource, such
   * as a public gateway.
   *
   * @return the target
   */
  public FloatingIPTargetPatch target() {
    return target;
  }

  /**
   * Construct a JSON merge-patch from the FloatingIPPatch.
   *
   * Note that properties of the FloatingIPPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the FloatingIPPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

