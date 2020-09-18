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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpc options.
 */
public class CreateVpcOptions extends GenericModel {

  /**
   * Indicates whether a default address prefix should be automatically created for each zone in this VPC. If `manual`,
   * this VPC will be created with no default address prefixes.
   */
  public interface AddressPrefixManagement {
    /** auto. */
    String AUTO = "auto";
    /** manual. */
    String MANUAL = "manual";
  }

  protected String name;
  protected String addressPrefixManagement;
  protected Boolean classicAccess;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String addressPrefixManagement;
    private Boolean classicAccess;
    private ResourceGroupIdentity resourceGroup;

    private Builder(CreateVpcOptions createVpcOptions) {
      this.name = createVpcOptions.name;
      this.addressPrefixManagement = createVpcOptions.addressPrefixManagement;
      this.classicAccess = createVpcOptions.classicAccess;
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
     */
    public Builder classicAccess(Boolean classicAccess) {
      this.classicAccess = classicAccess;
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

  protected CreateVpcOptions(Builder builder) {
    name = builder.name;
    addressPrefixManagement = builder.addressPrefixManagement;
    classicAccess = builder.classicAccess;
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
   * Gets the name.
   *
   * The unique user-defined name for this VPC. If unspecified, the name will be a hyphenated list of randomly-selected
   * words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the addressPrefixManagement.
   *
   * Indicates whether a default address prefix should be automatically created for each zone in this VPC. If `manual`,
   * this VPC will be created with no default address prefixes.
   *
   * @return the addressPrefixManagement
   */
  public String addressPrefixManagement() {
    return addressPrefixManagement;
  }

  /**
   * Gets the classicAccess.
   *
   * Indicates whether this VPC should be connected to Classic Infrastructure. If true, this VPC's resources will have
   * private network connectivity to the account's Classic Infrastructure resources. Only one VPC, per region, may be
   * connected in this way. This value is set at creation and subsequently immutable.
   *
   * @return the classicAccess
   */
  public Boolean classicAccess() {
    return classicAccess;
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
}

