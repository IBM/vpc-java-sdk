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

/**
 * NetworkACLPrototypeNetworkACLByRules.
 */
public class NetworkACLPrototypeNetworkACLByRules extends NetworkACLPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private VPCIdentity vpc;
    private List<NetworkACLRulePrototypeNetworkACLContext> rules;

    public Builder(NetworkACLPrototype networkAclPrototypeNetworkAclByRules) {
      this.name = networkAclPrototypeNetworkAclByRules.name;
      this.resourceGroup = networkAclPrototypeNetworkAclByRules.resourceGroup;
      this.vpc = networkAclPrototypeNetworkAclByRules.vpc;
      this.rules = networkAclPrototypeNetworkAclByRules.rules;
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
     * Builds a NetworkACLPrototypeNetworkACLByRules.
     *
     * @return the new NetworkACLPrototypeNetworkACLByRules instance
     */
    public NetworkACLPrototypeNetworkACLByRules build() {
      return new NetworkACLPrototypeNetworkACLByRules(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the NetworkACLPrototypeNetworkACLByRules builder
     */
    public Builder addRules(NetworkACLRulePrototypeNetworkACLContext rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<NetworkACLRulePrototypeNetworkACLContext>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLPrototypeNetworkACLByRules builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the NetworkACLPrototypeNetworkACLByRules builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the NetworkACLPrototypeNetworkACLByRules builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the NetworkACLPrototypeNetworkACLByRules builder
     */
    public Builder rules(List<NetworkACLRulePrototypeNetworkACLContext> rules) {
      this.rules = rules;
      return this;
    }
  }

  protected NetworkACLPrototypeNetworkACLByRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    vpc = builder.vpc;
    rules = builder.rules;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLPrototypeNetworkACLByRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

