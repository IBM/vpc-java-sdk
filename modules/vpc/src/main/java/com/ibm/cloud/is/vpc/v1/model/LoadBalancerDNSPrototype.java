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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The DNS configuration for this load balancer.
 *
 * If unspecified, DNS `A` records for this load balancer's `hostname` property will be added to the public DNS zone
 * `lb.appdomain.cloud`. Otherwise, those DNS `A` records will be added to the specified `zone`.
 *
 * Not supported by private path load balancers.
 */
public class LoadBalancerDNSPrototype extends GenericModel {

  protected DNSInstanceIdentity instance;
  protected DNSZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private DNSInstanceIdentity instance;
    private DNSZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing LoadBalancerDNSPrototype instance.
     *
     * @param loadBalancerDnsPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerDNSPrototype loadBalancerDnsPrototype) {
      this.instance = loadBalancerDnsPrototype.instance;
      this.zone = loadBalancerDnsPrototype.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instance the instance
     * @param zone the zone
     */
    public Builder(DNSInstanceIdentity instance, DNSZoneIdentity zone) {
      this.instance = instance;
      this.zone = zone;
    }

    /**
     * Builds a LoadBalancerDNSPrototype.
     *
     * @return the new LoadBalancerDNSPrototype instance
     */
    public LoadBalancerDNSPrototype build() {
      return new LoadBalancerDNSPrototype(this);
    }

    /**
     * Set the instance.
     *
     * @param instance the instance
     * @return the LoadBalancerDNSPrototype builder
     */
    public Builder instance(DNSInstanceIdentity instance) {
      this.instance = instance;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the LoadBalancerDNSPrototype builder
     */
    public Builder zone(DNSZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected LoadBalancerDNSPrototype() { }

  protected LoadBalancerDNSPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instance,
      "instance cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    instance = builder.instance;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerDNSPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instance.
   *
   * The DNS instance to associate with this load balancer.
   *
   * The specified instance may be in a different region or account, subject to IAM
   * policies.
   *
   * @return the instance
   */
  public DNSInstanceIdentity instance() {
    return instance;
  }

  /**
   * Gets the zone.
   *
   * The DNS zone to associate with this load balancer.
   *
   * The specified zone may be in a different region or account, subject to IAM policies.
   *
   * @return the zone
   */
  public DNSZoneIdentity zone() {
    return zone;
  }
}

