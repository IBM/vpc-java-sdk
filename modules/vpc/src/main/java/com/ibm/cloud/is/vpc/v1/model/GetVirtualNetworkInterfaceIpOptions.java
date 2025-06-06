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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getVirtualNetworkInterfaceIp options.
 */
public class GetVirtualNetworkInterfaceIpOptions extends GenericModel {

  protected String virtualNetworkInterfaceId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String virtualNetworkInterfaceId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetVirtualNetworkInterfaceIpOptions instance.
     *
     * @param getVirtualNetworkInterfaceIpOptions the instance to initialize the Builder with
     */
    private Builder(GetVirtualNetworkInterfaceIpOptions getVirtualNetworkInterfaceIpOptions) {
      this.virtualNetworkInterfaceId = getVirtualNetworkInterfaceIpOptions.virtualNetworkInterfaceId;
      this.id = getVirtualNetworkInterfaceIpOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param virtualNetworkInterfaceId the virtualNetworkInterfaceId
     * @param id the id
     */
    public Builder(String virtualNetworkInterfaceId, String id) {
      this.virtualNetworkInterfaceId = virtualNetworkInterfaceId;
      this.id = id;
    }

    /**
     * Builds a GetVirtualNetworkInterfaceIpOptions.
     *
     * @return the new GetVirtualNetworkInterfaceIpOptions instance
     */
    public GetVirtualNetworkInterfaceIpOptions build() {
      return new GetVirtualNetworkInterfaceIpOptions(this);
    }

    /**
     * Set the virtualNetworkInterfaceId.
     *
     * @param virtualNetworkInterfaceId the virtualNetworkInterfaceId
     * @return the GetVirtualNetworkInterfaceIpOptions builder
     */
    public Builder virtualNetworkInterfaceId(String virtualNetworkInterfaceId) {
      this.virtualNetworkInterfaceId = virtualNetworkInterfaceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetVirtualNetworkInterfaceIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetVirtualNetworkInterfaceIpOptions() { }

  protected GetVirtualNetworkInterfaceIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.virtualNetworkInterfaceId,
      "virtualNetworkInterfaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    virtualNetworkInterfaceId = builder.virtualNetworkInterfaceId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetVirtualNetworkInterfaceIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the virtualNetworkInterfaceId.
   *
   * The virtual network interface identifier.
   *
   * @return the virtualNetworkInterfaceId
   */
  public String virtualNetworkInterfaceId() {
    return virtualNetworkInterfaceId;
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

