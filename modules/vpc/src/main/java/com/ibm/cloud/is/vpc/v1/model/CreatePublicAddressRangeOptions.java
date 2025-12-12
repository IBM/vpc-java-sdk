/*
 * (C) Copyright IBM Corp. 2025.
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
 * The createPublicAddressRange options.
 */
public class CreatePublicAddressRangeOptions extends GenericModel {

  protected Long ipv4AddressCount;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;
  protected PublicAddressRangeTargetPrototype target;

  /**
   * Builder.
   */
  public static class Builder {
    private Long ipv4AddressCount;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private PublicAddressRangeTargetPrototype target;

    /**
     * Instantiates a new Builder from an existing CreatePublicAddressRangeOptions instance.
     *
     * @param createPublicAddressRangeOptions the instance to initialize the Builder with
     */
    private Builder(CreatePublicAddressRangeOptions createPublicAddressRangeOptions) {
      this.ipv4AddressCount = createPublicAddressRangeOptions.ipv4AddressCount;
      this.name = createPublicAddressRangeOptions.name;
      this.resourceGroup = createPublicAddressRangeOptions.resourceGroup;
      this.target = createPublicAddressRangeOptions.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ipv4AddressCount the ipv4AddressCount
     */
    public Builder(Long ipv4AddressCount) {
      this.ipv4AddressCount = ipv4AddressCount;
    }

    /**
     * Builds a CreatePublicAddressRangeOptions.
     *
     * @return the new CreatePublicAddressRangeOptions instance
     */
    public CreatePublicAddressRangeOptions build() {
      return new CreatePublicAddressRangeOptions(this);
    }

    /**
     * Set the ipv4AddressCount.
     *
     * @param ipv4AddressCount the ipv4AddressCount
     * @return the CreatePublicAddressRangeOptions builder
     */
    public Builder ipv4AddressCount(long ipv4AddressCount) {
      this.ipv4AddressCount = ipv4AddressCount;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreatePublicAddressRangeOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreatePublicAddressRangeOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreatePublicAddressRangeOptions builder
     */
    public Builder target(PublicAddressRangeTargetPrototype target) {
      this.target = target;
      return this;
    }
  }

  protected CreatePublicAddressRangeOptions() { }

  protected CreatePublicAddressRangeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ipv4AddressCount,
      "ipv4AddressCount cannot be null");
    ipv4AddressCount = builder.ipv4AddressCount;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a CreatePublicAddressRangeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ipv4AddressCount.
   *
   * The total number of public IPv4 addresses required. Must be a power of 2.
   *
   * @return the ipv4AddressCount
   */
  public Long ipv4AddressCount() {
    return ipv4AddressCount;
  }

  /**
   * Gets the name.
   *
   * The name for this public address range. The name must not be used by another public address range in the region. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
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

  /**
   * Gets the target.
   *
   * The target to bind this public address range to. If unspecified, the public address
   * range will not be bound to a target at creation.
   *
   * @return the target
   */
  public PublicAddressRangeTargetPrototype target() {
    return target;
  }
}

