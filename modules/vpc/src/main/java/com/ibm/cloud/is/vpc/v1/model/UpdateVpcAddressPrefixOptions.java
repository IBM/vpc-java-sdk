/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateVpcAddressPrefix options.
 */
public class UpdateVpcAddressPrefixOptions extends GenericModel {

  protected String vpcId;
  protected String id;
  protected String name;
  protected Boolean isDefault;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String id;
    private String name;
    private Boolean isDefault;

    private Builder(UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptions) {
      this.vpcId = updateVpcAddressPrefixOptions.vpcId;
      this.id = updateVpcAddressPrefixOptions.id;
      this.name = updateVpcAddressPrefixOptions.name;
      this.isDefault = updateVpcAddressPrefixOptions.isDefault;
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
     */
    public Builder(String vpcId, String id) {
      this.vpcId = vpcId;
      this.id = id;
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
     * Set the name.
     *
     * @param name the name
     * @return the UpdateVpcAddressPrefixOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the isDefault.
     *
     * @param isDefault the isDefault
     * @return the UpdateVpcAddressPrefixOptions builder
     */
    public Builder isDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }
  }

  protected UpdateVpcAddressPrefixOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    vpcId = builder.vpcId;
    id = builder.id;
    name = builder.name;
    isDefault = builder.isDefault;
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
   * Gets the name.
   *
   * The user-defined name for this address prefix. Names must be unique within the VPC the address prefix resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the isDefault.
   *
   * Indicates whether this is the default prefix for this zone in this VPC. Updating to true makes this prefix the
   * default prefix for this zone in this VPC, provided the VPC currently has no default address prefix for this zone.
   * Updating to false removes the default prefix for this zone in this VPC.
   *
   * @return the isDefault
   */
  public Boolean isDefault() {
    return isDefault;
  }
}

