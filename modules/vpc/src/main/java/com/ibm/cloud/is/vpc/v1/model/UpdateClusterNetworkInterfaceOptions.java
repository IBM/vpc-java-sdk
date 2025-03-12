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

/**
 * The updateClusterNetworkInterface options.
 */
public class UpdateClusterNetworkInterfaceOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String id;
  protected Map<String, Object> clusterNetworkInterfacePatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String id;
    private Map<String, Object> clusterNetworkInterfacePatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateClusterNetworkInterfaceOptions instance.
     *
     * @param updateClusterNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(UpdateClusterNetworkInterfaceOptions updateClusterNetworkInterfaceOptions) {
      this.clusterNetworkId = updateClusterNetworkInterfaceOptions.clusterNetworkId;
      this.id = updateClusterNetworkInterfaceOptions.id;
      this.clusterNetworkInterfacePatch = updateClusterNetworkInterfaceOptions.clusterNetworkInterfacePatch;
      this.ifMatch = updateClusterNetworkInterfaceOptions.ifMatch;
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
     * @param clusterNetworkInterfacePatch the clusterNetworkInterfacePatch
     */
    public Builder(String clusterNetworkId, String id, Map<String, Object> clusterNetworkInterfacePatch) {
      this.clusterNetworkId = clusterNetworkId;
      this.id = id;
      this.clusterNetworkInterfacePatch = clusterNetworkInterfacePatch;
    }

    /**
     * Builds a UpdateClusterNetworkInterfaceOptions.
     *
     * @return the new UpdateClusterNetworkInterfaceOptions instance
     */
    public UpdateClusterNetworkInterfaceOptions build() {
      return new UpdateClusterNetworkInterfaceOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the UpdateClusterNetworkInterfaceOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateClusterNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the clusterNetworkInterfacePatch.
     *
     * @param clusterNetworkInterfacePatch the clusterNetworkInterfacePatch
     * @return the UpdateClusterNetworkInterfaceOptions builder
     */
    public Builder clusterNetworkInterfacePatch(Map<String, Object> clusterNetworkInterfacePatch) {
      this.clusterNetworkInterfacePatch = clusterNetworkInterfacePatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateClusterNetworkInterfaceOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateClusterNetworkInterfaceOptions() { }

  protected UpdateClusterNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterNetworkInterfacePatch,
      "clusterNetworkInterfacePatch cannot be null");
    clusterNetworkId = builder.clusterNetworkId;
    id = builder.id;
    clusterNetworkInterfacePatch = builder.clusterNetworkInterfacePatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateClusterNetworkInterfaceOptions builder
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
   * The cluster network interface identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the clusterNetworkInterfacePatch.
   *
   * The cluster network interface patch.
   *
   * @return the clusterNetworkInterfacePatch
   */
  public Map<String, Object> clusterNetworkInterfacePatch() {
    return clusterNetworkInterfacePatch;
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

