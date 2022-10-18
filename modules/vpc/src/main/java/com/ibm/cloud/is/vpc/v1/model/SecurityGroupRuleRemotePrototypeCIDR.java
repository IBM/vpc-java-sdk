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
 * SecurityGroupRuleRemotePrototypeCIDR.
 */
public class SecurityGroupRuleRemotePrototypeCIDR extends SecurityGroupRuleRemotePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String cidrBlock;

    /**
     * Instantiates a new Builder from an existing SecurityGroupRuleRemotePrototypeCIDR instance.
     *
     * @param securityGroupRuleRemotePrototypeCidr the instance to initialize the Builder with
     */
    public Builder(SecurityGroupRuleRemotePrototype securityGroupRuleRemotePrototypeCidr) {
      this.cidrBlock = securityGroupRuleRemotePrototypeCidr.cidrBlock;
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
     * Builds a SecurityGroupRuleRemotePrototypeCIDR.
     *
     * @return the new SecurityGroupRuleRemotePrototypeCIDR instance
     */
    public SecurityGroupRuleRemotePrototypeCIDR build() {
      return new SecurityGroupRuleRemotePrototypeCIDR(this);
    }

    /**
     * Set the cidrBlock.
     *
     * @param cidrBlock the cidrBlock
     * @return the SecurityGroupRuleRemotePrototypeCIDR builder
     */
    public Builder cidrBlock(String cidrBlock) {
      this.cidrBlock = cidrBlock;
      return this;
    }
  }

  protected SecurityGroupRuleRemotePrototypeCIDR() { }

  protected SecurityGroupRuleRemotePrototypeCIDR(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrBlock,
      "cidrBlock cannot be null");
    cidrBlock = builder.cidrBlock;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRuleRemotePrototypeCIDR builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

