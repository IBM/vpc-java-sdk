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
 * The createNetworkAclRule options.
 */
public class CreateNetworkAclRuleOptions extends GenericModel {

  protected String networkAclId;
  protected NetworkACLRulePrototype networkAclRulePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String networkAclId;
    private NetworkACLRulePrototype networkAclRulePrototype;

    private Builder(CreateNetworkAclRuleOptions createNetworkAclRuleOptions) {
      this.networkAclId = createNetworkAclRuleOptions.networkAclId;
      this.networkAclRulePrototype = createNetworkAclRuleOptions.networkAclRulePrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param networkAclId the networkAclId
     * @param networkAclRulePrototype the networkAclRulePrototype
     */
    public Builder(String networkAclId, NetworkACLRulePrototype networkAclRulePrototype) {
      this.networkAclId = networkAclId;
      this.networkAclRulePrototype = networkAclRulePrototype;
    }

    /**
     * Builds a CreateNetworkAclRuleOptions.
     *
     * @return the new CreateNetworkAclRuleOptions instance
     */
    public CreateNetworkAclRuleOptions build() {
      return new CreateNetworkAclRuleOptions(this);
    }

    /**
     * Set the networkAclId.
     *
     * @param networkAclId the networkAclId
     * @return the CreateNetworkAclRuleOptions builder
     */
    public Builder networkAclId(String networkAclId) {
      this.networkAclId = networkAclId;
      return this;
    }

    /**
     * Set the networkAclRulePrototype.
     *
     * @param networkAclRulePrototype the networkAclRulePrototype
     * @return the CreateNetworkAclRuleOptions builder
     */
    public Builder networkAclRulePrototype(NetworkACLRulePrototype networkAclRulePrototype) {
      this.networkAclRulePrototype = networkAclRulePrototype;
      return this;
    }
  }

  protected CreateNetworkAclRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkAclId,
      "networkAclId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkAclRulePrototype,
      "networkAclRulePrototype cannot be null");
    networkAclId = builder.networkAclId;
    networkAclRulePrototype = builder.networkAclRulePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateNetworkAclRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the networkAclId.
   *
   * The network ACL identifier.
   *
   * @return the networkAclId
   */
  public String networkAclId() {
    return networkAclId;
  }

  /**
   * Gets the networkAclRulePrototype.
   *
   * The network ACL rule prototype object.
   *
   * @return the networkAclRulePrototype
   */
  public NetworkACLRulePrototype networkAclRulePrototype() {
    return networkAclRulePrototype;
  }
}

