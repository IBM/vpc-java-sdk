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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DNSServerPrototype.
 */
public class DNSServerPrototype extends GenericModel {

  protected String address;
  @SerializedName("zone_affinity")
  protected ZoneIdentity zoneAffinity;

  /**
   * Builder.
   */
  public static class Builder {
    private String address;
    private ZoneIdentity zoneAffinity;

    /**
     * Instantiates a new Builder from an existing DNSServerPrototype instance.
     *
     * @param dnsServerPrototype the instance to initialize the Builder with
     */
    private Builder(DNSServerPrototype dnsServerPrototype) {
      this.address = dnsServerPrototype.address;
      this.zoneAffinity = dnsServerPrototype.zoneAffinity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param address the address
     */
    public Builder(String address) {
      this.address = address;
    }

    /**
     * Builds a DNSServerPrototype.
     *
     * @return the new DNSServerPrototype instance
     */
    public DNSServerPrototype build() {
      return new DNSServerPrototype(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the DNSServerPrototype builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the zoneAffinity.
     *
     * @param zoneAffinity the zoneAffinity
     * @return the DNSServerPrototype builder
     */
    public Builder zoneAffinity(ZoneIdentity zoneAffinity) {
      this.zoneAffinity = zoneAffinity;
      return this;
    }
  }

  protected DNSServerPrototype() { }

  protected DNSServerPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.address,
      "address cannot be null");
    address = builder.address;
    zoneAffinity = builder.zoneAffinity;
  }

  /**
   * New builder.
   *
   * @return a DNSServerPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * This property may [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) to support IPv6 addresses in
   * the future.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the zoneAffinity.
   *
   * DHCP configuration for the specified zone will have this DNS server listed first.
   *
   * @return the zoneAffinity
   */
  public ZoneIdentity zoneAffinity() {
    return zoneAffinity;
  }
}

