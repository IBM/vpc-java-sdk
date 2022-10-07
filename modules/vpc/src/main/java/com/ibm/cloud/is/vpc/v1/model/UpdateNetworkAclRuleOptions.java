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
 * The updateNetworkAclRule options.
 */
public class UpdateNetworkAclRuleOptions extends GenericModel {

  protected String networkAclId;
  protected String id;
  protected Map<String, Object> networkAclRulePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String networkAclId;
    private String id;
    private Map<String, Object> networkAclRulePatch;

    /**
     * Instantiates a new Builder from an existing UpdateNetworkAclRuleOptions instance.
     *
     * @param updateNetworkAclRuleOptions the instance to initialize the Builder with
     */
    private Builder(UpdateNetworkAclRuleOptions updateNetworkAclRuleOptions) {
      this.networkAclId = updateNetworkAclRuleOptions.networkAclId;
      this.id = updateNetworkAclRuleOptions.id;
      this.networkAclRulePatch = updateNetworkAclRuleOptions.networkAclRulePatch;
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
     * @param networkAclRulePatch the networkAclRulePatch
     */
    public Builder(String networkAclId, String id, Map<String, Object> networkAclRulePatch) {
      this.networkAclId = networkAclId;
      this.id = id;
      this.networkAclRulePatch = networkAclRulePatch;
    }

    /**
     * Builds a UpdateNetworkAclRuleOptions.
     *
     * @return the new UpdateNetworkAclRuleOptions instance
     */
    public UpdateNetworkAclRuleOptions build() {
      return new UpdateNetworkAclRuleOptions(this);
    }

    /**
     * Set the networkAclId.
     *
     * @param networkAclId the networkAclId
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder networkAclId(String networkAclId) {
      this.networkAclId = networkAclId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the networkAclRulePatch.
     *
     * @param networkAclRulePatch the networkAclRulePatch
     * @return the UpdateNetworkAclRuleOptions builder
     */
    public Builder networkAclRulePatch(Map<String, Object> networkAclRulePatch) {
      this.networkAclRulePatch = networkAclRulePatch;
      return this;
    }
  }

  protected UpdateNetworkAclRuleOptions() { }

  protected UpdateNetworkAclRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkAclId,
      "networkAclId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.networkAclRulePatch,
      "networkAclRulePatch cannot be null");
    networkAclId = builder.networkAclId;
    id = builder.id;
    networkAclRulePatch = builder.networkAclRulePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateNetworkAclRuleOptions builder
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

  /**
   * Gets the networkAclRulePatch.
   *
   * The network ACL rule patch.
   *
   * @return the networkAclRulePatch
   */
  public Map<String, Object> networkAclRulePatch() {
    return networkAclRulePatch;
  }
}

