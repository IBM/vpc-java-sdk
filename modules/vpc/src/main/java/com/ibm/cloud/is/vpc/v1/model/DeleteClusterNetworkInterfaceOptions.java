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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteClusterNetworkInterface options.
 */
public class DeleteClusterNetworkInterfaceOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String id;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String id;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing DeleteClusterNetworkInterfaceOptions instance.
     *
     * @param deleteClusterNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(DeleteClusterNetworkInterfaceOptions deleteClusterNetworkInterfaceOptions) {
      this.clusterNetworkId = deleteClusterNetworkInterfaceOptions.clusterNetworkId;
      this.id = deleteClusterNetworkInterfaceOptions.id;
      this.ifMatch = deleteClusterNetworkInterfaceOptions.ifMatch;
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
     */
    public Builder(String clusterNetworkId, String id) {
      this.clusterNetworkId = clusterNetworkId;
      this.id = id;
    }

    /**
     * Builds a DeleteClusterNetworkInterfaceOptions.
     *
     * @return the new DeleteClusterNetworkInterfaceOptions instance
     */
    public DeleteClusterNetworkInterfaceOptions build() {
      return new DeleteClusterNetworkInterfaceOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the DeleteClusterNetworkInterfaceOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteClusterNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the DeleteClusterNetworkInterfaceOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected DeleteClusterNetworkInterfaceOptions() { }

  protected DeleteClusterNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    id = builder.id;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a DeleteClusterNetworkInterfaceOptions builder
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
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

