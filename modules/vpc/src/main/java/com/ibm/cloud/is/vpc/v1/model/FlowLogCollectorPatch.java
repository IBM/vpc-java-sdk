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
 * FlowLogCollectorPatch.
 */
public class FlowLogCollectorPatch extends GenericModel {

  protected Boolean active;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;
    private String name;

    /**
     * Instantiates a new Builder from an existing FlowLogCollectorPatch instance.
     *
     * @param flowLogCollectorPatch the instance to initialize the Builder with
     */
    private Builder(FlowLogCollectorPatch flowLogCollectorPatch) {
      this.active = flowLogCollectorPatch.active;
      this.name = flowLogCollectorPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a FlowLogCollectorPatch.
     *
     * @return the new FlowLogCollectorPatch instance
     */
    public FlowLogCollectorPatch build() {
      return new FlowLogCollectorPatch(this);
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the FlowLogCollectorPatch builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the FlowLogCollectorPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected FlowLogCollectorPatch() { }

  protected FlowLogCollectorPatch(Builder builder) {
    active = builder.active;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a FlowLogCollectorPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the active.
   *
   * Indicates whether this collector is active. Updating to false deactivates the collector and updating to true
   * activates the collector.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this flow log collector.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the FlowLogCollectorPatch.
   *
   * Note that properties of the FlowLogCollectorPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the FlowLogCollectorPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

