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

/**
 * The updateSubnetReservedIp options.
 */
public class UpdateSubnetReservedIpOptions extends GenericModel {

  protected String subnetId;
  protected String id;
  protected Map<String, Object> reservedIpPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String subnetId;
    private String id;
    private Map<String, Object> reservedIpPatch;

    /**
     * Instantiates a new Builder from an existing UpdateSubnetReservedIpOptions instance.
     *
     * @param updateSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSubnetReservedIpOptions updateSubnetReservedIpOptions) {
      this.subnetId = updateSubnetReservedIpOptions.subnetId;
      this.id = updateSubnetReservedIpOptions.id;
      this.reservedIpPatch = updateSubnetReservedIpOptions.reservedIpPatch;
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
     * @param reservedIpPatch the reservedIpPatch
     */
    public Builder(String subnetId, String id, Map<String, Object> reservedIpPatch) {
      this.subnetId = subnetId;
      this.id = id;
      this.reservedIpPatch = reservedIpPatch;
    }

    /**
     * Builds a UpdateSubnetReservedIpOptions.
     *
     * @return the new UpdateSubnetReservedIpOptions instance
     */
    public UpdateSubnetReservedIpOptions build() {
      return new UpdateSubnetReservedIpOptions(this);
    }

    /**
     * Set the subnetId.
     *
     * @param subnetId the subnetId
     * @return the UpdateSubnetReservedIpOptions builder
     */
    public Builder subnetId(String subnetId) {
      this.subnetId = subnetId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSubnetReservedIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the reservedIpPatch.
     *
     * @param reservedIpPatch the reservedIpPatch
     * @return the UpdateSubnetReservedIpOptions builder
     */
    public Builder reservedIpPatch(Map<String, Object> reservedIpPatch) {
      this.reservedIpPatch = reservedIpPatch;
      return this;
    }
  }

  protected UpdateSubnetReservedIpOptions() { }

  protected UpdateSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.subnetId,
      "subnetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.reservedIpPatch,
      "reservedIpPatch cannot be null");
    subnetId = builder.subnetId;
    id = builder.id;
    reservedIpPatch = builder.reservedIpPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSubnetReservedIpOptions builder
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

  /**
   * Gets the reservedIpPatch.
   *
   * The reserved IP patch.
   *
   * @return the reservedIpPatch
   */
  public Map<String, Object> reservedIpPatch() {
    return reservedIpPatch;
  }
}

