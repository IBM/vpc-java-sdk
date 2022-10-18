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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpcAddressPrefix options.
 */
public class CreateVpcAddressPrefixOptions extends GenericModel {

  protected String vpcId;
  protected String cidr;
  protected ZoneIdentity zone;
  protected Boolean isDefault;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String cidr;
    private ZoneIdentity zone;
    private Boolean isDefault;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateVpcAddressPrefixOptions instance.
     *
     * @param createVpcAddressPrefixOptions the instance to initialize the Builder with
     */
    private Builder(CreateVpcAddressPrefixOptions createVpcAddressPrefixOptions) {
      this.vpcId = createVpcAddressPrefixOptions.vpcId;
      this.cidr = createVpcAddressPrefixOptions.cidr;
      this.zone = createVpcAddressPrefixOptions.zone;
      this.isDefault = createVpcAddressPrefixOptions.isDefault;
      this.name = createVpcAddressPrefixOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpcId the vpcId
     * @param cidr the cidr
     * @param zone the zone
     */
    public Builder(String vpcId, String cidr, ZoneIdentity zone) {
      this.vpcId = vpcId;
      this.cidr = cidr;
      this.zone = zone;
    }

    /**
     * Builds a CreateVpcAddressPrefixOptions.
     *
     * @return the new CreateVpcAddressPrefixOptions instance
     */
    public CreateVpcAddressPrefixOptions build() {
      return new CreateVpcAddressPrefixOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the CreateVpcAddressPrefixOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the cidr.
     *
     * @param cidr the cidr
     * @return the CreateVpcAddressPrefixOptions builder
     */
    public Builder cidr(String cidr) {
      this.cidr = cidr;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateVpcAddressPrefixOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the isDefault.
     *
     * @param isDefault the isDefault
     * @return the CreateVpcAddressPrefixOptions builder
     */
    public Builder isDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpcAddressPrefixOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateVpcAddressPrefixOptions() { }

  protected CreateVpcAddressPrefixOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidr,
      "cidr cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    vpcId = builder.vpcId;
    cidr = builder.cidr;
    zone = builder.zone;
    isDefault = builder.isDefault;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateVpcAddressPrefixOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpcId.
   *
   * The VPC identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the cidr.
   *
   * The IPv4 range of the address prefix, expressed in CIDR format. The request must not overlap with any existing
   * address prefixes in the VPC or any of the following reserved address ranges:
   *   - `127.0.0.0/8` (IPv4 loopback addresses)
   *   - `161.26.0.0/16` (IBM services)
   *   - `166.8.0.0/14` (Cloud Service Endpoints)
   *   - `169.254.0.0/16` (IPv4 link-local addresses)
   *   - `224.0.0.0/4` (IPv4 multicast addresses)
   *
   * The prefix length of the address prefix's CIDR must be between `/9` (8,388,608 addresses) and `/29` (8 addresses).
   *
   * @return the cidr
   */
  public String cidr() {
    return cidr;
  }

  /**
   * Gets the zone.
   *
   * The zone this address prefix will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the isDefault.
   *
   * Indicates whether this will be the default address prefix for this zone in this VPC. If `true`, the VPC must not
   * have a default address prefix for this zone.
   *
   * @return the isDefault
   */
  public Boolean isDefault() {
    return isDefault;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this address prefix. Names must be unique within the VPC the address prefix resides in.
   * If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

