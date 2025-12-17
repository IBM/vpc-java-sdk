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
 * The updateVirtualNetworkInterface options.
 */
public class UpdateVirtualNetworkInterfaceOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> virtualNetworkInterfacePatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> virtualNetworkInterfacePatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateVirtualNetworkInterfaceOptions instance.
     *
     * @param updateVirtualNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVirtualNetworkInterfaceOptions updateVirtualNetworkInterfaceOptions) {
      this.id = updateVirtualNetworkInterfaceOptions.id;
      this.virtualNetworkInterfacePatch = updateVirtualNetworkInterfaceOptions.virtualNetworkInterfacePatch;
      this.ifMatch = updateVirtualNetworkInterfaceOptions.ifMatch;
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
     * @param virtualNetworkInterfacePatch the virtualNetworkInterfacePatch
     */
    public Builder(String id, Map<String, Object> virtualNetworkInterfacePatch) {
      this.id = id;
      this.virtualNetworkInterfacePatch = virtualNetworkInterfacePatch;
    }

    /**
     * Builds a UpdateVirtualNetworkInterfaceOptions.
     *
     * @return the new UpdateVirtualNetworkInterfaceOptions instance
     */
    public UpdateVirtualNetworkInterfaceOptions build() {
      return new UpdateVirtualNetworkInterfaceOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVirtualNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the virtualNetworkInterfacePatch.
     *
     * @param virtualNetworkInterfacePatch the virtualNetworkInterfacePatch
     * @return the UpdateVirtualNetworkInterfaceOptions builder
     */
    public Builder virtualNetworkInterfacePatch(Map<String, Object> virtualNetworkInterfacePatch) {
      this.virtualNetworkInterfacePatch = virtualNetworkInterfacePatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateVirtualNetworkInterfaceOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateVirtualNetworkInterfaceOptions() { }

  protected UpdateVirtualNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.virtualNetworkInterfacePatch,
      "virtualNetworkInterfacePatch cannot be null");
    id = builder.id;
    virtualNetworkInterfacePatch = builder.virtualNetworkInterfacePatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVirtualNetworkInterfaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The virtual network interface identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the virtualNetworkInterfacePatch.
   *
   * The virtual network interface patch.
   *
   * @return the virtualNetworkInterfacePatch
   */
  public Map<String, Object> virtualNetworkInterfacePatch() {
    return virtualNetworkInterfacePatch;
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

