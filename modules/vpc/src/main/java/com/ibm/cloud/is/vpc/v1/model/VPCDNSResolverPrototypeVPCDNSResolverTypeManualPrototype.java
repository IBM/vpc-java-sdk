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

/**
 * Manually specify the DNS server addresses for this VPC.
 */
public class VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype extends VPCDNSResolverPrototype {

  /**
   * The type of the DNS resolver to use.
   */
  public interface Type {
    /** manual. */
    String MANUAL = "manual";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private List<DNSServerPrototype> manualServers;
    private String type;

    /**
     * Instantiates a new Builder from an existing VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype instance.
     *
     * @param vpcdnsResolverPrototypeVpcdnsResolverTypeManualPrototype the instance to initialize the Builder with
     */
    public Builder(VPCDNSResolverPrototype vpcdnsResolverPrototypeVpcdnsResolverTypeManualPrototype) {
      this.manualServers = vpcdnsResolverPrototypeVpcdnsResolverTypeManualPrototype.manualServers;
      this.type = vpcdnsResolverPrototypeVpcdnsResolverTypeManualPrototype.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param manualServers the manualServers
     * @param type the type
     */
    public Builder(List<DNSServerPrototype> manualServers, String type) {
      this.manualServers = manualServers;
      this.type = type;
    }

    /**
     * Builds a VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype.
     *
     * @return the new VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype instance
     */
    public VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype build() {
      return new VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype(this);
    }

    /**
     * Adds a new element to manualServers.
     *
     * @param manualServers the new element to be added
     * @return the VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype builder
     */
    public Builder addManualServers(DNSServerPrototype manualServers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(manualServers,
        "manualServers cannot be null");
      if (this.manualServers == null) {
        this.manualServers = new ArrayList<DNSServerPrototype>();
      }
      this.manualServers.add(manualServers);
      return this;
    }

    /**
     * Set the manualServers.
     * Existing manualServers will be replaced.
     *
     * @param manualServers the manualServers
     * @return the VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype builder
     */
    public Builder manualServers(List<DNSServerPrototype> manualServers) {
      this.manualServers = manualServers;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype() { }

  protected VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.manualServers,
      "manualServers cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    manualServers = builder.manualServers;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

