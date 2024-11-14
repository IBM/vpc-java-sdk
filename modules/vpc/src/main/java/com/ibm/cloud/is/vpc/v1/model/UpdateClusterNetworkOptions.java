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
 * The updateClusterNetwork options.
 */
public class UpdateClusterNetworkOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> clusterNetworkPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> clusterNetworkPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateClusterNetworkOptions instance.
     *
     * @param updateClusterNetworkOptions the instance to initialize the Builder with
     */
    private Builder(UpdateClusterNetworkOptions updateClusterNetworkOptions) {
      this.id = updateClusterNetworkOptions.id;
      this.clusterNetworkPatch = updateClusterNetworkOptions.clusterNetworkPatch;
      this.ifMatch = updateClusterNetworkOptions.ifMatch;
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
     * @param clusterNetworkPatch the clusterNetworkPatch
     */
    public Builder(String id, Map<String, Object> clusterNetworkPatch) {
      this.id = id;
      this.clusterNetworkPatch = clusterNetworkPatch;
    }

    /**
     * Builds a UpdateClusterNetworkOptions.
     *
     * @return the new UpdateClusterNetworkOptions instance
     */
    public UpdateClusterNetworkOptions build() {
      return new UpdateClusterNetworkOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateClusterNetworkOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the clusterNetworkPatch.
     *
     * @param clusterNetworkPatch the clusterNetworkPatch
     * @return the UpdateClusterNetworkOptions builder
     */
    public Builder clusterNetworkPatch(Map<String, Object> clusterNetworkPatch) {
      this.clusterNetworkPatch = clusterNetworkPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateClusterNetworkOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateClusterNetworkOptions() { }

  protected UpdateClusterNetworkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterNetworkPatch,
      "clusterNetworkPatch cannot be null");
    id = builder.id;
    clusterNetworkPatch = builder.clusterNetworkPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateClusterNetworkOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The cluster network identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the clusterNetworkPatch.
   *
   * The cluster network patch.
   *
   * @return the clusterNetworkPatch
   */
  public Map<String, Object> clusterNetworkPatch() {
    return clusterNetworkPatch;
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

