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
 * The getClusterNetworkInterface options.
 */
public class GetClusterNetworkInterfaceOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetClusterNetworkInterfaceOptions instance.
     *
     * @param getClusterNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(GetClusterNetworkInterfaceOptions getClusterNetworkInterfaceOptions) {
      this.clusterNetworkId = getClusterNetworkInterfaceOptions.clusterNetworkId;
      this.id = getClusterNetworkInterfaceOptions.id;
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
     * Builds a GetClusterNetworkInterfaceOptions.
     *
     * @return the new GetClusterNetworkInterfaceOptions instance
     */
    public GetClusterNetworkInterfaceOptions build() {
      return new GetClusterNetworkInterfaceOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the GetClusterNetworkInterfaceOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetClusterNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetClusterNetworkInterfaceOptions() { }

  protected GetClusterNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetClusterNetworkInterfaceOptions builder
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
}

