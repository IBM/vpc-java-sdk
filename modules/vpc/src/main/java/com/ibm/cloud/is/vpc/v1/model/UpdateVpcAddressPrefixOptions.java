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
 * The updateVpcAddressPrefix options.
 */
public class UpdateVpcAddressPrefixOptions extends GenericModel {

  protected String vpcId;
  protected String id;
  protected Map<String, Object> addressPrefixPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String id;
    private Map<String, Object> addressPrefixPatch;

    /**
     * Instantiates a new Builder from an existing UpdateVpcAddressPrefixOptions instance.
     *
     * @param updateVpcAddressPrefixOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptions) {
      this.vpcId = updateVpcAddressPrefixOptions.vpcId;
      this.id = updateVpcAddressPrefixOptions.id;
      this.addressPrefixPatch = updateVpcAddressPrefixOptions.addressPrefixPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpcId the vpcId
     * @param id the id
     * @param addressPrefixPatch the addressPrefixPatch
     */
    public Builder(String vpcId, String id, Map<String, Object> addressPrefixPatch) {
      this.vpcId = vpcId;
      this.id = id;
      this.addressPrefixPatch = addressPrefixPatch;
    }

    /**
     * Builds a UpdateVpcAddressPrefixOptions.
     *
     * @return the new UpdateVpcAddressPrefixOptions instance
     */
    public UpdateVpcAddressPrefixOptions build() {
      return new UpdateVpcAddressPrefixOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the UpdateVpcAddressPrefixOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpcAddressPrefixOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the addressPrefixPatch.
     *
     * @param addressPrefixPatch the addressPrefixPatch
     * @return the UpdateVpcAddressPrefixOptions builder
     */
    public Builder addressPrefixPatch(Map<String, Object> addressPrefixPatch) {
      this.addressPrefixPatch = addressPrefixPatch;
      return this;
    }
  }

  protected UpdateVpcAddressPrefixOptions() { }

  protected UpdateVpcAddressPrefixOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.addressPrefixPatch,
      "addressPrefixPatch cannot be null");
    vpcId = builder.vpcId;
    id = builder.id;
    addressPrefixPatch = builder.addressPrefixPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpcAddressPrefixOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpcId.
   *
   * The VPC identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the id.
   *
   * The prefix identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the addressPrefixPatch.
   *
   * The prefix patch.
   *
   * @return the addressPrefixPatch
   */
  public Map<String, Object> addressPrefixPatch() {
    return addressPrefixPatch;
  }
}

