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
 * The getNetworkAclRule options.
 */
public class GetNetworkAclRuleOptions extends GenericModel {

  protected String networkAclId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String networkAclId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetNetworkAclRuleOptions instance.
     *
     * @param getNetworkAclRuleOptions the instance to initialize the Builder with
     */
    private Builder(GetNetworkAclRuleOptions getNetworkAclRuleOptions) {
      this.networkAclId = getNetworkAclRuleOptions.networkAclId;
      this.id = getNetworkAclRuleOptions.id;
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
     * Builds a GetNetworkAclRuleOptions.
     *
     * @return the new GetNetworkAclRuleOptions instance
     */
    public GetNetworkAclRuleOptions build() {
      return new GetNetworkAclRuleOptions(this);
    }

    /**
     * Set the networkAclId.
     *
     * @param networkAclId the networkAclId
     * @return the GetNetworkAclRuleOptions builder
     */
    public Builder networkAclId(String networkAclId) {
      this.networkAclId = networkAclId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetNetworkAclRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetNetworkAclRuleOptions() { }

  protected GetNetworkAclRuleOptions(Builder builder) {
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
   * @return a GetNetworkAclRuleOptions builder
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

