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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * ClusterNetworkSubnetPatch.
 */
public class ClusterNetworkSubnetPatch extends GenericModel {

  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;

    /**
     * Instantiates a new Builder from an existing ClusterNetworkSubnetPatch instance.
     *
     * @param clusterNetworkSubnetPatch the instance to initialize the Builder with
     */
    private Builder(ClusterNetworkSubnetPatch clusterNetworkSubnetPatch) {
      this.name = clusterNetworkSubnetPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ClusterNetworkSubnetPatch.
     *
     * @return the new ClusterNetworkSubnetPatch instance
     */
    public ClusterNetworkSubnetPatch build() {
      return new ClusterNetworkSubnetPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ClusterNetworkSubnetPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ClusterNetworkSubnetPatch() { }

  protected ClusterNetworkSubnetPatch(Builder builder) {
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ClusterNetworkSubnetPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network subnet. The name must not be used by another cluster network subnet in the
   * cluster network. Names starting with `ibm-` are reserved for provider-owned resources, and are not allowed.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the ClusterNetworkSubnetPatch.
   *
   * Note that properties of the ClusterNetworkSubnetPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ClusterNetworkSubnetPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}
