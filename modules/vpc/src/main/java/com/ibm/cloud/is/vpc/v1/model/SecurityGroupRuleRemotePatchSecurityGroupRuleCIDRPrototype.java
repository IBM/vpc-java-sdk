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

/**
 * SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype.
 */
public class SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype extends SecurityGroupRuleRemotePatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String cidrBlock;

    /**
     * Instantiates a new Builder from an existing SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype instance.
     *
     * @param securityGroupRuleRemotePatchSecurityGroupRuleCidrPrototype the instance to initialize the Builder with
     */
    public Builder(SecurityGroupRuleRemotePatch securityGroupRuleRemotePatchSecurityGroupRuleCidrPrototype) {
      this.cidrBlock = securityGroupRuleRemotePatchSecurityGroupRuleCidrPrototype.cidrBlock;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cidrBlock the cidrBlock
     */
    public Builder(String cidrBlock) {
      this.cidrBlock = cidrBlock;
    }

    /**
     * Builds a SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype.
     *
     * @return the new SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype instance
     */
    public SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype build() {
      return new SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype(this);
    }

    /**
     * Set the cidrBlock.
     *
     * @param cidrBlock the cidrBlock
     * @return the SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype builder
     */
    public Builder cidrBlock(String cidrBlock) {
      this.cidrBlock = cidrBlock;
      return this;
    }
  }

  protected SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype() { }

  protected SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrBlock,
      "cidrBlock cannot be null");
    cidrBlock = builder.cidrBlock;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRuleRemotePatchSecurityGroupRuleCIDRPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

