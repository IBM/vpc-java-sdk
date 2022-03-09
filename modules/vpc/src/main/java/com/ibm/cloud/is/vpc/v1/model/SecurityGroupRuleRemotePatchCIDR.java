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

/**
 * SecurityGroupRuleRemotePatchCIDR.
 */
public class SecurityGroupRuleRemotePatchCIDR extends SecurityGroupRuleRemotePatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String cidrBlock;

    public Builder(SecurityGroupRuleRemotePatch securityGroupRuleRemotePatchCidr) {
      this.cidrBlock = securityGroupRuleRemotePatchCidr.cidrBlock;
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
     * Builds a SecurityGroupRuleRemotePatchCIDR.
     *
     * @return the new SecurityGroupRuleRemotePatchCIDR instance
     */
    public SecurityGroupRuleRemotePatchCIDR build() {
      return new SecurityGroupRuleRemotePatchCIDR(this);
    }

    /**
     * Set the cidrBlock.
     *
     * @param cidrBlock the cidrBlock
     * @return the SecurityGroupRuleRemotePatchCIDR builder
     */
    public Builder cidrBlock(String cidrBlock) {
      this.cidrBlock = cidrBlock;
      return this;
    }
  }

  protected SecurityGroupRuleRemotePatchCIDR(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrBlock,
      "cidrBlock cannot be null");
    cidrBlock = builder.cidrBlock;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRuleRemotePatchCIDR builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

