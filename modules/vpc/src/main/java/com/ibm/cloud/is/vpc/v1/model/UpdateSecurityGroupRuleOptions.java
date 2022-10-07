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
 * The updateSecurityGroupRule options.
 */
public class UpdateSecurityGroupRuleOptions extends GenericModel {

  protected String securityGroupId;
  protected String id;
  protected Map<String, Object> securityGroupRulePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String securityGroupId;
    private String id;
    private Map<String, Object> securityGroupRulePatch;

    /**
     * Instantiates a new Builder from an existing UpdateSecurityGroupRuleOptions instance.
     *
     * @param updateSecurityGroupRuleOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptions) {
      this.securityGroupId = updateSecurityGroupRuleOptions.securityGroupId;
      this.id = updateSecurityGroupRuleOptions.id;
      this.securityGroupRulePatch = updateSecurityGroupRuleOptions.securityGroupRulePatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param securityGroupId the securityGroupId
     * @param id the id
     * @param securityGroupRulePatch the securityGroupRulePatch
     */
    public Builder(String securityGroupId, String id, Map<String, Object> securityGroupRulePatch) {
      this.securityGroupId = securityGroupId;
      this.id = id;
      this.securityGroupRulePatch = securityGroupRulePatch;
    }

    /**
     * Builds a UpdateSecurityGroupRuleOptions.
     *
     * @return the new UpdateSecurityGroupRuleOptions instance
     */
    public UpdateSecurityGroupRuleOptions build() {
      return new UpdateSecurityGroupRuleOptions(this);
    }

    /**
     * Set the securityGroupId.
     *
     * @param securityGroupId the securityGroupId
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder securityGroupId(String securityGroupId) {
      this.securityGroupId = securityGroupId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the securityGroupRulePatch.
     *
     * @param securityGroupRulePatch the securityGroupRulePatch
     * @return the UpdateSecurityGroupRuleOptions builder
     */
    public Builder securityGroupRulePatch(Map<String, Object> securityGroupRulePatch) {
      this.securityGroupRulePatch = securityGroupRulePatch;
      return this;
    }
  }

  protected UpdateSecurityGroupRuleOptions() { }

  protected UpdateSecurityGroupRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.securityGroupId,
      "securityGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.securityGroupRulePatch,
      "securityGroupRulePatch cannot be null");
    securityGroupId = builder.securityGroupId;
    id = builder.id;
    securityGroupRulePatch = builder.securityGroupRulePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSecurityGroupRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the securityGroupId.
   *
   * The security group identifier.
   *
   * @return the securityGroupId
   */
  public String securityGroupId() {
    return securityGroupId;
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
   * Gets the securityGroupRulePatch.
   *
   * The security group rule patch.
   *
   * @return the securityGroupRulePatch
   */
  public Map<String, Object> securityGroupRulePatch() {
    return securityGroupRulePatch;
  }
}

