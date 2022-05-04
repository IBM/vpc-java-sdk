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
 * The listSecurityGroupRules options.
 */
public class ListSecurityGroupRulesOptions extends GenericModel {

  protected String securityGroupId;

  /**
   * Builder.
   */
  public static class Builder {
    private String securityGroupId;

    private Builder(ListSecurityGroupRulesOptions listSecurityGroupRulesOptions) {
      this.securityGroupId = listSecurityGroupRulesOptions.securityGroupId;
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
     */
    public Builder(String securityGroupId) {
      this.securityGroupId = securityGroupId;
    }

    /**
     * Builds a ListSecurityGroupRulesOptions.
     *
     * @return the new ListSecurityGroupRulesOptions instance
     */
    public ListSecurityGroupRulesOptions build() {
      return new ListSecurityGroupRulesOptions(this);
    }

    /**
     * Set the securityGroupId.
     *
     * @param securityGroupId the securityGroupId
     * @return the ListSecurityGroupRulesOptions builder
     */
    public Builder securityGroupId(String securityGroupId) {
      this.securityGroupId = securityGroupId;
      return this;
    }
  }

  protected ListSecurityGroupRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.securityGroupId,
      "securityGroupId cannot be empty");
    securityGroupId = builder.securityGroupId;
  }

  /**
   * New builder.
   *
   * @return a ListSecurityGroupRulesOptions builder
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
}

