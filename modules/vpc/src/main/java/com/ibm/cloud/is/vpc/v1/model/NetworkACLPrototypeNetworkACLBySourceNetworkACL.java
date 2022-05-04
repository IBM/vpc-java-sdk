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
 * NetworkACLPrototypeNetworkACLBySourceNetworkACL.
 */
public class NetworkACLPrototypeNetworkACLBySourceNetworkACL extends NetworkACLPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private VPCIdentity vpc;
    private NetworkACLIdentity sourceNetworkAcl;

    public Builder(NetworkACLPrototype networkAclPrototypeNetworkAclBySourceNetworkAcl) {
      this.name = networkAclPrototypeNetworkAclBySourceNetworkAcl.name;
      this.resourceGroup = networkAclPrototypeNetworkAclBySourceNetworkAcl.resourceGroup;
      this.vpc = networkAclPrototypeNetworkAclBySourceNetworkAcl.vpc;
      this.sourceNetworkAcl = networkAclPrototypeNetworkAclBySourceNetworkAcl.sourceNetworkAcl;
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
     * @param sourceNetworkAcl the sourceNetworkAcl
     */
    public Builder(VPCIdentity vpc, NetworkACLIdentity sourceNetworkAcl) {
      this.vpc = vpc;
      this.sourceNetworkAcl = sourceNetworkAcl;
    }

    /**
     * Builds a NetworkACLPrototypeNetworkACLBySourceNetworkACL.
     *
     * @return the new NetworkACLPrototypeNetworkACLBySourceNetworkACL instance
     */
    public NetworkACLPrototypeNetworkACLBySourceNetworkACL build() {
      return new NetworkACLPrototypeNetworkACLBySourceNetworkACL(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLPrototypeNetworkACLBySourceNetworkACL builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the NetworkACLPrototypeNetworkACLBySourceNetworkACL builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the NetworkACLPrototypeNetworkACLBySourceNetworkACL builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the sourceNetworkAcl.
     *
     * @param sourceNetworkAcl the sourceNetworkAcl
     * @return the NetworkACLPrototypeNetworkACLBySourceNetworkACL builder
     */
    public Builder sourceNetworkAcl(NetworkACLIdentity sourceNetworkAcl) {
      this.sourceNetworkAcl = sourceNetworkAcl;
      return this;
    }
  }

  protected NetworkACLPrototypeNetworkACLBySourceNetworkACL(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceNetworkAcl,
      "sourceNetworkAcl cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    vpc = builder.vpc;
    sourceNetworkAcl = builder.sourceNetworkAcl;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLPrototypeNetworkACLBySourceNetworkACL builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

