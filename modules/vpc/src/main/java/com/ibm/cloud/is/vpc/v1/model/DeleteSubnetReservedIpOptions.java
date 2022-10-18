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
 * The deleteSubnetReservedIp options.
 */
public class DeleteSubnetReservedIpOptions extends GenericModel {

  protected String subnetId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String subnetId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteSubnetReservedIpOptions instance.
     *
     * @param deleteSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSubnetReservedIpOptions deleteSubnetReservedIpOptions) {
      this.subnetId = deleteSubnetReservedIpOptions.subnetId;
      this.id = deleteSubnetReservedIpOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnetId the subnetId
     * @param id the id
     */
    public Builder(String subnetId, String id) {
      this.subnetId = subnetId;
      this.id = id;
    }

    /**
     * Builds a DeleteSubnetReservedIpOptions.
     *
     * @return the new DeleteSubnetReservedIpOptions instance
     */
    public DeleteSubnetReservedIpOptions build() {
      return new DeleteSubnetReservedIpOptions(this);
    }

    /**
     * Set the subnetId.
     *
     * @param subnetId the subnetId
     * @return the DeleteSubnetReservedIpOptions builder
     */
    public Builder subnetId(String subnetId) {
      this.subnetId = subnetId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSubnetReservedIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteSubnetReservedIpOptions() { }

  protected DeleteSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.subnetId,
      "subnetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    subnetId = builder.subnetId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteSubnetReservedIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subnetId.
   *
   * The subnet identifier.
   *
   * @return the subnetId
   */
  public String subnetId() {
    return subnetId;
  }

  /**
   * Gets the id.
   *
   * The reserved IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

