/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
 * Specify `null` to remove the existing DNS configuration, which will remove all DNS `A` records for this load balancer
 * that had been added to `zone`, and add equivalent `A` records to the public DNS zone `lb.appdomain.cloud`.
 */
public class LoadBalancerDNSPatch extends GenericModel {

  protected DNSInstanceIdentity instance;
  protected DNSZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private DNSInstanceIdentity instance;
    private DNSZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing LoadBalancerDNSPatch instance.
     *
     * @param loadBalancerDnsPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerDNSPatch loadBalancerDnsPatch) {
      this.instance = loadBalancerDnsPatch.instance;
      this.zone = loadBalancerDnsPatch.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerDNSPatch.
     *
     * @return the new LoadBalancerDNSPatch instance
     */
    public LoadBalancerDNSPatch build() {
      return new LoadBalancerDNSPatch(this);
    }

    /**
     * Set the instance.
     *
     * @param instance the instance
     * @return the LoadBalancerDNSPatch builder
     */
    public Builder instance(DNSInstanceIdentity instance) {
      this.instance = instance;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the LoadBalancerDNSPatch builder
     */
    public Builder zone(DNSZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected LoadBalancerDNSPatch() { }

  protected LoadBalancerDNSPatch(Builder builder) {
    instance = builder.instance;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerDNSPatch builder
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

