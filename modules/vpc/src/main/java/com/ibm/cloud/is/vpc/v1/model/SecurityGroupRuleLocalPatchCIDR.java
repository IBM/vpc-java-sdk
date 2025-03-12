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
 * SecurityGroupRuleLocalPatchCIDR.
 */
public class SecurityGroupRuleLocalPatchCIDR extends SecurityGroupRuleLocalPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String cidrBlock;

    /**
     * Instantiates a new Builder from an existing SecurityGroupRuleLocalPatchCIDR instance.
     *
     * @param securityGroupRuleLocalPatchCidr the instance to initialize the Builder with
     */
    public Builder(SecurityGroupRuleLocalPatch securityGroupRuleLocalPatchCidr) {
      this.cidrBlock = securityGroupRuleLocalPatchCidr.cidrBlock;
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
     * Builds a SecurityGroupRuleLocalPatchCIDR.
     *
     * @return the new SecurityGroupRuleLocalPatchCIDR instance
     */
    public SecurityGroupRuleLocalPatchCIDR build() {
      return new SecurityGroupRuleLocalPatchCIDR(this);
    }

    /**
     * Set the cidrBlock.
     *
     * @param cidrBlock the cidrBlock
     * @return the SecurityGroupRuleLocalPatchCIDR builder
     */
    public Builder cidrBlock(String cidrBlock) {
      this.cidrBlock = cidrBlock;
      return this;
    }
  }

  protected SecurityGroupRuleLocalPatchCIDR() { }

  protected SecurityGroupRuleLocalPatchCIDR(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrBlock,
      "cidrBlock cannot be null");
    cidrBlock = builder.cidrBlock;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRuleLocalPatchCIDR builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

