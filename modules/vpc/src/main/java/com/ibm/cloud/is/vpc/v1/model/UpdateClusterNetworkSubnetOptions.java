/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * The updateClusterNetworkSubnet options.
 */
public class UpdateClusterNetworkSubnetOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String id;
  protected Map<String, Object> clusterNetworkSubnetPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String id;
    private Map<String, Object> clusterNetworkSubnetPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateClusterNetworkSubnetOptions instance.
     *
     * @param updateClusterNetworkSubnetOptions the instance to initialize the Builder with
     */
    private Builder(UpdateClusterNetworkSubnetOptions updateClusterNetworkSubnetOptions) {
      this.clusterNetworkId = updateClusterNetworkSubnetOptions.clusterNetworkId;
      this.id = updateClusterNetworkSubnetOptions.id;
      this.clusterNetworkSubnetPatch = updateClusterNetworkSubnetOptions.clusterNetworkSubnetPatch;
      this.ifMatch = updateClusterNetworkSubnetOptions.ifMatch;
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
     * @param id the id
     * @param clusterNetworkSubnetPatch the clusterNetworkSubnetPatch
     */
    public Builder(String clusterNetworkId, String id, Map<String, Object> clusterNetworkSubnetPatch) {
      this.clusterNetworkId = clusterNetworkId;
      this.id = id;
      this.clusterNetworkSubnetPatch = clusterNetworkSubnetPatch;
    }

    /**
     * Builds a UpdateClusterNetworkSubnetOptions.
     *
     * @return the new UpdateClusterNetworkSubnetOptions instance
     */
    public UpdateClusterNetworkSubnetOptions build() {
      return new UpdateClusterNetworkSubnetOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the UpdateClusterNetworkSubnetOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateClusterNetworkSubnetOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the clusterNetworkSubnetPatch.
     *
     * @param clusterNetworkSubnetPatch the clusterNetworkSubnetPatch
     * @return the UpdateClusterNetworkSubnetOptions builder
     */
    public Builder clusterNetworkSubnetPatch(Map<String, Object> clusterNetworkSubnetPatch) {
      this.clusterNetworkSubnetPatch = clusterNetworkSubnetPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateClusterNetworkSubnetOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateClusterNetworkSubnetOptions() { }

  protected UpdateClusterNetworkSubnetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterNetworkSubnetPatch,
      "clusterNetworkSubnetPatch cannot be null");
    clusterNetworkId = builder.clusterNetworkId;
    id = builder.id;
    clusterNetworkSubnetPatch = builder.clusterNetworkSubnetPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateClusterNetworkSubnetOptions builder
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
   * Gets the id.
   *
   * The cluster network subnet identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the clusterNetworkSubnetPatch.
   *
   * The cluster network subnet patch.
   *
   * @return the clusterNetworkSubnetPatch
   */
  public Map<String, Object> clusterNetworkSubnetPatch() {
    return clusterNetworkSubnetPatch;
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

