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
 * SubnetPrototypeSubnetByTotalCount.
 */
public class SubnetPrototypeSubnetByTotalCount extends SubnetPrototype {

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
    private String ipVersion;
    private String name;
    private NetworkACLIdentity networkAcl;
    private PublicGatewayIdentity publicGateway;
    private ResourceGroupIdentity resourceGroup;
    private RoutingTableIdentity routingTable;
    private VPCIdentity vpc;
    private Long totalIpv4AddressCount;
    private ZoneIdentity zone;

    public Builder(SubnetPrototype subnetPrototypeSubnetByTotalCount) {
      this.ipVersion = subnetPrototypeSubnetByTotalCount.ipVersion;
      this.name = subnetPrototypeSubnetByTotalCount.name;
      this.networkAcl = subnetPrototypeSubnetByTotalCount.networkAcl;
      this.publicGateway = subnetPrototypeSubnetByTotalCount.publicGateway;
      this.resourceGroup = subnetPrototypeSubnetByTotalCount.resourceGroup;
      this.routingTable = subnetPrototypeSubnetByTotalCount.routingTable;
      this.vpc = subnetPrototypeSubnetByTotalCount.vpc;
      this.totalIpv4AddressCount = subnetPrototypeSubnetByTotalCount.totalIpv4AddressCount;
      this.zone = subnetPrototypeSubnetByTotalCount.zone;
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
     * @param totalIpv4AddressCount the totalIpv4AddressCount
     * @param zone the zone
     */
    public Builder(VPCIdentity vpc, Long totalIpv4AddressCount, ZoneIdentity zone) {
      this.vpc = vpc;
      this.totalIpv4AddressCount = totalIpv4AddressCount;
      this.zone = zone;
    }

    /**
     * Builds a SubnetPrototypeSubnetByTotalCount.
     *
     * @return the new SubnetPrototypeSubnetByTotalCount instance
     */
    public SubnetPrototypeSubnetByTotalCount build() {
      return new SubnetPrototypeSubnetByTotalCount(this);
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkAcl.
     *
     * @param networkAcl the networkAcl
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder networkAcl(NetworkACLIdentity networkAcl) {
      this.networkAcl = networkAcl;
      return this;
    }

    /**
     * Set the publicGateway.
     *
     * @param publicGateway the publicGateway
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder publicGateway(PublicGatewayIdentity publicGateway) {
      this.publicGateway = publicGateway;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the routingTable.
     *
     * @param routingTable the routingTable
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder routingTable(RoutingTableIdentity routingTable) {
      this.routingTable = routingTable;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the totalIpv4AddressCount.
     *
     * @param totalIpv4AddressCount the totalIpv4AddressCount
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder totalIpv4AddressCount(long totalIpv4AddressCount) {
      this.totalIpv4AddressCount = totalIpv4AddressCount;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the SubnetPrototypeSubnetByTotalCount builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected SubnetPrototypeSubnetByTotalCount(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.totalIpv4AddressCount,
      "totalIpv4AddressCount cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    ipVersion = builder.ipVersion;
    name = builder.name;
    networkAcl = builder.networkAcl;
    publicGateway = builder.publicGateway;
    resourceGroup = builder.resourceGroup;
    routingTable = builder.routingTable;
    vpc = builder.vpc;
    totalIpv4AddressCount = builder.totalIpv4AddressCount;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a SubnetPrototypeSubnetByTotalCount builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

