/*
 * (C) Copyright IBM Corp. 2025.
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
 * The updateClusterNetworkSubnetReservedIp options.
 */
public class UpdateClusterNetworkSubnetReservedIpOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String clusterNetworkSubnetId;
  protected String id;
  protected Map<String, Object> clusterNetworkSubnetReservedIpPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String clusterNetworkSubnetId;
    private String id;
    private Map<String, Object> clusterNetworkSubnetReservedIpPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateClusterNetworkSubnetReservedIpOptions instance.
     *
     * @param updateClusterNetworkSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(UpdateClusterNetworkSubnetReservedIpOptions updateClusterNetworkSubnetReservedIpOptions) {
      this.clusterNetworkId = updateClusterNetworkSubnetReservedIpOptions.clusterNetworkId;
      this.clusterNetworkSubnetId = updateClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId;
      this.id = updateClusterNetworkSubnetReservedIpOptions.id;
      this.clusterNetworkSubnetReservedIpPatch = updateClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetReservedIpPatch;
      this.ifMatch = updateClusterNetworkSubnetReservedIpOptions.ifMatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @param clusterNetworkSubnetId the clusterNetworkSubnetId
     * @param id the id
     * @param clusterNetworkSubnetReservedIpPatch the clusterNetworkSubnetReservedIpPatch
     */
    public Builder(String clusterNetworkId, String clusterNetworkSubnetId, String id, Map<String, Object> clusterNetworkSubnetReservedIpPatch) {
      this.clusterNetworkId = clusterNetworkId;
      this.clusterNetworkSubnetId = clusterNetworkSubnetId;
      this.id = id;
      this.clusterNetworkSubnetReservedIpPatch = clusterNetworkSubnetReservedIpPatch;
    }

    /**
     * Builds a UpdateClusterNetworkSubnetReservedIpOptions.
     *
     * @return the new UpdateClusterNetworkSubnetReservedIpOptions instance
     */
    public UpdateClusterNetworkSubnetReservedIpOptions build() {
      return new UpdateClusterNetworkSubnetReservedIpOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the UpdateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the clusterNetworkSubnetId.
     *
     * @param clusterNetworkSubnetId the clusterNetworkSubnetId
     * @return the UpdateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkSubnetId(String clusterNetworkSubnetId) {
      this.clusterNetworkSubnetId = clusterNetworkSubnetId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the clusterNetworkSubnetReservedIpPatch.
     *
     * @param clusterNetworkSubnetReservedIpPatch the clusterNetworkSubnetReservedIpPatch
     * @return the UpdateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkSubnetReservedIpPatch(Map<String, Object> clusterNetworkSubnetReservedIpPatch) {
      this.clusterNetworkSubnetReservedIpPatch = clusterNetworkSubnetReservedIpPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateClusterNetworkSubnetReservedIpOptions() { }

  protected UpdateClusterNetworkSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkSubnetId,
      "clusterNetworkSubnetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterNetworkSubnetReservedIpPatch,
      "clusterNetworkSubnetReservedIpPatch cannot be null");
    clusterNetworkId = builder.clusterNetworkId;
    clusterNetworkSubnetId = builder.clusterNetworkSubnetId;
    id = builder.id;
    clusterNetworkSubnetReservedIpPatch = builder.clusterNetworkSubnetReservedIpPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateClusterNetworkSubnetReservedIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterNetworkId.
   *
   * The cluster network identifier.
   *
   * @return the clusterNetworkId
   */
  public String clusterNetworkId() {
    return clusterNetworkId;
  }

  /**
   * Gets the clusterNetworkSubnetId.
   *
   * The cluster network subnet identifier.
   *
   * @return the clusterNetworkSubnetId
   */
  public String clusterNetworkSubnetId() {
    return clusterNetworkSubnetId;
  }

  /**
   * Gets the id.
   *
   * The cluster network subnet reserved IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the clusterNetworkSubnetReservedIpPatch.
   *
   * The cluster network subnet reserved IP patch.
   *
   * @return the clusterNetworkSubnetReservedIpPatch
   */
  public Map<String, Object> clusterNetworkSubnetReservedIpPatch() {
    return clusterNetworkSubnetReservedIpPatch;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

