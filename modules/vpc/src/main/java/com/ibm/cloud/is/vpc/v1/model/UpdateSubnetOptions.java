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
 * The updateSubnet options.
 */
public class UpdateSubnetOptions extends GenericModel {

  protected String id;
  protected String name;
  protected NetworkACLIdentity networkAcl;
  protected PublicGatewayIdentity publicGateway;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;
    private NetworkACLIdentity networkAcl;
    private PublicGatewayIdentity publicGateway;

    private Builder(UpdateSubnetOptions updateSubnetOptions) {
      this.id = updateSubnetOptions.id;
      this.name = updateSubnetOptions.name;
      this.networkAcl = updateSubnetOptions.networkAcl;
      this.publicGateway = updateSubnetOptions.publicGateway;
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
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateSubnetOptions.
     *
     * @return the new UpdateSubnetOptions instance
     */
    public UpdateSubnetOptions build() {
      return new UpdateSubnetOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSubnetOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateSubnetOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkAcl.
     *
     * @param networkAcl the networkAcl
     * @return the UpdateSubnetOptions builder
     */
    public Builder networkAcl(NetworkACLIdentity networkAcl) {
      this.networkAcl = networkAcl;
      return this;
    }

    /**
     * Set the publicGateway.
     *
     * @param publicGateway the publicGateway
     * @return the UpdateSubnetOptions builder
     */
    public Builder publicGateway(PublicGatewayIdentity publicGateway) {
      this.publicGateway = publicGateway;
      return this;
    }
  }

  protected UpdateSubnetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
    networkAcl = builder.networkAcl;
    publicGateway = builder.publicGateway;
  }

  /**
   * New builder.
   *
   * @return a UpdateSubnetOptions builder
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
   * Gets the name.
   *
   * The user-defined name for this subnet. Names must be unique within the VPC the subnet resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the networkAcl.
   *
   * The network ACL to use for this subnet.
   *
   * @return the networkAcl
   */
  public NetworkACLIdentity networkAcl() {
    return networkAcl;
  }

  /**
   * Gets the publicGateway.
   *
   * The public gateway to handle internet bound traffic for this subnet.
   *
   * @return the publicGateway
   */
  public PublicGatewayIdentity publicGateway() {
    return publicGateway;
  }
}

