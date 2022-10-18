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
 * The deleteNetworkAclRule options.
 */
public class DeleteNetworkAclRuleOptions extends GenericModel {

  protected String networkAclId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String networkAclId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteNetworkAclRuleOptions instance.
     *
     * @param deleteNetworkAclRuleOptions the instance to initialize the Builder with
     */
    private Builder(DeleteNetworkAclRuleOptions deleteNetworkAclRuleOptions) {
      this.networkAclId = deleteNetworkAclRuleOptions.networkAclId;
      this.id = deleteNetworkAclRuleOptions.id;
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
     * @param id the id
     */
    public Builder(String networkAclId, String id) {
      this.networkAclId = networkAclId;
      this.id = id;
    }

    /**
     * Builds a DeleteNetworkAclRuleOptions.
     *
     * @return the new DeleteNetworkAclRuleOptions instance
     */
    public DeleteNetworkAclRuleOptions build() {
      return new DeleteNetworkAclRuleOptions(this);
    }

    /**
     * Set the networkAclId.
     *
     * @param networkAclId the networkAclId
     * @return the DeleteNetworkAclRuleOptions builder
     */
    public Builder networkAclId(String networkAclId) {
      this.networkAclId = networkAclId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteNetworkAclRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteNetworkAclRuleOptions() { }

  protected DeleteNetworkAclRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkAclId,
      "networkAclId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    networkAclId = builder.networkAclId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteNetworkAclRuleOptions builder
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
   * Gets the id.
   *
   * The rule identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

