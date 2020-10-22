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
 * SubnetPrototypeSubnetByCIDR.
 */
public class SubnetPrototypeSubnetByCIDR extends SubnetPrototype {

  /**
   * The IP version(s) to support for this subnet.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private NetworkACLIdentity networkAcl;
    private PublicGatewayIdentity publicGateway;
    private String ipVersion;
    private ResourceGroupIdentity resourceGroup;
    private VPCIdentity vpc;
    private String ipv4CIDRBlock;
    private ZoneIdentity zone;

    public Builder(SubnetPrototype subnetPrototypeSubnetByCIDR) {
      this.name = subnetPrototypeSubnetByCIDR.name;
      this.networkAcl = subnetPrototypeSubnetByCIDR.networkAcl;
      this.publicGateway = subnetPrototypeSubnetByCIDR.publicGateway;
      this.ipVersion = subnetPrototypeSubnetByCIDR.ipVersion;
      this.resourceGroup = subnetPrototypeSubnetByCIDR.resourceGroup;
      this.vpc = subnetPrototypeSubnetByCIDR.vpc;
      this.ipv4CIDRBlock = subnetPrototypeSubnetByCIDR.ipv4CIDRBlock;
      this.zone = subnetPrototypeSubnetByCIDR.zone;
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
     * @param ipv4CIDRBlock the ipv4CIDRBlock
     */
    public Builder(VPCIdentity vpc, String ipv4CIDRBlock) {
      this.vpc = vpc;
      this.ipv4CIDRBlock = ipv4CIDRBlock;
    }

    /**
     * Builds a SubnetPrototypeSubnetByCIDR.
     *
     * @return the new SubnetPrototypeSubnetByCIDR instance
     */
    public SubnetPrototypeSubnetByCIDR build() {
      return new SubnetPrototypeSubnetByCIDR(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkAcl.
     *
     * @param networkAcl the networkAcl
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder networkAcl(NetworkACLIdentity networkAcl) {
      this.networkAcl = networkAcl;
      return this;
    }

    /**
     * Set the publicGateway.
     *
     * @param publicGateway the publicGateway
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder publicGateway(PublicGatewayIdentity publicGateway) {
      this.publicGateway = publicGateway;
      return this;
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the ipv4CIDRBlock.
     *
     * @param ipv4CIDRBlock the ipv4CIDRBlock
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder ipv4CIDRBlock(String ipv4CIDRBlock) {
      this.ipv4CIDRBlock = ipv4CIDRBlock;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the SubnetPrototypeSubnetByCIDR builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected SubnetPrototypeSubnetByCIDR(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ipv4CIDRBlock,
      "ipv4CIDRBlock cannot be null");
    name = builder.name;
    networkAcl = builder.networkAcl;
    publicGateway = builder.publicGateway;
    ipVersion = builder.ipVersion;
    resourceGroup = builder.resourceGroup;
    vpc = builder.vpc;
    ipv4CIDRBlock = builder.ipv4CIDRBlock;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a SubnetPrototypeSubnetByCIDR builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

