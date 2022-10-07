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
 * The replaceSubnetNetworkAcl options.
 */
public class ReplaceSubnetNetworkAclOptions extends GenericModel {

  protected String id;
  protected NetworkACLIdentity networkAclIdentity;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private NetworkACLIdentity networkAclIdentity;

    /**
     * Instantiates a new Builder from an existing ReplaceSubnetNetworkAclOptions instance.
     *
     * @param replaceSubnetNetworkAclOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptions) {
      this.id = replaceSubnetNetworkAclOptions.id;
      this.networkAclIdentity = replaceSubnetNetworkAclOptions.networkAclIdentity;
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
     * @param networkAclIdentity the networkAclIdentity
     */
    public Builder(String id, NetworkACLIdentity networkAclIdentity) {
      this.id = id;
      this.networkAclIdentity = networkAclIdentity;
    }

    /**
     * Builds a ReplaceSubnetNetworkAclOptions.
     *
     * @return the new ReplaceSubnetNetworkAclOptions instance
     */
    public ReplaceSubnetNetworkAclOptions build() {
      return new ReplaceSubnetNetworkAclOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceSubnetNetworkAclOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the networkAclIdentity.
     *
     * @param networkAclIdentity the networkAclIdentity
     * @return the ReplaceSubnetNetworkAclOptions builder
     */
    public Builder networkAclIdentity(NetworkACLIdentity networkAclIdentity) {
      this.networkAclIdentity = networkAclIdentity;
      return this;
    }
  }

  protected ReplaceSubnetNetworkAclOptions() { }

  protected ReplaceSubnetNetworkAclOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkAclIdentity,
      "networkAclIdentity cannot be null");
    id = builder.id;
    networkAclIdentity = builder.networkAclIdentity;
  }

  /**
   * New builder.
   *
   * @return a ReplaceSubnetNetworkAclOptions builder
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
   * Gets the networkAclIdentity.
   *
   * The network ACL identity.
   *
   * @return the networkAclIdentity
   */
  public NetworkACLIdentity networkAclIdentity() {
    return networkAclIdentity;
  }
}

