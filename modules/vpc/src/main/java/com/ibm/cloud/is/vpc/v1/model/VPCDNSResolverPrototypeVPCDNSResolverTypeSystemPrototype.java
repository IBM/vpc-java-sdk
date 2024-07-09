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

/**
 * The system will provide DNS server addresses for this VPC. The system-provided DNS server addresses depend on whether
 * any endpoint gateways reside in the VPC, and whether a
 * [DNS Services](https://cloud.ibm.com/docs/dns-svcs) instance is configured for the VPC.
 */
public class VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype extends VPCDNSResolverPrototype {

  /**
   * The type of the DNS resolver to use.
   */
  public interface Type {
    /** system. */
    String SYSTEM = "system";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String type;

    /**
     * Instantiates a new Builder from an existing VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype instance.
     *
     * @param vpcdnsResolverPrototypeVpcdnsResolverTypeSystemPrototype the instance to initialize the Builder with
     */
    public Builder(VPCDNSResolverPrototype vpcdnsResolverPrototypeVpcdnsResolverTypeSystemPrototype) {
      this.type = vpcdnsResolverPrototypeVpcdnsResolverTypeSystemPrototype.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype.
     *
     * @return the new VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype instance
     */
    public VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype build() {
      return new VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype() { }

  protected VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype(Builder builder) {
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

