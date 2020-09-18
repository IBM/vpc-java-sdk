/*
 * (C) Copyright IBM Corp. 2020.
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
 * SecurityGroupRulePatchRemoteCIDR.
 */
public class SecurityGroupRulePatchRemoteCIDR extends SecurityGroupRulePatchRemote {


  /**
   * Builder.
   */
  public static class Builder {
    private String cidrBlock;

    public Builder(SecurityGroupRulePatchRemote securityGroupRulePatchRemoteCidr) {
      this.cidrBlock = securityGroupRulePatchRemoteCidr.cidrBlock;
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
     * Builds a SecurityGroupRulePatchRemoteCIDR.
     *
     * @return the new SecurityGroupRulePatchRemoteCIDR instance
     */
    public SecurityGroupRulePatchRemoteCIDR build() {
      return new SecurityGroupRulePatchRemoteCIDR(this);
    }

    /**
     * Set the cidrBlock.
     *
     * @param cidrBlock the cidrBlock
     * @return the SecurityGroupRulePatchRemoteCIDR builder
     */
    public Builder cidrBlock(String cidrBlock) {
      this.cidrBlock = cidrBlock;
      return this;
    }
  }

  protected SecurityGroupRulePatchRemoteCIDR(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrBlock,
      "cidrBlock cannot be null");
    cidrBlock = builder.cidrBlock;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRulePatchRemoteCIDR builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

