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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The setSubnetPublicGateway options.
 */
public class SetSubnetPublicGatewayOptions extends GenericModel {

  protected String id;
  protected PublicGatewayIdentity publicGatewayIdentity;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private PublicGatewayIdentity publicGatewayIdentity;

    /**
     * Instantiates a new Builder from an existing SetSubnetPublicGatewayOptions instance.
     *
     * @param setSubnetPublicGatewayOptions the instance to initialize the Builder with
     */
    private Builder(SetSubnetPublicGatewayOptions setSubnetPublicGatewayOptions) {
      this.id = setSubnetPublicGatewayOptions.id;
      this.publicGatewayIdentity = setSubnetPublicGatewayOptions.publicGatewayIdentity;
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
     * @param publicGatewayIdentity the publicGatewayIdentity
     */
    public Builder(String id, PublicGatewayIdentity publicGatewayIdentity) {
      this.id = id;
      this.publicGatewayIdentity = publicGatewayIdentity;
    }

    /**
     * Builds a SetSubnetPublicGatewayOptions.
     *
     * @return the new SetSubnetPublicGatewayOptions instance
     */
    public SetSubnetPublicGatewayOptions build() {
      return new SetSubnetPublicGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the SetSubnetPublicGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the publicGatewayIdentity.
     *
     * @param publicGatewayIdentity the publicGatewayIdentity
     * @return the SetSubnetPublicGatewayOptions builder
     */
    public Builder publicGatewayIdentity(PublicGatewayIdentity publicGatewayIdentity) {
      this.publicGatewayIdentity = publicGatewayIdentity;
      return this;
    }
  }

  protected SetSubnetPublicGatewayOptions() { }

  protected SetSubnetPublicGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.publicGatewayIdentity,
      "publicGatewayIdentity cannot be null");
    id = builder.id;
    publicGatewayIdentity = builder.publicGatewayIdentity;
  }

  /**
   * New builder.
   *
   * @return a SetSubnetPublicGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The subnet identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the publicGatewayIdentity.
   *
   * The public gateway identity.
   *
   * @return the publicGatewayIdentity
   */
  public PublicGatewayIdentity publicGatewayIdentity() {
    return publicGatewayIdentity;
  }
}

