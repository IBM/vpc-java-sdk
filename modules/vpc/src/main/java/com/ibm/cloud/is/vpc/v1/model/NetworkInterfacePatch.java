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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * NetworkInterfacePatch.
 */
public class NetworkInterfacePatch extends GenericModel {

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowIpSpoofing;
    private String name;

    /**
     * Instantiates a new Builder from an existing NetworkInterfacePatch instance.
     *
     * @param networkInterfacePatch the instance to initialize the Builder with
     */
    private Builder(NetworkInterfacePatch networkInterfacePatch) {
      this.allowIpSpoofing = networkInterfacePatch.allowIpSpoofing;
      this.name = networkInterfacePatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NetworkInterfacePatch.
     *
     * @return the new NetworkInterfacePatch instance
     */
    public NetworkInterfacePatch build() {
      return new NetworkInterfacePatch(this);
    }

    /**
     * Set the allowIpSpoofing.
     *
     * @param allowIpSpoofing the allowIpSpoofing
     * @return the NetworkInterfacePatch builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkInterfacePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected NetworkInterfacePatch() { }

  protected NetworkInterfacePatch(Builder builder) {
    allowIpSpoofing = builder.allowIpSpoofing;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a NetworkInterfacePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this instance network interface.
   *
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and source IP spoofing is managed on
   * the attached virtual network interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean allowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the name.
   *
   * The name for the instance network interface. The name must not be used by another network interface on the virtual
   * server instance.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the NetworkInterfacePatch.
   *
   * Note that properties of the NetworkInterfacePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the NetworkInterfacePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

