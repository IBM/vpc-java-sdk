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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSecurityGroup options.
 */
public class CreateSecurityGroupOptions extends GenericModel {

  protected VPCIdentity vpc;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;
  protected List<SecurityGroupRulePrototype> rules;

  /**
   * Builder.
   */
  public static class Builder {
    private VPCIdentity vpc;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private List<SecurityGroupRulePrototype> rules;

    /**
     * Instantiates a new Builder from an existing CreateSecurityGroupOptions instance.
     *
     * @param createSecurityGroupOptions the instance to initialize the Builder with
     */
    private Builder(CreateSecurityGroupOptions createSecurityGroupOptions) {
      this.vpc = createSecurityGroupOptions.vpc;
      this.name = createSecurityGroupOptions.name;
      this.resourceGroup = createSecurityGroupOptions.resourceGroup;
      this.rules = createSecurityGroupOptions.rules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpc the vpc
     */
    public Builder(VPCIdentity vpc) {
      this.vpc = vpc;
    }

    /**
     * Builds a CreateSecurityGroupOptions.
     *
     * @return the new CreateSecurityGroupOptions instance
     */
    public CreateSecurityGroupOptions build() {
      return new CreateSecurityGroupOptions(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the CreateSecurityGroupOptions builder
     */
    public Builder addRules(SecurityGroupRulePrototype rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<SecurityGroupRulePrototype>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the CreateSecurityGroupOptions builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSecurityGroupOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateSecurityGroupOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the CreateSecurityGroupOptions builder
     */
    public Builder rules(List<SecurityGroupRulePrototype> rules) {
      this.rules = rules;
      return this;
    }
  }

  protected CreateSecurityGroupOptions() { }

  protected CreateSecurityGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    vpc = builder.vpc;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    rules = builder.rules;
  }

  /**
   * New builder.
   *
   * @return a CreateSecurityGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpc.
   *
   * The VPC this security group will reside in.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this security group. If unspecified, the name will be a hyphenated list of
   * randomly-selected words. Names must be unique within the VPC the security group resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the rules.
   *
   * The prototype objects for rules to be created for this security group. If unspecified, no rules will be created,
   * resulting in all traffic being denied.
   *
   * @return the rules
   */
  public List<SecurityGroupRulePrototype> rules() {
    return rules;
  }
}

