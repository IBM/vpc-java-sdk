/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * The createClusterNetwork options.
 */
public class CreateClusterNetworkOptions extends GenericModel {

  protected ClusterNetworkProfileIdentity profile;
  protected VPCIdentity vpc;
  protected ZoneIdentity zone;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;
  protected List<ClusterNetworkSubnetPrefixPrototype> subnetPrefixes;

  /**
   * Builder.
   */
  public static class Builder {
    private ClusterNetworkProfileIdentity profile;
    private VPCIdentity vpc;
    private ZoneIdentity zone;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private List<ClusterNetworkSubnetPrefixPrototype> subnetPrefixes;

    /**
     * Instantiates a new Builder from an existing CreateClusterNetworkOptions instance.
     *
     * @param createClusterNetworkOptions the instance to initialize the Builder with
     */
    private Builder(CreateClusterNetworkOptions createClusterNetworkOptions) {
      this.profile = createClusterNetworkOptions.profile;
      this.vpc = createClusterNetworkOptions.vpc;
      this.zone = createClusterNetworkOptions.zone;
      this.name = createClusterNetworkOptions.name;
      this.resourceGroup = createClusterNetworkOptions.resourceGroup;
      this.subnetPrefixes = createClusterNetworkOptions.subnetPrefixes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param profile the profile
     * @param vpc the vpc
     * @param zone the zone
     */
    public Builder(ClusterNetworkProfileIdentity profile, VPCIdentity vpc, ZoneIdentity zone) {
      this.profile = profile;
      this.vpc = vpc;
      this.zone = zone;
    }

    /**
     * Builds a CreateClusterNetworkOptions.
     *
     * @return the new CreateClusterNetworkOptions instance
     */
    public CreateClusterNetworkOptions build() {
      return new CreateClusterNetworkOptions(this);
    }

    /**
     * Adds a new element to subnetPrefixes.
     *
     * @param subnetPrefixes the new element to be added
     * @return the CreateClusterNetworkOptions builder
     */
    public Builder addSubnetPrefixes(ClusterNetworkSubnetPrefixPrototype subnetPrefixes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(subnetPrefixes,
        "subnetPrefixes cannot be null");
      if (this.subnetPrefixes == null) {
        this.subnetPrefixes = new ArrayList<ClusterNetworkSubnetPrefixPrototype>();
      }
      this.subnetPrefixes.add(subnetPrefixes);
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the CreateClusterNetworkOptions builder
     */
    public Builder profile(ClusterNetworkProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the CreateClusterNetworkOptions builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateClusterNetworkOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateClusterNetworkOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateClusterNetworkOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the subnetPrefixes.
     * Existing subnetPrefixes will be replaced.
     *
     * @param subnetPrefixes the subnetPrefixes
     * @return the CreateClusterNetworkOptions builder
     */
    public Builder subnetPrefixes(List<ClusterNetworkSubnetPrefixPrototype> subnetPrefixes) {
      this.subnetPrefixes = subnetPrefixes;
      return this;
    }
  }

  protected CreateClusterNetworkOptions() { }

  protected CreateClusterNetworkOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    profile = builder.profile;
    vpc = builder.vpc;
    zone = builder.zone;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    subnetPrefixes = builder.subnetPrefixes;
  }

  /**
   * New builder.
   *
   * @return a CreateClusterNetworkOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this cluster network.
   *
   * @return the profile
   */
  public ClusterNetworkProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this cluster network will reside in.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this cluster network will reside in. The zone must be listed
   * as supported on the specified cluster network profile.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network. The name must not be used by another cluster network in the region. Names
   * starting with `ibm-` are reserved for provider-owned resources, and are not allowed. If unspecified, the name will
   * be a hyphenated list of randomly-selected words.
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
   * Gets the subnetPrefixes.
   *
   * @return the subnetPrefixes
   */
  public List<ClusterNetworkSubnetPrefixPrototype> subnetPrefixes() {
    return subnetPrefixes;
  }
}

