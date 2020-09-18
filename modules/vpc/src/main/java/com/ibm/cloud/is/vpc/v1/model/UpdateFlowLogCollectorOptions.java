/*
 * (C) Copyright IBM Corp. 2020.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateFlowLogCollector options.
 */
public class UpdateFlowLogCollectorOptions extends GenericModel {

  protected String id;
  protected String name;
  protected Boolean active;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private Boolean active;

    private Builder(UpdateFlowLogCollectorOptions updateFlowLogCollectorOptions) {
      this.id = updateFlowLogCollectorOptions.id;
      this.name = updateFlowLogCollectorOptions.name;
      this.active = updateFlowLogCollectorOptions.active;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateFlowLogCollectorOptions.
     *
     * @return the new UpdateFlowLogCollectorOptions instance
     */
    public UpdateFlowLogCollectorOptions build() {
      return new UpdateFlowLogCollectorOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateFlowLogCollectorOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateFlowLogCollectorOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the UpdateFlowLogCollectorOptions builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }
  }

  protected UpdateFlowLogCollectorOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
    active = builder.active;
  }

  /**
   * New builder.
   *
   * @return a UpdateFlowLogCollectorOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The flow log collector identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
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
}

