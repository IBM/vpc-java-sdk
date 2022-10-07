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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteInstanceNetworkInterface options.
 */
public class DeleteInstanceNetworkInterfaceOptions extends GenericModel {

  protected String instanceId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteInstanceNetworkInterfaceOptions instance.
     *
     * @param deleteInstanceNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(DeleteInstanceNetworkInterfaceOptions deleteInstanceNetworkInterfaceOptions) {
      this.instanceId = deleteInstanceNetworkInterfaceOptions.instanceId;
      this.id = deleteInstanceNetworkInterfaceOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param id the id
     */
    public Builder(String instanceId, String id) {
      this.instanceId = instanceId;
      this.id = id;
    }

    /**
     * Builds a DeleteInstanceNetworkInterfaceOptions.
     *
     * @return the new DeleteInstanceNetworkInterfaceOptions instance
     */
    public DeleteInstanceNetworkInterfaceOptions build() {
      return new DeleteInstanceNetworkInterfaceOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteInstanceNetworkInterfaceOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteInstanceNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteInstanceNetworkInterfaceOptions() { }

  protected DeleteInstanceNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteInstanceNetworkInterfaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * The network interface identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

