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
 * The createSecurityGroupRule options.
 */
public class CreateSecurityGroupRuleOptions extends GenericModel {

  protected String securityGroupId;
  protected SecurityGroupRulePrototype securityGroupRulePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String securityGroupId;
    private SecurityGroupRulePrototype securityGroupRulePrototype;

    /**
     * Instantiates a new Builder from an existing CreateSecurityGroupRuleOptions instance.
     *
     * @param createSecurityGroupRuleOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecurityGroupRuleOptions createSecurityGroupRuleOptions) {
      this.securityGroupId = createSecurityGroupRuleOptions.securityGroupId;
      this.securityGroupRulePrototype = createSecurityGroupRuleOptions.securityGroupRulePrototype;
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
     * @param securityGroupRulePrototype the securityGroupRulePrototype
     */
    public Builder(String securityGroupId, SecurityGroupRulePrototype securityGroupRulePrototype) {
      this.securityGroupId = securityGroupId;
      this.securityGroupRulePrototype = securityGroupRulePrototype;
    }

    /**
     * Builds a CreateSecurityGroupRuleOptions.
     *
     * @return the new CreateSecurityGroupRuleOptions instance
     */
    public CreateSecurityGroupRuleOptions build() {
      return new CreateSecurityGroupRuleOptions(this);
    }

    /**
     * Set the securityGroupId.
     *
     * @param securityGroupId the securityGroupId
     * @return the CreateSecurityGroupRuleOptions builder
     */
    public Builder securityGroupId(String securityGroupId) {
      this.securityGroupId = securityGroupId;
      return this;
    }

    /**
     * Set the securityGroupRulePrototype.
     *
     * @param securityGroupRulePrototype the securityGroupRulePrototype
     * @return the CreateSecurityGroupRuleOptions builder
     */
    public Builder securityGroupRulePrototype(SecurityGroupRulePrototype securityGroupRulePrototype) {
      this.securityGroupRulePrototype = securityGroupRulePrototype;
      return this;
    }
  }

  protected CreateSecurityGroupRuleOptions() { }

  protected CreateSecurityGroupRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.securityGroupId,
      "securityGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.securityGroupRulePrototype,
      "securityGroupRulePrototype cannot be null");
    securityGroupId = builder.securityGroupId;
    securityGroupRulePrototype = builder.securityGroupRulePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateSecurityGroupRuleOptions builder
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
   * Gets the securityGroupRulePrototype.
   *
   * The properties of the security group rule to be created.
   *
   * @return the securityGroupRulePrototype
   */
  public SecurityGroupRulePrototype securityGroupRulePrototype() {
    return securityGroupRulePrototype;
  }
}

