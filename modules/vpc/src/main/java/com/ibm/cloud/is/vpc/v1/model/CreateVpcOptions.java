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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpc options.
 */
public class CreateVpcOptions extends GenericModel {

  /**
   * Indicates whether a [default address prefix](https://cloud.ibm.com/docs/vpc?topic=vpc-configuring-address-prefixes)
   * will be automatically created for each zone in this VPC. If `manual`, this VPC will be created with no default
   * address prefixes.
   *
   * Since address prefixes are managed identically regardless of whether they were automatically created, the value is
   * not preserved as a VPC property.
   */
  public interface AddressPrefixManagement {
    /** auto. */
    String AUTO = "auto";
    /** manual. */
    String MANUAL = "manual";
  }

  protected String addressPrefixManagement;
  protected Boolean classicAccess;
  protected VPCDNSPrototype dns;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String addressPrefixManagement;
    private Boolean classicAccess;
    private VPCDNSPrototype dns;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateVpcOptions instance.
     *
     * @param createVpcOptions the instance to initialize the Builder with
     */
    private Builder(CreateVpcOptions createVpcOptions) {
      this.addressPrefixManagement = createVpcOptions.addressPrefixManagement;
      this.classicAccess = createVpcOptions.classicAccess;
      this.dns = createVpcOptions.dns;
      this.name = createVpcOptions.name;
      this.resourceGroup = createVpcOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateVpcOptions.
     *
     * @return the new CreateVpcOptions instance
     */
    public CreateVpcOptions build() {
      return new CreateVpcOptions(this);
    }

    /**
     * Set the addressPrefixManagement.
     *
     * @param addressPrefixManagement the addressPrefixManagement
     * @return the CreateVpcOptions builder
     */
    public Builder addressPrefixManagement(String addressPrefixManagement) {
      this.addressPrefixManagement = addressPrefixManagement;
      return this;
    }

    /**
     * Set the classicAccess.
     *
     * @param classicAccess the classicAccess
     * @return the CreateVpcOptions builder
     * @deprecated this method is deprecated and may be removed in a future release
     */
    @Deprecated
    public Builder classicAccess(Boolean classicAccess) {
      this.classicAccess = classicAccess;
      return this;
    }

    /**
     * Set the dns.
     *
     * @param dns the dns
     * @return the CreateVpcOptions builder
     */
    public Builder dns(VPCDNSPrototype dns) {
      this.dns = dns;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpcOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateVpcOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateVpcOptions() { }

  protected CreateVpcOptions(Builder builder) {
    addressPrefixManagement = builder.addressPrefixManagement;
    classicAccess = builder.classicAccess;
    dns = builder.dns;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateVpcOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the addressPrefixManagement.
   *
   * Indicates whether a [default address prefix](https://cloud.ibm.com/docs/vpc?topic=vpc-configuring-address-prefixes)
   * will be automatically created for each zone in this VPC. If `manual`, this VPC will be created with no default
   * address prefixes.
   *
   * Since address prefixes are managed identically regardless of whether they were automatically created, the value is
   * not preserved as a VPC property.
   *
   * @return the addressPrefixManagement
   */
  public String addressPrefixManagement() {
    return addressPrefixManagement;
  }

  /**
   * Gets the classicAccess.
   *
   * Indicates whether this VPC will be connected to Classic Infrastructure. If true, this VPC's resources will have
   * private network connectivity to the account's Classic Infrastructure resources. Only one VPC, per region, may be
   * connected in this way. This value is set at creation and subsequently immutable.
   *
   * This property has been deprecated. Instead, use a [Transit Gateway](https://cloud.ibm.com/docs/transit-gateway) to
   * connect this VPC to Classic Infrastructure. For more information, see [upcoming
   * changes](https://cloud.ibm.com/docs/vpc?topic=vpc-api-change-log#upcoming-changes).
   *
   * @return the classicAccess
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public Boolean classicAccess() {
    return classicAccess;
  }

  /**
   * Gets the dns.
   *
   * The DNS configuration for this VPC.
   *
   * If unspecified, the system will assign DNS servers capable of resolving hosts and endpoint
   * gateways within this VPC, and hosts on the internet.
   *
   * @return the dns
   */
  public VPCDNSPrototype dns() {
    return dns;
  }

  /**
   * Gets the name.
   *
   * The name for this VPC. The name must not be used by another VPC in the region. If unspecified, the name will be a
   * hyphenated list of randomly-selected words.
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
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

